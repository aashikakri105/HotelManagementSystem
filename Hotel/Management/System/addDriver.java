package Hotel.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addDriver extends JFrame implements ActionListener {
    JTextField nametext, agetext, gendertext, carCtext, carNtext, locText;
    JComboBox comboBox, comboBox1;
    JButton add,back;
    addDriver(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,490);
        panel.setBackground(new Color(44, 3, 48));
        panel.setLayout(null);
        add(panel);

        JLabel label = new JLabel("ADD DRIVING");
        label.setBounds(194,10,200,22);
        label.setForeground(Color.WHITE);
        label.setFont(new Font("Tahoma", Font.BOLD, 22));
        panel.add(label);

        JLabel name = new JLabel("NAME");
       name.setBounds(64,70,102,22);
       name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(name);
        nametext = new JTextField();
        nametext.setBounds(174,70,156,20);
        nametext.setFont(new Font("Tahoma", Font.BOLD,14));
        nametext.setForeground(Color.WHITE);
        nametext.setBackground(new Color(16,108,115));
        panel.add(nametext);

        JLabel age = new JLabel("AGE");
        age.setBounds(64,110,102,22);
        age.setForeground(Color.WHITE);
        age.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(age);
        agetext = new JTextField();
        agetext.setBounds(174,110,156,20);
        agetext.setFont(new Font("Tahoma", Font.BOLD,14));
        agetext.setForeground(Color.WHITE);
        agetext.setBackground(new Color(16,108,115));
        panel.add(agetext);

        JLabel gender = new JLabel("GENDER");
        gender.setBounds(64,150,102,22);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(gender);
        gendertext = new JTextField();
        gendertext.setBounds(174,150,156,20);
        gendertext.setFont(new Font("Tahoma", Font.BOLD,14));
        gendertext.setForeground(Color.WHITE);
        gendertext.setBackground(new Color(16,108,115));
        panel.add(gendertext);
        comboBox = new JComboBox(new String[]{"Male","Female"});
        comboBox.setBounds(176,150,154,20);
        comboBox.setForeground(Color.WHITE);
        comboBox.setFont(new Font("Tahoma", Font.BOLD,14));
        comboBox.setBackground(new Color(14,108,115));
        panel.add(comboBox);


        JLabel carC = new JLabel("CAR COMPANY");
        carC.setBounds(64,190,110,22);
        carC.setForeground(Color.WHITE);
        carC.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(carC);
        carCtext = new JTextField();
        carCtext.setBounds(174,190,156,20);
        carCtext.setFont(new Font("Tahoma", Font.BOLD,14));
        carCtext.setForeground(Color.WHITE);
        carCtext.setBackground(new Color(16,108,115));
        panel.add(carCtext);

        JLabel carN = new JLabel("CAR NAME");
        carN.setBounds(64,230,120,22);
        carN.setForeground(Color.WHITE);
        carN.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(carN);
        carNtext = new JTextField();
        carNtext.setBounds(174,230,156,20);
        carNtext.setFont(new Font("Tahoma", Font.BOLD,14));
        carNtext.setForeground(Color.WHITE);
        carNtext.setBackground(new Color(16,108,115));
        panel.add(carNtext);

        JLabel available = new JLabel("AVAILABLE");
        available.setBounds(64,270,102,22);
        available.setForeground(Color.WHITE);
        available.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(available);

        comboBox1 = new JComboBox(new String[]{"YES","NO"});
        comboBox1.setBounds(176,270,154,20);
        comboBox1.setForeground(Color.WHITE);
        comboBox1.setFont(new Font("Tahoma", Font.BOLD,14));
        comboBox1.setBackground(new Color(14,108,115));
        panel.add(comboBox1);

        JLabel loc= new JLabel("LOCATION");
        loc.setBounds(64,310,120,22);
        loc.setForeground(Color.WHITE);
        loc.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(loc);
        locText = new JTextField();
        locText.setBounds(174,310,156,20);
        locText.setFont(new Font("Tahoma", Font.BOLD,14));
        locText.setForeground(Color.WHITE);
        locText.setBackground(new Color(16,108,115));
        panel.add(locText);

        add = new JButton("ADD");
        add.setBounds(64,380,111,33);
        add.setBackground(Color.BLACK);
        add.setForeground(Color.WHITE);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(198,380,111,33);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        panel.add(back);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/license.png"));
        Image image = imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label1 = new JLabel(imageIcon1);
        label1.setBounds(500,60,300,300);
        panel.add(label1);


        setUndecorated(true);
        setLocation(20,200);
        setLayout(null);
        setSize(900,500);
        setVisible(true);
    }
    public static void main(String[] args) {

        new addDriver();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == add){
            String name = nametext.getText();
            String age = agetext.getText();
            String gender = (String) comboBox.getSelectedItem();
            String company = carCtext.getText();
            String carname = carNtext.getText();
            String available = (String) comboBox1.getSelectedItem();
            String location = locText.getText();

            try {
                Con c = new Con();
                String q = "insert into driver values('"+name+"', '"+age+"', '"+gender+"', '"+company+"', '"+carname+"', '"+available+"', '"+location+"')";
                c.statement.executeUpdate(q);
                JOptionPane.showMessageDialog(null, "Driver Added");
                setVisible(false);

            }catch (Exception E){
                E.printStackTrace();
            }

        }else {
            setVisible(false);
        }

    }
}
