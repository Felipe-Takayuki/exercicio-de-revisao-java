package app;

import java.lang.*;

public class Genero {
  private long id;
  private String name;

  public void setId(long id) {
    if (id < 1) {
      throw new IllegalArgumentException("Id inválido");
    }
    this.id = id;
  }

  public long getId() {
    return this.id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  Genero(long id, String name) {
    this.setId(id);
    this.setName(name);
  }

  Genero() {
  }
}
