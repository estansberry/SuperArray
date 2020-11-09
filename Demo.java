public class Demo{
  public static void removeDuplicates(SuperArray s){
    String check = "";
    for(int i = 0; i < s.size(); i ++){
      if (check.indexOf(s.get(i)) == -1){
        check = check + s.get(i) + " ";
      }else{
        s.remove(i);
      }
    }
  }

  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
  }
  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray newarr = new SuperArray();
    int count = 0;
    for(int i = 0; i < a.size(); i ++){
      if (a.get(i) == b.get(i)){
        newarr.set(count, a.get(i));
        count += 1;
      }
    }removeDuplicates(newarr);
    return(newarr);
  }

  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray newarr = new SuperArray();
    if(a.size() >= b.size()){
      int j = 0;
      for(int i = 0; i < (2 * b.size()); i = i + 2){
        newarr.set(i, a.get(j));
        newarr.set(i + 1, b.get(j));
        j ++;
      } for(int i = b.size(); i < a.size(); i ++){
        newarr.set(i, a.get(i));
      }
    }if(b.size() > a.size()){
      int j = 0;
      for(int i = 0; i < (2 * a.size()); i = i + 2){
        newarr.set(i, a.get(j));
        newarr.set(i + 1, b.get(j));
        j ++;
      } for(int i = a.size(); i < b.size(); i ++){
        newarr.set(i, b.get(i));
      }
      }return(newarr);
    }

}
