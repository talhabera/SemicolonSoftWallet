package Wallet.Entities;

import Wallet.Wrappers.Property;

public class Credit extends BaseEntity {
    public Property<Float> interest = new Property<>();
    public Property<Float> taken = new Property<>();
    public Property<Float> given = new Property<>();
    public Property<Integer> userId = new Property<>();

}
