
public class LinkList {
	public node firstnode;
	LinkList(){
		firstnode = null;
	}
	public boolean isEmpty(){
		return (firstnode == null);
	}
	public void insertFirstNode(String name, int age){
		node newNode = new node(name, age);
		newNode.next = firstnode;
		firstnode = newNode;
	}
	public node removeFirst(){
		node theNode = firstnode;
		if(!isEmpty()){
			firstnode = firstnode.next;
		}else{
			System.out.println("Nothing in the LinkList no need to remove.");
		}
		return theNode;	
	}
	
	public void display(){
		node thenode = firstnode;
		while(thenode != null){
			thenode.display();
			thenode = thenode.next;
		}
	}	
	
//Recursive 
	public int getCountR(node rnode){
		if(rnode!=null){
			return 1+getCountR(rnode.next);
		}else{
			return 0;
		}
	}
	
//not recursive way to count linked list 
	public int getCountI(node rnode){
		node tempnode=rnode;
		int counter=0;
			while(tempnode !=null){
				counter++;
				tempnode=tempnode.next;
				
			}
		return counter;
	}
	
	
	
	public static void main(String[] args){
		LinkList obj = new LinkList();
		obj.insertFirstNode("xiaoming", 24);
		obj.insertFirstNode("xiaohong", 19);
		obj.insertFirstNode("xiaogang", 18);
		obj.insertFirstNode("xiaoqiang", 28);
		//obj.removeFirst();
		//obj.display();
		
		// not recursive way test
		System.out.println(obj.getCountI(obj.firstnode));
		//recursive
		System.out.println(obj.getCountR(obj.firstnode));
	}
}
