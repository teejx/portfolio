import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class PersonalInfo {
    private String name;
    private String birthday;
    private String number;
    private String address;
    private String address1;
    private String address2;
    private String occupation;
    private String status;
    private String course;
    private String school;

    public PersonalInfo(String name, String birthday, String number, String address, String address1, String address2, String occupation, String status, String course, String school) {
        this.name = name;
        this.birthday = birthday;
        this.number = number;
        this.address = address;
        this.address1 = address1;
        this.address2 = address2;
        this.occupation = occupation;
        this.status = status;
        this.course = course;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getNumber() {
        return number;
    }

    public String getAddress() {
        return address;
    }
    
    public String getAddress1() {
        return address1;
    }
    
    public String getAddress2() {
        return address2;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getStatus() {
        return status;
    }

    public String getCourse() {
        return course;
    }

    public String getSchool() {
        return school;
    }
}

class InfoFrame extends JFrame {
    private PersonalInfo personalInfo;
    JButton homeBtn,exit;

    public InfoFrame(PersonalInfo personalInfo) {
        this.personalInfo = personalInfo;
        
        setTitle("Portfolio by Teej");
        setSize(1280, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        Image icon = Toolkit.getDefaultToolkit().getImage("logo.png");
        setIconImage(icon);
        setVisible(true);

        JPanel mainPanel = new JPanel(new BorderLayout());
        setContentPane(mainPanel);
        // this is my buttons


        JScrollPane scrollPane = new JScrollPane();
        mainPanel.add(scrollPane, BorderLayout.CENTER);

        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(null);
        contentPanel.setPreferredSize(new Dimension(0, 1500));
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

        JLabel nameLabel = new JLabel(personalInfo.getName());
        nameLabel.setBounds(590, 375, 420, 30);
        nameLabel.setFont(new Font("Borsok", Font.BOLD, 27));
        nameLabel.setForeground(Color.BLACK);
        contentPanel.add(nameLabel);

        JLabel bdayLabel = new JLabel(personalInfo.getBirthday());
        bdayLabel.setBounds(590, 475, 420, 30);
        bdayLabel.setFont(new Font("Borsok", Font.BOLD, 27));
        bdayLabel.setForeground(Color.BLACK);
        contentPanel.add(bdayLabel);

        JLabel numberLabel = new JLabel(personalInfo.getNumber());
        numberLabel.setBounds(590, 575, 420, 30);
        numberLabel.setFont(new Font("Borsok", Font.BOLD, 27));
        numberLabel.setForeground(Color.BLACK);
        contentPanel.add(numberLabel);

        JLabel addressLabel = new JLabel(personalInfo.getAddress());
        addressLabel.setBounds(590, 675, 600, 30);
        addressLabel.setFont(new Font("Borsok", Font.BOLD, 27));
        addressLabel.setForeground(Color.BLACK);
        contentPanel.add(addressLabel);

        JLabel addressLabel1 = new JLabel(personalInfo.getAddress1());
        addressLabel1.setBounds(590, 705, 600, 30);
        addressLabel1.setFont(new Font("Borsok", Font.BOLD, 27));
        addressLabel1.setForeground(Color.BLACK);
        contentPanel.add(addressLabel1);

        JLabel addressLabel2 = new JLabel(personalInfo.getAddress2());
        addressLabel2.setBounds(590, 735, 600, 30);
        addressLabel2.setFont(new Font("Borsok", Font.BOLD, 27));
        addressLabel2.setForeground(Color.BLACK);
        contentPanel.add(addressLabel2);

        JLabel occupationLabel = new JLabel(personalInfo.getOccupation());
        occupationLabel.setBounds(590, 775, 420, 30);
        occupationLabel.setFont(new Font("Borsok", Font.BOLD, 27));
        occupationLabel.setForeground(Color.BLACK);
        contentPanel.add(occupationLabel);

        JLabel statusLabel = new JLabel(personalInfo.getStatus());
        statusLabel.setBounds(590, 875, 420, 30);
        statusLabel.setFont(new Font("Borsok", Font.BOLD, 27));
        statusLabel.setForeground(Color.BLACK);
        contentPanel.add(statusLabel); 

        JLabel courseLabel = new JLabel(personalInfo.getCourse());
        courseLabel.setBounds(590, 975, 420, 30);
        courseLabel.setFont(new Font("Borsok", Font.BOLD, 27));
        courseLabel.setForeground(Color.BLACK);
        contentPanel.add(courseLabel); 

        JLabel schoolLabel = new JLabel(personalInfo.getSchool());
        schoolLabel.setBounds(590, 1075, 440, 30);
        schoolLabel.setFont(new Font("Borsok", Font.BOLD, 27));
        schoolLabel.setForeground(Color.BLACK);
        contentPanel.add(schoolLabel);

        JLabel imageLabel = new JLabel(new ImageIcon("aboutme.png"));
        imageLabel.setBounds(0, 0, 1280, 1500);
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