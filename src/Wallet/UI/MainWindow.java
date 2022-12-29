package Wallet.UI;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MainWindow{

    private static JPanel panel;
    private static Toolkit arac;

    public static void screen(){
        Toolkit arac = Toolkit.getDefaultToolkit();
        System.out.println("Ekran = "+arac.getScreenSize());

        JFrame pencere = new JFrame();
        pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        pencere.setSize(arac.getScreenSize().width/2, arac.getScreenSize().height/2);
        pencere.setAlwaysOnTop(true);
        pencere.setLocationRelativeTo(null);
        pencere.setResizable(false);

        JPanel panel = new JPanel(null);
        panel.setBackground(Color.yellow);

        JButton profil = new JButton("Profil");
        JButton hesabım = new JButton("Hesabım");
        JButton eft = new JButton("EFT/Havale");
        JButton odeme = new JButton("Ödeme");
        profil.setBounds(0, 0, arac.getScreenSize().width/2/7, arac.getScreenSize().height/2/4);
        hesabım.setBounds(0, arac.getScreenSize().height/2/4, arac.getScreenSize().width/2/7, arac.getScreenSize().height/2/4);
        eft.setBounds(0, arac.getScreenSize().height/2/4*2, arac.getScreenSize().width/2/7, arac.getScreenSize().height/2/4);
        odeme.setBounds(0, arac.getScreenSize().height/2/4*3, arac.getScreenSize().width/2/7, arac.getScreenSize().height/2/4);




        String isim="Emir Taha";
        JLabel labelHosgeldin = new JLabel("Merhaba "+isim);
        labelHosgeldin.setFont(new Font("Merhaba", Font.PLAIN, 36));
        labelHosgeldin.setForeground(new Color(50, 50, 10));
        labelHosgeldin.setBounds(arac.getScreenSize().width/2/7*2, arac.getScreenSize().height/2/4, arac.getScreenSize().width/2/7*6, 100);
        panel.add(labelHosgeldin);

/*
            BİLGİLERİM EKRANI
        String data[][]  = { {"Adı","Ahmet"},
                {"Soy adı","Hayri"},
                {"TC","12345678987"},
                {"ev adresi","hürriyet mah bakırcılar sok no19 daire 2"},
                {"cep tel","05380300803"},
                {"para durumu","1234"}};
        String column[]={"Bilgiler","Icerik"};
        JTable jtable=new JTable(data,column);

        jtable.setBounds(arac.getScreenSize().width/2/7*2, arac.getScreenSize().height/2/10, arac.getScreenSize().width/2/7*4, arac.getScreenSize().height/2/4*2);
        panel.add(jtable);
        */
        /*
        int para=12345;
        JLabel labelPara = new JLabel("Bakiyeniz "+para+"TL");
        labelPara.setFont(new Font("Para", Font.PLAIN, 36));
        labelPara.setForeground(new Color(50, 50, 10));
        labelPara.setBounds(arac.getScreenSize().width/2/7*2, arac.getScreenSize().height/2/4, arac.getScreenSize().width/2/7*6, 100);
        panel.add(labelPara);
        */


        panel.add(profil);
        panel.add(hesabım);
        panel.add(eft);
        panel.add(odeme);


        pencere.add(panel);
        pencere.setVisible(true);


    }


}