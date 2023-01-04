package Wallet.UI;

import Wallet.DataAccess.Repositories.AssetRepo;
import Wallet.DataAccess.Repositories.CreditCardRepo;
import Wallet.DataAccess.Repositories.IAssetRepo;
import Wallet.DataAccess.Repositories.ICreditCardRepo;
import Wallet.Entities.Asset;
import Wallet.Entities.CreditCard;
import Wallet.Services.ProfileService;

import javax.swing.*;

import java.awt.*;
import java.util.ArrayList;

import static Wallet.UI.MainWindow.*;


public class KartBilgileri {


    public static void kartBilgileri() {
        screen();

        ICreditCardRepo repo = new CreditCardRepo();
        ArrayList<CreditCard> creditCards = repo.getCreditCardsByUserId(user.id.get());
        ArrayList<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"Kart Bilgisi", "Limiti", "Faizi", "Kullanılan Miktar"});
        for (int i = 0; i < creditCards.size(); i++) {
            System.out.println(creditCards.get(i).description.get());
            Object[] obj = {creditCards.get(i).description.get(), creditCards.get(i).cardLimit.get(), creditCards.get(i).interest.get(), creditCards.get(i).taken.get()};
            list.add(obj);
        }
        JTable tabloKart = new JTable(list.toArray(new Object[][]{}), new String[]{"Kart Bilgisi", "Limiti", "Faizi", "Kullanılan Miktar"});

        ProfileService service = new ProfileService();
        tabloKart.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10, arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 4 * 2);

        JButton kartSil = new JButton("Kart Sil");
        JButton kartEkle = new JButton("Kart Ekle");
        kartSil.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 * 5 + 10, arac.getScreenSize().width / 2 / 6, arac.getScreenSize().height / 2 / 16);
        kartEkle.setBounds(arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 10 * 5 + 10, arac.getScreenSize().width / 2 / 6, arac.getScreenSize().height / 2 / 16);

        panel.add(kartSil);
        panel.add(kartEkle);
        kartEkle.addActionListener(actionEvent -> FormKartbilgileriEkle.formKartbilgileriEkle());


        panel.add(tabloKart);

    }
}
