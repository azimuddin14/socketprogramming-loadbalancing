import java.io.*;
import java.net.*;

public class client{
	public static void main(String[] args)throws IOException{
	Socket c=new Socket("192.168.111.129", 8000);
	DataOutputStream outtoserver=new DataOutputStream(c.getOutputStream());
	BufferedReader infromuser=new BufferedReader(new InputStreamReader(System.in));
	String sentence=infromuser.readLine();
	outtoserver.writeBytes(sentence);
	c.close();
	}
}
