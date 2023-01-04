package Wallet.UI;

import Wallet.DataAccess.Repositories.AccountRepo;
import Wallet.DataAccess.Repositories.CreditCardRepo;
import Wallet.DataAccess.Repositories.IAccountRepo;
import Wallet.DataAccess.Repositories.ICreditCardRepo;
import Wallet.Entities.Account;
import Wallet.Entities.CreditCard;

import javax.swing.*;

import static Wallet.UI.MainWindow.*;
import static Wallet.UI.MainWindow.panel;

public class FormKartbilgileriEkle {
    public static void formKartbilgileriEkle(){

        screen();

        JTextField txtKartAdi = new JTextField();
        JTextField txtFaiz = new JTextField();
        JTextField txtLimit = new JTextField();
        JTextField txtCekilen = new JTextField();
        JLabel lKartAdi = new JLabel("Kart Adı");
        JLabel lFaiz = new JLabel("Faiz Miktarı");
        JLabel lLimit = new JLabel("Limit");
        JLabel lCekilen = new JLabel("Çekilen Miktar");
        JButton gonder = new JButton("Gönder");

        lKartAdi.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 * 1, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        txtKartAdi.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 *2 , arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        lFaiz.setBounds(arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 10 * 1, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        txtFaiz.setBounds(arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 10 * 2, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        lLimit.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 * 3, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        txtLimit.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 * 4, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        lCekilen.setBounds(arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 10 * 3, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        txtCekilen.setBounds(arac.getScreenSize().width / 2 / 7 * 4, arac.getScreenSize().height / 2 / 10 * 4, arac.getScreenSize().width / 2 / 4, arac.getScreenSize().height / 2 / 10);
        gonder.setBounds(arac.getScreenSize().width / 2 / 7 * 3, arac.getScreenSize().height / 2 / 10 * 6, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 10);

        panel.add(lKartAdi);
        panel.add(txtKartAdi);
        panel.add(lFaiz);
        panel.add(txtFaiz);
        panel.add(lLimit);

        panel.add(txtLimit);
        panel.add(lCekilen);
        panel.add(txtCekilen);
        panel.add(gonder);

        gonder.addActionListener(actionEvent -> {
            ICreditCardRepo repo = new CreditCardRepo();
            CreditCard creditCard = new CreditCard();
            creditCard.taken.set(Float.parseFloat(txtCekilen.getText()));
            creditCard.cardLimit.set(Float.parseFloat(txtLimit.getText()));
            creditCard.interest.set(Float.parseFloat(txtFaiz.getText()));
            creditCard.description.set(txtKartAdi.getText());
            creditCard.userId.set(user.id.get());
            repo.addCreditCard(creditCard);
            KartBilgileri.kartBilgileri();
        });
    }
}
