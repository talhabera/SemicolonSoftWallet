package Wallet.DataAccess.Repositories;

import Wallet.DataAccess.Context.AppContext;
import Wallet.Entities.Credit;
import Wallet.Entities.Debt;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class CreditRepo implements ICreditRepo {

    /**
     * Gönderilen kullanıcı Id'sine göre kullanıcıya ait Credit nesnelerini döndürür
     *
     * @param userId Kullanıcı Id
     * @return
     */
    @Override
    public ArrayList<Credit> getCreditsByUserId(int userId) {
        ArrayList<Credit> credits = new ArrayList<>();

        try {
            Statement state = AppContext.getConnection().createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM debt WHERE userId = '" + userId + "'");

            while (rs.next()) {
                Credit credit = new Credit();
                credit.id.set(rs.getInt("Id"));
                credit.userId.set(userId);
                credits.add(credit);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return credits;
    }
}
