package LinkedlISTT;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import LinkedList.Node;

public class Microsoft {
	HashMap<String, String> hm = new HashMap<String, String>();
	ArrayList<String> lodo = new ArrayList<String>();
	static Nodee head, head1;
		private void insert(String data){
			if(head==null){
				head = new Nodee();
				head.data = data;
				//System.out.println(head.data);
			}
			else{
				Nodee p = head;
				while(p.next != null){
					p = p.next;
				}
				p.next = new Nodee();
				p.next.data = data;
				//System.out.println(p.data);
			}
		}
		
		private void insert1(String data){
			if(head1==null){
				head1 = new Nodee();
				head1.data = data;
				//System.out.println(head.data);
			}
			else{
				Nodee p = head1;
				while(p.next != null){
					p = p.next;
				}
				p.next = new Nodee();
				p.next.data = data;
				//System.out.println(p.data);
			}
		}
		private void traverse(Nodee p){
			while(p.next != null){
				System.out.println(p.data);
				p = p.next;
			}
			System.out.println(p.data);
		}
		private void hashmap(Nodee q){
			 //q = head;
			while(q != null){
				if((hm.containsKey(q.data) && !hm.containsValue(hm.get(q.data))) || !(hm.containsKey(q.data) ) ){
						lodo.add(q.data+" : " + q.next.data);
					hm.put(q.data, q.next.data);
					
				}
				q = q.next.next;
			}
		}
		private void show(){
			System.out.println(lodo.toString());		

		
		}
	
		public static void main(String args[]){
			Microsoft ms = new Microsoft();
			ms.insert("Abhi");
			ms.insert("123");
			ms.insert("Heet");
			ms.insert("456");
			ms.insert("Neel");
			ms.insert("753");
			ms.insert("Abhi");
			ms.insert("123");
			ms.insert("Heet");
			ms.insert("999");
			//ms.traverse(head);
			System.out.println("List 2");
			ms.insert1("qwe");
			ms.insert1("777");
			ms.insert1("qwe");
			ms.insert1("777");
			ms.insert1("asd");
			ms.insert1("787");
			ms.insert1("qwr");
			ms.insert1("777");
			//ms.traverse(head1);
			ms.hashmap(head);
			ms.hashmap(head1);
			ms.show();
		}
}
