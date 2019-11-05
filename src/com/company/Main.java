package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        String name = "Ulan";
        String name1 = "Nurbek";
        String name2 = "Kanybek";
        int age = 29;
        int temperature = 5;
        if (age >= 20 && age<= 45 && temperature<30 && temperature>-20){
            System.out.println(name + " может идти гулять");
        }else {
            System.out.println(name +" не может гулять");
        }
        if (age <20 && temperature>0 && temperature<28){
            System.out.println(name1 + " может идти гулять");
        }else {
            System.out.println(name1 + " не может гулять");
        }
        if (age>45 && temperature>-10 && temperature<25){
            System.out.println(name2 + " может идти гулять");
        }else {
            System.out.println(name2 + " не может идти гулять");
        }
    }
}
