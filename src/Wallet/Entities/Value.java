package Wallet.Entities;

public class Value<T>{
    private T _value;

    public T get(){
        return _value;
    }
    public void set(T value){
        this._value = value;
    }
}
