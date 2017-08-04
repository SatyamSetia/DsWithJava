

class CustomQueue{
	private int[] queueArr;
	private int rear,front;
	
	CustomQueue(int size){
		queueArr = new int[size];
		rear = -1;
		front = -1;
	}
	
	public void enqueue(int ele){
		if(rear==front-1){
			System.out.println("Queue is full.");
		}else if(rear==-1){
			rear++;
			front++;
			queueArr[rear] = ele;
		}else{
			if(rear!=queueArr.length-1){
				rear++;
			}else{
				rear=0;
			}
			queueArr[rear] = ele;
		}
	}
	
	public int dequeue(){
		if(rear==-1){
			System.out.println("Queue is empty.");
			return 0;
		}
		int frontNum = queueArr[front];
		if(rear==front){
			rear=front=-1;
		}else{
			if(front!=queueArr.length-1){
				front++;
			}else{
				front=0;
			}
		}
		return frontNum;
	}
	
	public void display(){
		if(rear==-1){
			System.out.println("Queue is empty.");
		}else{
			for(int i=front;i<=rear;i++){
				System.out.print(queueArr[i]+" ");
			}
			System.out.println();
		}
	}
}

public class Queue {
	public static void main(String[] args) {
		CustomQueue queue = new CustomQueue(10);
		queue.enqueue(2);
		queue.enqueue(3);
		queue.display();
		queue.enqueue(4);
		queue.enqueue(5);
		queue.display();
		System.out.println("Element removed: "+queue.dequeue());
		queue.display();
		System.out.println("Element removed: "+queue.dequeue());
		queue.display();
		System.out.println("Element removed: "+queue.dequeue());
		queue.display();
		System.out.println("Element removed: "+queue.dequeue());
		queue.display();
		System.out.println("Element removed: "+queue.dequeue());
		queue.display();
	}
}
