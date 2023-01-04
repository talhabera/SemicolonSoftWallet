package Wallet.UI;

import Wallet.Services.ProfileService;

import javax.swing.*;

import java.awt.*;

import static Wallet.UI.MainWindow.*;


public class KartBilgileri {


    public  static void kartBilgileri(){
        String data[][] = {            {"deneme", "33%","4353TL","3456Tl"},
                {"deneme", "33%","4353TL","3456Tl"},
                {"deneme", "33%","4353TL","3456Tl"},
                {"deneme", "33%","4353TL","3456Tl"},
                {"deneme", "33%","4353TL","3456Tl"},
        };
         String kolonAdlari[] = {"KART Adı", "Faiz Miktarı","Limit","Çekilen Miktar"};

         JTable tabloKart = new JTable(data, kolonAdlari);

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
