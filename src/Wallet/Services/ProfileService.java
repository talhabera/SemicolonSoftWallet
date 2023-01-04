package Wallet.Services;

import Wallet.Entities.User;
import Wallet.UI.MainWindow;

public class ProfileService implements IProfileService {
    @Override
    public String[][] GetTableDataFromUser() {
        User user = MainWindow.user;
        return new String[][]
                {{"Ad", user.firstname.get()},
                {"Soyad", user.lastname.get()},
                {"Kimlik Numarası", user.identity.get()},
                {"Adres", user.address.get()},
                {"Telefon", user.phone.get()}};
    }
}
