package gol.rule;

import java.util.Collection;

import gol.Cell;

public class OverPopulation
    implements Rule
{

  @Override
  public void apply(Cell cell, Collection<Cell> neighbours)
  {

    if (neighbours.size() > 3)
    {
      cell.die();
    }
  }

}
