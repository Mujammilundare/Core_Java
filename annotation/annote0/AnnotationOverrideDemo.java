import java.awt.*;
import java.awt.event.*;

public class AnnotationOverrideDemo extends Frame 
	{
   public AnnotationOverrideDemo() 
	   {
      this.addWindowListener(new WindowAdapter() 
		  {

//Add annotation @Override to the windowClosing() as follows, whichs signal your intention, serves as documentation, and also allow the compiler to catch this error.
@Override
				public void windowClosing(WindowEvent e) 
					{
					    System.exit(0);
					}
			});
      setSize(200, 100);
      setTitle("Annotation Override Demo");
      setVisible(true);
   }

   public static void main(String[] args) 
	   {
	   new AnnotationOverrideDemo(); 
      }
}
