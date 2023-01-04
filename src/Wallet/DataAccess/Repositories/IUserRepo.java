package Wallet.DataAccess.Repositories;

import Wallet.Entities.User;

/**
 * @author Talha Bera
 */
public interface IUserRepo {

    /**
     * Gönderilen kullanıcı adına göre dbden User nesnesi döner
     * @param username
     * @return
     */
    User getUserByUsername(String username);
}
