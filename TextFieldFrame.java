import javax.swing.*;

/**
 * 과제#3
 *
 * @author (2019315011 조은채)
 * @version (2020.12.09)
 */
public class TextFieldFrame extends JFrame
{
    public TextFieldFrame(){
        this.setTitle("과제#3(2019315026 전유정, 2019315011 조은채)");
        this.setSize(300, 500);
        
        MyPanel mp = new MyPanel();
        
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
