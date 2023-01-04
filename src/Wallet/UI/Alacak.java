package Wallet.UI;

import Wallet.DataAccess.Repositories.AccountRepo;
import Wallet.DataAccess.Repositories.AssetRepo;
import Wallet.DataAccess.Repositories.IAccountRepo;
import Wallet.DataAccess.Repositories.IAssetRepo;
import Wallet.Entities.Account;
import Wallet.Entities.Asset;

import javax.swing.*;

import java.util.ArrayList;

import static Wallet.UI.MainWindow.*;
public class Alacak {

    public static void alacak(){
        screen();

        IAssetRepo repo = new AssetRepo();
        ArrayList<Asset> assets = repo.getAssetsByUserId(user.id.get());
        ArrayList<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"Alınacak Bilgisi", "Miktar"});
        for (int i = 0; i < assets.size(); i++) {
            System.out.println(assets.get(i).description.get());
            Object[] obj = {assets.get(i).description.get(), assets.get(i).amount.get()};
            list.add(obj);
        }
        JTable tabloAlacak = new JTable(list.toArray(new Object[][]{}), new String[]{"Alınacak Bilgisi", "Miktar"});


        JButton alacakSil = new JButton("Alacak Sil");
        JButton alacakekle = new JButton("Alacak ekle");
        alacakSil.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 * 5 + 10, arac.getScreenSize().width / 2 / 6, arac.getScreenSize().height / 2 / 16);
        alacakekle.setBounds(arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 10 * 5 + 10, arac.getScreenSize().width / 2 / 6, arac.getScreenSize().height / 2 / 16);

        panel.add(alacakSil);
        panel.add(alacakekle);
        alacakekle.addActionListener(actionEvent -> FormAlacakEkle.alacakEkle());

        tabloAlacak.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10, arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 4 * 2);

        panel.add(tabloAlacak);
    }
}
