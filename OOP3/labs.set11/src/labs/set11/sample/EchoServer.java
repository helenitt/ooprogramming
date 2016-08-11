package labs.set11.sample;

import java.net.*;
import java.io.*;
import java.util.*;
 
public class EchoServer {
 
  public final static int EchoPort = 7;

  public static void main(String[] args) {

   ServerSocket theServer;
   Socket theConnection;
   PrintStream theOutputStream;
   Scanner theInputStream;
   String EchoInput;

   try {
     theServer = new ServerSocket(EchoPort);
     try {
       while (true) {
         theConnection = theServer.accept();
		while (true) 	{
         theInputStream = new Scanner(theConnection.getInputStream());
         theOutputStream = new PrintStream(theConnection.getOutputStream());
         
         EchoInput = theInputStream.nextLine();
         System.out.println(EchoInput);
         theOutputStream.println(EchoInput);
		}
       }
     }
     catch (IOException e) {
       theServer.close();
       System.err.println(e);
     }

   }  // end try
   catch (IOException e) {
     System.err.println(e);
   }

  }

}
