package  Hotel.Management.System;

import javax.swing.*;

public class Splash extends JFrame {
    Splash(){

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/splash.gif"));     //imageicon used to give location of the image
        JLabel label = new JLabel(imageIcon);            //label is to set image
        label.setBounds(0,0,858,680);
        add(label);

        setLayout(null);
        setLocation(300,80);
        setSize(858,680);
        setVisible(true);

        try{
            Thread.sleep(5000);     //showing only 5sec..
            setVisible(false);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[]args){
        new Splash();
    }
}
