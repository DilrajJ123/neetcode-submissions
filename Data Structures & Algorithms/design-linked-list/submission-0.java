class DoubleLinkedListNode {
    int val;
    DoubleLinkedListNode next;
    DoubleLinkedListNode prev;

    public DoubleLinkedListNode(int val) {
        this.val = val;
    }
}

class MyLinkedList {

    DoubleLinkedListNode head;
    DoubleLinkedListNode tail;

    public MyLinkedList() {
        head = new DoubleLinkedListNode(-1);
        tail = new DoubleLinkedListNode(-1);
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int index) {
        DoubleLinkedListNode curr = head.next;
        int i = 0;
        
        while (curr != tail) {
            if (i == index) {
                return curr.val;
            }
            curr = curr.next;
            i++;
        }
        
        return -1;
    }
    
    public void addAtHead(int val) {
        DoubleLinkedListNode newNode = new DoubleLinkedListNode(val);
        newNode.prev = head;
        newNode.next = head.next;
        
        head.next.prev = newNode;
        head.next = newNode;
    }
    
    public void addAtTail(int val) {
        DoubleLinkedListNode newNode = new DoubleLinkedListNode(val);
        newNode.next = tail;
        newNode.prev = tail.prev;
        
        tail.prev.next = newNode;
        tail.prev = newNode;
    }
    
    public void addAtIndex(int index, int val) {
        DoubleLinkedListNode curr = head.next;
        int i = 0;
        
        while (curr != null && i < index) {
            curr = curr.next;
            i++;
        }
        
        if (curr != null) {
            DoubleLinkedListNode newNode = new DoubleLinkedListNode(val);
            newNode.prev = curr.prev;
            newNode.next = curr;
            
            curr.prev.next = newNode;
            curr.prev = newNode;
        }
    }
    
    public void deleteAtIndex(int index) {
        DoubleLinkedListNode curr = head.next;
        int i = 0;

        while (curr != tail && i < index) {
            curr = curr.next;
            i++;
        }
        
        if (curr != tail) {
            curr.prev.next = curr.next;
            curr.next.prev = curr.prev;
        }
    }
}