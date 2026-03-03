public class Node {
    CharData data;
    Node next;

    public Node(CharData data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(CharData data) {
        this(data, null);
    }

    public String toString() {
        return "" + data;
    }
}