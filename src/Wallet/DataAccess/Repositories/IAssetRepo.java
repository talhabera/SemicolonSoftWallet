package Wallet.DataAccess.Repositories;

import Wallet.Entities.Asset;

import java.util.ArrayList;

public interface IAssetRepo {

    /**
     * Gönderilen kullanıcı Id'sine göre kullanıcıya ait Asset nesnelerini döndürür
     * @param userId Kullanıcı Id
     * @return
     */
    ArrayList<Asset> getAssetsByUserId(int userId);
}
