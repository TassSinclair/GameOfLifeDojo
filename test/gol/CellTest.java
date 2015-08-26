package gol;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;


public class CellTest {

  private Cell cell;

  @Test
  public void shouldNotBeAliveWhenCreatedViaDeadCell() {
    cell = Cell.deadCell();
    assertThat(cell.isAlive()).isFalse();
  }

  @Test
  public void shouldBeAliveWhenCreatedViaAliveCell() {
    cell = Cell.aliveCell();
    assertThat(cell.isAlive()).isTrue();
  }

//  @Test
//  public void shouldBeAliveWhenSpawned() {
//    cell.spawn();
//
//    assertThat(cell.isAlive()).isTrue();
//  }
//
//  @Test
//  public void shouldNotBeAliveWhenKilled() {
//    cell.spawn();
//    cell.kill();
//
//    assertThat(cell.isAlive()).isFalse();
//  }
}