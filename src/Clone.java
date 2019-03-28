public class Clone {
    public RandomListNode Clone(RandomListNode pHead)
    {
        //先对自身结点进行克隆，针对于next；'
        RandomListNode currentNode = pHead;
        //cloneNode(pHead);
//        while (currentNode != null) {
//            RandomListNode node = new RandomListNode(currentNode.label);
//            node.next = currentNode.next;
//            currentNode.next = node;
//            currentNode = node.next;
//        }
//        链接：https://www.nowcoder.com/questionTerminal/f836b2c43afc4b35ad6adc41ec941dba
//    来源：牛客网

        while(currentNode != null){
            RandomListNode cloneNode = new RandomListNode(currentNode.label);
            RandomListNode nextNode = currentNode.next;
            currentNode.next = cloneNode;
            cloneNode.next = nextNode;
            currentNode = nextNode;
        }


        currentNode = pHead;
        //cloneRandomNode(pHead);
        while (currentNode != null) {
            currentNode.next.random = currentNode.random==null?null:currentNode.random.next;
            currentNode = currentNode.next.next;
        }


        currentNode = pHead;
        RandomListNode cloneHead = pHead.next;
        while (currentNode!=null) {
            RandomListNode cloneNode = currentNode.next;
            currentNode.next = cloneNode.next;
            cloneNode.next = (cloneNode.next == null) ? null : cloneNode.next.next;
            currentNode = currentNode.next;
        }
        return cloneHead;
    }
}


//第一个指针指向next，另外一个指针指向任意一个结点。
class RandomListNode {
    int label;
    RandomListNode next = null;
    RandomListNode random = null;

    RandomListNode(int label) {
        this.label = label;
    }
}