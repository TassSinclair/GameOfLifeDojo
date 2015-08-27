package gol.rule;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import gol.Cell;

public class UnderpopulationRuleTest
{

  private UnderpopulationRule rule = new UnderpopulationRule();

  @Test
  public void shouldKillCellWhenThereIsLessThan2AliveNeighbours()
  {

    Cell cell = Cell.alive();

    List<Cell> neighbours = Arrays.asList(Cell.alive(), Cell.dead(), Cell.dead(),
        Cell.dead(), Cell.dead(),
        Cell.dead(), Cell.dead(), Cell.dead());

    rule.apply(cell, neighbours);
    assertThat(cell.isAlive()).isFalse();
  }

  @Test
  public void shouldNotKillCellWhenThereAreTwoLiveNeighbors()
  {
    Cell cell = Cell.alive();

    rule.apply(cell, Arrays.asList(Cell.alive(), Cell.alive()));
    assertThat(cell.isAlive()).isTrue();
  }
}
