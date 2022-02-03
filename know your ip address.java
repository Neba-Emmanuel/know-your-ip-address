import java.net.InetAddress;
class GetMyIPAddress{
	public static void main(String args[]) throws Exception{
		
		/* public static InetAddress getLocalHost()
		throws unknownHostException
		returns the address of the localhost*/
		
		InetAddress myIP=InetAddress.getLocalHost();		
		/* public string getHostAddress()
		returns the IP address*/
		
		System.out.println("My IP Address is:");
		System.out.println(myIP.getHostAddress());
	}
}