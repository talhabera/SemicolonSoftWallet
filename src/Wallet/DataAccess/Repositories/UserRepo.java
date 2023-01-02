package Wallet.DataAccess.Repositories;

import Wallet.Entities.User;

public class UserRepo implements IUserRepo {

    @Override
    public User getUserByUsername(String username) {
        User user = new User();
        user.username.set("tbera");
        user.password.set("123");
        return user;
    }
}
