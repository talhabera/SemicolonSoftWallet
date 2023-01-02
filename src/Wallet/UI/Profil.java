package Wallet.UI;

import javax.swing.*;

import static Wallet.UI.MainWindow.*;

public class Profil {
    static String data[][] = {{"Adı", "Ahmet"},
            {"Soy adı", "Hayri"},
            {"TC", "12345678987"},
            {"ev adresi", "hürriyet mah bakırcılar sok no19 daire 2"},
            {"cep tel", "05380300803"},
            {"para durumu", "1234"}};
    static String kolonAdlari[] = {"Bilgiler", "Icerik"};
    public static JTable tablo = new JTable(data, kolonAdlari);

    public static void profil() {
        screen();

        tablo.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10, arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 4 * 2);
        panel.add(tablo);
    }
}