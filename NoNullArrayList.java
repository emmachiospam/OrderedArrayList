import java.util.ArrayList;
import java.lang.IllegalArgumentException;
public class NoNullArrayList<T> extends ArrayList<T>{
  private ArrayList<T> data;
  private int index;

  public NoNullArrayList() {
    data = new ArrayList<T>();
  }

  public boolean add(T value) {
    if(value == null) {
      throw new IllegalArgumentException("cannot add a null value");
    }
    else{
      super.add(value);
      return true;
    }
  }

}
