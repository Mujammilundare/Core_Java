import javax.swing.*; 
import javax.swing.event.ChangeEvent; 
import javax.swing.event.ChangeListener; 
import java.awt.*; 
  

class MyPreviewPane extends JLabel{
  Color curColor;
  public MyPreviewPane(JColorChooser chooser) {
    curColor = chooser.getColor();
    ColorSelectionModel model = chooser.getSelectionModel();
    model.addChangeListener(new ChangeListener() {
      public void stateChanged(ChangeEvent evt) {
        ColorSelectionModel model = (ColorSelectionModel) evt.getSource();
        curColor = model.getSelectedColor();
      }
    });
    setPreferredSize(new Dimension(50, 50));
  }
  public void paint(Graphics g) {
    g.setColor(curColor);
    g.fillRect(0, 0, getWidth() - 1, getHeight() - 1);
  }
}

