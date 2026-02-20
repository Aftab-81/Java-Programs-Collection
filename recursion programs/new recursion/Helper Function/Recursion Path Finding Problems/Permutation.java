public class Permutation {
    public static void main(String[] args) {
        int n = 4, r = 4;
        long ans = nPr(n, r);
        System.out.println(ans);
    }    
    static long nPr(int n, int r){
        if(r < 0 || r > n || n < 0) return 0;
        if(r == 0) return 1;
        long label = 1;
        for(int i = 0; i < r; i++){
            label = label * (n - i);    /*
                                                  (n - i)                 
                                                    ||
                                             (1st Iteration) 4 
                                             *
                                             (2nd Iteration) 3 
                                             * 
                                             (3rd Iteration) 2 
                                             * 
                                             (4th Iteration) 1
                                        */
        }
        return label;
    }
}
