package gol;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CellTest {

  private Cell cell;

  @Test
  public void shouldNotBeAliveWhenCreatedDead() {
    cell = Cell.dead();
    assertThat(cell.isAlive()).isFalse();
  }

  @Test
  public void shouldBeAliveWhenCreatedAlive() {
    cell = Cell.alive();
    assertThat(cell.isAlive()).isTrue();
  }
}