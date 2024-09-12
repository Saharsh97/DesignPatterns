package org.example.backup.decorator.icecreamDecorator;

// only a base
public class NormalCone implements IceCream{

    public NormalCone(){}


    @Override
    public int getCost() {
        return 40;
    }

    @Override
    public String getDescription() {
        return "Normal Cone";
    }
}
