static int[] rotLeft(int[] a, int d) {
        int[] x = new int[a.length];
        System.out.println(a.length + " " + d);
        if ( d == a.length) {return a;}
        else if (d > a.length) { d %= a.length;}
        int j;
        for (int i = a.length-1; i>-1 ;i--){
            j = i-d;
            if (j < 0) { x[j + a.length] = a[i];}
            else{ x[j] = a[i];}
                
        }
        return x;
    }
