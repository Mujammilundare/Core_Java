import java.io.*;

public class BasicFileWriting {
    
    private void incorrectWriting() throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream("data"));
        out.writeInt(666);
        out.writeUTF("Hello");
        out.close();
    }
    
    private void correctWriting() throws IOException {
        DataOutputStream out = null;
        try {
            out = new DataOutputStream(new FileOutputStream("data"));
            out.writeInt(666);
            out.writeUTF("Hello");
        } finally {
            if (out != null) {
                out.close();
            }
        }        
    }
    
    private void writingWithARM() throws IOException {
        try (DataOutputStream out 
                = new DataOutputStream(new FileOutputStream("data"))) {
            out.writeInt(666);
            out.writeUTF("Hello");
        }
    }
    
    public static void main(String[] args) throws IOException {
        BasicFileWriting basicFileWriting = new BasicFileWriting();
        basicFileWriting.incorrectWriting();
        basicFileWriting.correctWriting();
        basicFileWriting.writingWithARM();
    }
}