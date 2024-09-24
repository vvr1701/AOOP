package Generic;
	public class LinkedListStack<T> implements StackInterface<T> {
		 private Node<T> top;

		 public LinkedListStack() {
		     top = null;
		 }

		 @Override
		 public void push(T item) {
		     Node<T> newNode = new Node<>(item);
		     newNode.next = top;
		     top = newNode;
		 }

		 @Override
		 public T pop() {
		     if (isEmpty()) {
		         throw new IllegalStateException("Stack is empty");
		     }
		     T item = top.data;
		     top = top.next;
		     return item;
		 }

		 @Override
		 public T peek() {
		     if (isEmpty()) {
		         throw new IllegalStateException("Stack is empty");
		     }
		     return top.data;
		 }

		 @Override
		 public boolean isEmpty() {
		     return top == null;
		 }
		}

