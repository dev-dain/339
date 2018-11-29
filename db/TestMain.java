package db;

import java.util.Iterator;
import java.util.Vector;

public class TestMain {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
    	DBConnect dbc = DBConnect.getInstanceCon();
    	Vector v = dbc.selectSt();
    	
    	Iterator it = v.iterator();
    	while (it.hasNext()) {
    		System.out.println(it.next());
    	}
	}

}
