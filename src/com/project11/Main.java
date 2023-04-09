package com.project11;

import com.project11.logger.LoggingConfig;
import com.project11.logger.LoggingLevel;
import com.project11.models.Person;

public class Main {
    public static void main(String[] args) {

        Parrent someparent = new Parrent() {
            @Override
            public void foo() {
            }

            @Override
            public void bar() {
            }
        };

        LoggingConfig.getINSTANCE().setBaseLevel(LoggingLevel.DEBUG);

        Person p1, p2;
        p1 = new Person("1234", "Rati", 175, 77);
        p2 = new Person("1234", "Rati", 175, 77);

        System.out.println(p1 == p2);
        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
        System.out.println(p1.toString());
/*        p1.foo();
        p1.fatal();*/
    }


}


abstract class Parrent {
    public abstract void foo();

    public abstract void bar();
}

class  Child extends Parrent {

    @Override
    public void foo() {
    }

    @Override
    public void bar() {
    }
}