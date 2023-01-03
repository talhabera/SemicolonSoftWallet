package Wallet.DataAccess.Repositories;

import Wallet.DataAccess.Context.AppContext;
import Wallet.Entities.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UserRepo implements IUserRepo {

    @Override
    public User getUserByUsername(String username) {
        try {
            Statement state = AppContext.getConnection().createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM User WHERE Username = '" + username + "'");
            if (rs.next()){
                User user = new User();
                user.username.set(rs.getString("Username"));
                user.password.set(rs.getString("Password"));
                return user;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
