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
    newarr = new String[data.length * 2];
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
    if(size() == 0){
      return("[]");
    }
    String newstr = "[";
    for(int i = 0; i < (size() - 1); i ++){
      newstr = newstr + data[i] + ", ";
    }newstr = newstr + data[size - 1] + "]";
    return(newstr);
  }

  public boolean contains(String s){
    boolean there = false;
    for(int i = 0; i < size(); i ++){
      if(data[i].equals(s)){
        there = true;
      }
    }return(there);
  }
  public SuperArray(int initialcapacity){
    data = new String[initialcapacity];
  }
  public void add(int index, String element){
    add(element);
    if(size() == 0){
      data[index] = element;
    }else if(index == 0){
        for(int i = size() - 1; i > 0; i --){
          data[i] = data[i - 1];
      }data[index] = element;
    }else{
      for(int i = size() - 1; i >= index; i --){
      data[i] = data[i - 1];
    }data[index] = element;
  }
  }
  public String remove(int index){
    String removed = data[index];
    for(int i = index; i < size() - 1; i ++){
      data[i] = data[i + 1];
    }data[size() - 1] = null;
    size -= 1;
    return(removed);
  }
  public int indexOf(String s){
    int locus = -1;
    for(int i = 0; i < size(); i ++){
      if(data[i].equals(s)){
        locus = i;
        break;
      }
    } return(locus);
  }

  public String[] toArray(){
    String[] newarr;
    newarr = new String[size];
    for(int i = 0; i < size; i ++){
      newarr[i] = data[i];
    }return(newarr);
  }
  public int lastIndexOf(String value){
    int last = -1;
    for(int i = size() - 1; i >= 0; i --){
      if(data[i].equals(value)){
        last = i;
        break;
      }
    }return(last);
  }

  public boolean equals(SuperArray other){
    if(other.size() != this.size()){
      return(false);
    }
    for(int i = 0; i < other.size(); i ++){
      if(other.get(i) != this.get(i)){
        return (false);
      }
    }return(true);
  }
}
