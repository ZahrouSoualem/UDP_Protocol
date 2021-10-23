import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class P1 {
	private static InetAddress adr;
	private static DatagramPacket packet,packet2;
	private static DatagramSocket socket,socket2;
	public static void main(String[] args)  {
		
		String s="Message de P1 à P2";
		try{
			adr = InetAddress.getLocalHost();
			socket = new DatagramSocket();
			byte [] data= (new String(s)).getBytes();
			packet = new DatagramPacket(data, data.length, adr,5000);
			
			while(true) {
				Thread.sleep(1000);
				socket.send(packet);
				
				//s=""+s;
				data = s.getBytes();
				packet.setData(data);		
			
			  socket = new DatagramSocket(4000);
			byte []data1 = new byte[30];
			packet2 = new DatagramPacket(data1,data1.length);
			while(true) {
			socket.receive(packet2);
			String s1 = new String(data1, 0, data1.length);
			System.out.println(s1);
			}}
		}catch (IOException | InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		
		
	
}
}