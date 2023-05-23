class CircularQueue
{
    private int cq[];
    private int size;
    private int r=-1;
    private int f=0;
    private int count=0;
    private Scanner scan= new Scanner(System.in);
    public CircularQueue(int n) {
        cq= new int [n];
        size=cq.length();    
    }
    public void insert() {
        if (count==size)
        {
            System.out.println("Insertion not possible");
        }
        else{
            System.out.println("Enter an element");
            int elem=scan.nextInt();
            r=(r+1)%size;
            cq[r]=elem;
            count++;
        }
    }
    public void delete() {
        if(count==0)
        {
            System.out.println("Deletion not possible");
        }
        else{
            System.out.println("Element deletion is"+q[f]);
            f=(f+1)%size;
            count--;
        }
    }
    public void display() {
        int f1=f;
        if(count==0)
        {
            System.out.println("Display not possible");
        }
        else{
            for(int i=1; i<=count; i++){
                System.out.println(cq[f1]+" ");
                f1=(f1+1)%size;
            }
            System.out.println();
        } 
    }   
}
class CircularQueueApp{
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter the Queue size");
        int n= scan.nextInt();
        CircularQueue queue =new CircularQueue(n);
        while(true){
            System.out.println("Press 1 ----> Insert");
            System.out.println("Press 2 ----> Delete");
            System.out.println("Press 3 ----> Display");
            System.out.println("Any other number ---->Stop");
            System.out.println("Enter your choice");
            int choice=scan.nextInt();
            switch (choice) {
                case 1:
                    circularqueue.insert();
                    break;
                case 2:
                    circularqueue.delete();
                    break;
                case 3:
                    circularqueue.display();
                    break;
                default:
                    System.exit(0);
            }
        }
    }
}