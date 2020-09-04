package com.example.designpattern.bridgepattern;

/**
 * @author 张全伟
 */
public abstract class Store {
    protected Pie pie;

    public Store(Pie pie){
        this.pie = pie;
    }

    abstract Pie makePie();
}
