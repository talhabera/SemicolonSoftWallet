package Wallet.DataAccess.Repositories;

import Wallet.DataAccess.Context.AppContext;
import Wallet.Entities.Debt;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author Talha Bera
 */
public class DebtRepo implements IDebtRepo {

    /**
     * Gönderilen kullanıcı Id'sine göre kullanıcıya ait Debt nesnelerini döndürür
     *
     * @param userId Kullanıcı Id
     * @return
     */
    @Override
    public ArrayList<Debt> getDebtsByUserId(int userId) {
        ArrayList<Debt> debts = new ArrayList<>();

        try {
            Statement state = AppContext.getConnection().createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM debt WHERE userId = '" + userId + "'");

            while (rs.next()) {
                Debt debt = new Debt();
                debt.id.set(rs.getInt("Id"));
                debt.amount.set(rs.getFloat("Amount"));
                debt.description.set(rs.getString("Description"));
                debt.userId.set(userId);
                debts.add(debt);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return debts;
    }

    /**
     * Gönderilen değerin Id'sindeki borç bilgisini günceller
     *
     * @param debt güncellenecek borç
     */
    @Override
    public void updateDebt(Debt debt) {
        try
        {
            String query = "update debt set Amount = ?, Description = ? where Id = ?";

            PreparedStatement preparedStmt = AppContext.getConnection().prepareStatement(query);
            preparedStmt.setFloat   (1, debt.amount.get());
            preparedStmt.setString   (2, debt.description.get());
            preparedStmt.setInt(3, debt.id.get());

            preparedStmt.executeUpdate();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Gönderilen borç bilgisini database'e ekler
     *
     * @param debt eklenecek borç
     */
    @Override
    public void addDebt(Debt debt) {
        try
        {
            String query = "insert into debt (Amount, Description, UserId) values (?, ?, ?)";

            PreparedStatement preparedStmt = AppContext.getConnection().prepareStatement(query);
            preparedStmt.setFloat   (1, debt.amount.get());
            preparedStmt.setString   (2, debt.description.get());
            preparedStmt.setInt(3, debt.userId.get());

            preparedStmt.execute();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
}
