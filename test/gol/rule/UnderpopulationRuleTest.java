package gol.rule;

import gol.Cell;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;


public class UnderpopulationRuleTest {

  UnderpopulationRule rule = new UnderpopulationRule();

  @Test
  public void shouldKillCellWhenTooFewAliveNeighbours() {

    Cell cell = Cell.aliveCell();

    List<Cell> neighbours = Arrays.asList(Cell.aliveCell(), Cell.deadCell(),  Cell.deadCell(),
                                          Cell.deadCell(),                    Cell.deadCell(),
                                          Cell.deadCell(),  Cell.deadCell(),  Cell.deadCell());

    rule.apply(cell, neighbours);

    assertThat(cell.isAlive()).isFalse();
  }
}