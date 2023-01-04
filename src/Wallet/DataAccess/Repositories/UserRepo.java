package Wallet.DataAccess.Repositories;

import Wallet.DataAccess.Context.AppContext;
import Wallet.Entities.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author Talha Bera
 */
public class UserRepo implements IUserRepo {

    /**
     * Gönderilen kullanıcı adına göre dbden User nesnesi döner
     *
     * @param username Kullanıcı adı
     * @return
     */
    @Override
    public User getUserByUsername(String username) {
        try {
            Statement state = AppContext.getConnection().createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM User WHERE Username = '" + username + "'");
            if (rs.next()) {
                User user = new User();
                user.id.set(rs.getInt("Id"));
                user.username.set(rs.getString("Username"));
                user.password.set(rs.getString("Password"));
                user.firstname.set(rs.getString("Firstname"));
                user.lastname.set(rs.getString("Lastname"));
                user.address.set(rs.getString("Address"));
                user.phone.set(rs.getString("Phone"));
                user.identity.set(rs.getString("Identity"));
                return user;
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
    }
}
