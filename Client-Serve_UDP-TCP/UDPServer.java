import java.io.*;
import java.net.*;
class UDPServer {
    public static void main(String args[]) throws Exception
    {
        DatagramSocket socketServidor = new DatagramSocket(port);
        byte[] dadosRecebidos = new byte[1024];
        byte[] dadosEnviados = new byte[1024];
        while(true)
        {
            DatagramPacket pacoteRecebido = new DatagramPacket(dadosRecebidos,
            dadosRecebidos.length);
            socketServidor.receive(pacoteRecebido);
            String frase = new String(pacoteRecebido.getData());
            InetAddress IPAddress = pacoteRecebido.getAddress();
            int porta = pacoteRecebido.getPort();
            String fraseEmMaiusculas = frase.toUpperCase();
            dadosEnviados = fraseEmMaiusculas.getBytes();
            DatagramPacket pacoteEnviado = new DatagramPacket(dadosEnviados,dadosEnviados.length, IPAddress, porta);
            socketServidor.send(pacoteEnviado);
        }
    }
}
