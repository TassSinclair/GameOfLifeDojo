package gol.rule;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;

import org.junit.Test;

import gol.Cell;

public class OverPopulationTest
{
  private OverPopulation rule = new OverPopulation();

  @Test
  public void shouldDieForOverpopulation()
  {
    Cell cell = Cell.alive();
    rule.apply(cell, Arrays.asList(Cell.alive(), Cell.alive(), Cell.alive(), Cell.alive()));
    assertThat(cell.isAlive()).isFalse();
  }

  @Test
  public void shouldLiveIfLessPopulated()
  {
    Cell cell = Cell.alive();
    rule.apply(cell, Arrays.asList(Cell.alive(), Cell.alive(), Cell.alive()));
    assertThat(cell.isAlive()).isTrue();

  }
}
