/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clientesSOketS;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.*;
import java.net.InetSocketAddress;

/**
 *
 * @author oracle
 */
public class ClientesSOketS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
		try{
			System.out.println("Creando socket cliente");
			Socket clienteSocket=new Socket();
			System.out.println("Estableciendo la conexi�n");
			
			InetSocketAddress addr=new InetSocketAddress("localhost",5555);
			clienteSocket.connect(addr);

			InputStream is = clienteSocket.getInputStream();
			OutputStream os= clienteSocket.getOutputStream();

			System.out.println("Enviando mensaje");

			String mensaje="mensaje desde el cliente";
			os.write(mensaje.getBytes());

			System.out.println("Mensaje enviado");

			System.out.println("Cerrando el socket cliente");

			clienteSocket.close();

			System.out.println("Terminado");

			}catch (IOException e) {
				e.printStackTrace();
			}
	}
}	