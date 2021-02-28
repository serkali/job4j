package ru.job4j.calculate;


public class PrimerOne {
    public static void main(String[] args) {
        //there is no instance available for class Test, so use Test.class
        System.out.println("Test.class.getName() ::: " + PrimerOne.class.getName());

        // Now create an instance of class Test use getClass()
        PrimerOne testObj = new PrimerOne();
        System.out.println("testObj.getClass().getName() ::: " + testObj.getClass().getName());

        //For primitive type
        System.out.println("boolean.class.getName() ::: " + boolean.class.getName());
        System.out.println("int.class.getName() ::: " + int.class.getName());
        System.out.println("char.class.getName() ::: " + char.class.getName());
        System.out.println("long.class.getName() ::: " + long.class.getName());
    }
}
