import java.io.*;
import java.net.*;

public class loadbalancer{
	public static void main(String []args)throws IOException{
	ServerSocket s=new ServerSocket(8000);
	while(true){
		Socket connectionsocket=s.accept();
		BufferedReader messagefromclient=new BufferedReader(new InputStreamReader(connectionsocket.getInputStream()));
		String clientsentence=messagefromclient.readLine();

		if(clientsentence.contains("water")){
		Socket server=new Socket("192.168.222.128", 8001);
		DataOutputStream outtoserver=new DataOutputStream(server.getOutputStream());
		outtoserver.writeBytes(clientsentence+"\n");
		server.close();
		}

		else if(clientsentence.contains("fire")){
		Socket server1=new Socket("192.168.222.129", 8002);
		DataOutputStream outtoserver1=new DataOutputStream(server1.getOutputStream());
		outtoserver1.writeBytes(clientsentence+"\n");
		server1.close();
		}
		
		else{
		System.out.println("Error !");
		}
	}
}
}
