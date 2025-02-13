package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Room extends JFrame {
    JTable table;
    JButton back;
    Room(){

        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(48, 41, 3));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/roomm.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel label = new JLabel(imageIcon1);
        label.setBounds(600,200,200,200);
        panel.add(label);

        table = new JTable();
        table.setBounds(10,40,500,400);
        table.setBackground(new Color(42, 48, 3));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try{
            Con c = new Con();
            String RoomInfo = "Select * from room";
            ResultSet resultSet = c.statement.executeQuery(RoomInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e){
            e.printStackTrace();
        }

        back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(200,500,120,30);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel room = new JLabel("Room NO.");
        room.setBounds(12,15,80,19);
        room.setForeground(Color.WHITE);
        room.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(room);

        JLabel availability = new JLabel("Availability");
        availability.setBounds(119,15,80,19);
        availability.setForeground(Color.WHITE);
        availability.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(availability);

        JLabel clean = new JLabel("Clean Status");
        clean.setBounds(216,15,150,19);
        clean.setForeground(Color.WHITE);
        clean.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(clean);

        JLabel price = new JLabel("Price");
        price.setBounds(330,15,80,19);
        price.setForeground(Color.WHITE);
        price.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(price);

        JLabel Bed = new JLabel("Bed Type");
        Bed.setBounds(417,15,80,19);
        Bed.setForeground(Color.WHITE);
        Bed.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(Bed);

        setUndecorated(true);
        setLayout(null);
        setLocation(500,100);
        setSize(900,600);
        setVisible(true);
    }
    public static void main(String[] args) {
        new  Room();
    }
}
