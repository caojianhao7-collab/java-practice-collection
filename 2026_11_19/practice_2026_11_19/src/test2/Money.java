package test2;

public class Money implements Cloneable{
    public int amount = 100;

    @Override
    protected Money clone() throws CloneNotSupportedException {
        return (Money) super.clone();
    }
}
