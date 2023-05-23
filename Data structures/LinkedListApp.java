class LinkedList
{
    class Node{
        int data;
        Node link;
    }
    private Scanner scan= new Scanner(System.in);
    private Node first;
    public void insertRear() {
        Node temp;
        System.out.println("Enter an element");
        int ele=scan.nextInt();
        Node newnode=new Node();
        newnode.data=ele;
        newnode.link=null; 
        if (first==null)
        {
            first=newnode;
        }
        else{
            temp=first;
            while(temp.link!=null){
                temp=temp.link;
            }  
            temp.link=newnode; 
        }
    }
    public void deleteRear() {
        Node temp; 
        if (first==null)
        {
            System.out.println("Deletion not possible");
        }
        elseif (first.link==null){
            System.out.println("Element deleted is"+first.data);
            first==null;
        }
        else{
            temp=first;
            while(temp.link!=null){
                temp=temp.link;
            }
            System.out.println("Element deleted is"+temp.link.data);   
            temp.link=null; 
        }
    }
    public void insertFront() {
        System.out.println("Enter an element");
        ele=scan.nextInt();
        Node newnode=new Node();
        newnode.data=ele;
        newnode.link=null; 
        if (first==null)
        {
            first=newnode;
        }
        else{
            newnode.link=first;
            first=newnode;
        }
    }
    public void deleteFront() {
        if (first==null)
        {
            System.out.println("Deletion not possible");
        }
        elseif (first.link==null){
            System.out.println("Element deleted is"+first.data);
            first==null;
        }
        else{
            System.out.println("Element deleted is"+first.data);
        }
    }
    public void display() {
        Node temp; 
        if (first==null)
        {
            System.out.println("Display not possible");
        }
        elseif (first.link==null){
            System.out.println(first.data);
        }
        else{
            temp=first;
            while(temp!=null){
                System.out.println(temp.data);   
                temp=temp.link; 
            }
            System.out.println();
        }
    }  
}
class LinkedListApp{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        LinkedList ll =new LinkedList();
        while(true){
            System.out.println("Press 1 ----> InsertRear");
            System.out.println("Press 2 ----> DeleteRear");
            System.out.println("Press 3 ----> InsertFront");
            System.out.println("Press 4 ----> DeleteFront");
            System.out.println("Press 5 ----> Display");
            System.out.println("Any other number ---->Stop");
            System.out.println("Enter your choice");
            int choice=scan.nextInt();
            switch (choice) {
                case 1:
                    ll.insertRear();
                    break;
                case 2:
                    ll.deleteRear();
                    break;
                case 3:
                    ll.insertFront();
                    break;
                case 4:
                    ll.deleteFront();
                    break;
                case 5:
                    ll.display();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}