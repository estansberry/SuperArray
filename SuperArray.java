public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    data = new String[10];
  }

  public int size(){
    return(size);
  }

  public boolean add(String element){
    if(size() == data.length){
      resize();
    }
    data[size] = element;
    size += 1;
    return(true);
  }

  public String get(int index){
    return(data[index]);
  }

  public String set(int index, String element){
    String x = data[index];
    data[index] = element;
    return(x);
  }

  private void resize(){
    String[] newarr;
    newarr = new String[data.length + 10];
    for(int i = 0; i < data.length; i ++){
      newarr[i] = data[i] ;
    }data = newarr;
  }

  public boolean isEmpty(){
    return(size() == 0);
  }
  public void clear(){
    data = new String[10];
    size = 0;
  }

  public String toString(){
    String newstr = "[";
    for(int i = 0; i < size() - 1; i ++){
      newstr = newstr + data[i] + ", ";
    }newstr = newstr + data[size - 1] + "]";
    return(newstr);
  }
}
