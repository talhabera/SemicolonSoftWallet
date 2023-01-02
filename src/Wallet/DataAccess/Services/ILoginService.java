package Wallet.DataAccess.Services;

import Wallet.Entities.User;

public interface ILoginService {
    boolean checkAuth(User user);
}
