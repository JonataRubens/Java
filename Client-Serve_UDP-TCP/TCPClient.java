import java.io.*;
import java.net.*;
class TCPClient 
{
    public static void main(String argv[]) throws Exception
    {
        String frase;
        String fraseModificada;
        BufferedReader doUsuario =
        new BufferedReader(new InputStreamReader(System.in));
        Socket socketCliente = new Socket("ip", porta);
        DataOutputStream paraServidor =
        new DataOutputStream(socketCliente.getOutputStream());
        BufferedReader doServidor =
        new BufferedReader(new
        InputStreamReader(socketCliente.getInputStream()));
        frase = doUsuario.readLine();
        paraServidor.writeBytes(frase + '\n');
        fraseModificada = doServidor.readLine();
        System.out.println("Do Servidor: " + fraseModificada);
        socketCliente.close();
    }
}
