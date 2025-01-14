   

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.colorchooser.ColorSelectionModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class Main {
  public static void main(String[] argv) {
    JColorChooser chooser = new JColorChooser();
    final MyPreviewPanel pre = new MyPreviewPanel(chooser);
    chooser.setPreviewPanel(pre);
    
    ColorSelectionModel model = chooser.getSelectionModel();
    model.addChangeListener(new ChangeListener() {
      public void stateChanged(ChangeEvent evt) {
        ColorSelectionModel model = (ColorSelectionModel) evt.getSource();
        pre.curColor = model.getSelectedColor();
      }
    });
 
    
  }
}
class MyPreviewPanel extends JComponent {
  Color curColor;
  public MyPreviewPanel(JColorChooser chooser) {
    curColor = chooser.getColor();
    
    setPreferredSize(new Dimension(50, 50));
  }
  public void paint(Graphics g) {
    g.setColor(curColor);
    g.fillRect(0, 0, getWidth() - 1, getHeight() - 1);
  }
}

   
    
    
