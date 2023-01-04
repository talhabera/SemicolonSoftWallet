package Wallet.UI;

import Wallet.DataAccess.Repositories.AssetRepo;
import Wallet.DataAccess.Repositories.DebtRepo;
import Wallet.DataAccess.Repositories.IAssetRepo;
import Wallet.DataAccess.Repositories.IDebtRepo;
import Wallet.Entities.Asset;
import Wallet.Entities.Debt;

import javax.swing.*;

import static Wallet.UI.MainWindow.*;
import static Wallet.UI.MainWindow.panel;

public class FormOdemeEkle {
    public static void formOdemeEkle(){
        screen();

        JTextField txtadi = new JTextField();
        JTextField txtTutar = new JTextField();
        JLabel lbilgi = new JLabel("Ödeme Bilgisi");
        JLabel lTutar = new JLabel("Tutar");
        JButton gonder = new JButton("Gönder");

        lbilgi.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);
        txtadi.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 2, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);
        lTutar.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 3, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);
        txtTutar.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 4, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);
        gonder.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 5 + 10, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);

        panel.add(lbilgi);
        panel.add(txtadi);
        panel.add(txtTutar);
        panel.add(lTutar);
        panel.add(gonder);
        gonder.addActionListener(actionEvent -> {
            IDebtRepo repo = new DebtRepo();
            Debt debt = new Debt();
            debt.amount.set(Float.parseFloat(txtTutar.getText()));
            debt.description.set(txtadi.getText());
            debt.userId.set(user.id.get());
            repo.addDebt(debt);
            Odeme.odeme();
        });
    }
}
