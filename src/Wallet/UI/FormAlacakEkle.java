package Wallet.UI;

import Wallet.DataAccess.Repositories.AssetRepo;
import Wallet.DataAccess.Repositories.IAssetRepo;
import Wallet.Entities.Asset;

import javax.swing.*;

import static Wallet.UI.MainWindow.*;
import static Wallet.UI.MainWindow.panel;

public class FormAlacakEkle {

    public static void alacakEkle(){
        screen();

        JTextField txtadi = new JTextField();
        JTextField txtTutar = new JTextField();
        JLabel lAdi = new JLabel("Alıcaklının Adı");
        JLabel lTutar = new JLabel("Alıcağınız Tutar");
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
            IAssetRepo repo = new AssetRepo();
            Asset asset = new Asset();
            asset.amount.set(Float.parseFloat(txtTutar.getText()));
            asset.description.set(txtadi.getText());
            asset.userId.set(user.id.get());
            repo.addAsset(asset);
            Alacak.alacak();
        });

    }
}
