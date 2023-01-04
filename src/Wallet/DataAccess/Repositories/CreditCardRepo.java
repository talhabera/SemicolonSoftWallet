package Wallet.DataAccess.Repositories;

import Wallet.DataAccess.Context.AppContext;
import Wallet.Entities.CreditCard;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author Talha Bera
 */
public class CreditCardRepo implements ICreditCardRepo {

    /**
     * Gönderilen kullanıcı Id'sine göre kullanıcıya ait CreditCard nesnelerini döndürür
     *
     * @param userId Kullanıcı Id
     * @return
     */
    @Override
    public ArrayList<CreditCard> getCreditCardsByUserId(int userId) {
        ArrayList<CreditCard> creditCards = new ArrayList<>();

        try {
            Statement state = AppContext.getConnection().createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM creditcard WHERE userId = '" + userId + "'");

            while (rs.next()) {
                CreditCard creditCard = new CreditCard();
                creditCard.id.set(rs.getInt("Id"));
                creditCard.taken.set(rs.getFloat("Taken"));
                creditCard.cardLimit.set(rs.getFloat("CardLimit"));
                creditCard.interest.set(rs.getFloat("Interest"));
                creditCard.userId.set(userId);
                creditCards.add(creditCard);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return creditCards;
    }

    /**
     * Gönderilen değerin Id'sindeki kredi kartı bilgisini günceller
     *
     * @param card güncellenecek kredi kartı
     */
    @Override
    public void updateCreditCard(CreditCard card) {
        try
        {
            String query = "update creditcard set Taken = ?, Interest = ?, CardLimit = ? where Id = ?";

            PreparedStatement preparedStmt = AppContext.getConnection().prepareStatement(query);
            preparedStmt.setFloat   (1, card.taken.get());
            preparedStmt.setFloat   (2, card.interest.get());
            preparedStmt.setFloat   (3, card.cardLimit.get());
            preparedStmt.setInt(4, card.id.get());

            preparedStmt.executeUpdate();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Gönderilen kredi kartı bilgisini database'e ekler
     *
     * @param card eklenecek kredi kartı
     */
    @Override
    public void addCreditCard(CreditCard card) {
        try
        {
            String query = "insert into creditcard (CardLimit, Interest, Taken, UserId) values (?, ?, ?, ?)";

            PreparedStatement preparedStmt = AppContext.getConnection().prepareStatement(query);
            preparedStmt.setFloat   (1, card.cardLimit.get());
            preparedStmt.setFloat   (2, card.interest.get());
            preparedStmt.setFloat   (3, card.taken.get());
            preparedStmt.setInt(4, card.userId.get());

            preparedStmt.execute();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
}
