package org.example.prgm;

public class Sim implements ISim{

    private String simName;

    public String getSimName() {
        return simName;
    }

    public void setSimName(String simName) {
        this.simName = simName;
    }

    @Override
    public void calling() {
        System.out.println(simName + " is calling....!");
    }

    @Override
    public void data() {
        System.out.println(simName + " Data...!");
    }
}
