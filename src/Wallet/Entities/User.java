package Wallet.Entities;

import Wallet.Handlers.PasswordHandler;
import Wallet.Wrappers.Property;

public class User extends BaseEntity {
    public Property<String> username = new Property<>();
    public Property<String> password = new Property<>() {
        @Override
        public void set(String value) {
            super.set(PasswordHandler.ConvertToMd5(value));
        }
    };
    public Property<String> firstname = new Property<>();
    public Property<String> lastname = new Property<>();
    public Property<String> identity = new Property<>();
    public Property<String> address = new Property<>();
    public Property<String> phone = new Property<>();
    public Property<Integer> balance = new Property<>();
}
