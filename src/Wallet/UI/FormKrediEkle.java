package Wallet.UI;

import Wallet.DataAccess.Repositories.CreditCardRepo;
import Wallet.DataAccess.Repositories.CreditRepo;
import Wallet.DataAccess.Repositories.ICreditCardRepo;
import Wallet.DataAccess.Repositories.ICreditRepo;
import Wallet.Entities.Credit;
import Wallet.Entities.CreditCard;

import javax.swing.*;

import static Wallet.UI.MainWindow.*;
import static Wallet.UI.MainWindow.panel;

public class FormKrediEkle {
    public  static void formKrediEkle(){

        screen();

        JTextField txtAdi = new JTextField();
        JTextField txtFaiz = new JTextField();
        JTextField txtCekilen = new JTextField();
        JTextField txtOdenen = new JTextField();
        JLabel lAdi = new JLabel("Kredi Ayrıntısı");
        JLabel lFaiz = new JLabel("Faiz Miktarı");
        JLabel lCekilen = new JLabel("Çekilen Miktar");
        JLabel lOdenen = new JLabel("Ödenen Miktar");
        JButton gonder = new JButton("Gönder");

        lAdi.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 * 1, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        txtAdi.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 *2 , arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        lFaiz.setBounds(arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 10 * 1, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        txtFaiz.setBounds(arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 10 * 2, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        lCekilen.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 * 3, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        txtCekilen.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 * 4, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        lOdenen.setBounds(arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 10 * 3, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        txtOdenen.setBounds(arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 10 * 4, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        gonder.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 7, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 10);

        panel.add(lAdi);
        panel.add(txtAdi);
        panel.add(lFaiz);
        panel.add(txtFaiz);
        panel.add(lCekilen);

        panel.add(txtCekilen);
        panel.add(lOdenen);
        panel.add(txtOdenen);
        panel.add(gonder);

        gonder.addActionListener(actionEvent -> {
            ICreditRepo repo = new CreditRepo();
            Credit credit = new Credit();
            credit.taken.set(Float.parseFloat(txtCekilen.getText()));
            credit.given.set(Float.parseFloat(txtOdenen.getText()));
            credit.interest.set(Float.parseFloat(txtFaiz.getText()));
            credit.description.set(txtAdi.getText());
            credit.userId.set(user.id.get());
            repo.addCredit(credit);
            Kredi.krediKart();
        });
    }
}
