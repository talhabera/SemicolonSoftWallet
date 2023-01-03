package Wallet.UI;

import java.awt.*;
import javax.swing.*;

import static Wallet.UI.Profil.tablo;
import static Wallet.UI.MainWindow.*;

public class Hesap {
    public static int bakiye = 12345;
    public static JLabel lBakiye = new JLabel("Bakiyeniz " + bakiye + "TL");

    public static void hesap() {
        screen();

        lBakiye.setFont(new Font("Para", Font.PLAIN, 36));
        lBakiye.setForeground(new Color(50, 50, 10));
        lBakiye.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 4, arac.getScreenSize().width / 2 / 7 * 6, 100);
        panel.add(lBakiye);
    }
}
