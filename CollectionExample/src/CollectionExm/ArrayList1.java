package CollectionExm;

import java.util.ArrayList;
import java.util.Iterator;
public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList <String> list =new ArrayList <String>();
list.add("pavan");
list.add("kumar");
list.add("Gangone");
list.add("Nagasri");


/*Iterator<String> itr =list.iterator();
while(itr.hasNext()) {
	System.out.println(itr.next());
}*/

for(String obj:list) {
	System.out.println(obj);
	
}
	}

}
