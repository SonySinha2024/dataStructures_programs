package stackOperation;



public class Main {
    public static void main(String[] args) {

        Stack<Integer> s = new Stack<>(4);
// size is 4 ,so 50 is not added
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(50);

        
        System.out.println("to push:"+s.push(80));
        System.out.println("to pop:"+s.pop());
        System.out.println("to peek:"+s.peek());
        
        System.out.println("is Full:"+s.isEmpty());
        System.out.println("is Empty:"+s.isFull());
        
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}


//output:
//	to push:false as size is 4 ,so 50 is not added
//	to pop:40
//	to peek:30
//	is Full:false
//	is Empty:false
//	30
//	20
//	10
//	null