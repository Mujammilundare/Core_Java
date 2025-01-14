//In case of call by value original value is not changed

class Operation
	{
 int data=50;

 void change(int data)  //called method ie changer
  {
     data=data+100;
 }
   
  
 public static void main(String args[])
	 {
   Operation op=new Operation();

   System.out.println("before change "+op.data);
   op.change(500);  //calling method
   System.out.println("after change "+op.data);

 }
}