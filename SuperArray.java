public class SuperArray {
  private String[] data;
  private int size;
  public SuperArray(String[] data1) {
    data = data1;
  }
  public int size() {
    int c = 0;
    for (int i = 0; i < data.length-1; i++){
      if (!(data[i].equals(null))){
        c++;
      }
    }
    return c;
  }
  public String set(int index, String element){
    String x = data[index];
    data[index] = element;
    return x;
  }
public void add(int index, String element){
  
}
}
