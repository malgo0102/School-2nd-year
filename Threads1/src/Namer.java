
public class Namer implements Runnable{
  String name;

  public Namer (String name){
    this.name =name;
  }

  public void run(){
    System.out.println(Thread.currentThread().getName());
  }


}
