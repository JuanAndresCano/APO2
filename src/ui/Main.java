package ui;
import model.Student;
public class Main {
    public static void main(String[] args){
        Student a1, b, c;
        a1 = new Student(18, "Aristi", "Andrés");
        b = new Student(20, "Gomez", "Marlon");
        c = new Student(21, "Sosa", "Aníbal");

        Student d = new Student(18, "Villota", "A");

        System.out.println("a1 es menor que b -> el resultado es negativo: " + a1.compareTo(b));
        System.out.println("a1 es igual a d -> el resultado es 0: " + a1.compareTo(d));
        System.out.println("c es mayor que a1 -> el resultado es positivo: " + c.compareTo(a1));
    }
}
