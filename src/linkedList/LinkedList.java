package linkedList;

class CustomLinkedList{
	private Node<Integer> head;
	private Node<Integer> tail;
	private int length;
	
	public CustomLinkedList() {
		head = new Node<>();
		tail = head;
		length=0;
	}
	
	public void add(int data){
		Node<Integer> newNode = new Node<>(data);
		if(length==0){
			head=newNode;
			tail=head;
			length++;
			return;
		}
		tail.next = newNode;
		tail = tail.next;
		length++;
	}
	
	public void add(int data,int pos){
		if(pos<1 || pos>length+1){
			System.out.println("Invalid position.");
			return;
		}
		Node<Integer> newNode = new Node<>(data);
		if(pos==1){
			newNode.next = head;
			head = newNode;
			return;
		}else if(pos==(length+1)){
			tail.next = newNode;
			tail = newNode;
			return;
		}
		Node<Integer> temp = head;
		while(--pos>1){
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
		length++;
	}
	
	public void delete(int pos){
		if(pos>length || pos<1){
			System.out.println("Invalid position.");
			return;
		}
		if(pos==1){
			if(length>1){
				head=head.next;
			}else{
				head=null;
				tail=null;
			}
			return;
		}
		Node<Integer> temp = head;
		while(--pos>1){
			temp = temp.next;
		}
		length--;
		temp.next = temp.next.next;
		if(temp.next==null){
			tail=temp;
		}
	}
	
	public int find(int data){
		Node<Integer> temp = head;
		int position = 1;
		while(temp!=null){
			if(temp.getData()==data){
				return position;
			}
			position++;
			temp=temp.next;
		}
		return 0;
	}
	
	public int length(){
		return length;
	}
	
	public void display(){
		if(length==0){
			System.out.println("Linked list is empty.");
			return;
		}
		Node<Integer> temp = head;
		while(temp!=null){
			System.out.print(temp.getData()+"->");
			temp = temp.next;
		}
		System.out.print("NULL\n");
	}
}

public class LinkedList {

	public static void main(String[] args) {
		CustomLinkedList list = new CustomLinkedList();
		list.display();
		System.out.println("Adding 2.");
		list.add(2);
		System.out.println("Adding 3.");
		list.add(3);
		list.display();
		System.out.println("Adding 4.");
		list.add(4);
		System.out.println("Adding 5.");
		list.add(5);
		list.display();
		System.out.println("Deleting node at position 4:");
		list.delete(4);
		list.display();
		System.out.println("Adding 6 at position 3:");
		list.add(6,3);
		list.display();
//		System.out.println("Reversing list:");
//		list.reverse();
		System.out.println("Length of list: "+list.length());
//		System.out.println("Swapping node at index 1 with node at index 3:");
//		list.swap(1,3);
		System.out.println("Position of node with data 3: "+((list.find(3)==0)?"Not Present":list.find(3)));
	}

}
