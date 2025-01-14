public class Program
{
    public static void main(String[] args)
    {
        try
        {
            // Create two new TestScore objects.
            TestScores tom = new TestScores("Tom", 84);
            TestScores jerry = new TestScores("Jerry", 84);

            // Determine how tom compares to jerry.
            int comparison = tom.compareTo(jerry);

			System.out.println(comparison);
            // Print out the results of the comparison.
            System.out.print("Tom's test score was ");

            if (comparison == -1)
                System.out.print("less than ");
            else if (comparison == 0)
                System.out.print("equal to ");
            else
                System.out.print("greater than ");

            System.out.println("Jerry's test score.");
        }
        catch (IllegalArgumentException ex)
        {
            System.out.println(ex.toString());
        }
    }
}

/*
Output:
Tom's test score was less than Jerry's test score.
*/

class TestScores implements Comparable
{
    private String studentName;
    private int score;

    public TestScores(String nameOfStudent,  int testScore)
    {
        studentName = nameOfStudent;
        score = testScore;
    }

    // Implements Comparable.compareTo
    // Compares the test scores of the two objects.
    public int compareTo(Object obj)
    {
        if (obj instanceof TestScores)
        {
            TestScores objTestScores = (TestScores)obj;
            if (score < objTestScores.score)
                return -1;
            else if (score > objTestScores.score)
                return 1;
            else
                return 0;
        }
        else
        {
            throw new IllegalArgumentException("obj must be an " +
                " instance of a TestScores object.");
        }
    }

}

/*
Use the compareTo method of the Comparable interface to compare two objects of the same type. The rules for the return values for compareTo are summarized as follows:

Condition
 Return Value
 
The object implementing compareTo is less than the parameter passed to compareTo.
 -1
 
The object implementing compareTo is equal to the parameter passed to compareTo.
 0
 
The object implementing compareTo is greater than the parameter passed to compareTo.
 1
 

The method used to compare two objects is up to the developer of the class. Usually this is determined by comparing some or all of the fields of the class.


*/