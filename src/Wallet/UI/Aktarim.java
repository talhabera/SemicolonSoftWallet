package Wallet.UI;

import javax.swing.*;

import static Wallet.UI.MainWindow.*;

public class Aktarim {
    public static JTextField txtIban = new JTextField();
    public static JTextField txtTutar = new JTextField();
    public static JLabel lIban = new JLabel("Iban NUMARASI ");
    public static JLabel lTutar = new JLabel("Göndermek İstediğiniz Tutar");
    public static JButton gonder = new JButton("Gönder");

    public static void aktarim() {
        screen();

        lIban.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);
        txtIban.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 2, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);
        lTutar.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 3, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);
        txtTutar.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 4, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);
        gonder.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 5 + 10, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);

        panel.add(lIban);
        panel.add(txtIban);
        panel.add(txtTutar);
        panel.add(lTutar);
        panel.add(gonder);
    }
}
