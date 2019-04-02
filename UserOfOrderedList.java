public class UserOfOrderedList {
	public static void main (String[] commandLine) {
	/**
	Constructor: 
	*/
	OrderedList_inArraySlots list = new OrderedList_inArraySlots();
	System.out.println(list);
	
	/**
	methods:
	*/
	// add() , and expand()
	list.add(11);
	list.add(10);
	list.add(8);
	list.add(9);
	list.add(7);
	list.add(4);
	list.add(6);
	list.add(5);
	list.add(2);
	list.add(3);
	list.add(1);
	System.out.println(list);
	
	// remove
	list.remove(3);
	System.out.println(list);
	}
}