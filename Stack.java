
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
		//}// ������ �迭�� ũ��� top�� ��ġ�� ���ؾ��ϴ°��� �����̴�. ������ �Ŀ� ��� exception���ΰ� ��ġ���ش�.
		//members[top++] = value; //�濡 �����͸� �Է����ְ� �������� ��ġ�� �������ش�.
	}
	
	public int pop() {
		top--;
		int tmp = members.getData(); // �����͸� ���� ���� ���� ��ġ�� ����Ű�� �ִ� top�� ������� ��ġ�� �ΰ� �����͸� ����.
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
