package gol.rule;

import gol.Cell;

import java.util.Collection;

public interface Rule {
  void apply(Cell cell, Collection<Cell> neighbours);
}
