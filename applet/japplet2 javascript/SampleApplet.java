import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.net.URL;
import java.net.MalformedURLException;
 
public class SampleApplet extends Applet {
 
    private JFrame frame;
    private JButton button;
    private URL javaScript;
 
    public void init() {
        frame = new JFrame();
        frame.setDefaultCloseOperation( JFrame.DISPOSE_ON_CLOSE );
 
        try {
            javaScript = new URL( "javascript:alert('Hello, Mars!')" );
        } catch( MalformedURLException exception ) {
            exception.printStackTrace();
        }
 
        button = new JButton( "Run JavaScript" );
        button.addActionListener( new ActionListener() {
            public void actionPerformed( ActionEvent event ) {
                getAppletContext().showDocument( javaScript, "_self" );
            }
        });
 
        frame.getContentPane().add( button );
        frame.setSize( 200, 50 );
        frame.setVisible( true );
    }
}