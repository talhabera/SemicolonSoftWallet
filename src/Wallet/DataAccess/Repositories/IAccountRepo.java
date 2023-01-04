package Wallet.DataAccess.Repositories;

import Wallet.Entities.Account;

import java.util.ArrayList;

public interface IAccountRepo {

    /**
     * Gönderilen kullanıcı Id'sine göre kullanıcıya ait Account nesnelerini döndürür
     * @param userId Kullanıcı Id
     * @return
     */
    ArrayList<Account> getAccountsByUserId(int userId);
}
