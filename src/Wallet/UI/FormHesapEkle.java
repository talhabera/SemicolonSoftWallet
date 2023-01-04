package Wallet.UI;

import Wallet.DataAccess.Repositories.AccountRepo;
import Wallet.DataAccess.Repositories.AssetRepo;
import Wallet.DataAccess.Repositories.IAccountRepo;
import Wallet.DataAccess.Repositories.IAssetRepo;
import Wallet.Entities.Account;
import Wallet.Entities.Asset;

import javax.swing.*;

import static Wallet.UI.MainWindow.*;
import static Wallet.UI.MainWindow.panel;

public class FormHesapEkle {
    public static void formhesapEkle(){

        screen();

        JTextField txtadi = new JTextField();
        JTextField txtTutar = new JTextField();
        JLabel lAdi = new JLabel("Hesap Adı");
        JLabel lTutar = new JLabel("Hesap Tutar");
        JButton gonder = new JButton("Gönder");

        lAdi.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);
        txtadi.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 2, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);
        lTutar.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 3, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);
        txtTutar.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 4, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);
        gonder.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 5 + 10, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);

        panel.add(lAdi);
        panel.add(txtadi);
        panel.add(txtTutar);
        panel.add(lTutar);
        panel.add(gonder);
        gonder.addActionListener(actionEvent -> {
            IAccountRepo repo = new AccountRepo();
            Account acc = new Account();
            acc.balance.set(Float.parseFloat(txtTutar.getText()));
            acc.description.set(txtadi.getText());
            acc.userId.set(user.id.get());
            repo.addAccount(acc);
            Hesap.hesap();
        });
    }
}
