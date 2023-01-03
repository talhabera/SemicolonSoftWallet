package Wallet.Entities;

import Wallet.Handlers.PasswordHandler;
import Wallet.Wrappers.Property;

public class User extends BaseEntity {
    public Property<String> username = new Property<String>();
    public Property<String> password = new Property<String>() {
        @Override
        public void set(String value) {
            super.set(PasswordHandler.ConvertToMd5(value));
        }
    };
    public Property<String> Ad = new Property<String>();
    public Property<String> Soyad = new Property<String>();
}
