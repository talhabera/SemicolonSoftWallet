package Wallet.DataAccess.Repositories;

import Wallet.Entities.CreditCard;

import java.util.ArrayList;

/**
 * @author Talha Bera
 */
public interface ICreditCardRepo {

    /**
     * Gönderilen kullanıcı Id'sine göre kullanıcıya ait CreditCard nesnelerini döndürür
     * @param userId Kullanıcı Id
     * @return Kredi kartı listesi
     */
    ArrayList<CreditCard> getCreditCardsByUserId(int userId);

    /**
     * Gönderilen değerin Id'sindeki kredi kartı bilgisini günceller
     * @param card güncellenecek kredi kartı
     */
    void updateCreditCard(CreditCard card);

    /**
     * Gönderilen kredi kartı bilgisini database'e ekler
     * @param card eklenecek kredi kartı
     */
    void addCreditCard(CreditCard card);
}
