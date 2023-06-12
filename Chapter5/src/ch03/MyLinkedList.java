package ch03;

public class MyLinkedList {
	
	private MyListNode head;
	int count;
	
	public MyLinkedList() {
		head = null;
		count = 0;
	}
	
	public MyListNode addElement(String data) {
		
		MyListNode newNode;
		
		if(head == null) {
			newNode = new MyListNode(data);
		} else {
			newNode = new MyListNode(data);
			MyListNode temp = head;
			// 노드의 마지막 요소를 찾는 코드
			// temp.next가 null이면(= 더이상 다음 요소가 없다면) temp=마지막 요소
			while(temp.next != null) {
				temp = temp.next;
			}
			// 마지막 요소의 다음에 newNode 삽입
			temp.next = newNode;
		}
		
		count++;
		return newNode;
		
	}
	
	public MyListNode insertElement(int position, String data) {
		
		int i;
		MyListNode tempNode = head;
		MyListNode preNode = null;
		
		MyListNode newNode = new MyListNode(data);
		
		if(position < 0 || position > count) {
			System.out.println("추가 할 위치 오류 입니다. 현재 리스트의 개수는 " + count +"개 입니다.");
			return null;
		}
		
		// 첫번째에다 삽입할 때
		if(position == 0) {
			// newNode의 다음을 원래 첫번째 요소인 head를 가리키도록 함
			// head에 newNode 할당
			newNode.next = head;
			head = newNode;
		} else {
			for(i=0; i<position; i++) {
				preNode = tempNode;
				tempNode = tempNode.next;
			}
			
			newNode.next = preNode.next;
			preNode.next = newNode;
		}
		
		count++;
		return newNode;
		
	}
	
//	public MyListNode removeElement(int position) {
//		
//	}
//	
//	public String getElement(int position) {
//		
//	}
//	
//	public MyListNode getNode(int position) {
//		
//	}
	
	public void removeAll() {
		
	}
	
	public int getSize() {
		return count;
	}
	
	public void printAll() {
		
	}
	
	public boolean isEmpty() {
		if(head == null) return true;
		else return false;
	}
	
	
	
	
	

}
