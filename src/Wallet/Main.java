package Wallet;

import Wallet.DataAccess.Repositories.UserRepository;
import Wallet.UI.LoginScreen;
import Wallet.UI.MainWindow;

public class Main {
    public static void main(String[] args) {
        LoginScreen login = new LoginScreen();
        login.Login();
    }
}
