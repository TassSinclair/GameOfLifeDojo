package gol;

import java.util.Random;

public class Game
{

  public static final int SIZE = 20;

  private final Cell[][] cells = new Cell[SIZE][SIZE];

  public Game()
  {
    for (int x = 0; x < SIZE; x++)
    {
      for (int y = 0; y < SIZE; y++)
      {
        cells[x][y] = randomCell();
      }
    }
  }

  private Cell randomCell()
  {
    if (new Random().nextBoolean())
    {
      return Cell.alive();
    }
    return Cell.dead();
  }

  public void tick()
  {
    for (int x = 0; x < SIZE; x++)
    {
      for (int y = 0; y < SIZE; y++)
      {
        System.out.print(cells[x][y].isAlive() ? 'o' : '-');
      }
      System.out.println();
    }
  }
}
