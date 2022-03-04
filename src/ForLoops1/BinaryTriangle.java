package ForLoops1;

public class BinaryTriangle {
    public static void main(String[] args) {
/*1
  10
  101
  1010
  10101
  101010
  1010101
  Write a java program for this pattern.
*/
        for(int i=1;i<=7;i++) {
            for(int j=1;j<i;j++) {
                System.out.print(j%2);
            }
            System.out.println();
        }
    }
}
