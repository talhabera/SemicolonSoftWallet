package Wallet.UI;

import Wallet.Services.ProfileService;

import javax.swing.*;

import static Wallet.UI.MainWindow.*;
import static Wallet.UI.MainWindow.panel;

public class KrediKart {
    public static void krediKart(){
        screen();
        String data[][] = {            {"deneme", "15%","435","3456Tl"},
                {"deneme", "15%","435","3456Tl"},
                {"deneme", "15%","435","3456Tl"},
                {"deneme", "15%","435","3456Tl"},
        };
        String kolonAdlari[] = {"Kredi ayrıntısı", "Faiz miktarı","Çekilen Miktar","Ödenen Miktar"};

        JTable tabloKart = new JTable(data, kolonAdlari);


        tabloKart.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10, arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 4 * 2);

        JButton kartSil = new JButton("Kart Sil");
        JButton kartEkle = new JButton("Kart Ekle");
        kartSil.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 * 5 + 10, arac.getScreenSize().width / 2 / 6, arac.getScreenSize().height / 2 / 16);
        kartEkle.setBounds(arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 10 * 5 + 10, arac.getScreenSize().width / 2 / 6, arac.getScreenSize().height / 2 / 16);

        panel.add(kartSil);
        panel.add(kartEkle);
        kartEkle.addActionListener(actionEvent -> FormKrediEkle.formKrediEkle());


        panel.add(tabloKart);

    }
}
