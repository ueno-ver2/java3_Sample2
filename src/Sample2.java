package human;

public class Sample2{
  public static void main(String[] args){
  	///////ここ変える
    Human[] humen = new Human[3];

    ////ここでいれる
    
    for(Human h: humen){
      System.out.print("name=" + h.getName());
    }
  }
}
