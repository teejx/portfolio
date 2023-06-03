import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame();
        frame.setTitle("Main Menu");
        frame.setSize(1280, 665);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setLayout(null);
        Image icon = Toolkit.getDefaultToolkit().getImage("logo.png");
        frame.setIconImage(icon);
        frame.setLayout(new BorderLayout());

        JLabel imageLabel = new JLabel(new ImageIcon("Untitled.gif"));
        frame.setContentPane(imageLabel);

        JButton enterButton = new JButton();
        enterButton.setIcon(new ImageIcon("enter.png"));
        enterButton.setBounds(570, 300, 100, 40);
        enterButton.setBorder(BorderFactory.createEmptyBorder());
        frame.add(enterButton, BorderLayout.CENTER);

        enterButton.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                new HomePage();
                frame.dispose();
            }
        });

        JButton exit = new JButton();
        exit.setIcon(new ImageIcon("exit.png"));
        exit.setBounds(570, 345, 100, 40);
        exit.setBorder(BorderFactory.createEmptyBorder());
        frame.add(exit, BorderLayout.CENTER);

        exit.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                frame.dispose();
            }
        });
        frame.setVisible(true);
    }

}
