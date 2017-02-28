import java.util.Map;
import java.util.HashMap;

public class Node {
	
	private char value;
	private Map<Character, Node> next = new HashMap<Character, Node>();
	
	public Node(){}
	
	public Node(char input){
		value = input;
	}

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public Map<Character, Node> getNext() {
		return next;
	}

	public void setNext(Map<Character, Node> next) {
		this.next = next;
	}

	
}
