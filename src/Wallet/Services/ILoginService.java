package Wallet.Services;

import Wallet.Entities.User;

public interface ILoginService {
    boolean checkAuth(User user);
}
