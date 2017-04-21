package Test;

import java.util.Scanner;

/**
 * Created by Francis on 2017/3/10.
 */
public class Person {


    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void  printName(){
        System.out.println("My name is "+this.getName());

    }

    public static void main(String[] args){
        System.out.println("Enter your name please:");
        Scanner in = new Scanner(System.in);
        String name = in.next();
        in.close();
        Person person = new Person();
        person.setName(name);
        person.printName();

        System.out.println("Hello World");
    }




}
