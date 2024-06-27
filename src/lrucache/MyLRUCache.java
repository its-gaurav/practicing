package lrucache;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;


/**
 * Using Doubly-Linked-List and HashMap data structure
 * populate doubly linked-list in a fashion that elements lying closer to tail will be least recently used AND
 * elements lying closer to head will be most recently used.
 * While inserting a node, insert next to head making it most recently used
 * Hence, when map is full --> delete the node closest to tail
 * **/
public class MyLRUCache {
    private Node head = new Node(0,0);
    private Node tail = new Node(0,0);

    private final int capacity;

    private Map<Integer, Node> map = new HashMap<>();

    public MyLRUCache(int capacity) {
        this.head.nextNode = tail;
        this.head.prevNode = null;
        this.tail.prevNode = head;
        this.tail.nextNode = null;
        this.capacity = capacity;
    }

    public void put(Integer key, Integer value) {
        if (map.containsKey(key)) {
            remove(map.get(key)); // if element is already there, then remove it --> re-insert it and make it most recently used
        }
        if (map.size() == this.capacity) {
            remove(tail.prevNode); // size is full hence remove the least-recently-used element
        }

        insert(new Node(key, value)); // insert it adjacent to head make it most recently used
    }

    public Integer get(Integer key) {
        Integer value = -1;
        if (map.containsKey(key)) {
            Node nodeFound = map.get(key);
            value = nodeFound.value;
            // make this node as most recently used
            remove(nodeFound);
            insert(new Node(nodeFound.key, nodeFound.value));
        }
        System.out.println("Returned value :: "+value);
        return value;
    }

    public void entrySets() {
        System.out.println("Current entries are: ");
        Set<Map.Entry<Integer, Node>> entries = map.entrySet();
        for (Map.Entry<Integer, Node> entry: entries) {
            System.out.println(entry.getValue());
        }

    }

    /**
     * Removal of node from map and linked-list
     * **/
    private void remove(Node node) {
        map.remove(node.key);
        node.prevNode.nextNode = node.nextNode;
        node.nextNode.prevNode = node.prevNode;
    }

    private void insert(Node node) {
        map.put(node.key, node);
        Node currHeadNxt = head.nextNode;
        head.nextNode = node;
        node.prevNode = head;
        node.nextNode = currHeadNxt;
        currHeadNxt.prevNode = node;
    }

}

class Node {
    Node prevNode;
    Node nextNode;
    int key;
    int value;

    public Node(int key, int value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "(" +
                "" + key +
                ", " + value +
                ')';
    }
}
