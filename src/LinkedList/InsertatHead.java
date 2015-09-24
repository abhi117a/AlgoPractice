package LinkedList;

import java.util.Arrays;

public class InsertatHead {
	static Node head, head1;
	private void insert(int data){
		if(head==null){
			head = new Node();
			head.data = data;
			//System.out.println(head.data);
		}
		else{
			Node p = head;
			while(p.next != null){
				p = p.next;
			}
			p.next = new Node();
			p.next.data = data;
			//System.out.println(p.data);
		}
	}
	
	private void insert1(int data){
		if(head1==null){
			head1 = new Node();
			head1.data = data;
			//System.out.println(head.data);
		}
		else{
			Node p = head1;
			while(p.next != null){
				p = p.next;
			}
			p.next = new Node();
			p.next.data = data;
			//System.out.println(p.data);
		}
	}
	
	private void chckLen(){
		Node q = head;
		int count =0;
		while(q  !=null){
			count++;
			System.out.println(q.data);
			q = q.next;
			
		}
		System.out.println("Length "+count);
	}
	
	private static Node travers(Node p){
		if(p==null){
			return null;
		}
		else{
			System.out.println(p.data);
			return travers(p.next);
		}
	}
	
	private void insertR(Node p, int post, int dat){
		int j=0;
		while(j < post-1){
			System.out.println(p.data);
			p = p.next;
			j++;
		}
		Node temp = p.next;
		p.next = new Node();
		p.next.data = dat;
		p.next.next = temp;	
	}
	
	private void delHead(){
		head = head.next;
	}
	
	private void delTail(Node p){
		
		while(p.next.next != null){
			p = p.next;
		}
		p.next = null;
	
}
	private void delatRand(Node p, int post){
		int j = 0;
		while(j < post -2){
			p = p.next;
			j++;
		}
		p.next = p.next.next;
	}
	
	private static void delAlter(Node p){
		int count =0;
		while(p.next.next != null){
			if(count %2==0){
				p.next=p.next.next;
				count++;
			}
			else{
				p = p.next;
				count++;
			}	
		}if(count %2==0){
		p.next=null;
		}
	}
	private static void delSimilar(Node p, Node q){
		int x;
		while(p.next != null){
			x= p.data;
			q =p; //Neel load ae  batadiyu
			while(q.next != null){
				if(q.next.data != x){
					q = q.next;
				}
				else{
					q.next = q.next.next;
				}
			}
			p = p.next; //Neel load ae  batadiyu
		}
	}
	
	private static void replaceMin(){
		int []arr ={3,1,4,5,6};
		int [] rep = {1,9,5,2,3};
		int x;
		for(int i=0; i < arr.length; i++){
			//x = arr[i];
			for(int j=0; j < rep.length; j++){
				if(arr[i] <= rep[j]){
					arr[i] = rep[j];
					rep[j] = -1;// Neel loada ae batayu
					//i++;
				}
			}
		}
		for(int k=0; k < arr.length; k++){
			System.out.println(arr[k]);
		}
	}
	
	private static void repMin(){
		int []arr ={3,1,4,5,6};
		int [] rep = {1,9,5,2,3};
		int x=0;
		Arrays.sort(rep);
		for(int i=0; i < arr.length;i++){
			if(arr[i] < rep[x]){
				arr[i] = rep[x];
				x++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}
	
	private static void traverseS(Node p){
		while(p.next!=null){
			System.out.println(p.data);
			p=p.next;
		}
	}
	private static void traverseKth(Node p, int val){
		while(p != null){
			if(p.data == val){
				while(p.next != null){
					System.out.println(p.data);
					p=p.next;
				}
				if(p.next==null){
					break;
				}
			}
			else{
				p = p.next;
			}
		}
	}
	
	private static void delMid(Node p, Node q){
		int count =0;
		while(p.next.next.next != null){
			p = p.next.next;
			count++;
			if(count>=1){
				q=q.next;
				
			}
		}
		q.next=q.next.next;
		Node k = head;
		while(k.next !=null){
			System.out.println(k.data);
			k = k.next;
			//System.out.println(k.data);
		}
		//System.out.println(q.data);
		
	}
	
	
	
	public static void main(String[] args) {
		InsertatHead ih = new InsertatHead();
		ih.insert(1);
		ih.insert(2);
		ih.insert(3);
		ih.insert(4);
		ih.insert(5);
		ih.insert(6);
		ih.insert(7);
		ih.insert(8);
		ih.insert(9);
		ih.insert(10);
		ih.insert(11);
		ih.insert(12);
		ih.insert(13);
		ih.insert(14);
		ih.insert(15);
		ih.insert(16);
		ih.insert(17);
		ih.insert(18);
		ih.insert(19);
		ih.insert(20);
		ih.insert(21);
		ih.insert(22);
		ih.insert(23);
		ih.insert(24);
		ih.insert(25);
		ih.insert(26);
		ih.insert(27);
		//ih.chckLen();
		//ih.insertR(head, 1, 8);
		//ih.delTail(head);
		//ih.travers(head);
		System.out.println("After Deletion");
		//ih.delatRand(head, 3);
		//ih.delSimilar(head,head);
		//ih.delAlter(head);
		//ih.travers(head);
		//ih.replaceMin();
		//ih.replaceMin();
		//ih.traverseKth(head, 5);
		ih.delMid(head, head);
	}


}
