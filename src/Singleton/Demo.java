package Singleton;

public class Demo {
  public static void main(String[] args) {
    System.out.println("Jika output memiliki value yang sama, maka singleton telah ter-reuse");
    System.out.println("Jika output memiliki value yang berbeda, maka 2 singleton telah dibuat");
    System.out.println("Output : ");

    Singleton sample1 = Singleton.getInstance("HAHA");
    Singleton sample2 = Singleton.getInstance("HIHI");

    System.out.println(sample1.value);
    System.out.println(sample2.value);
  }
}
