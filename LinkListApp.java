package linklistExercise;

public class LinkListApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkList theList = new LinkList();
		
		
		theList.inserFirst(22, 2.99);
		theList.inserFirst(44, 4.99);
		theList.inserFirst(66, 6.99);
		theList.inserFirst(88, 8.99);
		
		theList.displayList();
		
		while(! theList.isEmpty()){
			Link aLink = theList.deleteFirst();
			System.out.println("Deleted   ");
			aLink.displayLink();
		}
		
		theList.displayList();
	}
}
