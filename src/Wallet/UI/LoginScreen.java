package Wallet.UI;

import Wallet.Services.LoginService;
import Wallet.Entities.User;

import javax.swing.*;
import java.awt.*;

public class LoginScreen {

    public void login() {
       // Color textcolor = new Color(45,32,22);
        Toolkit arac = Toolkit.getDefaultToolkit();
        JPanel LoginPanel = new JPanel(null);
        JFrame LoginFrame = new JFrame();
        LoginFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        LoginFrame.setSize(arac.getScreenSize().width / 2, arac.getScreenSize().height / 2);
        LoginFrame.setAlwaysOnTop(true);
        LoginFrame.setLocationRelativeTo(null);
        LoginFrame.setResizable(false);

        JTextField textKullaniciAdi = new JTextField();
        JTextField textKullaniciPassword = new JTextField();
        JButton loginGonder = new JButton("Gönder");
        JLabel lKullanici = new JLabel("Kullanıcı Adı ");
        JLabel lPasword = new JLabel("Şifre");

        JLabel lHatalipasword = new JLabel("");
        lHatalipasword.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 * 6 + 10, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);


        lKullanici.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);
        textKullaniciAdi.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 * 2, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);

        lPasword.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 * 3, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);
        textKullaniciPassword.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 * 4, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);

        loginGonder.setBounds(arac.getScreenSize().width / 2 / 7 * 2, arac.getScreenSize().height / 2 / 10 * 5 + 10, arac.getScreenSize().width / 2 / 3, arac.getScreenSize().height / 2 / 12);

        //textKullaniciAdi.setBackground(textcolor);

        LoginPanel.add(lHatalipasword);
        LoginPanel.add(lKullanici);
        LoginPanel.add(textKullaniciAdi);
        LoginPanel.add(lPasword);
        LoginPanel.add(textKullaniciPassword);
        LoginPanel.add(loginGonder);
        loginGonder.addActionListener(actionEvent -> {
            User user = new User();
            user.username.set(textKullaniciAdi.getText());
            user.password.set(textKullaniciPassword.getText());

            LoginService service = new LoginService();

            if (service.checkAuth(user))
            {
                MainWindow.user = user;
                Profil.profil();
                LoginFrame.setVisible(false);
            } else {
                lHatalipasword.setText("Giriş Bilgileri Hatalı");
            }
        });
        

        LoginFrame.add(LoginPanel);
        LoginFrame.setVisible(true);
    }
}
