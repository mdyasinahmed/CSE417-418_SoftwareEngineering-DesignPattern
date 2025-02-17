package Lab_04;

public class Counter {
    static int count = 0;

    public void increment() {
        Counter.count++; 
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        c1.increment(); 
        System.out.println("Count: " + Counter.count);
        
        Counter c2 = new Counter();
        c2.increment(); 

         
        System.out.println("Count: " + Counter.count); 
    }    
}
