
public class Test {
	public static void main(String args[]){

		Test t=new Test();
		t.finalize();
		t.finalize();
		t=null;
		System.gc();
		System.out.println("End of main");
		
	}
	
	public void finalize(){
		
		System.out.println("Fianlize method called");
	}

}
