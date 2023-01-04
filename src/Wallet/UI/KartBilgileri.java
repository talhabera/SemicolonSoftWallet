package Wallet.UI;

import Wallet.Services.ProfileService;

import javax.swing.*;

import java.awt.*;

import static Wallet.UI.MainWindow.*;


public class KartBilgileri {
    static String data[][] = {            {"34567897765", "12/21","435","3456Tl"},

            {"34567897765", "12/21","435","3456Tl"},
            {"34567897765", "12/21","435","3456Tl"},
            {"34567897765", "12/21","435","3456Tl"},
            {"34567897765", "12/21","435","3456Tl"},
            };
    static String kolonAdlari[] = {"KART NUMARASI", "AY/YIL","CCV","MİKTAR"};

    public static JTable tabloKart = new JTable(data, kolonAdlari);

    public  static void kartBilgileri(){

        screen();
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
