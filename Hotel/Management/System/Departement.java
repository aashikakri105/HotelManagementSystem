package Hotel.Management.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Departement extends JFrame {
    Departement(){
        JPanel panel = new JPanel();
        panel.setBackground(new Color(3,45,47));
        panel.setBounds(5,5,690,490);
        panel.setLayout(null);
        add(panel);

        JTable table = new JTable();
        table.setBounds(0,40,700,350);
        table.setBackground(new Color(4,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try {
            Con c = new Con();
            String departementInfo = "Select * from departement";
            ResultSet resultSet = c.statement.executeQuery(departementInfo);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }

        JButton back = new JButton("BACK");
        back.setBounds(400,410,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel label1 = new JLabel("Departement");
        label1.setBounds(145,11,105,20);
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("Tahoma", Font.ITALIC,14));
        panel.add(label1);

        JLabel label2 = new JLabel("Budget");
        label2.setBounds(431,11,105,20);
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("Tahoma", Font.ITALIC,14));
        panel.add(label2);

        setLayout(null);
        setLocation(550,150);
        setSize(700,500);
        setVisible(true);


    }
    public static void main(String[] args) {
        new Departement();
    }
}
