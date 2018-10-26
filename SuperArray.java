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
      System.out.println("Error");
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

public boolean contains(String element){
  for (int i = 0; i < size; i++){
    if (data[i].equals(element)){
      return true;
    }
  }
    return false;
}
  public String set(int index, String element){
    if (index < 0 || index >= size()) {
      System.out.println("Error");
      return null;
    }
    else {
    String x = data[index];
    data[index] = element;
    return x;
  }
}

private void resize() {
  String[] resized = new String[size * 2];
  for (int i = 0; i < size; i++){
    resized[i] = data[i];
  }
  data = resized;
}
//public void add(int index, String element){
  //if (index < 0 || index >= size()) {
    //System.out.println("Error");
    //return null;
  //}


}
