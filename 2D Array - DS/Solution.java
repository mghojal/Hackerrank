// Complete the hourglassSum function below.
    static int hourglassSum(int[][] arr) {
        int sum = -63;
        int windowSum = 0;
        // system.out.print
        for (int i = 1; i < arr.length -1; i++){
            for (int j = 1; j < arr[0].length -1; j++){
                
                windowSum = ( arr[i-1][j-1] +
                              arr[i-1][j]   +
                              arr[i-1][j+1] +
                              arr[i][j]     +
                              arr[i+1][j-1] +
                              arr[i+1][j]   +
                              arr[i+1][j+1]);
                if (sum < windowSum){
                    sum = windowSum;
                }
                System.out.println(windowSum);
                windowSum = 0;
                
            }

        }
        return sum;

    }
