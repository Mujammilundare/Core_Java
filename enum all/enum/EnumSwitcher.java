public class EnumSwitcher
	{
public enum Grade { A, B, C, D, F, INCOMPLETE };
 
	public static void main(String[] args) {
			Grade examGrade	= Grade.C;
 		System.out.println("Switching based on the enums values.");
		System.out.println();
		switch (examGrade) {
			case A:
				System.out.println("The students grade is " + Grade.A);
				break;
			case B: // fall through to C
			case C:
				System.out.println("The students grade is " + Grade.C);
				break;
			case D: // fall through to F
			case F:
				System.out.println("The students grade is " + Grade.F);
				break;
			case INCOMPLETE:
				System.out.println("The students grade is " + Grade.INCOMPLETE);
				break;
			default:
				System.out.println("The students grade is unknown.");
				break;
		}
 
	}
}