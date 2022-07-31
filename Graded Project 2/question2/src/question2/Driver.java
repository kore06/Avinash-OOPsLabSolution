package question2;

public class Driver {
    public Node node;
    public static void main(String[] args) {
        Transactions transactions = new Transactions();
        Driver tree = new Driver();
        tree.node = new Node(50);
        tree.node.setLeft(new Node(30));
        tree.node.setRight(new Node(60));
        tree.node.getLeft().setLeft(new Node(10));
        tree.node.getLeft().setRight(new Node(40));
        transactions.convertBTToRightSkewed(tree.node);
        transactions.traverseRightSkewed(Transactions.headNode);
    }
}