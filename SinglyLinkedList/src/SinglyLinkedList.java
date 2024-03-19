public class SinglyLinkedList<T> {

    public Node<T> head;

    public static class Node<T>{
        T data;
        Node<T> next;
        public Node(T data) {
            this.data = data;
        }
    }

    public void traverse() {
        Node current = head;
        while(current != null) {
            System.out.println("data: " + current.data);
            current = current.next;
        }
    }

    public void insert(Node node, int position) {

    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> singlyLinkedList = new SinglyLinkedList<>();
        singlyLinkedList.head = new Node(1);
        singlyLinkedList.traverse();
    }


}


