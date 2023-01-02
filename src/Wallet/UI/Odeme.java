package Wallet.UI;

import javax.swing.*;

import static Wallet.UI.MainWindow.*;

public class Odeme {

    static String data[][] = {{"Turkcell", "1500"},
            {"VODAFON", "1600"},
            {"İSKİ", "18987"},
            {"iNTERNET", "2357"},
            {"cep tel", "543"},
            {"elektrik", "1234"}};
    static String kolonAdlari[] = {"Firma", "Odenecek tutar"};
    public static JTable tablo = new JTable(data, kolonAdlari);

    public static void odeme() {
        screen();

        JButton odemeGonder = new JButton("Ödeme");
        odemeGonder.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 5 + 10, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);
        panel.add(odemeGonder);

        tablo.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10, arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 4 * 2);
        panel.add(tablo);
    }
}