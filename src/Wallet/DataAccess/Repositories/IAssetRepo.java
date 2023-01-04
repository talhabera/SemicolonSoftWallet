package Wallet.DataAccess.Repositories;

import Wallet.Entities.Asset;

import java.util.ArrayList;

/**
 * @author Talha Bera
 */
public interface IAssetRepo {

    /**
     * Gönderilen kullanıcı Id'sine göre kullanıcıya ait Asset nesnelerini döndürür
     * @param userId Kullanıcı Id
     * @return Alacak Listesi
     */
    ArrayList<Asset> getAssetsByUserId(int userId);

    /**
     * Gönderilen değerin Id'sindeki alacak bilgisini günceller
     * @param asset güncellenecek alacak
     */
    void updateAsset(Asset asset);

    /**
     * Gönderilen alacak bilgisini database'e ekler
     * @param asset eklenecek alacak
     */
    void addAsset(Asset asset);
}
