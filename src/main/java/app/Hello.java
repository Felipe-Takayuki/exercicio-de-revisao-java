package app;

public class Hello {
  public static void main(String[] args) {
    // Genero genero = new Genero(1, "ficção");
    // System.out.println(genero.getName());
    // Genero genero2 = new Genero(2, "");
    // System.out.println(genero.getName());
    // System.out.println(genero2.getId());

    // isso são referências, a própria váriavel e o uso dela
    Genero policial = new Genero(1, "Policial");
    Genero aventura = new Genero(2, "Aventura");
    Genero terror = new Genero(3, "Terror");
    Filme filme1 = new Filme();
    filme1.setId(1);
    filme1.setTitulo("A sociedade do Anel");
    filme1.setGenero(aventura);
    Filme filme2 = new Filme(2, "Duna", aventura);
    Filme filme3 = new Filme(3, "Entre Facas e Segredos", policial);
    System.out.println(filme1);
    System.out.println(filme2.getTitulo());
    System.out.println(filme3.getTitulo());
  }
}
