package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.PriorityQueue;


public class Demo1Application {

    public static void main(String[] args) {
//        SpringApplication.run(Demo1Application.class, args);
        //without custom
//        PriorityQueue<Integer> pr = new PriorityQueue<Integer>();
//
//        pr.add(750);
//        pr.add(900);
//        pr.add(100);
//        pr.add(500);
//        System.out.println(pr.size());
//
//        System.out.println(pr.poll());
//
//
//        // with custom comparator
//        EmployeeComparator comparator = new EmployeeComparator();
//        PriorityQueue<Employee> myQueue = new PriorityQueue<Employee>(10, comparator);
//        myQueue.add(new Employee("sunday", 50_000));
//        myQueue.add(new Employee("jide", 2000_000));
//        myQueue.add(new Employee("wale", 150_000_000));
//
//
//        System.out.println(myQueue.size());
//        System.out.println(myQueue.remove());
//        System.out.println(myQueue.size());


        //length of string with custom comparator
        StringLengthComparator mycomparator = new StringLengthComparator();
        PriorityQueue<String> display = new PriorityQueue<String>(10, mycomparator);
       display.add("sunday");
       display.add("Yinka");
       display.add("pascal");



        System.out.println(display.size());
        System.out.println(display.poll());
        System.out.println(display);
        System.out.println(display.poll());
        System.out.println(display);






    }

}
