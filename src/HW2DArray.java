//create an 2d array for double and char type of data //
//bubble sort


public class HW2DArray

{


    public static void main(String[] args) {
        System.out.println("the double array of 4x3 is as follows");
        double[][] array={{23.55,25.88,45.99},{25.54,48.89,25.789},{78.544,87.597,56.145},{40.58,89.459,25.489}};

        for(int i=0;i<array.length;i++)
        {
            for(int j=0;j<array[0].length;j++)
            {
                System.out.print(array[i][j]+"\t");
            }
            System.out.println();


        }
        System.out.println("  ");

        System.out.println("the character array of 5x4 is as follows");
        char[][] chararray={{'a','s','d','e'},{'p','q','t','w'},{'q','s','t','g'},{'g','h','j','l'},{'v','r','x','z','y'}};

        for(int i=0;i<chararray.length;i++) {
            for (int j = 0; j < chararray[0].length; j++) {
                System.out.print(chararray[i][j] + "\t");
            }
            System.out.println();
        }





    }
}
