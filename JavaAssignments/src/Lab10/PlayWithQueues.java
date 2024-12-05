public class PlayWithQueues {
    public static void main(String[] args){
        Queue q = new Queue();
        
        q.enqueue(5);
        q.enqueue(6);
       
        System.out.println("Current Queue: ");
        printQueue(q);
        System.out.println();
        q.enqueue(10);
        
        System.out.println(q.peek() + " is at the front of the queue.");
        
        q.enqueue(90);
        System.out.println("Size of queue: " + q.size());
        System.out.println("Queue full: "+ q.isFull());

        System.out.println(countNum(q, 90));
        System.out.println(ascendingOrder(q));

        System.out.println("Dequeue all elements");
        q.dequeueAll();
        System.out.println("Queue empty: "+ q.isEmpty());


        System.out.println("6 in the queue: " + inQueue(6,q));
    }
        
    public static void printQueue(Queue Q){
        int s = Q.size();

        for (int i=0; i<s; i++){
            int temp = (int) Q.dequeue();
            Q.enqueue(temp);
            System.out.print(temp+" ");
        }
    }    
    
    public static boolean inQueue(int n, Queue Q){
        int s = Q.size();
        boolean decision = false;
        
        for (int i=0; i<s; i++){
        int temp = (int) Q.dequeue();
        Q.enqueue(temp);
        if (temp==n)
            decision=true;
        }
        
        return decision;
    
    }

    public static int countNum(Queue Q, int num) {
        return 0;
    }
    
    public static boolean ascendingOrder(Queue Q) {
        return true;
    }




}
