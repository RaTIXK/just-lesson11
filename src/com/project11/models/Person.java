package com.project11.models;

import com.project11.logger.AbstractLogeer;
import com.project11.logger.CommandLineLoger;

import java.util.Objects;

public class Person extends Human {

    private  static  final AbstractLogeer log = new CommandLineLoger( "com.project11.models.Person"/*, LogingLevel.DEBUG*/);

    private String pid;
    public Person(String pid, String name, double height, double weight) {
        super(name, height, weight);
        this.pid = pid;
        log.debug("Created person with pid: " + pid);
        log.info("Created Person");
    }

    public String getPid() {
        return pid;
    }

    public  void foo() {
        log.error("Not implemented yet!");

    }


    public void fatal(){
        log.fatal("OMG");
        System.exit(-1);
    }
    public void setPid(String pid) {
        this.pid = pid;
    }



//    @Override
//    public  boolean equals(Object obj){
//        if(obj instanceof  Person) {
//            Person person = (Person) obj;
//            boolean firstResult = pid.equals(person.pid);
//            boolean secondResult = super.equals(obj);
//            return firstResult && secondResult;
//        }
//        return false;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Person person = (Person) o;
        return pid.equals(person.pid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), pid);
    }

    @Override
    public String toString() {
        return "Person{" +
                "pid='" + pid + '\'' +
                ", name='" + name + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
