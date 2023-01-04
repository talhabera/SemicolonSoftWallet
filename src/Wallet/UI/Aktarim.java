package Wallet.UI;

import javax.swing.*;

import static Wallet.UI.MainWindow.*;

public class Aktarim {


    public static void aktarim() {
        screen();

        JTextField txtIban = new JTextField();
        JTextField txtTutar = new JTextField();
        JLabel lIban = new JLabel("Iban NUMARASI ");
        JLabel lTutar = new JLabel("Göndermek İstediğiniz Tutar");
        JButton gonder = new JButton("Gönder");

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
