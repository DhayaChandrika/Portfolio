class Queue
{
    private int q[];
    private int size;
    private int r=-1;
    private int f=0;
    private Scanner scan= new Scanner(System.in);
    public Queue(int n) {
        q= new int [n];
        size=q.length();    
    }
    public void input() {
        int elem;
        if (r==size-1)
        {
            System.out.println("Insertion not possible");
        }
        else{
            System.out.println("Enter an element");
            elem=scan.nextInt();
            ++r
            q[r]=elem;
        }
    }
    public void delete() {
        if(r==-1 || f>r)
        {
            System.out.println("Deletion not possible");
        }
        else{
            System.out.println("Element deletion is"+q[f]);
            ++f;
        }
    }
    public void display() {
        if(r==-1 || f>r)
        {
            System.out.println("Display not possible");
        }
        else{
            for(int i=f; i<=r; i++){
                System.out.println(q[i]+" ");
            }
            System.out.println();
        } 
    }   
}
class QueueApp{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the Queue size");
        int n= scan.nextInt();
        Queue queue =new Queue(n);
        while(true){
            System.out.println("Press 1 ----> Insert");
            System.out.println("Press 2 ----> Delete");
            System.out.println("Press 3 ----> Display");
            System.out.println("Any other number ---->Stop");
            System.out.println("Enter your choice");
            int choice=scan.nextInt();
            switch (choice) {
                case 1:
                    queue.insert();
                    break;
                case 2:
                    queue.delete();
                    break;
                case 3:
                    queue.display();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}