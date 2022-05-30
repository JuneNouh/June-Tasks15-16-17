package com.wsb.generic;

public class Main {
    public static void main(String[] args) {
//        Task 15




        SuperNumber<Double> num = new SuperNumber<>(10.0);
        SuperNumber<Integer> num2 = new SuperNumber<>(11);

        System.out.println(num.returnDoubleValue());
        System.out.println(num.returnIntegerValue());
        num.showType();

        System.out.println("Generic Number " + num.genericNumber());
        System.out.println(num.checkValueIntSuperNumber(num2));
        System.out.println(num.checkValueDoubleSuperNumber(num2));


//        TASK 16



        Container<Double> doubleNumbers = new Container<>();
        doubleNumbers.add(10.0);
        doubleNumbers.add(11.0);
        System.out.println("Removing: ");
        doubleNumbers.printArray();
        System.out.println(doubleNumbers.getNumberOfChange());

        // TASK 17

        ContainerWithMemory<Double> containerWithMemory = new ContainerWithMemory();
        containerWithMemory.add(10.0);
        containerWithMemory.add(10.0);
        containerWithMemory.add(10.0);
        System.out.println(containerWithMemory.version.get(1));
        System.out.println(containerWithMemory.version.get(2));
        System.out.println(containerWithMemory.version.get(3));
        containerWithMemory.add(10.0);
        System.out.println(containerWithMemory.version.get(4));
        containerWithMemory.remove(10.0);
        System.out.println(containerWithMemory.version.get(5));
        containerWithMemory.restoreVersion(1);
        System.out.println(containerWithMemory.containerListMemory);




    }
}
