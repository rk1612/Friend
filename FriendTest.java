import java.util.ArrayList;


public class FriendTest {
	public static void main (String[]args){
		Friend f= new Friend(); //new array
		Friend f1= new Friend();
		Friend f2= new Friend();
		
		ArrayList<String> a1= new ArrayList();//sets new array list
		
		f.setName("Jane Doe\n");//sets array
		f.setPhone("085-5555555\n");
		f.setEmail("jane.doe@gmail.com\n\n");
		
		f.getName();//gets array
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
		
		a1.add(f.getName()); //adds name to list
		a1.add(f.getPhone());//adds phone to list
		a1.add(f.getEmail());//adds mail to list
		
		a1.add(f1.getName());
		a1.add(f1.getPhone());
		a1.add(f1.getEmail());
		
		a1.add(f2.getName());
		a1.add(f2.getPhone());
		a1.add(f2.getEmail());
		//prints friends on the list
		System.out.print("\nFriends added to list...\n"+a1);
		
		
		System.out.print("\nAbout to remove the following:\n "+f1.getName()+" "+f1.getPhone()+" "+f1.getEmail());
		a1.remove(f1.getName());//removes name from the list
		a1.remove(f1.getPhone());//removes phone from the list
		a1.remove(f1.getEmail());//removes mail from the list
		
		System.out.print("Add Ringo to the list...\n");
		f1.setName("Ringo Star\n");
		f1.setPhone("082-1234567\n");
		f1.setEmail("ringo@gmail.com\n\n");
		
		f1.getName();//gets 
		f1.getPhone();
		f1.getEmail();
		
		a1.add(f1.getName());//adds to the list
		a1.add(f1.getPhone());
		a1.add(f1.getEmail());
		
		System.out.print("\n"+a1);
		
	}

}
