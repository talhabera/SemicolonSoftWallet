package Wallet.DataAccess.Repositories;

import Wallet.Entities.Credit;

import java.util.ArrayList;

public interface ICreditRepo {

    /**
     * Gönderilen kullanıcı Id'sine göre kullanıcıya ait Credit nesnelerini döndürür
     * @param userId Kullanıcı Id
     * @return
     */
    ArrayList<Credit> getCreditsByUserId(int userId);
}
