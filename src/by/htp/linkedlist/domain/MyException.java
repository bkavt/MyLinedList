package by.htp.linkedlist.domain;

public class MyException extends Exception{
		private int index,size;
		
		public  MyException(int i, int s){
			index=i;
			size=s;
		}	
		public String getMassage(){
			
			return "Element by index="+ index+ " does not exist, Size of list="+size;
		}
		
}
