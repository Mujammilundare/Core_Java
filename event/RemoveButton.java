/*
        Remove AWT Button From Applet or Window Frame Example 
        This java example shows how to remove a Button from window frame or an applet.
*/
 
import java.applet.Applet;
import java.awt.Button;
 
/*
<applet code="RemoveButton" width=200 height=200>
</applet>
*/
 
public class RemoveButton extends Applet{
 
        public void init(){
                //create Buttons
                Button Button1 = new Button("Ok");
                Button Button2 = new Button("Cancel");
                
                //add Buttons
                add(Button1);
                add(Button2);
                
                /*
                 * To remove a Button from window, use
                 * void remove(Component c)
                 * method.
                 * 
                 * Remove method removes the specified component from the 
                 * container. 
                 */
                
                remove(Button1);
        } 
}