package Wallet.DataAccess.Repositories;

import Wallet.Entities.Account;

import java.util.ArrayList;

/**
 * @author Talha Bera
 */
public interface IAccountRepo {

    /**
     * Gönderilen kullanıcı Id'sine göre kullanıcıya ait Account nesnelerini döndürür
     * @param userId Kullanıcı Id
     * @return Hesap Listesi
     */
    ArrayList<Account> getAccountsByUserId(int userId);

    /**
     * Gönderilen değerin Id'sindeki hesabı günceller
     * @param account güncellenecek hesap
     */
    void updateAccount(Account account);

    /**
     * Gönderilen hesap bilgisini database'e ekler
     * @param account eklenecek hesap
     */
    void addAccount(Account account);
}
