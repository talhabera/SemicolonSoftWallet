package Wallet.UI;

import Wallet.DataAccess.Repositories.CreditRepo;
import Wallet.DataAccess.Repositories.DebtRepo;
import Wallet.DataAccess.Repositories.ICreditRepo;
import Wallet.DataAccess.Repositories.IDebtRepo;
import Wallet.Entities.Credit;
import Wallet.Entities.Debt;

import javax.swing.*;

import java.util.ArrayList;

import static Wallet.UI.MainWindow.*;

public class Odeme {



    public static void odeme() {
        screen();

        IDebtRepo repo = new DebtRepo();
        ArrayList<Debt> debts = repo.getDebtsByUserId(user.id.get());
        ArrayList<Object[]> list = new ArrayList<>();
        list.add(new Object[]{"Borç Bilgisi", "Borç Miktarı"});
        for (int i = 0; i < debts.size(); i++) {
            System.out.println(debts.get(i).description.get());
            Object[] obj = {debts.get(i).description.get(), debts.get(i).amount.get()};
            list.add(obj);
        }
        JTable tablo = new JTable(list.toArray(new Object[][]{}), new String[]{"Borç Bilgisi", "Borç Miktarı"});

        JButton odemeSil = new JButton("Borç Sil");
        JButton odemeEkle = new JButton("Borç Ekle");
        odemeSil.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 * 5 + 10, arac.getScreenSize().width / 2 / 6, arac.getScreenSize().height / 2 / 16);
        odemeEkle.setBounds(arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 10 * 5 + 10, arac.getScreenSize().width / 2 / 6, arac.getScreenSize().height / 2 / 16);

        panel.add(odemeSil);
        panel.add(odemeEkle);
        odemeEkle.addActionListener(actionEvent -> FormOdemeEkle.formOdemeEkle());


        tablo.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10, arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 4 * 2);

        panel.add(tablo);
    }
}
