package Wallet.Entities;

import Wallet.Wrappers.Property;

public class Debt extends BaseEntity{
    public Property<Float> amount = new Property<>();
    public Property<String> description = new Property<>();
    public Property<Integer> userId = new Property<>();
}
