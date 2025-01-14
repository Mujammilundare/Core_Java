public class AutoClose implements AutoCloseable {
    
    @Override
    public void close() {
        System.out.println(">>> close()");
        throw new RuntimeException("Exception in close()");
    }
    
    public void work() throws MyException {
        System.out.println(">>> work()");
        throw new MyException("Exception in work()");
    }
        
    public static void runWithMasking() throws MyException {
        AutoClose autoClose = new AutoClose();
        try {
            autoClose.work();
        } finally {
            autoClose.close();
        }
    }
    
    public static void runWithoutMasking() throws MyException {
        AutoClose autoClose = new AutoClose();
        MyException myException = null;
        try {
            autoClose.work();
        } catch (MyException e) {
            myException = e;
            throw e;
        } finally {
            if (myException != null) {
                try {
                    autoClose.close();
                } catch (Throwable t) {
                    myException.addSuppressed(t);
                }
            } else {
                autoClose.close();
            }
        }
    }
    
    public static void runInARM() throws MyException {
        try (AutoClose autoClose = new AutoClose()) {
            autoClose.work();
        }
    }
    
    public static void main(String[] args) {
        try {
            runWithMasking();        
        } catch (Throwable t) {
            t.printStackTrace();
        }
        
        try {
            runWithoutMasking();        
        } catch (MyException e) {
            e.printStackTrace();
        }
        
        try {
            runInARM();        
        } catch (MyException e) {
            e.printStackTrace();
        }
    }
}

class MyException extends Exception {
    
    public MyException() {
        super();
    }
    
    public MyException(String message) {
        super(message);
    }
}