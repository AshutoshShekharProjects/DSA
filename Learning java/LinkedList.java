public class LinkedList {
    Node head;
    public class Node {
        String data;
        Node next;
        Node(String data){
            this.data=data;
            this.next=null;
        }
    }
    public void addFirst(String data){
        Node newNode=new Node(data);
        newNode.next=head;
        head=newNode;
    }
    public void addLast(String data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
        }
        Node lastNode=head;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
        }
        lastNode.next=newNode;
    }
    public void printList(){
        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.data + "->");
            currNode=currNode.next;
        }
        System.out.println("Null");
    }
    public void deleteFirst(){
        if(head==null){
            System.out.print("Empty List");
        }
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.print("Empty List");
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node secondLast=head;
        Node last=head.next;
        while(last.next!=null){
            secondLast=secondLast.next;
            last=last.next;
        }
        secondLast.next=null;
    }
    public void reverse(){
        if(head==null || head.next==null){
            return;
        }
        Node currentNode = head.next;
        Node previousNode = head;
        while(currentNode!=null){
            Node nextNode =currentNode.next;
            currentNode.next=previousNode;
            previousNode=currentNode;
            currentNode=nextNode;
        }
        head.next=null;
        head=previousNode;
    }
    public Node reverseRecursive(Node head){
        if(head==null || head.next==null){
            return head;
        }
        Node newHead = reverseRecursive(head.next);
        head.next.next=head;
        head.next=null;
        return newHead;
    }

    public static void main(String[] args){
        LinkedList ll=new LinkedList();
        ll.addFirst("is");
        ll.addLast("a");
        ll.addLast("list");
        ll.printList();
        ll.addFirst("this");
        ll.printList();
        ll.reverse();
        ll.printList();
        ll.head = ll.reverseRecursive(ll.head);
        ll.printList();
        //ll.deleteFirst();
        //ll.printList();
        //ll.deleteLast();
        //ll.printList();
    }
}
