public class Main {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();
        bst.put(3, "Three");
        bst.put(1, "One");
        bst.put(4, "Four");
        bst.put(2, "Two");
        bst.put(5, "Five");
        System.out.println(bst.get(1));
    }

}