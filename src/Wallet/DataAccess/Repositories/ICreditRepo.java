package Wallet.DataAccess.Repositories;

import Wallet.Entities.Credit;

import java.util.ArrayList;

/**
 * @author Talha Bera
 */
public interface ICreditRepo {

    /**
     * Gönderilen kullanıcı Id'sine göre kullanıcıya ait Credit nesnelerini döndürür
     * @param userId Kullanıcı Id
     * @return kredi listesi
     */
    ArrayList<Credit> getCreditsByUserId(int userId);

    /**
     * Gönderilen değerin Id'sindeki kredi bilgisini günceller
     * @param credit güncellenecek kredi
     */
    void updateCredit(Credit credit);

    /**
     * Gönderilen kredi bilgisini database'e ekler
     * @param credit eklenecek kredi
     */
    void addCredit(Credit credit);
}
