package Wallet.UI;


import Wallet.DataAccess.Repositories.IUserRepo;
import Wallet.DataAccess.Repositories.UserRepo;
import Wallet.Entities.User;

import java.awt.*;
import javax.swing.*;

public class MainWindow {
    public static User user;
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

        IUserRepo repo = new UserRepo();
        user = repo.getUserByUsername(user.username.get());

        JButton profil = new JButton("Profil");
        JButton hesabim = new JButton("Hesabım");
        JButton odeme = new JButton("Borç");
        JButton alacak = new JButton("Alacak");
        JButton kart = new JButton("Kartlar");
        JButton kredi = new JButton("Kredi");
        profil.setBounds(0, 0, arac.getScreenSize().width / 2 / 7, arac.getScreenSize().height / 2 / 7);
        hesabim.setBounds(0, arac.getScreenSize().height / 2 / 7, arac.getScreenSize().width / 2 / 7, arac.getScreenSize().height / 2 / 7);
        odeme.setBounds(0, arac.getScreenSize().height / 2 / 7 * 2, arac.getScreenSize().width / 2 / 7, arac.getScreenSize().height / 2 / 7);
        alacak.setBounds(0, arac.getScreenSize().height / 2 / 7 * 3, arac.getScreenSize().width / 2 / 7, arac.getScreenSize().height / 2 / 7);
        kart.setBounds(0, arac.getScreenSize().height / 2 / 7 * 4, arac.getScreenSize().width / 2 / 7, arac.getScreenSize().height / 2 / 7);
        kredi.setBounds(0, arac.getScreenSize().height / 2 / 7 * 5, arac.getScreenSize().width / 2 / 7, arac.getScreenSize().height / 2 / 7);

        panel.add(profil);
        profil.addActionListener(actionEvent -> Profil.profil());

        panel.add(hesabim);
        hesabim.addActionListener(actionEvent -> Hesap.hesap());


        panel.add(odeme);
        odeme.addActionListener(actionEvent -> Odeme.odeme());

        panel.add(alacak);
        alacak.addActionListener(actionEvent -> Alacak.alacak());

        panel.add(kart);
        kart.addActionListener(actionEvent -> KartBilgileri.kartBilgileri());

        panel.add(kredi);
        kredi.addActionListener(actionEvent -> Kredi.krediKart());

        pencere.add(panel);
        pencere.setVisible(true);
    }
}