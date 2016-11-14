import java.util.*;


public class TupleComparator implements Comparator<Tuple>{
  @Override
  public int compare(Tuple t1, Tuple t2) {
  	Integer n1 = new Integer(t1.getInv());
  	Integer n2 = new Integer(t2.getInv());
  	
    return n1.compareTo(n2);

   }

}