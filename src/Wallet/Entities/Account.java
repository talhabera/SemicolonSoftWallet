package Wallet.Entities;

import Wallet.Wrappers.Property;

public class Account extends BaseEntity {
    public Property<Float> balance = new Property<>();
    public Property<Integer> userId = new Property<>();
}
