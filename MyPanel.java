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
        textArea.setEditable(false);
                
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
        
        tfName.addActionListener(this);
        tfDepartment.addActionListener(this);
        cb_grade.addActionListener(this);
        tfAddress.addActionListener(this);
        b_add.addActionListener(this);
        b_clear.addActionListener(this);
                
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource().equals(b_add)){
            String text1 = tfName.getText();
            textArea.append("이름 : " + text1 + "\n");
                
            String text2 = tfDepartment.getText();
            textArea.append("학과 : " + text2 + "\n");
                
            String text3 = cb_grade.getSelectedItem().toString();
            textArea.append("학년 : " + text3 + "\n");
            
            String text4 = tfAddress.getText();
            textArea.append("주소 : " + text4 + "\n");
            textArea.append("---------------------------------------------\n");
        }
        
        if(e.getSource().equals(b_clear)){
            textArea.setText("");
        }
    }
}
