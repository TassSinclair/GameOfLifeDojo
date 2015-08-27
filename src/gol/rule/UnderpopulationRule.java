package gol.rule;

import java.util.Collection;

import gol.Cell;

public class UnderpopulationRule
    implements Rule
{

  @Override
  public void apply(Cell cell, Collection<Cell> neighbours)
  {

    int alive = 0;
    for (Cell neighbour : neighbours)
    {
      if (neighbour.isAlive())
      {
        alive++;
      }
    }
    if (alive < 2)
    {
      cell.die();
    }

  }
}
