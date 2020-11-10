public class Demo{
  public static void removeDuplicates(SuperArray s){
    String check = "";
    for(int i = 0; i < s.size(); i ++){
      if (check.indexOf(s.get(i)) == -1){
        check = check + s.get(i) + ", ";
      }else{
        s.remove(i);
        i -= 1;
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
    for(int i = 0; i < a.size(); i ++){
      for(int j = 0; j < b.size(); j ++){
        if((a.get(i)).equals(b.get(j))) {
          newarr.add(a.get(i));
        }
      }
    }
    removeDuplicates(newarr);
    return(newarr);
  }

  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray newarr = new SuperArray();
    if(a.size() >= b.size()){
      int j = 0;
      for(int i = 0; i < (2 * b.size()); i = i + 2){
        newarr.add(a.get(j));
        newarr.add(b.get(j));
        j ++;
      } for(int i = b.size(); i < a.size(); i ++){
        newarr.add(a.get(i));
      }
    }if(b.size() > a.size()){
      int j = 0;
      for(int i = 0; i < (2 * a.size()); i = i + 2){
        newarr.add(a.get(j));
        newarr.add(b.get(j));
        j ++;
      } for(int i = a.size(); i < b.size(); i ++){
        newarr.add(b.get(i));
      }
      }return(newarr);
    }

}
