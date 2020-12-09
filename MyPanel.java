import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * 과제#3
 *
 * @author (2019315026 전유정, 2019315011 조은채)
 * @version (2020.12.09)
 */
public class MyPanel extends JPanel
{
    JComboBox<String> cb_grade;
    JButton b_add;
    JButton b_clear;
    JTextArea textArea;
    
    public MyPanel(){
        String[] grade = {"1학년", "2학년", "3학년", "4학년"};
        cb_grade = new JComboBox<String>(grade);
        
        b_add = new JButton("추가");
        b_clear = new JButton("Clear");
        textArea = new JTextArea(30,30);
        

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
        this.add(cb_grade);
        this.add(b_add);
        this.add(b_clear);
        this.add(new JScrollPane(textArea));
    }
}
