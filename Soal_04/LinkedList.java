package Soal_04;

public class LinkedList {
   
   private Node head;
   private Node tail;
   private int count;

   public LinkedList() {
      head = tail = null;
      count = 0;
   }

   public Node getHead() {
      return head;
   }

   public Node getTail() {
      return tail;
   }

   public int getCount() {
      return count;
   }

   public void add(int item) {
      Node node = new Node(item);
      if (head == null) {
         head = tail = node;
      }
      else {
         tail.setNext(node);
         tail = node;
      }
      count++;
   }

   public boolean contain(int item) {
      if (count > 0) {
         Node p = getHead();
         while (p != null) {
            if (p.getItem() == item) return true;
            p = p.getNext();
         }
      }
      return false;
   }

   public int getIndex(int item) {
      if (count > 0) {
         Node p = getHead();
         int idx = 0;
         while (p != null) {
            if (p.getItem() == item) return idx;
            p = p.getNext();
            idx++;
         }
      }
      return -1;
   }
   
   private void removeAt(int index) {
      if (index == 0) {
         // remove head
         Node p = getHead();
         head = p.getNext();
         p.setNext(null);
         p = null;
      }
      else if (index == count-1) {
         // remove tail
         Node p = getHead();
         for (int i = 0; i < index-1; i++) {
            p = p.getNext();
         }
         Node q = p.getNext();
         q.setNext(null);
         p.setNext(null);
         tail = p;
         q = null;
      }
      else {
         // remove item tengah
         Node p = getHead();
         for (int i = 0; i < index-1; i++) {
            p = p.getNext();
         }
         Node q = p.getNext();
         p.setNext(q.getNext());
         q.setNext(null);
         q = null;
      }
      count--;
   }

   // method ini akan menghapus semua elemen item yang ditemukan di dalam list
   public void removeAll(int item) {
      while (contain(item)) {
         removeAt(getIndex(item));
      }
   }

   @Override
   public String toString() {
      StringBuilder sb = new StringBuilder();
      if (count != 0) {
         Node p = getHead();
         while (p != null) {
            if (sb.length() == 0)
               sb.append(p.getItem());
            else 
               sb.append(String.format(", %d", p.getItem()));
            p = p.getNext();
         }   
      }
      return sb.toString();
   }

}
