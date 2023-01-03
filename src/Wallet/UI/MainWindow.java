package Wallet.UI;


import java.awt.*;
import javax.swing.*;

public class MainWindow {
    public static JFrame pencere = new JFrame();
    public static Toolkit arac = Toolkit.getDefaultToolkit();
    public static JPanel panel = new JPanel(null);

    public static void screen() {
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        pencere.setSize(arac.getScreenSize().width / 2, arac.getScreenSize().height / 2);
        pencere.setAlwaysOnTop(true);
        pencere.setLocationRelativeTo(null);
        pencere.setResizable(false);

        panel.removeAll();

        //panel.setBackground(Color.yellow);

        JButton profil = new JButton("Profil");
        JButton hesabim = new JButton("Hesabım");
        JButton eft = new JButton("EFT/Havale");
        JButton odeme = new JButton("Ödeme");
        profil.setBounds(0, 0, arac.getScreenSize().width / 2 / 7, arac.getScreenSize().height / 2 / 4);
        hesabim.setBounds(0, arac.getScreenSize().height / 2 / 4, arac.getScreenSize().width / 2 / 7, arac.getScreenSize().height / 2 / 4);
        eft.setBounds(0, arac.getScreenSize().height / 2 / 4 * 2, arac.getScreenSize().width / 2 / 7, arac.getScreenSize().height / 2 / 4);
        odeme.setBounds(0, arac.getScreenSize().height / 2 / 4 * 3, arac.getScreenSize().width / 2 / 7, arac.getScreenSize().height / 2 / 4);

        panel.add(profil);
        profil.addActionListener(actionEvent -> {
            Profil.profil();
        });

        panel.add(hesabim);
        hesabim.addActionListener(actionEvent -> {
            Hesap.hesap();
        });

        panel.add(eft);
        eft.addActionListener(actionEvent -> {
            Aktarim.aktarim();
        });

        panel.add(odeme);
        odeme.addActionListener(actionEvent -> {
            Odeme.odeme();
        });

        pencere.add(panel);
        pencere.setVisible(true);
    }
}