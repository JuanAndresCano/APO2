package model;
import util.BST;

public class Controller {
    
    private BST tree;

    public Controller(){
        tree = new BST();
    }

    public void add(){
        
        tree.add(6);
        tree.add(9);
        tree.add(7);
        tree.add(8);
        tree.add(11);
        tree.add(10);
        tree.add(12);
        tree.add(3);
        tree.add(1);
        tree.add(2);
        tree.add(0);
        tree.add(4);
        tree.add(5);
    }

    public String searchNodo(int nodoContent){
        String ans = "";
        int temp = tree.search(nodoContent);
        if(temp == -1){
            ans = "The nodo " + nodoContent + " doesn't exist in the tree";
        }else{
            ans = "The nodo "+ nodoContent + " is in the position " + temp;
        }
        return ans;
    }

    public String findSucesors(int nodoContent){
        String ans = tree.findSucesors(nodoContent);
        
        if(ans.equals("")){
            ans = "The nodo doesn't exist in the tree";
        }
        if(ans.equals("MH")){
            ans = "The nodo is a leaf";
        }
        return ans;
    }

    public String findPredecesor(int content){
        String ans = tree.findPredecesor(content);

        if(ans.equals("")){
            ans = "The nodo doesn't exist in the tree";
        }

        if(ans.equals("MH")){
            ans = "The nodo is the root";
        }

        return ans;
    }

    public String deeperFinder(){
        String ans = tree.deeperFinder();

        if(ans.equals("")){
            ans = "The tree doesn't exist";
        }

        return ans;
    }

    public String findCommonAncestor(int n1, int n2){
        int ances = tree.findCommonAncestor(n1, n2);
        String ans = ""; 
        return ans;
    }

    
    
    
    
}
