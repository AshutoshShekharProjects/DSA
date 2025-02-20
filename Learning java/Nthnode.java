public class Nthnode {
    Node head;
    public static class Node {
        int value;
        Node next;
        Node(int val){
            this.value=val;
            this.next=null;
        }
    }
    public void addFirst(int val){
        Node newNode= new Node(val);
        newNode.next=head;
        head=newNode;
    }
    public void addLast(int val){
        Node newNode= new Node(val);
        if(head==null){
            newNode.next=head;
            head=newNode;
            return;
        }
        Node lastNode=head;
        while(lastNode.next!=null){
            lastNode=lastNode.next;
        }
        lastNode.next=newNode;
    }
    public void deleteFirst(){
        if(head==null){
            System.out.println("Empty List");
        }
        head=head.next;
    }
    public void deleteLast(){
        if(head==null){
            System.out.println("Empty List");
        }
        if(head.next==null){
            head=null;
            return;
        }
        Node last=head.next;
        Node secondLast=head;
        while(last.next!=null){
            last=last.next;
            secondLast=secondLast.next;
        }
        secondLast.next=null;
    }
    public void printList(){
        Node current=head;
        while(current!=null){
            System.out.print(current.value+"->");
            current=current.next;
        }
        System.out.println("Null");
    }
    public void removeNthFromEnd(int n){
        int size=0;
        Node temp=head;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        if(n==size){
            head= head.next;
            return;
        }
        int c=1,pos=size-n+1;
        int previous=pos-1;
        Node previousNode=head;
        while(c!=previous){
            previousNode=previousNode.next;
            c++;
        }
        previousNode.next=previousNode.next.next;
    }

    public static void main(String[] args){
        Nthnode ll=new Nthnode();
        ll.addLast(2);
        ll.addLast(3);
        ll.addLast(4);
        ll.addLast(5);
        ll.addFirst(1);
        ll.printList();
        ll.removeNthFromEnd(2);
        ll.printList();
    }
}
