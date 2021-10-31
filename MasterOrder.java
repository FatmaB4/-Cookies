import  java.util.ArrayList;

public class MasterOrder {

  private ArrayList<CookieOrder>orders;

  public MasterOrder() {

  }

  public void addOrder(CookieOrder theOrder) {

  }

  public int getTotalBoxes() {
    return 0;
  }

  public int removeVariety(String cookieVar) {
    int numRemoved=0;
    
    for(int i=0; i<orders.size; i++) {
	    
      if(((orders.get(i)).getVariety).equals(cookieVar)) {
		    
        orders.remove(i);
		    numRemoved=numRemoved+(orders.get(i)).getNumBoxes;
	    }
    }

    return numRemoved;

  }
}