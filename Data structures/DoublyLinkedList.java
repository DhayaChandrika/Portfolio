class DoublyLinkedList
{
    class Node{
        Node prelink;
        int data;
        Node nextlink;
    }
    private Node first;
    private Scanner scan= new Scanner(System.in);
    public void insertRear() {
        Node temp;
        System.out.println("Enter an element");
        int elem=scan.nextInt();
        Node newnode=new Node();
        newnode.data=elem;
        newnode.prelink=null;
        newnode.nextlink=null; 
        if (first==null)
        {
            first=newnode;
        }
        else{
            temp=first;
            while(temp.nextlink!=null){
                temp=temp.nextlink;
            }  
            temp.nextlink=newnode; 
            newnode.prelink=temp;
        }
    }
    public void deleteRear() {
        Node temp; 
        if (first==null)
        {
            System.out.println("Deletion not possible");
        }
        elseif (first.nextlink==null){
            System.out.println("Element deleted is"+first.data);
            first==null;
        }
        else{
            temp=first;
            while(temp.nextlink!=null){
                temp=temp.nextlink;
            }
            System.out.println("Element deleted is"+temp.nextlink.data);   
            temp.nextlink=null; 
        }
    }
    public void insertFront() {
        System.out.println("Enter an element");
        int elem=scan.nextInt();
        Node newnode=new Node();
        newnode.data=ele;
        newnode.prelink=null;
        newnode.nextlink=null; 
        if (first==null)
        {
            first=newnode;
        }
        else{
            newnode.nextlink=first;
            first.prelink=newnode;
            first=newnode;
        }
    }
    public void deleteFront() {
        if (first==null)
        {
            System.out.println("Deletion not possible");
        }
        elseif (first.nextlink==null){
            System.out.println("Element deleted is"+first.data);
        }
        else{
            first=first.nextlink;
            first.prelink=null;
        }
    }
    public void displayForward() {
        Node temp; 
        if (first==null)
        {
            System.out.println("Display not possible");
        }
        elseif (first.nextlink==null){
            System.out.println(first.data);
        }
        else{
            temp=first;
            while(temp!=null){
                System.out.println(temp.data+" ");   
                temp=temp.nextlink; 
            }
            System.out.println();
        }
    }  
    public void displayReverse() {
        Node temp; 
        if (first==null)
        {
            System.out.println("Display not possible");
        }
        elseif (first.nextlink==null){
            System.out.println(first.data);
        }
        else{
            temp=first;
            while(temp.nextlink!=null){
                temp=temp.nextlink; 
            }
            while(temp!=null){
                System.out.println(temp.data+" ");   
                temp=temp.prelink; 
            }
            System.out.println();
        }
    }  
}
class DoublyLinkedListApp{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        DoublyLinkedList dll =new DoublyLinkedList();
        while(true){
            System.out.println("Press 1 ----> InsertRear");
            System.out.println("Press 2 ----> DeleteRear");
            System.out.println("Press 3 ----> InsertFront");
            System.out.println("Press 4 ----> DeleteFront");
            System.out.println("Press 5 ----> DisplayForward");
            System.out.println("Press 6 ----> DisplayReverse");
            System.out.println("Any other number ---->Stop");
            System.out.println("Enter your choice");
            int choice=scan.nextInt();
            switch (choice) {
                case 1:
                    dll.insertRear();
                    break;
                case 2:
                    dll.deleteRear();
                    break;
                case 3:
                    dll.insertFront();
                    break;
                case 4:
                    dll.deleteFront();
                    break;
                case 5:
                    dll.displayForward();
                    break;
                case 6:
                    dll.displayReverse();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}