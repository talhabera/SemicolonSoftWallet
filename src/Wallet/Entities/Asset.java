package Wallet.Entities;

import Wallet.Wrappers.Property;

/**
 * @author Talha Bera
 */
public class Asset extends BaseEntity{
    public Property<Float> amount = new Property<>();
    public Property<String> description = new Property<>();
    public Property<Integer> userId = new Property<>();
}
