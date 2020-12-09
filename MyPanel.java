import javax.swing.*;

/**
 * 과제#3
 *
 * @author (2019315026 전유정, 2019315011 조은채)
 * @version (2020.12.09)
 */
public class MyPanel extends JPanel
{
    public MyPanel(){
        JLabel lbName = new JLabel("이름");
        JLabel lbDepartment = new JLabel("학과");
        JLabel lbAddress = new JLabel("주소");
        
        JTextField tfName = new JTextField(20);
        JTextField tfDepartment = new JTextField("글로벌소프트웨어학과", 20);
        JTextField tfAddress = new JTextField("아산시 ...", 20);
        
        this.add(lbName);
        this.add(tfName);
        this.add(lbDepartment);
        this.add(tfDepartment);
        this.add(lbAddress);
        this.add(tfAddress);
    }
}
