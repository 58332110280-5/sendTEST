import java.util.ArrayList;

public class SendTEST {

	public static void main(String[] args) {
		ArrayList<Object> lst = new ArrayList(1);
		lst.add(0, 1);
		lst.add(1, 2);
		lst.add(2, 3);
		lst.add(3, 4);
		lst.add(4, 5);
		lst.add(5, 6);
		lst.add(6, 7);
		lst.add(7, 8);
		for(int i =0;i<lst.size();i++){
			if((Integer)lst.get(i)==0){
				lst.remove(i);
			}
		}
		System.out.println(lst.toString());
	}

}