import java.net.*;
import java.io.*;
import java.util.*;

public class EchoClient {

  public static void main(String[] args) {

    String hostname = "localhost";

    if (args.length > 0) {
      hostname = args[0];
    }

    PrintWriter out = null;
    Scanner networkIn = null;
    
    try {
      Socket theSocket = new Socket(hostname, 7);
      networkIn = new Scanner(theSocket.getInputStream());
      // new InputStream(theSocket.getInputStream()));
      //BufferedReader userIn = new BufferedReader(
       //new InputStreamReader(System.in));
       
       Scanner userIn = new Scanner(System.in);
     	out = new PrintWriter(theSocket.getOutputStream());
       System.out.println("Connected to echo server");

      while (true) {
        String theLine = userIn.nextLine();
        if (theLine.equals(".")) break;
        out.println(theLine);
        out.flush();
        System.out.println(networkIn.nextLine());
      }
      
    }  // end try
    catch (IOException ex) {
      System.err.println(ex);
    }
    finally {
     try {
        if (networkIn != null) networkIn.close(); 
        if (out != null) out.close(); 
     }
     catch (Exception ex) {}
   }

  }  // end main

}  // end EchoClient
