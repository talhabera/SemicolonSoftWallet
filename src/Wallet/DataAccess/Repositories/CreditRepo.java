package Wallet.DataAccess.Repositories;

import Wallet.DataAccess.Context.AppContext;
import Wallet.Entities.Credit;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author Talha Bera
 */
public class CreditRepo implements ICreditRepo {

    /**
     * Gönderilen kullanıcı Id'sine göre kullanıcıya ait Credit nesnelerini döndürür
     *
     * @param userId Kullanıcı Id
     * @return User Id ile eşleşen creditler
     */
    @Override
    public ArrayList<Credit> getCreditsByUserId(int userId) {
        ArrayList<Credit> credits = new ArrayList<>();

        try {
            Statement state = AppContext.getConnection().createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM credit WHERE userId = '" + userId + "'");

            while (rs.next()) {
                Credit credit = new Credit();
                credit.id.set(rs.getInt("Id"));
                credit.taken.set(rs.getFloat("Taken"));
                credit.given.set(rs.getFloat("Given"));
                credit.interest.set(rs.getFloat("Interest"));
                credit.description.set(rs.getString("Description"));
                credit.userId.set(userId);
                credits.add(credit);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return credits;
    }

    /**
     * Gönderilen değerin Id'sindeki kredi bilgisini günceller
     *
     * @param credit güncellenecek kredi
     */
    @Override
    public void updateCredit(Credit credit) {
        try
        {
            String query = "update credit set Taken = ?, Interest = ?, Given = ?, Description = ? where Id = ?";

            PreparedStatement preparedStmt = AppContext.getConnection().prepareStatement(query);
            preparedStmt.setFloat   (1, credit.taken.get());
            preparedStmt.setFloat   (2, credit.interest.get());
            preparedStmt.setFloat   (3, credit.given.get());
            preparedStmt.setString   (4, credit.description.get());
            preparedStmt.setInt   (5, credit.id.get());

            preparedStmt.executeUpdate();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Gönderilen kredi bilgisini database'e ekler
     *
     * @param credit eklenecek kredi
     */
    @Override
    public void addCredit(Credit credit) {
        try
        {
            String query = "insert into credit (taken, given, interest, Description, UserId) values (?, ?, ?, ?, ?)";

            PreparedStatement preparedStmt = AppContext.getConnection().prepareStatement(query);
            preparedStmt.setFloat   (1, credit.taken.get());
            preparedStmt.setFloat   (2, credit.given.get());
            preparedStmt.setFloat   (3, credit.interest.get());
            preparedStmt.setString   (4, credit.description.get());
            preparedStmt.setInt   (5, credit.userId.get());

            preparedStmt.execute();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
}
