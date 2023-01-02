package Wallet.DataAccess.Repositories;

import Wallet.Entities.User;

public interface IUserRepo {
    User getUserByUsername(String username);
}
