package Wallet.UI;

import java.awt.Color;
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.*;

public class MainWindow{

    public static void screen(){
        Toolkit arac = Toolkit.getDefaultToolkit();
        System.out.println("Ekran = "+arac.getScreenSize());

        JFrame pencere = new JFrame();
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        pencere.setSize(arac.getScreenSize().width/2, arac.getScreenSize().height/2);
        pencere.setAlwaysOnTop(true);
        pencere.setLocationRelativeTo(null);
        pencere.setResizable(false);

        JPanel panel = new JPanel(null);
        panel.setBackground(Color.yellow);

        JButton profil = new JButton("Profil");
        JButton hesabım = new JButton("Hesabım");
        JButton eft = new JButton("EFT/Havale");
        JButton odeme = new JButton("Ödeme");
        profil.setBounds(0, 0, arac.getScreenSize().width/2/7, arac.getScreenSize().height/2/4);
        hesabım.setBounds(0, arac.getScreenSize().height/2/4, arac.getScreenSize().width/2/7, arac.getScreenSize().height/2/4);
        eft.setBounds(0, arac.getScreenSize().height/2/4*2, arac.getScreenSize().width/2/7, arac.getScreenSize().height/2/4);
        odeme.setBounds(0, arac.getScreenSize().height/2/4*3, arac.getScreenSize().width/2/7, arac.getScreenSize().height/2/4);



        panel.add(profil);
        panel.add(hesabım);
        panel.add(eft);
        panel.add(odeme);

        JLabel lblText = new JLabel("Hello World!", SwingConstants.CENTER);
        pencere.getContentPane().add(lblText);


        pencere.add(panel);
        pencere.setVisible(true);

    }
}