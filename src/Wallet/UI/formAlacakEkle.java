package Wallet.UI;

import javax.swing.*;

import static Wallet.UI.MainWindow.*;
import static Wallet.UI.MainWindow.panel;

public class formAlacakEkle {

    public static void alacakEkle(){
        screen();

        JTextField txtadi = new JTextField();
        JTextField txtTutar = new JTextField();
        JLabel lIban = new JLabel("Alıcaklının Adı");
        JLabel lTutar = new JLabel("Alıcağınız Tutar");
        JButton gonder = new JButton("Gönder");

        lIban.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);
        txtadi.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 2, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);
        lTutar.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 3, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);
        txtTutar.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 4, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);
        gonder.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 5 + 10, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);

        panel.add(lIban);
        panel.add(txtadi);
        panel.add(txtTutar);
        panel.add(lTutar);
        panel.add(gonder);
        gonder.addActionListener(actionEvent -> Alacak.alacak());

    }
}
