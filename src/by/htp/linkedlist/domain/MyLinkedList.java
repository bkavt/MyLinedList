package by.htp.linkedlist.domain;

import by.htp.linkedlist.domain.MyLinkedList.Node;

public class MyLinkedList {
		public class Node {
			private Student stud;
			
			private Node next;
			private Node prev;
			
			
			public Node(Student stud, Node next, Node prev) {
				super();
				this.stud = stud;
				this.next = next;
				this.prev = prev;
			}
			
			public Node getNext() {
				return next;
			}

			public void setNext(Node next) {
				this.next = next;
			}

			public Node getPrev() {
				return prev;
			}
			public void setPrev(Node prev) {
				this.prev = prev;
			}

			@Override
			public String toString() {
				return "[" + stud + "]\n";
			}

			public Student getStud() {
				return stud;
			}

			public void setStud(Student stud) {
				this.stud = stud;
			}
			
			
		}
	
	private Node element;
	private Node first;
	private Node last;
	private int size=0;
	
	
	public void add(Student stud){
		if (size==0){
			element=new Node(stud, null, null);
			size++;
			first=element;
			}
		else if (size>0){
			Node buf=new Node(stud,null, element);
			size++;
			element.setNext(buf);
			element=buf;
			last=element;
			
		}
	
		
	}
	public void addFirst(Student stud){
		try {
			add(stud, 0);
		} catch (MyException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	public void add(Student stud, int index)throws MyException{
		if((index>=0)&&(index<=size)){ 
			if ((size==0)||(size==index)){
				add(stud);
				}
			else{
				  Node buf=first; 
					 int ind=0;
				    	 while (ind<index){
				    		 buf=buf.getNext();
				    		 ind++;
				    	 }
				    	 element=new Node(stud, buf, buf.getPrev());
				    	 buf.setPrev(element);
				    	 if (index>0){element.getPrev().setNext(element);}
				    	 else {first=element;}
				    	 element=last;
				    	 
				    	 
				}
		}
		else{throw new MyException(index,size);}   
		
		
	}

	public void ShowAll(){
		Node buf=first.getNext();
		System.out.println(first);
		while ((size>1)&&((buf=buf.getNext())!=null)){
			System.out.println(buf.getPrev());
			
		};
		if(size>1){System.out.println(last);}
	}
	public int size(){
		return size;
	}
	
	public Student getByIndex(int i)throws MyException{
			Student stud=null;
					int ind=0;
		    Node buf=first; 
			if((i>=0)&&(i<size)){ 
		    	 while (ind<i){
		    		 buf=buf.getNext();
		    		 ind++;
		    	 }
		    	 stud=buf.getStud();
		    	 
		     }
		    
		     else{throw new MyException(i,size);}   
		return stud;
		
	}
	
	
	
	
}
