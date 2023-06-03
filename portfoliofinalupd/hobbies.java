import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class hobbies extends JFrame{
    hobbies(){
        JLabel genshin,gow,minecraft,roblox,spiderman,stray,tekken,valorant;
        JLabel genshintext;
        JButton exit;

        setTitle("Hobbies");
        setSize(1280, 550);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setUndecorated(true);
        
        JPanel mainPanel = new JPanel(new BorderLayout());
        setContentPane(mainPanel);

        exit = new JButton();
        exit.setBounds(4, 47, 100, 40);
        exitHandler handler1 = new exitHandler();
        exit.addActionListener(handler1);
        exit.setIcon(new ImageIcon("exit.png"));
        exit.setBorder(BorderFactory.createEmptyBorder());
        add(exit);

        JScrollPane scrollPane = new JScrollPane();
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(0, 6000));
        scrollPane.setViewportView(contentPanel);

        genshin = new JLabel(new ImageIcon("hobbies/genshin.png"));
        genshin.setBounds(140,220,1000,534);
        contentPanel.add(genshin);

        genshintext = new JLabel("Test");
        genshintext.setBounds(140,800,1000,534);
        contentPanel.add(genshintext);

        gow = new JLabel(new ImageIcon("hobbies/gow.png"));
        gow.setBounds(140,933,1000,534);
        contentPanel.add(gow);

        minecraft = new JLabel(new ImageIcon("hobbies/minecraft.png"));
        minecraft.setBounds(140,1646,1000,534);
        contentPanel.add(minecraft);

        roblox = new JLabel(new ImageIcon("hobbies/roblox.png"));
        roblox.setBounds(140,2360,1000,534);
        contentPanel.add(roblox);

        spiderman = new JLabel(new ImageIcon("hobbies/spiderman.png"));
        spiderman.setBounds(140,3074,1000,534);
        contentPanel.add(spiderman);
        
        stray = new JLabel(new ImageIcon("hobbies/stray.png"));
        stray.setBounds(140,3788,1000,534);
        contentPanel.add(stray);

        tekken = new JLabel(new ImageIcon("hobbies/tekken.png"));
        tekken.setBounds(140,4502,1000,534);
        contentPanel.add(tekken);

        valorant = new JLabel(new ImageIcon("hobbies/valorant.png"));
        valorant.setBounds(140,5215,1000,534);
        contentPanel.add(valorant);

        JLabel imageLabel = new JLabel(new ImageIcon("hobbies/hobbiesbg1.png"));
        imageLabel.setBounds(0, 0, 1280, 6000);
        contentPanel.add(imageLabel);
        
        setVisible(true);
        
    }

    private class exitHandler implements ActionListener {
        public void actionPerformed (ActionEvent event) {
            dispose();
        }
    }
    
}
