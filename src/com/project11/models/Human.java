package com.project11.models;

import com.project11.logger.AbstractLogeer;
import com.project11.logger.CommandLineLoger;

import java.util.Objects;

public abstract class Human {


    private  static  final AbstractLogeer log = new CommandLineLoger( "com.project11.models.Human"/*, LogingLevel.DEBUG*/);
    protected String name;
    protected double height; // cm
    protected double weight; // k


    public Human(String name, double height, double weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        log.info("Created Human");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Human) {
//            Human human = (Human) obj;
//            return name.equals(human.name)
//                    && height == human.height
//                    && weight == human.weight;
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return Double.compare(human.height, height) == 0
                && Double.compare(human.weight, weight) == 0
                && Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, height, weight);
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
