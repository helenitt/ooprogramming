import java.io.*;
import javax.swing.*;
public class TextInAndOut {
    public static void main (String [] args) throws IOException {
         // open file output stream
        File outFile = new File("data.txt");
        FileOutputStream outStream = new FileOutputStream(outFile);
        PrintWriter pWriter = new PrintWriter(outStream);

        // write an int, boolean, double
        pWriter.println("44");
        pWriter.println("true");
        pWriter.println("7.2");
 
        pWriter.close();
       
        // open file input stream
        File inFile = new File("data.txt");
        FileInputStream inStream = new FileInputStream(inFile);
        DataInputStream inDataStream = new DataInputStream(inStream);

        // read an int, boolean, double
        int n =  inDataStream.readInt();
        boolean b = inDataStream.readBoolean();
        double d = inDataStream.readDouble();

        inDataStream.close();
        // what did we get?
        System.out.println("n = " + n);
        System.out.println("b = " + b);
        System.out.println("d = " + d);

        // can we add n to d?
        System.out.println("n + d = " + (n+d));

    }

}
