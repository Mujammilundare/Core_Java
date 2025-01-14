
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.zip.GZIPOutputStream;

public class Compress {

    private static void compress(String paramString1, String paramString2)
            throws IOException {
        FileInputStream localFileInputStream = new FileInputStream(paramString1);

        Object localObject1 = null;
        try {
            FileOutputStream localFileOutputStream = new FileOutputStream(paramString2);

            Object localObject2 = null;
            try {
                GZIPOutputStream localGZIPOutputStream = new GZIPOutputStream(localFileOutputStream);

                Object localObject3 = null;
                try {
                    byte[] arrayOfByte = new byte[4096];
                    int i = 0;
                    while ((i = localFileInputStream.read(arrayOfByte)) != -1) {
                        localGZIPOutputStream.write(arrayOfByte, 0, i);
                    }
                } catch (Throwable localThrowable6) {
                    localObject3 = localThrowable6;
                    throw localThrowable6;
                } finally {
                    if (localGZIPOutputStream != null) {
                        if (localObject3 != null) {
                            try {
                                localGZIPOutputStream.close();
                            } catch (Throwable localThrowable7) {
                                localObject3.addSuppressed(localThrowable7);
                            }
                        } else {
                            localGZIPOutputStream.close();
                        }
                    }
                }
            } catch (Throwable localThrowable4) {
                localObject2 = localThrowable4;
                throw localThrowable4;
            } finally {
                if (localFileOutputStream != null) {
                    if (localObject2 != null) {
                        try {
                            localFileOutputStream.close();
                        } catch (Throwable localThrowable8) {
                            localObject2.addSuppressed(localThrowable8);
                        }
                    } else {
                        localFileOutputStream.close();
                    }
                }
            }
        } catch (Throwable localThrowable2) {
            localObject1 = localThrowable2;
            throw localThrowable2;
        } finally {
            if (localFileInputStream != null) {
                if (localObject1 != null) {
                    try {
                        localFileInputStream.close();
                    } catch (Throwable localThrowable9) {
                        localObject1.addSuppressed(localThrowable9);
                    }
                } else {
                    localFileInputStream.close();
                }
            }
        }
    }

    public static void main(String[] paramArrayOfString) throws IOException {
        if (paramArrayOfString.length != 2) {
            System.out.println("Synopsis: java Compress input output");
        } else {
            compress(paramArrayOfString[0], paramArrayOfString[1]);
        }
    }
}