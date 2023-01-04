package Wallet.UI;

import javax.swing.*;

import static Wallet.UI.MainWindow.*;
import static Wallet.UI.MainWindow.panel;

public class FormKartbilgileriEkle {
    public static void formKartbilgileriEkle(){

        screen();

        JTextField txtnumara = new JTextField();
        JTextField txtyil = new JTextField();
        JTextField txtccv = new JTextField();
        JTextField txtTutar = new JTextField();
        JLabel lnumara = new JLabel("Kart Numarası");
        JLabel lyil = new JLabel("Ay/Yil");
        JLabel lccv = new JLabel("CCV");
        JLabel lTutar = new JLabel("Hesap Tutar");
        JButton gonder = new JButton("Gönder");

        lnumara.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 * 1, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        txtnumara.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 *2 , arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        lyil.setBounds(arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 10 * 1, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        txtyil.setBounds(arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 10 * 2, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        lccv.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 * 3, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        txtccv.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 * 4, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        lTutar.setBounds(arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 10 * 3, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        txtTutar.setBounds(arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 10 * 4, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        gonder.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 6, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 10);

        panel.add(lnumara);
        panel.add(txtnumara);
        panel.add(lyil);
        panel.add(txtyil);
        panel.add(lccv);

        panel.add(txtccv);
        panel.add(lTutar);
        panel.add(txtTutar);
        panel.add(gonder);

        gonder.addActionListener(actionEvent -> KartBilgileri.kartBilgileri());
    }
}
