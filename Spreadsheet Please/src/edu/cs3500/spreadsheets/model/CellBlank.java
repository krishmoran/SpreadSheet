package edu.cs3500.spreadsheets.model;

public class CellBlank implements CellContents {

  @Override
  public CellValue evaluate() {
    return null;
  }
}
