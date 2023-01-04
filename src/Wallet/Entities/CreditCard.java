package Wallet.Entities;

import Wallet.Wrappers.Property;

/**
 * @author Talha Bera
 */
public class CreditCard extends BaseEntity {
    public Property<Float> cardLimit = new Property<>();
    public Property<Float> interest = new Property<>();
    public Property<Float> taken = new Property<>();
    public Property<Integer> userId = new Property<>();
}
