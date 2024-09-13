import java.io.*;
import java.net.*;
class TCPServer {
public static void main(String argv[]) throws Exception
{
    String fraseCliente;
    String FraseMaiusculas;
    ServerSocket socketRecepcao = new ServerSocket(porta);
    while(true) 
    {
        Socket socketConexao = socketRecepcao.accept();
        BufferedReader doCliente =
        new BufferedReader(new
        InputStreamReader(socketConexao.getInputStream()));
        DataOutputStream paraCliente =
        new DataOutputStream(socketConexao.getOutputStream());
        fraseCliente= doCliente.readLine();
        FraseMaiusculas= fraseCliente.toUpperCase() + '\n';
        paraCliente.writeBytes(FraseMaiusculas);
    }
    }
}
