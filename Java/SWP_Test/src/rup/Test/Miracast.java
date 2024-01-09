package rup.Test;

public class Miracast implements Device{
    @Override
    public boolean isActive() {
        return true;
    }

    @Override
    public String getContent() {
        return "is Miracast";
    }
}
