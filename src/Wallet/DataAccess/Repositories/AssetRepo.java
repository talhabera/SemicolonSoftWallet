package Wallet.DataAccess.Repositories;

import Wallet.DataAccess.Context.AppContext;
import Wallet.Entities.Asset;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 * @author Talha Bera
 */
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

    /**
     * Gönderilen değerin Id'sindeki alacak bilgisini günceller
     *
     * @param asset güncellenecek alacak
     */
    @Override
    public void updateAsset(Asset asset) {
        try
        {
            String query = "update asset set Amount = ?, Description = ? where Id = ?";

            PreparedStatement preparedStmt = AppContext.getConnection().prepareStatement(query);
            preparedStmt.setFloat   (1, asset.amount.get());
            preparedStmt.setString   (2, asset.description.get());
            preparedStmt.setInt(3, asset.id.get());

            preparedStmt.executeUpdate();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }

    /**
     * Gönderilen alacak bilgisini database'e ekler
     *
     * @param asset eklenecek alacak
     */
    @Override
    public void addAsset(Asset asset) {
        try
        {
            String query = "insert into asset (Amount, Description, UserId) values (?, ?, ?)";

            PreparedStatement preparedStmt = AppContext.getConnection().prepareStatement(query);
            preparedStmt.setFloat   (1, asset.amount.get());
            preparedStmt.setString   (2, asset.description.get());
            preparedStmt.setInt(3, asset.userId.get());

            preparedStmt.execute();
        }
        catch (Exception e)
        {
            System.err.println(e.getMessage());
        }
    }
}
