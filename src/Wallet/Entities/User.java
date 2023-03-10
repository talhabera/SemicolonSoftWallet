package Wallet.Entities;

import Wallet.Handlers.PasswordHandler;
import Wallet.Wrappers.Property;

/**
 * @author Talha Bera
 */
public class User extends BaseEntity {
    public Property<String> username = new Property<>();
    public Property<String> password = new Property<>() {
        @Override
        public void set(String value) {
            super.set(PasswordHandler.convertToMd5(value));
        }
    };
    public Property<String> firstname = new Property<>();
    public Property<String> lastname = new Property<>();
    public Property<String> identity = new Property<>();
    public Property<String> address = new Property<>();
    public Property<String> phone = new Property<>();
}
