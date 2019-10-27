package edu.cs3500.spreadsheets.model;

public interface CellContents {
  CellValue evaluate(); //returns what the cell actually stores
  String toString();
}
