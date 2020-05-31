import java.awt.Color;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 *
 * @author Jan
 */
public class Palette {

    public static void main(String[] args) {
        new Palette();
    }

    JFrame frame;
    JSpinner spinnerR, spinnerG, spinnerB;
    int R = 0, G = 0, B = 0;
    Color c = new Color(R,G,B);
    JPanel color;
    
    public Palette() {
        frame = new JFrame();
        frame.setSize(500,500);
        frame.setDefaultCloseOperation(3);
        frame.setVisible(true);

        color = new JPanel();
        
        spinnerR = new JSpinner(new SpinnerNumberModel(0, 0, 255, 1));
        spinnerG = new JSpinner(new SpinnerNumberModel(0, 0, 255, 1));
        spinnerB = new JSpinner(new SpinnerNumberModel(0, 0, 255, 1));
        
        spinnerR.setSize(200, 50);
        spinnerR.setVisible(true);
        spinnerR.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                R = (int) spinnerR.getValue();
                System.out.println("R : " + R + ", G : " + G + " , B : " + B);
                setColor(new Color(R, G, B));
            }
        });
        
        spinnerG.setSize(200, 50);
        spinnerG.setVisible(true);
        spinnerG.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                G = (int) spinnerG.getValue();
                System.out.println("R : " + R + ", G : " + G + " , B : " + B);
                setColor(new Color(R, G, B));
            }
        });
        
        spinnerB.setSize(200, 50);
        spinnerB.setVisible(true);
        spinnerB.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                B = (int) spinnerB.getValue();
                System.out.println("R : " + R + ", G : " + G + " , B : " + B);
                setColor(new Color(R, G, B));
            }
        });
        
        JPanel p = new JPanel();
        
        p.add(spinnerR);
        p.add(spinnerG);
        p.add(spinnerB);
        p.add(color);
        
        p.setLayout(new BoxLayout(p, BoxLayout.PAGE_AXIS));
        frame.add(p);
        setColor(c);
    }
    public void setColor(Color col){
        color.setBackground(col);
        c = new Color(col.getRGB());
    }
    public int getColor(){
        return c.getRGB();
    }
}
