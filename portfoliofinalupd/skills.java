import javax.swing.*;
import java.awt.event.*;

public class skills extends JFrame{
    skills(){
        JButton exit;

        setTitle("Skills");
        setSize(1183, 581);
        setContentPane(new JLabel(new ImageIcon("skillsbg.png")));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setUndecorated(true);
        setVisible(true);

        exit = new JButton();
        exit.setBounds(540, 510, 100, 40);
        exitHandler handler1 = new exitHandler();
        exit.addActionListener(handler1);
        exit.setIcon(new ImageIcon("exit.png"));
        exit.setBorder(BorderFactory.createEmptyBorder());
        add(exit);
        
    }
    private class exitHandler implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            dispose();
        }
    }
    
}
