class Uebung {
  public static void main(String[] s) {
    Unter u = new Unter();
    u.m();
  }
}

abstract class Ober {
  protected int i;
  public Ober() { System.out.println("Ober."); }
  public Ober(int i) { this.i = i; System.out.println("Ober(i)."); }
  public void m() { System.out.println("Ober.m()"); }
  public abstract void n();
}

class Unter extends Ober {
  public Unter() { super(9); i = 5; System.out.println("Unter."); }
  public void m() { super.m(); System.out.println("Unter.m()"); }
  
}
