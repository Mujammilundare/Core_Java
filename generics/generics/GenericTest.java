
class MyGeneric<T>
{ 
	T data;
	
	MyGeneric(T t)
	{
		data=t;
	}
	
	T getData()
	{
		return data;
	}
}

class  GenericTest
{
	public static void main(String[] args) 
	{
		MyGeneric<Integer> obj1= new MyGeneric<Integer> (99);
		MyGeneric<Float> obj2=new MyGeneric<Float> (102.2F);

		System.out.println(obj1.getData());
		System.out.println(obj2.getData());
	}
}

