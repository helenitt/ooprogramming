import java.io.InputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
   This program demonstrates how to use a URL connection 
   to communicate with a web server. Supply the URL on the
   command line, for example
      java URLGet http://horstmann.com/index.html
      Modified by John Walsh March 2015
      
*/
public class URLGet
{
   public static void main(String[] args) throws IOException
   {
      // Get command line arguments

      String urlString;      
      urlString=JOptionPane.showInputDialog("Enter URL");
      
      /*if (args.length == 1)
      {
         urlString = args[0];
      }
      else*/
      
      if (urlString.equals(""))
      {
         urlString = "http://horstmann.com/";
         System.out.println("Using " + urlString);
      }

      //URL class allow you to create URL object consisting of resource and host (http://ittralee.ie/en/
      // URLconnection class takes care of setting up the socket and generating the http request.
      //Everything else remians the same as in Webget programs
      

      URL u = new URL(urlString);
      // Open connection
      URLConnection connection = u.openConnection();

      // Check if response code is HTTP_OK (200)
     
      HttpURLConnection httpConnection 
            = (HttpURLConnection) connection;
      int code = httpConnection.getResponseCode();
      String message = httpConnection.getResponseMessage(); 
      System.out.println(code + " " + message);
      if (code != HttpURLConnection.HTTP_OK)
      {
         return;
      }

      // Read server response

      InputStream instream = connection.getInputStream();
      Scanner in = new Scanner(instream);

      while (in.hasNextLine())
      {
         String input = in.nextLine();
         System.out.println(input);
      }
   }
}
