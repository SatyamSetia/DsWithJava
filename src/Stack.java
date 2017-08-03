import java.util.Scanner;

class CustomStack {
	
	private int[] stackArr;
	private int top;
	private int stackSize;
	
	public CustomStack(int size){
		stackArr = new int[size];
		top=-1;
		stackSize = size;
	}
	
	public void push(int ele){
		if(top<stackSize){
			top++;
			stackArr[top] = ele;
		}
		else{
			System.out.println("Stack is full.");
		}
	}
	
	public int pop(){
		if(top>-1){
			int topNum = stackArr[top];
			top--;
			return topNum;
		}
		else{
			System.out.println("Stack is empty.");
			return 0;
		}
	}
	
	public void peek(){
		if(top>-1){
			System.out.println(stackArr[top]);
		}
		else{
			System.out.println("Stack is empty.");
		}
	}
	
	public void print(){
		if(top<0){
			System.out.println("Stack is empty.");
		}
		for(int i=0;i<=top;i++){
			System.out.print(stackArr[i]+" ");
		}
		System.out.println();
	}

}

public class Stack {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		CustomStack stack = new CustomStack(10);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		stack.print();
		System.out.println("POP: "+stack.pop());
		stack.peek();
		System.out.println("POP: "+stack.pop());
		stack.peek();
		System.out.println("POP: "+stack.pop());
		stack.peek();
		System.out.println("POP: "+stack.pop());
		stack.print();
		stack.print();
		scan.close();
	}
}