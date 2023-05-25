package com.example.test;

public class Vacuum {

    private int x;
    private int y;
    char orientation;

    public Vacuum(int x, int y, char orientation) {
        this.x = x;
        this.y = y;
        this.orientation = orientation;
    }

    public void move() {
        switch (this.orientation) {
            case 'S' -> {
                if (this.y > 0){
                    this.y--;
                }
            }
            case 'O' -> {
                if (this.x < 10){
                    this.x++;
                }}
            case 'N' -> {
                if (this.y < 10){
                    this.y++;
                }
            }
            case 'E' -> {
                if (this.x > 0){
                    this.x--;
                }
            }
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public char getOrientation() {
        return orientation;
    }

    public void rotate(String input){
        switch (input) {
            case "D" -> {
                switch (this.orientation) {
                    case 'N' -> this.orientation = 'E';
                    case 'O' -> this.orientation = 'N';
                    case 'E' -> this.orientation = 'S';
                    case 'S' -> this.orientation = 'O';
                }
            }
            case "G" -> {
                switch (this.orientation) {
                    case 'N' -> this.orientation = 'O';
                    case 'E' -> this.orientation = 'N';
                    case 'S' -> this.orientation = 'E';
                    case 'O' -> this.orientation = 'S';
                }
            }
        }
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setOrientation(char orientation){
        this.orientation = orientation;
    }
}
