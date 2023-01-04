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
                user.firstname.set(rs.getString("Firstname"));
                user.lastname.set(rs.getString("Lastname"));
                user.address.set(rs.getString("Address"));
                user.phone.set(rs.getString("Phone"));
                user.identity.set(rs.getString("Identity"));
                user.balance.set(rs.getDouble("Balance"));
                return user;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
