package Wallet.Entities;

import Wallet.Handlers.PasswordHandler;

public class User extends BaseEntity {
    public Value<String> username = new Value<String>();
    public Value<String> password = new Value<String>(){
        @Override
        public void set(String value) {
            super.set(PasswordHandler.ConvertToMd5(value));
        }
    };
}
