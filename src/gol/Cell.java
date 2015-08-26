package gol;

public class Cell {
  private boolean alive;

  public static Cell deadCell() {
    return new Cell(false);
  }

  public static Cell aliveCell() {
    return new Cell(true);
  }

  private Cell(boolean alive) {
    this.alive = alive;
  }
  public boolean isAlive() {
    return alive;
  }
}
