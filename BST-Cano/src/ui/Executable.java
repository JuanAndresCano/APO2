package ui;

import model.Controller;
import java.util.Scanner;

public class Executable {

    private Controller controller;
    private Scanner reader;

    public Executable(){
        controller =  new Controller();
        reader = new Scanner(System.in); 
    }

    public static void main (String [] args){
        Executable executable = new Executable();
        executable.menu();
    }

    public void menu(){

        boolean flag = false;
        int choose = 0;

        while(!flag){

            System.out.println("Welcome to the Seguimiento 5 \nPlease choose an option: ");
            System.out.println("1. Generate the tree");
            System.out.println("2. Search the level of a number in the tree");
            System.out.println("3. Find the sucesor of a number in the tree");
            System.out.println("4. Find the predecesor of the number in the tree");
            System.out.println("5. Find how deep is the tree");
            System.out.println("6. Exit");
            

            choose = reader.nextInt();
            switch(choose){
                
                case 1:
                    controller.add();
                    System.out.println("The tree has been created with the numbers");
                    break;

                case 2:
                    search();
                    break;
                
                case 3:
                    findSucesors();
                    break;

                case 4:
                    findPredecesor();
                    break;

                case 5: 
                    deeperFinder();
                    break;
                case 6:
                    flag = true;
                    break;

            }

        }

    }


    public void search(){
        System.out.println("Type the nodo you're searching");
        int nodoContent = reader.nextInt();
        System.out.println(controller.searchNodo(nodoContent));
    }

    public void findSucesors(){
        System.out.println("Type the nodo you're searching");
        int nodoContent = reader.nextInt();
        System.out.println(controller.findSucesors(nodoContent));
    }

    public void findPredecesor(){
        System.out.println("Type the nodo you're searching");
        int nodoContent = reader.nextInt();
        System.out.println(controller.findPredecesor(nodoContent));
    }

    public void deeperFinder(){
        System.out.println(controller.deeperFinder());
    }
}



        

    