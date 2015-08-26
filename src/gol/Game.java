package gol;

import java.util.Random;

public class Game {

  private static final int SIZE = 20;

  private final Cell[][] cells = new Cell[SIZE][SIZE];

  private final Printer printer;

  public Game(Printer printer) {
    this.printer = printer;

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
