
import java.util.LinkedList;


public class FriendTest2 {
	public static void main (String[]args){
		Friend f= new Friend();
		Friend f1= new Friend();
		Friend f2= new Friend();
		
		LinkedList<String> l1= new LinkedList<String>();
		
		f.setName("Jane Doe\n");
		f.setPhone("085-5555555\n");
		f.setEmail("jane.do@gmail.com\n\n");
		
		f.getName();
		f.getPhone();
		f.getEmail();
		
		f1.setName("John Doe\n");
		f1.setPhone("085-1111111\n");
		f1.setEmail("john.doe@gmail.com\n\n");
		
		f1.getName();
		f1.getPhone();
		f1.getEmail();
		
		f2.setName("Paul Weller\n");
		f2.setPhone("085-3333333\n");
		f2.setEmail("paul.weller@gmail.com\n\n");
		
		f2.getName();
		f2.getPhone();
		f2.getEmail();
		
		l1.add(f.getName());
		l1.add(f.getPhone());
		l1.add(f.getEmail());
		
		l1.add(f1.getName());
		l1.add(f1.getPhone());
		l1.add(f1.getEmail());
		
		l1.add(f2.getName());
		l1.add(f2.getPhone());
		l1.add(f2.getEmail());
		
		System.out.print("\nFriends added to list...\n"+l1);
		
		
		System.out.print("\nAbout to remove the following:\n "+f1.getName()+" "+f1.getPhone()+" "+f1.getEmail());
		l1.remove(f1.getName());
		l1.remove(f1.getPhone());
		l1.remove(f1.getEmail());
		
		System.out.print("Add Ringo to the list...\n");
		f1.setName("Ringo Star\n");
		f1.setPhone("082-1234567\n");
		f1.setEmail("ringo@gmail.com\n\n");
		
		f1.getName();
		f1.getPhone();
		f1.getEmail();
		
		l1.add(f1.getName());
		l1.add(f1.getPhone());
		l1.add(f1.getEmail());
		
		System.out.print("\n"+l1);
		
	}

}



