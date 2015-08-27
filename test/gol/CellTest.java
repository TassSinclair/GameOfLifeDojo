package gol;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class CellTest
{
  private Cell cell;

  @Test
  public void shouldNotBeAliveWhenCreatedDead()
  {
    cell = Cell.dead();
    assertThat(cell.isAlive()).isFalse();
  }

  @Test
  public void shouldBeAliveWhenCreatedAlive()
  {
    cell = Cell.alive();
    assertThat(cell.isAlive()).isTrue();
  }

  @Test
  public void shouldNotBeAliveWhenAskedToDie()
  {
    cell = Cell.alive();
    cell.die();

    assertThat(cell.isAlive()).isFalse();
  }
}
