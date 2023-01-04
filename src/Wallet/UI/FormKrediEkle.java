package Wallet.UI;

import javax.swing.*;

import static Wallet.UI.MainWindow.*;
import static Wallet.UI.MainWindow.panel;

public class FormKrediEkle {
    public  static void formKrediEkle(){

        screen();

        JTextField txtnumara = new JTextField();
        JTextField txtyil = new JTextField();
        JTextField txtccv = new JTextField();
        JTextField txtTutar = new JTextField();
        JLabel lnumara = new JLabel("Kredi Ayrıntısı");
        JLabel lyil = new JLabel("Faiz Miktarı");
        JLabel lccv = new JLabel("Çekilen Miktar");
        JLabel lTutar = new JLabel("Ödenen Miktar");
        JButton gonder = new JButton("Gönder");

        lnumara.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 * 1, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        txtnumara.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 *2 , arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        lyil.setBounds(arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 10 * 1, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        txtyil.setBounds(arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 10 * 2, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        lccv.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 * 3, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        txtccv.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 * 4, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        lTutar.setBounds(arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 10 * 3, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        txtTutar.setBounds(arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 10 * 4, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        gonder.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 7, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 10);

        panel.add(lnumara);
        panel.add(txtnumara);
        panel.add(lyil);
        panel.add(txtyil);
        panel.add(lccv);

        panel.add(txtccv);
        panel.add(lTutar);
        panel.add(txtTutar);
        panel.add(gonder);

        gonder.addActionListener(actionEvent -> KrediKart.krediKart());
    }
}
