import java.io.*;
import java.util.zip.*;

public class Compress {
    
    private static void compress(String input, String output) throws IOException {
        try(
            FileInputStream fin = new FileInputStream(input);
            FileOutputStream fout = new FileOutputStream(output);
            GZIPOutputStream out = new GZIPOutputStream(fout)
        ) {
            byte[] buffer = new byte[4096];
            int nread = 0;
            while ((nread = fin.read(buffer)) != -1) {
                out.write(buffer, 0, nread);
            }
        }
    }
    
    public static void main(String[] args) throws IOException {
        if (args.length != 2) {
            System.out.println("Synopsis: java Compress input output");
        } else {
            compress(args[0], args[1]);
        }
    }
}