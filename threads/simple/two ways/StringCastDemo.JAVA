import java.util.Vector;

public class StringCastDemo {

	public static void main(String args[]) {
		String username = "asdf";
		String password = "qwer";
		Vector v = new Vector();
		v.add(username);
		v.add(password);
		//               String u = v.elementAt(0); Cannot convert from object to String
		Object u = v.elementAt(0); //Cast not done
		System.out.println("Username : " + u);
		String uname = (String) v.elementAt(0); // cast allowed
		String pass = (String) v.elementAt(1); // cast allowed
		System.out.println();
		System.out.println("Username : " + uname);
		System.out.println("Password : " + pass);
	}
}