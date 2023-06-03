import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;

class HomePage extends JFrame {
    JButton b1,b2,b3,b4,b5,ig,fb;
    
    HomePage() {
        MainMenu mainMenu = new MainMenu("Tehrence Joie C. Llenarez", "September 21, 2003 (19)", "09928743033 (DITO)", "Blk 15 Lot 38, Italy Street,", "AFP-PNP Village, Phase 2 Barangay", "Pinagsama, Taguig City, 1630", "Single", "Student", "BSIT-MWA", "National University Manila");
        setContentPane(new JLabel(new ImageIcon("homepage.gif")));
        setLayout(new BorderLayout());
        setLayout(null);

        setSize(1280, 665);
        setTitle("Homepage");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setResizable(false);
        Image icon = Toolkit.getDefaultToolkit().getImage("logo.png");
        setIconImage(icon);

        ig = new JButton();
        ig.setBounds(500, 555, 100, 40);
        ig.setIcon(new ImageIcon("instagram.png"));
        ig.setBorder(BorderFactory.createEmptyBorder());
        add(ig);

        ig.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.instagram.com/tteej.l/"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        fb = new JButton();
        fb.setBounds(645, 555, 100, 40);
        fb.setIcon(new ImageIcon("facebook.png"));
        fb.setBorder(BorderFactory.createEmptyBorder());
        add(fb);

        fb.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop.getDesktop().browse(new URI("https://www.facebook.com/teej.llenarez/"));
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });

        b1 = new JButton();
        b1.setBounds(570, 290, 100, 40);
        b1Handler handler = new b1Handler();
        b1.addActionListener(handler);
        b1.setIcon(new ImageIcon("trophy.png"));
        b1.setBorder(BorderFactory.createEmptyBorder());
        add(b1);

        b2 = new JButton();
        b2.setBounds(570, 340, 100, 40);
        b2Handler handler1 = new b2Handler();
        b2.addActionListener(handler1);
        b2.setIcon(new ImageIcon("skills.png"));
        b2.setBorder(BorderFactory.createEmptyBorder());
        add(b2);

        b3 = new JButton();
        b3.setBounds(570, 390, 100, 40);
        b3Handler handler2 = new b3Handler();
        b3.addActionListener(handler2);
        b3.setIcon(new ImageIcon("hobbies.png"));
        b3.setBorder(BorderFactory.createEmptyBorder());
        add(b3);

        b4 = new JButton();
        b4.setBounds(570, 440, 100, 40);
        b4Handler handler3 = new b4Handler();
        b4.addActionListener(handler3);
        b4.setIcon(new ImageIcon("exit.png"));
        b4.setBorder(BorderFactory.createEmptyBorder());
        add(b4);

        JButton enterButton = new JButton();
        enterButton.setBounds(570, 240, 100, 40);
        enterButton.setIcon(new ImageIcon("profile.png"));
        enterButton.setBorder(BorderFactory.createEmptyBorder());
        add(enterButton);
    
        enterButton.addActionListener((ActionListener) new ActionListener() {
            public void actionPerformed(ActionEvent e) {  
                mainMenu.openInfoFrame();
                dispose();
            }
        });
        

        
    }

    private class b1Handler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            new Trophy();
            dispose();
        }
    }

    private class b2Handler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            new skills();
        }
    }

    private class b3Handler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            new hobbies();
        }
    }

    private class b4Handler implements ActionListener {
        public void actionPerformed(ActionEvent event) {
            dispose();
        }
    }

}
