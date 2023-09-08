package model;
import java.util.Random;
import java.util.random;

public class Student implements Comparable{

    private int age;
    private String lname;
    private String name;

    Random ale = new Random();


    public Student(int age, String lname, String name){
        this.age = age;
        this.lname = lname;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString(){
        return "Name: " + name + "\nLast name: " + lname + "\nAge: " + age;
    }

    @Override
    public int compareTo(Object o) {
        int ans;
        if(o instanceof Student){

            if(age == ((Student)o).getAge()){

                ans = 0;

            }else{

                if(this.age < ((Student)o).getAge()){

                    ans = ale.nextInt(10)+1;
                    ans = -ans;

                }else{

                    ans = ale.nextInt(10)+1;

                }
            }

        }else{

            ans = 3414314;

        }
        

        return ans;
    }
}