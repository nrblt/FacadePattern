package com.company;

public class Person {
    private Clothes hat;
    private Clothes jacket;

    public Person(){
        hat=new Hat();
        jacket=new Jacket();
    }

    public void wearHat(){
        hat.wear();
    }
    public void wearJacket(){
        jacket.wear();
    }
}
