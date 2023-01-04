package Wallet.DataAccess.Repositories;

import Wallet.Entities.Debt;

import java.util.ArrayList;

public interface IDebtRepo {

    /**
     * Gönderilen kullanıcı Id'sine göre kullanıcıya ait Debt nesnelerini döndürür
     * @param userId Kullanıcı Id
     * @return
     */
    ArrayList<Debt> getDebtsByUserId(int userId);
}
