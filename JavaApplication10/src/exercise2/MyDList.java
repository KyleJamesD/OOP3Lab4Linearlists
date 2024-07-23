package exercise2;

import java.util.NoSuchElementException;

public class MyDList<E>
{

	private MyNode<E> head;
	private MyNode<E> tail;
	private int size;

    public MyDList() {
    }

    public MyNode<E> getHead() {
        return head;
    }

    public MyNode<E> getTail() {
        return tail;
    }

    public int size() {
        return size;
    }

        
        
        
    public void addFirst(E toAdd) throws NullPointerException, IndexOutOfBoundsException {
        MyNode newNode = new MyNode(toAdd);
        if(size == 0){
            newNode.setNext(null);
            newNode.setPrev(null);
            head = newNode;
            tail = newNode;
            size++;
        }
        
        else{
        head.setPrev(newNode);
        newNode.setNext(head);
        newNode.setPrev(null);
        head = newNode;
        size++;
        }
    }
        
        
        
        
        
        
    public void addLast(E toAdd) throws NullPointerException, IndexOutOfBoundsException {
        MyNode newNode = new MyNode(toAdd);
        if(size == 0){
            newNode.setNext(null);
            newNode.setPrev(null);
            head = newNode;
            tail = newNode;
            size++;
        }
        else{
        newNode.setPrev(tail);
        tail.setNext(newNode);
        newNode.setNext(null);
        tail = newNode;
        size++;
        }
    }
        
        
        
    public E removeFirst(){  
        if (size == 0) {
        throw new NoSuchElementException("List is empty");
        }
        
        
        if(size==1){
        E toReturn = head.getElement();
        head = null;
        tail = null;
        size--;
        return toReturn;

        }

        E toReturn = head.getElement();
        head = head.getNext();
        head.setPrev(null);
        size--;
        return toReturn;       
    };
    
    
    
    public E removeLast(){
        if (size == 0) {
        throw new NoSuchElementException("List is empty");
        }
        
        if(size==1){
        E toReturn = head.getElement();
        head = null;
        tail = null;
        size--;
        return toReturn;
        }
        
        E toReturn = tail.getElement();
        tail = tail.getPrev();
        tail.setNext(null);
        size--;
        return toReturn;
    
    };
        
    public boolean isEmpty() {
        return size == 0;

    }  
        
        
        
        
}
