public class Main extends Thread{
  public void run() {
    for (int i = 0; i < 1000000; i++) {
      if(i % 100000 == 0) System.out.println(i / 100000);
    }
  }

  public static void main(String[] args) {
    (new Main()).start();
    (new Main()).start();
    (new Main()).start();
    (new Main()).start();
  }
}
