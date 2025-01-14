//Check out the following legal-but-strange-the-first-time-you-see-it code:

class Popcorn
	{
		public void pop() {	System.out.println("popcorn");}
	}


class Food 
	{
Popcorn p = new Popcorn() 
	{
		public void pop() {System.out.println("anonymous popcorn");}
	};

	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}

}