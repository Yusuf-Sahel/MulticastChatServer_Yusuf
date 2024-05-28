import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastServer {
    public static void main(String[] args) throws IOException {
        // Använd standardportnummer om inget annat anges
        int port = 1234;
        if (args.length > 0) {
            port = Integer.parseInt(args[0]);
        }


