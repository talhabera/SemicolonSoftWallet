package Wallet.UI;

import javax.swing.*;

import static Wallet.UI.MainWindow.*;
public class Alacak {

    static String data[][] = {{"Ahmet", "1500"},
            {"vELİ", "1600"},
            {"MUHAMMET", "18987"},
            {"TALHA", "2357"},
            {"EMİR", "543"},
            {"elektrik", "1234"}};
    static String kolonAdlari[] = {"Kişi", "Alınacak tutar"};

    public static JTable tabloAlacak = new JTable(data, kolonAdlari);
    public static void alacak(){
        screen();
        JButton odemeGonder = new JButton("Ödeme");
        odemeGonder.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 5 + 10, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);
        panel.add(odemeGonder);

        tabloAlacak.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10, arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 4 * 2);

        panel.add(tabloAlacak);
    }
}
