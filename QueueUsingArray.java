//aimport java.util.Scanner;

public class QueueUsingArray {
    
    //Scanner sc = new Scanner(System.in);

    static int [] queue;
    static int front;
    static int rear;


    static void createQueue(int size)
    {
        queue = new int[size];
        front = 0;
        rear = 0;
        System.out.println("Queue had been created with size : "+size);
    }

    static void enQueue(int element)
    {
        if(rear != queue.length)
        {
            queue[rear] = element;
            rear++;
            System.out.println(element+" had been added to queue ");
        }
        else
        {
            System.out.println("Queue is full ");
        }
    }

    static void deQueue()
    {
        if(rear == front)
        {
            System.out.println("Queue is empty ");
        }
        else
        {
            System.out.println(queue[front]+" got deleted");

            for(int i = 0; i < rear-1; i++)
            {
                queue[i] = queue[i+1];
            }
            rear--;
        }
    }

    public static void main(String[] args)
    {
        System.out.println("create the queue !");
        System.out.println("Enter the size of Queue :");
        createQueue(5);
        enQueue(10);
        enQueue(20);
        enQueue(30);
        enQueue(40);
        enQueue(50);
        enQueue(60);
        deQueue();
        deQueue();

    }
}
