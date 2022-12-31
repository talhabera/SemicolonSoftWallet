package Wallet.UI;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainWindow{


   public static Toolkit arac = Toolkit.getDefaultToolkit();
   public static JPanel panel = new JPanel(null);
   public static JLabel labelHosgeldin = new JLabel("Merhaba "+"isim");
    public static void screen(){


        JFrame pencere = new JFrame();
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        pencere.setSize(arac.getScreenSize().width/2, arac.getScreenSize().height/2);
        pencere.setAlwaysOnTop(true);
        pencere.setLocationRelativeTo(null);
        pencere.setResizable(false);


        panel.setBackground(Color.yellow);

        JButton profil = new JButton("Profil");
        JButton hesabim = new JButton("Hesabım");
        JButton eft = new JButton("EFT/Havale");
        JButton odeme = new JButton("Ödeme");
        profil.setBounds(0, 0, arac.getScreenSize().width/2/7, arac.getScreenSize().height/2/4);
        hesabim.setBounds(0, arac.getScreenSize().height/2/4, arac.getScreenSize().width/2/7, arac.getScreenSize().height/2/4);
        eft.setBounds(0, arac.getScreenSize().height/2/4*2, arac.getScreenSize().width/2/7, arac.getScreenSize().height/2/4);
        odeme.setBounds(0, arac.getScreenSize().height/2/4*3, arac.getScreenSize().width/2/7, arac.getScreenSize().height/2/4);





        labelHosgeldin.setFont(new Font("Merhaba", Font.PLAIN, 36));
        labelHosgeldin.setForeground(new Color(50, 50, 10));
        labelHosgeldin.setBounds(arac.getScreenSize().width/2/7*2, arac.getScreenSize().height/2/4, arac.getScreenSize().width/2/7*6, 100);
        panel.add(labelHosgeldin);






        panel.add(profil);

        profil.addActionListener(actionEvent->{
            JProfil.JProfil();
        });


        panel.add(hesabim);
        hesabim.addActionListener(actionEvent->{
            JHesabim.JHesabim();
        });
        panel.add(eft);
        eft.addActionListener(actionEvent->{
            JEft.JEFT();
        });
        panel.add(odeme);
        odeme.addActionListener(actionEvent->{
            JOdeme.JOdeme();
        });

        pencere.add(panel);
        pencere.setVisible(true);


    }


}