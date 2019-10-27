package edu.cs3500.spreadsheets.model;

public class CellValue implements CellContents {

  enum VAL_CLASS {
    DOUBLE, BOOLEAN, STRING;
  }
  @Override
  public CellValue evaluate() {
    return null;
  }

  @Override
  public String toString() {
    return "IMPLEMENT";
  }
}
