public class SuperArray {
  private String[] data;
  private int size;
  public SuperArray() {
    data = new String[10];
    size = 0;
  }
  public SuperArray(int startingCapacity){
    data = new String[startingCapacity];
    size = 0;
  }
  public void clear(){
    size = 0;
  }
  public int size() {
    int c = 0;
    for (int i = 0; i < size-1; i++){
      if (data[i] != null){
        c++;
      }
    }
    return c;
  }
  public boolean isEmpty() {
    return size == 0;
    }

  public boolean add(String element){
    if (data.length == size) {
      resize();
    }
    data[size] = element;
    size++;
    return true;
  }
  public String get(int index){
    if (index < 0 || index >= size()) {
      System.out.println("indexOutOfBoundsException");
    }
    return data[index];
  }
  public String toString() {
    String str = "";
    if (size == 0) return "[]";
    for (int i = 0; i < size; i++){
      str = str + data[i] + ", ";
    }
    return "[" + str + data[size-1] + "]";
  }
  public String toStringDebug() {
    String str = "";
    if (size == 0) return "[]";
    for (int i = 0; i < data.length; i++){
      str = str + data[i] + ", ";
    }
    return "[" + str + data[data.length-1] + "]";
    }

  public String set(int index, String element){
    if (index < 0 || index >= size()) {
      System.out.println("indexOutOfBoundsException");
      return null;
    }
    else {
    String x = data[index];
    data[index] = element;
    return x;
  }
}

private void resize() {
  String[] resized = new String[(size * 2) + 1];
  for (int i = 0; i < size; i++){
    resized[i] = data[i];
  }
  data = resized;
}
public boolean contains(String element){
  for (int i = 0; i < size; i++){
    if (data[i].equals(element)){
      return true;
    }
  }
    return false;
}
public int indexOf(String target){
  for (int i = 0; i < size; i++){
    if (data[i].equals(target)) {
      return i;
    }
  }
  return -1;
}
public int lastIndexOf(String target){
  for (int i = size-1; i >= 0; i--){
    if (data[i].equals(target)){
      return i;
    }
  }
  return -1;
}

public void add(int index, String element){
  if (index < 0 || index >= size()) {
    System.out.println("indexOutOfBoundsException");
  }
  for (int i = size-1; i >= index; i--){
    data[i+1] = data[i];
  }
  data[index] = element;
  size++;
}
public String remove(int index){
  if (index < 0 || index >= size()) {
    System.out.println("indexOutOfBoundsException");
    return null;
  }
  String removed = data[index];
  for (int i = index+1; i < size; i++){
    data[i-1] = data[i];
  }
  data[size-1] = null;
  return removed;
}
public boolean remove(String element){
  for (int i = 0; i < size; i++){
    if (data[i].equals(element)) {
      for (int p = i+1; p < size; p++){
        data[p-1] = data[p];
      }
      data[size-1]= null;
      size--;
    }
  }
  return false;
}

}
