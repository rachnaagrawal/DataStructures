package linkedlist;

public class Main extends OurLinkedList {

	public static void main(String[] args) {
		
		OurLinkedList list = new OurLinkedList();
		System.out.println(isEmpty(list));
		System.out.println(isPresent(list, 3));
		
		pushBack(list, 2);
		pushBack(list, 1);
		
		pushFront(list, 3);
		
		OurLinkedList.Node lastnode = topBack(list);
		if(lastnode == null)
			System.out.println("0");
		else
			System.out.println(lastnode.data);
		
		OurLinkedList.Node firstnode = topFront(list);
		if(firstnode == null)
			System.out.println("0");
		else
			System.out.println(firstnode.data);
		
		printList(list);
		
		System.out.println(isEmpty(list));
		
		popBack(list);
		printList(list);
		
		System.out.println(isPresent(list, 3));
		
		System.out.println(find(list, 9));
		
		System.out.println(find(list, 2).data);
		
		addBefore(list, find(list, 3), 6);
		printList(list);
		
		addBefore(list, find(list, 4), 5); //given node not present in list
		printList(list);
		
		addAfter(list,find(list, 4) , 8);	//given node not present in list
		printList(list);
		
		addAfter(list,find(list, 2) , 7);
		printList(list);
		
		erase(list, 6);
		printList(list);
		
		popFront(list);
		printList(list);
		

	}

}
