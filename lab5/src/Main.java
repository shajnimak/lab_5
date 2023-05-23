public class Main {
    public static void main(String[] args) {
        BST<Integer, Integer> bst = new BST<>();
        bst.put(3, 6);
        bst.put(1, 1);
        bst.put(4, 7);
        bst.put(2, 2);
        bst.put(5, 8);
        bst.put(5, 10);
        bst.put(5, 5);
        bst.put(5, 1);
        bst.put(5, 6);



        System.out.println(bst.get(1));
        System.out.println(bst.hight());
    }

}