
/**
 * Write a description of class CharMatrix here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CharMatrix
{
    private char[][] grid;

    public CharMatrix(int rows, int cols){
        grid = new char[rows][cols];
        for(int r = 0; r<grid.length;r++){
            for(int c = 0; c<grid[0].length; c++){
                grid[r][c] = ' ';
            }
        }
    }

    public CharMatrix(int rows, int cols, char fill){
        grid = new char[rows][cols];
        for(int r = 0; r<grid.length;r++){
            for(int c = 0; c<grid[0].length; c++){
                grid[r][c] = fill;
            }
        }
    }

    public void display(){
        //Prints the characters of the array to the terminal using print and println.
        for(int r = 0; r<grid.length; r++){
            for(int c = 0; c<grid[0].length; c++){
                System.out.print(grid[r][c]);
            }
            System.out.println();
        }
    }

    public int numRows(){
        return grid.length;
    }

    public int numCols(){
        return grid[0].length;
    }

    public char charAt(int row, int col){
        return grid[row][col];
    }

    public void setCharAt(int row, int col, char ch){
        grid[row][col] = ch;
    }

    public boolean isEmpty(int row, int col){
        if(grid[row][col] == ' ') return true;
        return false;
    }

    public void fillRect(int row0, int col0, int row1, int col1, char fill)   {
        //Fill the given rectangle with the fill characters. row0, col0 is the upper left corner and row1, col1 is the lower right corner 
        for(int r = row0; r<row1; r++) {
            for(int c = col0; c<col1; c++) {
                grid[r][c] = fill;
            }
        }
    }

    public void clearRect(int row0, int col0, int row1, int col1){
        //Fills the given rectangle with the SPACE characters. row0, col0 is the upper left corner and row1, col1 is the lower right corner of the rectangle.
        for(int r = row0; r<row1; r++) {
            for(int c = col0; c<col1; c++) {
                grid[r][c] = ' ';
            }
        }
    }

    public int countInRow(int row){
        //Returns the count of all non-SPACE characters in row.
        int count = 0;
        for(int c = 0; c<grid[0].length; c++) {
            if(grid[row][c] != ' '){
                count++;
            }
        }
        return count;
    }

    public int countInCol(int col){
        //Returns the count of all non-SPACE characters in col.
        int count = 0;
        for(int r = 0; r<grid.length; r++) {
            if(grid[r][col] != ' '){
                count++;
            }
        }
        return count;
    }

}
