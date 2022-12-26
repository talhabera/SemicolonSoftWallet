package Wallet.UI;

import java.awt.Color;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

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
        profil.setBounds(0, pencere.setSize.height, 150, 100);
        hesabım.setBounds(0, 100, 150, 100);
        eft.setBounds(0, 200, 150, 100);
        odeme.setBounds(0, 300, 150, 100);


        panel.add(profil);
        panel.add(hesabım);
        panel.add(eft);
        panel.add(odeme);

        pencere.add(panel);
        pencere.setVisible(true);

    }
}