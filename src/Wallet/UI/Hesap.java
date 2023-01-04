package Wallet.UI;

import java.awt.*;
import javax.swing.*;

import static Wallet.UI.MainWindow.*;

public class Hesap {
    static String data[][] = {{"Turkcell", "1500"},
            {"VODAFON", "1600"},
            {"İSKİ", "18987"},
            {"iNTERNET", "2357"},
            {"cep tel", "543"},
            {"elektrik", "1234"}};
    static String kolonAdlari[] = {"Kart İsmi", "Para Tutarı"};

    public static JTable tablo = new JTable(data, kolonAdlari);


    public static void hesap() {
        screen();

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
