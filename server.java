import java.io.*;
import java.net.*;

public class server{
	public static void main(String []args)throws IOException{
	ServerSocket s=new ServerSocket(8001);
	while(true){
		Socket connectionsocket=s.accept();
		BufferedReader messagefromloadbalancer=new BufferedReader(new InputStreamReader(connectionsocket.getInputStream()));
		String sentence=messagefromloadbalancer.readLine();
		System.out.println("Message received: "+sentence);
	}
}
}
