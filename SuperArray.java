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
}
