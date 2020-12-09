import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * Write a description of class MyPanel here.
 *
 * @author (your name)
 * @version (a version number or a date)
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
        
        this.add(b_add);
        this.add(b_clear);
        this.add(textArea);
        this.add(textArea);
    
    }
}
