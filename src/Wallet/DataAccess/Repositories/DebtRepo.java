package Wallet.DataAccess.Repositories;

import Wallet.DataAccess.Context.AppContext;
import Wallet.Entities.Asset;
import Wallet.Entities.Debt;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

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
}
