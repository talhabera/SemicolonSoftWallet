package Wallet.DataAccess.Repositories;

import Wallet.DataAccess.Context.AppContext;
import Wallet.Entities.Account;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author Talha Bera
 */
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

    /**
     * Gönderilen değerin Id'sindeki hesabı günceller
     *
     * @param account güncellenecek hesap
     */
    @Override
    public void updateAccount(Account account) {
        try
        {
            String query = "update account set Balance = ? where Id = ?";

            PreparedStatement preparedStmt = AppContext.getConnection().prepareStatement(query);
            preparedStmt.setFloat   (1, account.balance.get());
            preparedStmt.setInt(2, account.id.get());

            preparedStmt.executeUpdate();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Gönderilen hesap bilgisini database'e ekler
     *
     * @param account eklenecek hesap
     */
    @Override
    public void addAccount(Account account) {
        try
        {
            String query = "insert into account (Balance, UserId) values (?, ?)";

            PreparedStatement preparedStmt = AppContext.getConnection().prepareStatement(query);
            preparedStmt.setFloat   (1, account.balance.get());
            preparedStmt.setInt(2, account.userId.get());

            preparedStmt.execute();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
}
