package Wallet.Entities;

import Wallet.Wrappers.Property;

/**
 * @author Talha Bera
 */
public class Account extends BaseEntity {
    public Property<Float> balance = new Property<>();
    public Property<Integer> userId = new Property<>();
}
