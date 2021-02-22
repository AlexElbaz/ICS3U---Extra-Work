package week5;

public class LinkedListDriver {
    public static void main(String[] args) {
        IntLinkedList list = new IntLinkedList();
        list.add(7);
        list.add(6);
        list.add(3);
        list.add(9);
        list.addFront(5); 
        list.addFront(17);
        System.out.println(list);
        list.remove(6);
        list.remove(17);
        System.out.println(list);

        ContactLinkedList contacts = new ContactLinkedList();
        Contact c = new Contact("Steve", "Henry", "4165551212");
        contacts.add(c);
    }
}
