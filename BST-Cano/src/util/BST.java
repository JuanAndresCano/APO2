package util;

public class BST implements Tree{


    private BSTNodo root;




    public BST(){
        root = null;
    }

    @Override
    public String print() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'print'");
    }
    @Override
    public void add(int content) {

        if (root == null){
            BSTNodo nodo = new BSTNodo(content);
            root = nodo;
        }else{
            if(content < root.getContent()){
                if (root.getLeft()==null){
                    BSTNodo nodo = new BSTNodo(content);
                    root.setLeft(nodo);
                    nodo.setFather(root);
                }else{
                    addRecursive(root.getLeft(), content);
                }

            }else{
                if(root.getRight() == null){
                    BSTNodo nodo = new BSTNodo(content);
                    root.setRight(nodo);
                    nodo.setFather(root);
                }else{
                    addRecursive(root.getRight(), content);
                }
            }
        }
    }

    public void addRecursive(BSTNodo actual, int content){
        if(content < actual.getContent()){
            if (actual.getLeft()==null){
                BSTNodo nodo = new BSTNodo(content);
                actual.setLeft(nodo);
                nodo.setFather(actual);
            }else{
                addRecursive(actual.getLeft(), content);
            }
               
        }else{
            if(actual.getRight() == null){
                BSTNodo nodo = new BSTNodo(content);
                actual.setRight(nodo);
                nodo.setFather(actual);
            }else{
                addRecursive(actual.getRight(), content);
            }
        }
    }
    @Override
    public int search(int content) {
        int ans = 0;
        int temp;
        if(root == null){
            ans = -1;
        }else{

        
            if (root.getContent() == content){
                ans = 0;
            }else{
                ans++;
                if(content < root.getContent()){
                    if (root.getLeft()==null){
                        ans = -1;
                    }else{
                        temp = searchRecursive(root.getLeft(), content);
                        if(temp == -1){
                            ans = -1;
                        }else{
                            ans += temp;
                        }
                    }

                }else{
                    if(root.getRight() == null){
                        ans = -1;
                    }else{
                        
                        temp = searchRecursive(root.getRight(), content);
                        if(temp == -1){
                            ans = -1;
                        }else{
                            ans += temp;
                        }
                    }
                }
            }
        }

        return ans;

    }

    public int searchRecursive(BSTNodo actual, int content){
        int steps = 0;
        int temp;
        if (actual.getContent() == content){
            steps = 0;
        }else{
            steps++;
            if(content < actual.getContent()){
                if (actual.getLeft()==null){
                    steps = -1;
                }else{
                    temp = searchRecursive(actual.getLeft(), content);
                    if(temp == -1){
                        steps = -1;
                    }else{
                        steps += temp;
                    }
                }

            }else{
                if(actual.getRight() == null){
                    steps = -1;
                }else{
                    temp = searchRecursive(actual.getRight(), content);
                    if(temp == -1){
                        steps = -1;
                    }else{
                        steps += temp;
                    }
                }
            }
        }

        return steps;
    }

    public String findSucesors(int content){
        String ans = "";

        if(root == null){
            ans = "";
        }else{

        
            if (root.getContent() == content){

                if(root.getLeft() != null){
                    ans += "\nSucesor: " + root.getLeft().getContent();
                }
                if(root.getRight() != null){
                    ans += "\nSucesor: " + root.getRight().getContent();
                }
                if(ans.equals("")){
                    ans = "MH";
                }

            }else{
                
                if(content < root.getContent()){
                    if (root.getLeft()==null){

                        ans = "";

                    }else{

                        ans = findSucesorsRecursive(root.getLeft(), content);

                    }

                }else{
                    if(root.getRight() == null){

                        ans = "";

                    }else{
                        
                        ans = findSucesorsRecursive(root.getRight(), content);
                        
                    }
                }
            }
        }

        return ans;

    }

    public String findSucesorsRecursive(BSTNodo actual, int content){

        String ans = "";

        if(actual == null){
            ans = "";
        }else{

        
            if (actual.getContent() == content){

                if(actual.getLeft() != null){
                    ans += "\nSucesor: " + actual.getLeft().getContent();
                }
                if(actual.getRight() != null){
                    ans += "\nSucesor: " + actual.getRight().getContent();
                }
                if(ans.equals("")){
                    ans = "MH";
                }

            }else{
                
                if(content < actual.getContent()){
                    if (actual.getLeft()==null){

                        ans = "";

                    }else{

                        ans = findSucesorsRecursive(actual.getLeft(), content);

                    }

                }else{
                    if(actual.getRight() == null){

                        ans = "";
                        
                    }else{
                        
                        ans = findSucesorsRecursive(actual.getRight(), content);
                        
                    }
                }
            }
        }

        return ans;

    }

    public String findPredecesor(int content){
        String ans = "";
        if(root == null){
            ans = "";
        }else{

        
            if (root.getContent() == content){

                ans = "MH";

            }else{
                
                if(content < root.getContent()){
                    if (root.getLeft()==null){

                        ans = "";

                    }else{

                        ans = findPredecesorRecursive(root.getLeft(), content);

                    }

                }else{
                    if(root.getRight() == null){

                        ans = "";

                    }else{
                        
                        ans = findPredecesorRecursive(root.getRight(), content);
                        
                    }
                }
            }
        }

        return ans;
    }

    public String findPredecesorRecursive(BSTNodo actual, int content){

        String ans = "";

        if(actual == null){
            ans = "";

        }else{

        
            if (actual.getContent() == content){

               ans = "The predecesor of the nodo is " + (actual.getFather()).getContent();

            }else{
                
                if(content < actual.getContent()){
                    if (actual.getLeft()==null){

                        ans = "";

                    }else{

                        ans = findPredecesorRecursive(actual.getLeft(), content);

                    }

                }else{
                    if(actual.getRight() == null){

                        ans = "";
                        
                    }else{
                        
                        ans = findPredecesorRecursive(actual.getRight(), content);
                        
                    }
                }
            }
        }

        return ans;

    }

    public String deeperFinder(){
        String ans = "";
        int count = 0;
        int maxCount = 0;
        if(root == null){
        }else{

            count++;
            if(count > maxCount){
                maxCount = count;
            }

            if(root.getLeft() == null){
                ans = "The tree has " + maxCount + " levels"; 
            }else{

                count = findDown(root.getLeft());

                if(count > maxCount){
                    maxCount = count;
                }
                ans = "The tree has " + maxCount + " levels";
            }

            if(root.getRight() == null){
                ans = "The tree has " + maxCount + " levels";
            }else{

                count = findDown(root.getRight());

                if(count > maxCount){
                    maxCount = count;
                }
                ans = "The tree has " + maxCount + " levels";
            }
        }

        return ans;

    }

    public int findDown(BSTNodo actual){
        int count = 0;
        int maxCount = 0;

            if(actual.getLeft() != null){

                count++;
                maxCount++;

                count = findDown(actual.getLeft());

                if(count > maxCount){
                    maxCount = count;
                }
                
            }

            if(actual.getRight() != null){

                count++;
                maxCount++;

                count = findDown(actual.getRight());

                if(count > maxCount){
                    maxCount = count;
                }

            }
        
        return maxCount;

    }
    public int findCommonAncestor(int n1, int n2){
        int ans = -1;
        BSTNodo nodo1 = searchNodo(n1);
        BSTNodo nodo2 = searchNodo(n2);

        if (nodo1 == null || nodo2 == null){
            ans = -1;
        }else{
            if(nodo1.getFather().getContent() == nodo2.getFather().getContent()){
                ans = nodo1.getFather().getContent();
            }else{
                
            }
        }
        return ans;
    }

    public int findAncestorRecursive(int n, BSTNodo actual){
        int ans = -1;

        return ans;
    }

    public BSTNodo searchNodo(int content) {
        BSTNodo ans;
        
        if(root == null){
            ans = null;
        }else{

        
            if (root.getContent() == content){
                ans = root;
            }else{
                if(content < root.getContent()){
                    if (root.getLeft()==null){
                        ans = root.getLeft();
                    }else{
                        ans = searchNodoRecursive(root.getLeft(), content);
                    }

                }else{
                    if(root.getRight() == null){
                        ans = root.getRight();
                    }else{
                        
                        ans = searchNodoRecursive(root.getRight(), content);
                    }
                }
            }
        }

        return ans;

    }

    public BSTNodo searchNodoRecursive(BSTNodo actual, int content){
        BSTNodo ans;
        if (actual.getContent() == content){
            ans = actual;
        }else{
            
            if(content < actual.getContent()){
                if (actual.getLeft()==null){
                    ans = null;
                }else{
                    ans = searchNodoRecursive(actual.getLeft(), content);
                }

            }else{
                if(actual.getRight() == null){
                    ans = null;
                }else{
                    ans = searchNodoRecursive(actual.getRight(), content);
                    
                }
            }
        }

        return ans;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

}
