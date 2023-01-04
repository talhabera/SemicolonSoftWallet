package Wallet.DataAccess.Repositories;

import Wallet.Entities.CreditCard;

import java.util.ArrayList;

public interface ICreditCardRepo {

    /**
     * Gönderilen kullanıcı Id'sine göre kullanıcıya ait CreditCard nesnelerini döndürür
     * @param userId Kullanıcı Id
     * @return
     */
    ArrayList<CreditCard> getCreditCardsByUserId(int userId);
}
