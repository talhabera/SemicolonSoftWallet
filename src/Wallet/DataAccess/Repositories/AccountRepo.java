package Wallet.DataAccess.Repositories;

import Wallet.DataAccess.Context.AppContext;
import Wallet.Entities.Account;
import Wallet.Entities.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AccountRepo implements IAccountRepo {

    /**
     * Gönderilen kullanıcı Id'sine göre kullanıcıya ait Account nesnelerini döndürür
     *
     * @param userId Kullanıcı Id
     * @return
     */
    @Override
    public ArrayList<Account> getAccountsByUserId(int userId) {
        ArrayList<Account> accounts = new ArrayList<>();

        try {
            Statement state = AppContext.getConnection().createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM Account WHERE userId = '" + userId + "'");

            while (rs.next()) {
                Account account = new Account();
                account.id.set(rs.getInt("Id"));
                account.balance.set(rs.getFloat("Balance"));
                account.userId.set(userId);
                accounts.add(account);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return accounts;
    }
}
