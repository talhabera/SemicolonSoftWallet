package Wallet.Services;

import Wallet.DataAccess.Repositories.IUserRepo;
import Wallet.DataAccess.Repositories.UserRepo;
import Wallet.Entities.User;

import static Wallet.Handlers.PasswordHandler.convertToMd5;

public class LoginService implements ILoginService {
    @Override
    public boolean checkAuth(User user){
        IUserRepo userRepo = new UserRepo();
        User userDb = userRepo.getUserByUsername(user.username.get());

        if (userDb != null && convertToMd5(user.password.get()).equals(userDb.password.get()))
            return true;
        else
            return false;
    }
}
