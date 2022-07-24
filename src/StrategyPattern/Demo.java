package StrategyPattern;

public class Demo {
  public static void main(String[] args) {
    Context context = new Context(new OperationAdd());
    System.out.println("4 + 2 = " + context.executeStrategy(4, 2));

    context = new Context(new OperationMultiply());
    System.out.println("4 * 2 = " + context.executeStrategy(4, 2));

    context = new Context(new OperationSubstract());
    System.out.println("4 - 2 = " + context.executeStrategy(4, 2));
  }
}
