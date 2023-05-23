class Array{
    private int arr[];
    private Scanner scan=new Scanner (System.in);
    public Array(int n){
        arr=new int [n];
    }
    public void insert()
    {
        System.out.println("Enter the position from 0 to" + (arr.length-1));
        int pos=scan.nextInt();
        System.out.println("Enter the element");
        int elem=scan.nextInt();
        arr[pos]=elem;
    }
    public void delete()
    {
        System.out.println("Enter the position to delete the element");
        int pos=scan.nextInt();
        System.out.println("Element deleted is"+arr[pos]);
        arr[pos]=0;
    }
    public void display()
    {
        for(int i=0; i<=arr.length-1; i++)
        {
            System.out.println(arr[i]+" ");
        }
        System.out.println();
    }
}
class ArrayApp
{
    public static void public static void main(String[] args) {
     Scanner scan=new Scanner(System.in);
     System.out.println("Enter Array Length:");
     int n=scan.nextInt();
     Array a= new Array(n);
     while(true)
     {
        System.out.println("Press 1 ----> Inserting");
        System.out.println("Press 2 ----> Deleting");
        System.out.println("Press 3 ----> Display");
        System.out.println("Any other key ----> Exit");
        System.out.println("Enter your choice:");
        int choice=scan.nextInt();
        switch (choice) {
            case 1:
                a.insert();
                break;
            case 2:
                a.delete();
                break;
            case 3:
                a.display();
                break;
            default: System.exit(0);
                break;
        }
     }   
    }
}