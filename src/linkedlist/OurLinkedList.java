package linkedlist;

public class OurLinkedList {
	Node head;
	
	static class Node
	{
		int data;
		Node next;		//null by default
		public Node(int data)
		{
			this.data = data;
		}
	}
	
	//isEmpty Operation
	public static Boolean isEmpty(OurLinkedList list)
	{	
		if(list.head == null)
			return true;
		return false;
	}
	
	//popBack Operation
	public static OurLinkedList popBack(OurLinkedList list)
	{
		if(list.head == null)
			return null;
		else
		{
			Node last = list.head;
			while(last.next.next!=null)
			{
				last = last.next;
			}
			last.next = null;
		}
		return list;
	}
	
	//popFront Operation
	public static OurLinkedList popFront(OurLinkedList list)
	{
		if(list.head == null)
			return null;
		else
		{
			Node first = list.head.next;
			list.head = first;
		}
		return list;
	}
	
	//isPresent Operation
	public static boolean isPresent(OurLinkedList list,int key)
	{
			Node currentnode = list.head;
			while(currentnode!=null)
			{
				if(currentnode.data == key)
				{
					return true;
				}
				currentnode = currentnode.next;
			}
		return false;
	}
	
	//find Operation
	public static Node find(OurLinkedList list,int key)
	{	
		if(isPresent(list,key))
		{
			Node currentnode = list.head;
			while(currentnode!=null)
			{
				if(currentnode.data == key)
					return currentnode;
				
				currentnode = currentnode.next;
			}
		}
		return null;
	}
	
	//pushBack Operation
	public static OurLinkedList pushBack(OurLinkedList list,int data)
	{
		Node new_node = new Node(data);
		new_node.next = null;
		if(list.head==null)
		{
			list.head = new_node;
		}
		else
		{
			Node last = list.head;
			while(last.next!=null)
			{
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}
	
	//pushFront Operation
	public static OurLinkedList pushFront(OurLinkedList list, int data)
	{
		Node new_node = new Node(data);
		if(list.head==null)
		{
			list.head = new_node;
		}
		else
		{
			new_node.next = list.head;
			list.head = new_node;
		}
		return list;
	}
	
	//topBack Operation
	public static Node topBack(OurLinkedList list)
	{	
		if(list.head == null)
		{
			return null;
		}
		else
		{
			Node last = list.head;
			while(last.next!=null)
			{
				last = last.next;
			}
			return last;
		}
	}
	
	//topFront Operation
	public static Node topFront(OurLinkedList list)
	{
		if(list.head == null)
		{
			return null;
		}
		else
		{
			Node first = list.head;
			return first;
		}
	}
	
	//addBefore Operation
	public static OurLinkedList addBefore(OurLinkedList list,Node node,int key)
	{
		Node new_node = new Node(key);
		if(list.head == null || !(node instanceof Node))
			return null;
		else
		{
			if(isPresent(list,node.data))
			{
				if(list.head.equals(node))
				{
					pushFront(list,key);
				}
				else
				{
					Node currentnode = list.head;
					while(currentnode.next!=node)
					{
						currentnode = currentnode.next;
					}
					new_node.next = node;
					currentnode.next =new_node;
				}
			}
		}
		return list;
	}
	
	//addAfter Operation
	public static OurLinkedList addAfter(OurLinkedList list,Node node, int key)
	{	
		if(list.head == null || !(node instanceof Node))
			return null;
		else
		{
			if(isPresent(list,node.data))
			{
				Node new_node = new Node(key);
				new_node.next = node.next;
				node.next = new_node;
				
			}
		}
		return list;
	}
	
	//erase Operation
	public static OurLinkedList erase(OurLinkedList list,int key)
	{
		if(list.head == null)
			return null;
		else
		{
			if(find(list,key)!=null)
			{
				Node currentnode = list.head;
				Node deletenode = find(list,key);
				if(list.head == deletenode)
					list.head = list.head.next;
				else
				{
					while(currentnode.next!=deletenode)
					{
						currentnode = currentnode.next;
					}
					currentnode.next = deletenode.next;
				}
			}
		}
		return list;
	}
	
	//printList Operation
	public static void printList(OurLinkedList list)
	{
		Node current_node = list.head;
		while(current_node!=null)
		{
			System.out.print(current_node.data+" ");
			current_node = current_node.next;
		}
		System.out.println();
	}
}
