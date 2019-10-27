package edu.cs3500.spreadsheets.model;

public class Cell {
  private CellContents contents;

  @Override
  public String toString() {
    return contents.toString();
  }
}
