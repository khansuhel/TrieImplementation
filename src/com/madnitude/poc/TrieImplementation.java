package com.madnitude.poc;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TrieImplementation {
	private Node root;

	// Everything begins with a null root
	public TrieImplementation() {
		root = new Node();
	}

	public void insert(String input) {

		Map<Character, Node> nextNodesMap = new HashMap<Character, Node>();
		root.setNext(nextNodesMap);

		for (int i = 0; i < input.length(); i++) {

			char c = input.charAt(i);

			Node n;
			if (nextNodesMap.containsKey(c)) {
				n = nextNodesMap.get(c);
			} else {
				n = new Node(c);
				nextNodesMap.put(c, n);
			}
			// Within the same loop change the nextNodeMap to
			// look for next char at next level
			nextNodesMap = n.getNext();
		}

	}

/*	public void printTrie(Node root) {
		while (root.getNext() != null) {
			Map<Character, Node> temp = root.getNext();

			Iterator<Character> it = temp.keySet().iterator();
			while (it.hasNext()) {
				System.out.println(temp.get(it.next()));
			}
		}
	}*/
}
