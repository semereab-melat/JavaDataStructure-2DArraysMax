import java.util.Random; // Random number generator class

/*2D Array Iteration - The main method will create a 2d array called 'a' and fill this array with random numbers. 

Write a method public static int array2DMax(int[][] a) that returns the maximum value in the 2d parameter array a. 

Write a method public static int array2DMin(int[][] a) that returns the maximum value in the 2d parameter array a.*/



class Main {
public static void main(String[] args) {
        int[][] nums = new int[2][8];
        Random ran = new Random(0); // constant random numbers
        for (int r = 0; r < nums.length; r++){
            for (int c = 0; c < nums[r].length; c++){
                //nums[r][c] = ((int)(Math.random() * 1000) + 1);
                nums[r][c] = ran.nextInt(1000) + 1;
                System.out.print(nums[r][c] + "\t");
            }//for
            System.out.println();
        }//for
        System.out.println("Maximum Value: " + array2DMax(nums));
        System.out.println("Minimum Value: " + array2DMin(nums));
    }//main method

    // the maximum value in the 2d parameter array a.
    public static int array2DMax(int[][] a) {
        int max = a[0][0]; //assumed the first number is maximum
        for (int r = 0; r < a.length; r++){
            for (int c = 1; c < a[r].length; c++){
                if (a[r][c] > max){
                    max = a[r][c];
                }//if
            }//for
        }//for
        return max;
    }//array2DMax()
    //returns the minimum value in the 2d parameter array a.
    public static int array2DMin(int[][] a) {
        int minimum = a[0][0];
        for (int r = 0; r < a.length; r++){
            for (int c = 1; c < a[r].length; c++){
                if (a[r][c] < minimum){
                    minimum = a[r][c];
                }//if
            }//for
        }//for

        return minimum;
    }//array2DMin()

}
