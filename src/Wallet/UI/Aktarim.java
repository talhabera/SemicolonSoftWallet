package Wallet.UI;

import javax.swing.*;

import static Wallet.UI.Profil.tablo;
import static Wallet.UI.MainWindow.*;

public class Aktarim {
    public static JTextField textBox1 = new JTextField();
    public static JTextField textBox2 = new JTextField();
    public static JButton gonder = new JButton("Gönder");
    public static JLabel iban = new JLabel("Iban NUMARASI ");
    public static JLabel tutar = new JLabel("Göndermek İstediğiniz Tutar");


    static void aktarim() {
        screen();

        iban.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);
        textBox1.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 2, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);
        tutar.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 3, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);
        textBox2.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 4, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);
        gonder.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 5 + 10, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);

        panel.add(iban);
        panel.add(textBox1);
        panel.add(textBox2);
        panel.add(tutar);
        panel.add(gonder);
    }
}
