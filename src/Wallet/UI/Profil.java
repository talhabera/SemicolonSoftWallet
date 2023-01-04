package Wallet.UI;

import Wallet.Services.ProfileService;

import javax.swing.*;

import static Wallet.UI.MainWindow.*;

public class Profil {

    public static void profil() {
        screen();
        ProfileService service = new ProfileService();

        JTable tablo = new JTable(service.GetTableDataFromUser(), new String[]{"Bilgiler", "Icerik"});
        tablo.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10, arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 4 * 2);
        panel.add(tablo);
    }
}
