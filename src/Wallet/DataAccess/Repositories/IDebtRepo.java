package Wallet.DataAccess.Repositories;

import Wallet.Entities.Debt;

import java.util.ArrayList;

/**
 * @author Talha Bera
 */
public interface IDebtRepo {

    /**
     * Gönderilen kullanıcı Id'sine göre kullanıcıya ait Debt nesnelerini döndürür
     * @param userId Kullanıcı Id
     * @return borç listesi
     */
    ArrayList<Debt> getDebtsByUserId(int userId);

    /**
     * Gönderilen değerin Id'sindeki borç bilgisini günceller
     * @param debt güncellenecek borç
     */
    void updateDebt(Debt debt);

    /**
     * Gönderilen borç bilgisini database'e ekler
     * @param debt eklenecek borç
     */
    void addDebt(Debt debt);
}
