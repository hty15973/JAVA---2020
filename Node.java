
public class Node {
	private int data;
	private Node nextBox;
	
	public Node(int data,Node nextBox) {
		this.data = data;
		this.nextBox = nextBox
				;
	}
	
	public void setData(int data) {
		this.data =data;
	}
	public void setNextBox(Node nextBox) {
		this.nextBox = nextBox;
	}
	
	public int getData() {
		return data;
	}
	
	public Node getNextBox() {
		return nextBox;
	}
}
