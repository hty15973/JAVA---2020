
public class Stack {
	private Node members = null;
	private int top;
	
	public Stack() {
		members = null;
		top = 0;
	}

	public void push(int value) { 
		members = new Node(value,members);
		top ++;
		//if(top>= members.length) {
			//int[] tmp = new int[members.length+10];
			//System.arraycopy(members, 0, tmp, 0, members.length);
		//}// 원래는 배열의 크기와 top의 위치를 비교해야하는것이 정석이다. 하지만 후에 배울 exception을두고 방치해준다.
		//members[top++] = value; //방에 데이터를 입력해주고 다음방의 위치를 가르켜준다.
	}
	
	public int pop() {
		top--;
		int tmp = members.getData(); // 데이터를 뺀후 다음 방의 위치를 가리키고 있던 top을 현재방의 위치로 두고 데이터를 뺀다.
		members = members.getNextBox();
		return tmp;
	}
	
	public int getSize() {
		return top;
		
	}
	
	public boolean isEmpty() {
		return (top == 0);
	}
}
