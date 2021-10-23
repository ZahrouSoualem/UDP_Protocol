import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class P2 {
	private static InetAddress adr,adr1;
	private static DatagramPacket packet,packet2;
	private static DatagramSocket socket,socket2;

	public static void main(String[] args) {
		String s1="Message de P2 à P1";
		// TODO Auto-generated method stub
		try {
			// il faut utiliser un thread pour afficher 
			socket = new DatagramSocket(5000);
			byte []data = new byte[30];
			packet = new DatagramPacket(data,data.length);
			while(true) {
			socket.receive(packet);
			String s = new String(data, 0, data.length);
			System.out.println(s);	
			
			//****//
			//adr1 = InetAddress.getLocalHost();
			
			//adr1 = InetAddress.getLocalHost();
			byte []data1 = (new String(s1)).getBytes();
			packet2 = new DatagramPacket(data1, data1.length, InetAddress.getLocalHost(),4000);
			//socket = new DatagramSocket();
			while(true) {
				Thread.sleep(1000);
				socket.send(packet2);
				
				//s=""+s;
				data1 = s1.getBytes();
				packet2.setData(data1);		
			}
			}
			
			
			
			
			
			
		} catch ( IOException  | InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}


	
	
	
}
