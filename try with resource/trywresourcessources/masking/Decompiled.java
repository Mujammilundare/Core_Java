
import java.io.PrintStream;

public class AutoClose implements AutoCloseable {

    public void close() {
        System.out.println(">>> close()");
        throw new RuntimeException("Exception in close()");
    }

    public void work() throws MyException {
        System.out.println(">>> work()");
        throw new MyException("Exception in work()");
    }

    public static void runWithMasking() throws MyException {
        AutoClose localAutoClose = new AutoClose();
        try {
            localAutoClose.work();
        } finally {
            localAutoClose.close();
        }
    }

    public static void runWithoutMasking() throws MyException {
        AutoClose localAutoClose = new AutoClose();
        Object localObject1 = null;
        try {
            localAutoClose.work();
        } catch (MyException localMyException) {
            localObject1 = localMyException;
            throw localMyException;
        } finally {
            if (localObject1 != null) {
                try {
                    localAutoClose.close();
                } catch (Throwable localThrowable2) {
                    localObject1.addSuppressed(localThrowable2);
                }
            } else {
                localAutoClose.close();
            }
        }
    }

    public static void runInARM() throws MyException {
        AutoClose localAutoClose = new AutoClose();
        Object localObject1 = null;
        try {
            localAutoClose.work();
        } catch (Throwable localThrowable2) {
            localObject1 = localThrowable2;
            throw localThrowable2;
        } finally {
            if (localAutoClose != null) {
                if (localObject1 != null) {
                    try {
                        localAutoClose.close();
                    } catch (Throwable localThrowable3) {
                        localObject1.addSuppressed(localThrowable3);
                    }
                } else {
                    localAutoClose.close();
                }
            }
        }
    }

    public static void main(String[] paramArrayOfString) {
        try {
            runWithMasking();
        } catch (Throwable localThrowable) {
            localThrowable.printStackTrace();
        }
        try {
            runWithoutMasking();
        } catch (MyException localMyException1) {
            localMyException1.printStackTrace();
        }
        try {
            runInARM();
        } catch (MyException localMyException2) {
            localMyException2.printStackTrace();
        }
    }
}