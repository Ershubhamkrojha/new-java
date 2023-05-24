import java.util.*;
public class Queue{ 
static int rear=-1;
static int front=-1;
//static int n=5;
static int queue[];
      
   public static void main(String[] args ){
        Scanner sc=new Scanner(System.in);
       // System.out.println("Enter size of Queue");
        //int n=sc.nextInt();
        queue=new int[5];
        while(true){
        int ch=sc.nextInt();
        System.out.println(isFull());

       switch (ch) {
           case 1:enqueue();
           break;
           case 2:dequeue();
           break;
           case 3:display();
           break;
          default:System.out.println("Enter correct options:- ");
               break;
        }

   }
}
   
        public static boolean isEmpt(){
           return rear==-1;

       }

       public static boolean isFull(){
         return rear==5-1;

       }
       public static void enqueue(){
           System.out.println("aldksjf");
           if(isFull()){
               System.out.println("Queue is full");
           }
           else{
               for(int i=0;i<5;i++){
                   Scanner sc=new Scanner(System.in);
                   System.out.println("Enter element in queue:-");
                   int data=sc.nextInt();
                   rear=rear+1;
                   queue[rear]=data;
           }
       }
   }
       public static void dequeue(){
           if(isEmpt()){
               System.out.println("queue is empty");
           }
           else{
            front=front+1;
               System.out.print(queue[front]);
               for(int i=0;i<rear-1;i++){
                   queue[i]=queue[i+1];
               }
           }

       }
       public static void display(){
           if(isEmpt()){
               System.out.println("Queue is empty");
           }
           else{
               for(int i=0;i<rear;i++)
               {

                 System.out.println(queue[i]);  
               }
           }



       }    
   }
