package Wallet.UI;

import Wallet.DataAccess.Repositories.CreditRepo;
import Wallet.DataAccess.Repositories.ICreditRepo;
import Wallet.Entities.Credit;

import javax.swing.*;

import java.util.ArrayList;

import static Wallet.UI.MainWindow.*;
import static Wallet.UI.MainWindow.panel;

public class Kredi {
    public static void krediKart(){
        screen();

        ICreditRepo repo = new CreditRepo();
        ArrayList<Credit> credits = repo.getCreditsByUserId(user.id.get());
        ArrayList<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"Kredi Bilgisi", "Çekilen Miktar", "Faizi", "Ödenen Miktar"});
        for (int i = 0; i < credits.size(); i++) {
            System.out.println(credits.get(i).description.get());
            Object[] obj = {credits.get(i).description.get(), credits.get(i).taken.get(), credits.get(i).interest.get(), credits.get(i).taken.get()};
            list.add(obj);
        }
        JTable tablo = new JTable(list.toArray(new Object[][]{}), new String[]{"Kredi Bilgisi", "Çekilen Miktar", "Faizi", "Ödenen Miktar"});

        tablo.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10, arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 4 * 2);

        JButton kartSil = new JButton("Kredi Sil");
        JButton kartEkle = new JButton("Kredi Ekle");
        kartSil.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 * 5 + 10, arac.getScreenSize().width / 2 / 6, arac.getScreenSize().height / 2 / 16);
        kartEkle.setBounds(arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 10 * 5 + 10, arac.getScreenSize().width / 2 / 6, arac.getScreenSize().height / 2 / 16);

        panel.add(kartSil);
        panel.add(kartEkle);
        kartEkle.addActionListener(actionEvent -> FormKrediEkle.formKrediEkle());


        panel.add(tablo);

    }
}
