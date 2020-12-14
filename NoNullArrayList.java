import java.util.ArrayList;
import java.lang.IllegalArgumentException;
public class NoNullArrayList<T> extends ArrayList<T>{
  private ArrayList<T> data;

  public NoNullArrayList() {
    data = new ArrayList<T>();
  }

  public NoNullArrayList(int startingCapacity) {
    data = new ArrayList<T>(startingCapacity);
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

  public void add(int index, T value) {
    if(value == null) {
      throw new IllegalArgumentException("cannot add a null value");
    }
    else{
      super.add(index, value);
    }
  }

  public T set(int index, T value) {
    if(value == null) {
      throw new IllegalArgumentException("cannot set a null value");
    }
    else{
      T previous = get(index);
      super.set(index, value);
      return previous;
    }
  }

}
