package Generic;
//Node.java
class Node<T> {
 T data;
 Node<T> next;

 Node(T data) {
     this.data = data;
     this.next = null;
 }
}