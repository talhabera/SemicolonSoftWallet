package Wallet.UI;

import Wallet.DataAccess.Repositories.AccountRepo;
import Wallet.DataAccess.Repositories.IAccountRepo;
import Wallet.Entities.Account;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

import static Wallet.UI.MainWindow.*;

public class Hesap {
    static String data[][] = {{"Turkcell", "1500"},
            {"VODAFON", "1600"},
            {"İSKİ", "18987"},
            {"iNTERNET", "2357"},
            {"cep tel", "543"},
            {"elektrik", "1234"}};

    public static void hesap() {
        screen();

        IAccountRepo repo = new AccountRepo();
        ArrayList<Account> accounts = repo.getAccountsByUserId(user.id.get());
        ArrayList<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"Hesap İsmi", "Bakiye"});
        for (int i = 0; i < accounts.size(); i++) {
            System.out.println(accounts.get(i).description.get());
            Object[] obj = {accounts.get(i).description.get(), accounts.get(i).balance.get()};
            list.add(obj);
        }
        JTable tablo = new JTable(list.toArray(new Object[][]{}), new String[]{"Hesap İsmi", "Bakiye"});


        JButton hesapSil = new JButton("Hesap Sil");
        JButton hesapEkle = new JButton("Hesap Ekle");
        hesapSil.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 * 5 + 10, arac.getScreenSize().width / 2 / 6, arac.getScreenSize().height / 2 / 16);
        hesapEkle.setBounds(arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 10 * 5 + 10, arac.getScreenSize().width / 2 / 6, arac.getScreenSize().height / 2 / 16);

        panel.add(hesapSil);
        panel.add(hesapEkle);
        hesapEkle.addActionListener(actionEvent -> FormHesapEkle.formhesapEkle());


        tablo.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10, arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 4 * 2);

        panel.add(tablo);
    }
}
