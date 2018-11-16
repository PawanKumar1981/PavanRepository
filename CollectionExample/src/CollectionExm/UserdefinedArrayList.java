package CollectionExm;

import java.util.ArrayList;
import java.util.Iterator;

public class UserdefinedArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentArrayList s1 =new StudentArrayList(101,"pavan",23);
		ArrayList <StudentArrayList> al =new ArrayList<StudentArrayList>();
		al.add(s1);
		Iterator itr = al.iterator();
		while(itr.hasNext()) {
	//StudentArrayList st =(StudentArrayList)	itr.next();
    //System.out.println(st.Rollno+" "+st.name+" "+st.age);  
			System.out.println(itr.next());  

		}

	}

}
