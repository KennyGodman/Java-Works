package com.Godman.Godman.Arrays.Turtle;

public class SketchPad {
    private int row;
    private int column;
    private int [][] floor ;

    public SketchPad(int row, int column) {
        this.row = row;
        this.column = column;
        floor = new int [row][column];

    }

    public int[][] getFloor() {
        return floor;
    }
}
