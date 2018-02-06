package linklistExercise;

public class LinkList {
	private Link first;   // refer to first link on List
	
	public LinkList(){
		first = null;   // no items on list yet;
	}
	
	public boolean isEmpty(){
		return (first == null);
	}
	
	public void inserFirst(int id, double dd){ // make new link
		Link newLink = new Link(id,dd);
		newLink.next = first;  // new link->old first 
		first = newLink; 		// first ->new link
	}
	
	public Link deleteFirst(){ // delete first item
		Link temp = first; // assumes list not empty,store the first item 
		first = first.next; //delete it; first -> old next
		return temp; //return deleted link
	}
	
	public void displayList(){
		System.out.print("List (fist-->Last): ");
		Link current = first;
		while (current !=null){
			current.displayLink();
			current= current.next;
		}
		System.out.println("");
	}	
}
