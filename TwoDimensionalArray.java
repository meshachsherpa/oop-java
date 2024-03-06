public class TwoDimensionalArray {
    public static void main(String[] args) {
        // Array declaration -> datatype [row][column] array_name;
        // datatype [][] array_name; datatype array_name [][];

        int [][] values;

        //Instantiate - Column size is optional but row size is mandatory.
        // values = new int [2][];

        values = new int[2][3];

        // Initialize
        values [0][0] = 7;
        values [1][2] = 10;
        values [0][2] = 67;

        int [][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12,}

        };

        for (var i=0; i<3; i++){ // row
            for (var j=0; j<4; j++){ // column

                System.out.print(matrix [i][j]+"\t");

            }
            System.out.println();

        }

    }
}
