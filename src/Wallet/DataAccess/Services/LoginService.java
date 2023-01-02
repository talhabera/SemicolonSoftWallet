package Wallet.DataAccess.Services;

import Wallet.DataAccess.Repositories.IUserRepo;
import Wallet.DataAccess.Repositories.UserRepo;
import Wallet.Entities.User;

public class LoginService implements ILoginService {
    @Override
    public boolean checkAuth(User user){
        IUserRepo userRepo = new UserRepo();
        User userDb = userRepo.getUserByUsername(user.username.get());

        if (user.password.get().equals(userDb.password.get()))
            return true;
        else
            return false;
    }
}
