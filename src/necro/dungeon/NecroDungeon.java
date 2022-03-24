package necro.dungeon;
import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JLabel;
        
public class NecroDungeon {
    
    JFrame window;
    Container con;
    JPanel tNamePanel, sbuttonPanel;
    JLabel tNameJLabel;
    Font tfont = new Font("Times New Roman", Font.BOLD, 100);
    Font nfont = new Font("Times New Roman", Font.PLAIN, 35);
    JButton sbutton;
    
    public static void main(String[] args) {
        
    new NecroDungeon();
    
    }

    public NecroDungeon(){
        window = new JFrame();
        window.setSize(1100, 700);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.getContentPane().setBackground(Color.black);
        window.setLayout(null);
        window.setVisible(true);
        con = window.getContentPane();
        
        tNamePanel = new JPanel();
        tNamePanel.setBounds(75, 150, 950, 200);
        tNamePanel.setBackground(Color.black);
        tNameJLabel= new JLabel("NECRO DUNGEON");
        tNameJLabel.setForeground(Color.white);
        tNameJLabel.setFont(tfont);
        
        sbuttonPanel = new JPanel();
        sbuttonPanel.setBounds(425, 510, 250, 150);
        sbuttonPanel.setBackground(Color.black);
        
        sbutton = new JButton("START");
        sbutton.setBackground(Color.black);
        sbutton.setForeground(Color.white);
        sbutton.setFont(nfont);
        
        tNamePanel.add(tNameJLabel);
        sbuttonPanel.add(sbutton);
        
        con.add(tNamePanel);
        con.add(sbuttonPanel);
    }
}
