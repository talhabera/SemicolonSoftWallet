package Wallet.DataAccess.Repositories;

import Wallet.DataAccess.Context.AppContext;
import Wallet.Entities.Account;
import Wallet.Entities.Asset;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AssetRepo implements IAssetRepo {


    /**
     * Gönderilen kullanıcı Id'sine göre kullanıcıya ait Asset nesnelerini döndürür
     *
     * @param userId Kullanıcı Id
     * @return
     */
    @Override
    public ArrayList<Asset> getAssetsByUserId(int userId) {
        ArrayList<Asset> assets = new ArrayList<>();

        try {
            Statement state = AppContext.getConnection().createStatement();
            ResultSet rs = state.executeQuery("SELECT * FROM asset WHERE userId = '" + userId + "'");

            while (rs.next()) {
                Asset asset = new Asset();
                asset.id.set(rs.getInt("Id"));
                asset.amount.set(rs.getFloat("Amount"));
                asset.description.set(rs.getString("Description"));
                asset.userId.set(userId);
                assets.add(asset);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return assets;
    }
}
