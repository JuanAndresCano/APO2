package util;

public class BSTNodo implements Tree{

    private int content;
    private BSTNodo left;
    private BSTNodo right;
    private NodoType type;
    private BSTNodo father;

    public BSTNodo(int content){

        this.content = content;
        this.left = null;
        this.right = null;
        this.father = null;
    }
    

    public int getContent() {
        return content;
    }


    public void setContent(int content) {
        this.content = content;
    }


    public BSTNodo getLeft() {
        return left;
    }


    public void setLeft(BSTNodo left) {
        this.left = left;
        setType(NodoType.BRANCH);
    }


    public BSTNodo getRight() {
        return right;
    }


    public void setRight(BSTNodo right) {
        this.right = right;
        setType(NodoType.BRANCH);
    }


    public NodoType getType() {
        return type;
    }


    public void setType(NodoType type) {
        this.type = type;
    }

    public BSTNodo getFather(){
        return father;
    }

    public void setFather(BSTNodo father){
        this.father = father;
    }


    @Override
    public String print() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'print'");
    }
    @Override
    public void add(int content) {
        // TODO Auto-generated method stub
        
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }
    @Override
    public int search(int content) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'search'");
    }
    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }   


}
