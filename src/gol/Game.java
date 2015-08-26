package gol;

import java.util.Random;

public class Game {

  private static final int SIZE = 10;

  private Cell[][] cells = new Cell[SIZE][SIZE];

  private Printer printer = new Printer();

  public Game() {
    for (int x = 0; x < SIZE; x++) {
      for (int y = 0; y < SIZE; y++) {
        cells[x][y] = createCell();
      }
    }
  }

  private Cell createCell() {
    if (new Random().nextBoolean()) {
      return Cell.aliveCell();
    }
    return Cell.deadCell();
  }

  public void tick() {
    printer.print(cells);
  }
}
