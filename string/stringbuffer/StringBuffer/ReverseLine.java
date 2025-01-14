import java.util.StringTokenizer;
 
public class ReverseLine
	{
         public static void main(String[] args) 
			 {
              String line = "God is great";
              //specify delimiter as " " space
               StringTokenizer st = new StringTokenizer(line, " ");
               String rline = "";

//				while(st.hasMoreTokens())
      //          {
	//				System.out.println(st.nextToken());
        //        }

                while(st.hasMoreTokens())
                {
                        rline = st.nextToken() + " " + rline;
                }
                
                System.out.println("after reverse : " + rline);
        }
}
 
