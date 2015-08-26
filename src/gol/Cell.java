package gol;

public class Cell {
  private boolean alive;

  public static Cell dead() {
    return new Cell(false);
  }

  public static Cell alive() {
    return new Cell(true);
  }

  private Cell(boolean alive) {
    this.alive = alive;
  }

  public boolean isAlive() {
    return alive;
  }
}
