public class SuperArray {
  private String[] data;
  private int size;
  public SuperArray() {
    data = new String[10];
    size = 0;
  }
  public void clear(){
    size = 0;
  }
  public int size() {
    int c = 0;
    for (int i = 0; i < data.length-1; i++){
      if (data[i] != null){
        c++;
      }
    }
    return c;
  }
  public boolean isEmpty() {
    if (size == 0) {
      return true;
    }
    else return false;
  }
  public boolean add(String element){
    for (int i = 0; i<data.length; i++){
      if (data[i] == null){
        data[i] = element;
        return true;
      }
    }
      return false;
  }
  public String get(int index){
    if (index < 0 || index >= size()) {
      return "Error.";
    }
    else
      return data[index];
    }
    return data[index];
  }
  public String toString() {
    String str = "";
    for (int i = 0; i < size; i++){
      str = str + data[i] + ", ";
    }
    return "[" + str + data[size-1] + "]";
  }
  public String toStringDebug() {

  }
public boolean contains(String element){
  for (int i = 0; i < size-1; i++){
    if (data[i].equals(element)){
      return true;
    }
  }
    return false;
}
  public String set(int index, String element){
    if (index < 0 || index >= size()) {
      return "Error";
    }
    else {
    String x = data[index];
    data[index] = element;
    return x;
  }
}
public void add(int index, String element){
  String[] start = new String[index];
  for (int i =0; i < size-1; i++){
    start[i] = data[i];
    if (i == index){
      start[i] = element;
    }
  }
}
}
