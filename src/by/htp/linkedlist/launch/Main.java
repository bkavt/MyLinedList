package by.htp.linkedlist.launch;

import by.htp.linkedlist.domain.MyException;
import by.htp.linkedlist.domain.MyLinkedList;
import by.htp.linkedlist.domain.Student;

public class Main {

	public static void main(String[] args) {
		Student st1=new Student("Vasya",22);
		Student st2=new Student("Petr",21);
		Student st3=new Student("Ivan",23);
		Student st4=new Student("Ivannnn",25);
		Student st5=new Student("I888888",1111);
		MyLinkedList list=new MyLinkedList();

	list.add(st1);
	list.add(st2);
	list.add(st3);
	list.add(st4);
	
list.ShowAll();
	
	
	System.out.println("____________");
		
	try{
		System.out.println(list.getByIndex(1));
	}
	catch(MyException ex){
		System.out.println(ex.getMassage());
	}
	
	
	try{
		list.add(st5, 1);
		list.ShowAll();
	}
	catch(MyException ex){
		System.out.println(ex.getMassage());
	}
	
	
	
	
	}

}
