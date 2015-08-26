package gol.rule;

import gol.Cell;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class UnderpopulationRuleTest {

  private UnderpopulationRule rule = new UnderpopulationRule();

  @Test
  public void shouldKillCellWhenTooFewAliveNeighbours() {

    Cell cell = Cell.alive();

    List<Cell> neighbours = Arrays.asList(Cell.alive(), Cell.dead(),  Cell.dead(),
                                          Cell.dead(),                Cell.dead(),
                                          Cell.dead(),  Cell.dead(),  Cell.dead());

    rule.apply(cell, neighbours);
    assertThat(cell.isAlive()).isFalse();
  }
}