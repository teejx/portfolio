import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Trophy extends JFrame{
    Trophy(){
        JLabel color,death,diff,help,home,name,pause,play;;
        JButton homeBtn,exit;

        setTitle("Trophy");
        setSize(1280, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
        Image icon = Toolkit.getDefaultToolkit().getImage("logo.png");
        setIconImage(icon);
        setLayout(null);
        
        JPanel mainPanel = new JPanel(new BorderLayout());
        setContentPane(mainPanel);

        JScrollPane scrollPane = new JScrollPane();
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(0, 1086));
        scrollPane.setViewportView(contentPanel);

        homeBtn = new JButton();
        homeBtn.setBounds(4, 10, 89, 37);
        homeHandler handler = new homeHandler();
        homeBtn.addActionListener(handler);
        homeBtn.setIcon(new ImageIcon("homepage.png"));
        homeBtn.setBorder(BorderFactory.createEmptyBorder());
        contentPanel.add(homeBtn);

        exit = new JButton();
        exit.setBounds(4, 47, 89, 37);
        exitHandler handler1 = new exitHandler();
        exit.addActionListener(handler1);
        exit.setIcon(new ImageIcon("exit.png"));
        exit.setBorder(BorderFactory.createEmptyBorder());
        contentPanel.add(exit);

        home = new JLabel(new ImageIcon("trophy/homescreen.png"));
        home.setBounds(237,127,338,354);
        contentPanel.add(home);

        play = new JLabel(new ImageIcon("trophy/playing.png"));
        play.setBounds(597,127,526,314);
        contentPanel.add(play);

        name = new JLabel(new ImageIcon("trophy/name.png"));
        name.setBounds(237,485,338,274);
        contentPanel.add(name);

        pause = new JLabel(new ImageIcon("trophy/pause.png"));
        pause.setBounds(597,450,522,314);
        contentPanel.add(pause);

        death = new JLabel(new ImageIcon("trophy/death.png"));
        death.setBounds(220,765,338,274);
        contentPanel.add(death);
        
        diff = new JLabel(new ImageIcon("trophy/diff.png"));
        diff.setBounds(563,770,245,269);
        contentPanel.add(diff);

        color = new JLabel(new ImageIcon("trophy/color.png"));
        color.setBounds(812,770,163,269);
        contentPanel.add(color);

        help = new JLabel(new ImageIcon("trophy/help.png"));
        help.setBounds(980,785,157,242);
        contentPanel.add(help);

        JLabel imageLabel = new JLabel(new ImageIcon("trophy/trophybg.png"));
        imageLabel.setBounds(0, 0, 1280, 1086);
        contentPanel.add(imageLabel);


    }
    private class homeHandler implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            new HomePage();
            dispose();
        }
    }

    private class exitHandler implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            dispose();
        }
    }
    
}
