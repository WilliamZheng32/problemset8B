
/**
 * Write a description of class CharMatrixDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CharMatrixDriver
{
    public static void main (String[] args) {

        System.out.println("Create a CharMatrix filled with m's ...");
        CharMatrix matrix = new CharMatrix(3, 4, 'm');
        matrix.display();
        System.out.println(matrix.numRows());
        System.out.println(matrix.numCols());
        System.out.println(matrix.charAt(1,1));
        matrix.setCharAt(1,1,'H');
        matrix.display();
        System.out.println(matrix.isEmpty(2,2));
        //matrix.clearRect(1,1,3,3);
        matrix.display();
        System.out.println(matrix.countInRow(2));
        System.out.println(matrix.countInRow(2));
        
        System.out.println("Testing setCharAt ...");
        System.out.println("  CharMatrix before method call:");
        matrix.display();

        matrix.setCharAt(0, 0, 'k');

        System.out.println("  CharMatrix after method call:");
        matrix.display();
        
    } 

}
