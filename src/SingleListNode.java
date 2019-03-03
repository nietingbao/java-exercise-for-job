public class SingleListNode {
    //head node
    private Node head;

    //size of ListNode;
    private int size;

    //node class
    private class Node {
        private Object data;
        private Node next;

        Node(Object obj) {
            this.data = obj;
        }
    }

    //initialize a SingleListNode
    public SingleListNode() {
        head = null;
        size = 0;
    }

    //add a data to a SingleListNode
    public void addNode(Object obj) {
        Node newNode = new Node(obj);
        newNode.next = head;
        head = newNode;
        size++;
    }

    //delete a data from the head and return it
    public Object deleteHead() {
        if (size == 0) {
            return null;
        }
        Object object = head.data;
        head = head.next;
        size--;
        return object;
    }

    //find an object
    public Object find(Object obj) {
        if (size == 0) return null;
        Node current = head;
        int tempSize = size;
        while (tempSize > 0) {
            if (current.data == obj) {
                return current.data;
            }
            tempSize--;
            current = current.next;
        }
        return null;
    }

    //delete an object
    public boolean delete(Object obj){
        if (size == 0) {
            return false;
        }
        Node previousNode;
        Node currentNode = head;
        //如果删除的是头结点
        if (head.data == obj) {
            head = head.next;
            size --;
            return true;
        }
        //如果删除的是以后的节点
        int tempSize = size;
        while (tempSize > 0) {
            if (currentNode.next.data == obj) {
                previousNode = currentNode;
                currentNode = currentNode.next;
                previousNode.next = currentNode.next;
                size--;
                return true;
            }
            tempSize--;
            currentNode = currentNode.next;
        }
        return false;
    }

    //显示节点信息
    public void display() {
        if (size == 0) {
            System.out.println("无节点");
        }
        Node p = head;
        int tempSize = size;
        while (tempSize > 1) {
            System.out.print(p.data + "->");
            p = p.next;
            tempSize --;
        }
        System.out.print(p.data);
    }



    
    public static void main(String[] args) {
        SingleListNode listNode = new SingleListNode();
        listNode.addNode('A');
        listNode.addNode('B');
        listNode.addNode('C');
        listNode.display();
        System.out.println(listNode.find('D'));
        listNode.delete('A');
        listNode.display();
        listNode.delete('C');
        listNode.display();
    }

}
