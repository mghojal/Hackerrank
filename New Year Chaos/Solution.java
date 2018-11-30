static void minimumBribes(int[] q) {
        int bribeNumber = 0;
        for (int i = q.length -1; i >= 0 ; i--){
            if (i + 3 < q[i]){
                System.out.println("Too chaotic");
                return;
            }
            else {
                
                for (int j = Math.max(0 , q[i]-2); j < i ; j++){
                    if (q[j] > q[i] ){
                        bribeNumber++;
                    }

                }
            }
        }

        System.out.println(bribeNumber);
    }
