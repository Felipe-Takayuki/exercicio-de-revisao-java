package app;

public class Hello {
  public static void main(String[] args) {
    Genero genero = new Genero(1, "ficção");
    System.out.println(genero.getName());
    Genero genero2 = new Genero(2, "");
    System.out.println(genero.getName());
    System.out.println(genero2.getId());
  }
}
