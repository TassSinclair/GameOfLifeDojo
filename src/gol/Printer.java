package gol;

import gol.Cell;

public class Printer {
  public void print(Cell[][] cells) {
    for (Cell[] rows : cells) {
      for (Cell cell : rows) {
        System.out.print(cell.isAlive() ? '☺' : '-');
      }
      System.out.println();
    }

  }
}
