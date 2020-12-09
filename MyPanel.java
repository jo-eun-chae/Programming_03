import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * 과제#3
 *
 * @author (2019315026 전유정, 2019315011 조은채)
 * @version (2020.12.09)
 */
public class MyPanel extends JPanel implements ActionListener
{
    JTextField tfName;
    JTextField tfDepartment;
    JTextField tfAddress;
    JComboBox<String> cb_grade;
    
    JButton b_add;
    JButton b_clear;
    JTextArea textArea;
    public MyPanel(){
        JLabel lbName = new JLabel("이름");
        JLabel lbDepartment = new JLabel("학과");
        JLabel lbAddress = new JLabel("주소");
        JLabel lbGrade = new JLabel("학년");
        
        tfName = new JTextField(20);
        tfDepartment = new JTextField("글로벌소프트웨어학과", 20);
        tfAddress = new JTextField("아산시 ...", 20);
        
        String[] grade = {"1학년", "2학년", "3학년", "4학년"};
        cb_grade = new JComboBox<String>(grade);
        
        b_add = new JButton("추가");
        b_clear = new JButton("Clear");
        textArea = new JTextArea(15, 25);
                
        this.add(lbName);
        this.add(tfName);
        this.add(lbDepartment);
        this.add(tfDepartment);
        this.add(lbAddress);
        this.add(tfAddress);
        this.add(lbGrade);
        this.add(cb_grade);
        
        this.add(b_add);
        this.add(b_clear);
        this.add(new JScrollPane(textArea));

        b_add.addActionListener(this);
        //b_clear.addActionListener(this);
    }
    public void actionPerformed(ActionEvent e){
        textArea.append("이름 : " + tfName.getText());
        textArea.append("\n학과 : " + tfDepartment.getText());
        textArea.append("\n학년 : " + cb_grade.getSelectedItem().toString());
        textArea.append("\n주소 : " + tfAddress.getText());
        textArea.append("\n---------------------\n");
    }
}