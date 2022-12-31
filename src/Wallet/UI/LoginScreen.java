package Wallet.UI;

import javax.swing.*;
import java.awt.*;

import static Wallet.UI.JProfil.jtable;
import static Wallet.UI.MainWindow.*;
import static Wallet.UI.MainWindow.panel;

public class LoginScreen {
    public  void Login(){
        Toolkit arac = Toolkit.getDefaultToolkit();
        JPanel LoginPanel = new JPanel(null);
        JFrame LoginFrame = new JFrame();
        LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        LoginFrame.setSize(arac.getScreenSize().width/2, arac.getScreenSize().height/2);
        LoginFrame.setAlwaysOnTop(true);
        LoginFrame.setLocationRelativeTo(null);
        LoginFrame.setResizable(false);


        JTextField textKullaniciAdi=new JTextField();
         JTextField textKullaniciPasword=new JTextField();
         JButton loginGonder = new JButton("Gönder");
             JLabel lKullanici = new JLabel("Kullanıcı Adı ");
             JLabel lPasword = new JLabel("Şifre");




        lKullanici.setBounds(arac.getScreenSize().width/2/7*2, arac.getScreenSize().height/2/10, arac.getScreenSize().width/2/3, arac.getScreenSize().height/2/12);
        textKullaniciAdi.setBounds(arac.getScreenSize().width/2/7*2, arac.getScreenSize().height/2/10*2, arac.getScreenSize().width/2/3, arac.getScreenSize().height/2/12);
        lPasword.setBounds(arac.getScreenSize().width/2/7*2, arac.getScreenSize().height/2/10*3, arac.getScreenSize().width/2/3, arac.getScreenSize().height/2/12);
        textKullaniciPasword.setBounds(arac.getScreenSize().width/2/7*2, arac.getScreenSize().height/2/10*4, arac.getScreenSize().width/2/3, arac.getScreenSize().height/2/12);
        loginGonder.setBounds(arac.getScreenSize().width/2/7*2, arac.getScreenSize().height/2/10*5+10, arac.getScreenSize().width/2/3, arac.getScreenSize().height/2/12);

        LoginPanel.add(lKullanici);
        LoginPanel.add(textKullaniciAdi);
        LoginPanel.add(lPasword);
        LoginPanel.add(textKullaniciPasword);
        LoginPanel.add(loginGonder);
        loginGonder.addActionListener(actionEvent->{
            MainWindow pencere = new MainWindow();
            pencere.screen();
        });




        LoginFrame.add(LoginPanel);
        LoginFrame.setVisible(true);

    }
}
