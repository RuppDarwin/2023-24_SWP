package rup.Test;

public class AirPlay implements Device{
    @Override
    public boolean isActive() {
        return true;
    }

    @Override
    public String getContent() {
        return "is Airplay";
    }
}
