import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.lang.IllegalArgumentException;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T> {
  private NoNullArrayList<T> data;
  private int currentIndex;

  public OrderedArrayList() {
    data = new NoNullArrayList<T>();
    currentIndex = 0;
  }

  public OrderedArrayList(int startingCapacity) {
    data = new NoNullArrayList<T>(startingCapacity);
    currentIndex = 0;
  }

  public boolean add(T value) {
    int newIndex = rightIndex(value);
    if(currentIndex == 0) {
      super.add(value);
      currentIndex++;
    }
    else{
      super.add(newIndex, value);
      currentIndex++;
    }
    return true;
  }

  public void add(int index, T value) {
    int newIndex = rightIndex(value);
    if(currentIndex == 0) {
      super.add(value);
      currentIndex++;
    }
    else{
      super.add(newIndex, value);
      currentIndex++;
    }
  }

  public int rightIndex(T element) {
    int returnValue = 0;
    if(currentIndex > 0){
      T testfirst = get(0);
      T testlast = get(size()-1);
      for(int i = 0; i < size()-1; i++) {
        T test = get(i);
        if(((get(i)).compareTo(element) < 0) && ((get(i+1)).compareTo(element) >= 0)) {
          returnValue = i+1;
        }
      }
      if((get(0)).compareTo(element) > 0){
        returnValue = 0;
      }
      if((get(size()-1)).compareTo(element) < 0){
        returnValue = size();
      }
    }
    return returnValue;
  }

}
