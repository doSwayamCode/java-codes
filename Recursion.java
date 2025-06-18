public class Recursion {
    public static void printDec(int n) {
        if (n == 1) {
            System.out.println(n);
            return;
        }
        System.out.println(n+ " ");
        printDec(n-1);
    }

    public static void printInc(int n) {
        if(n == 1) {
            System.out.print(n+ " ");
            return;
        }
        printInc(n-1);
        System.out.print(n+" ");
    }

    public static int fact(int n) {
        if(n==0) {
            return 1;
        }
        int fnm1 = fact(n-1);
        int fn = n * fact(n-1);
          return fn;
        }

        public static int calcSum(int n) {
            if(n == 1) {
                return 1;
            }
            int Snm1 = calcSum(n-1);
            int Sn = n + Snm1;
            return Sn;
        }

        // calculating nth term in fibonacci.
        public static int  fib(int n) {

            if ( n == 0 || n == 1 ) {
                return n;
            }
           int fnm1 = fib(n-1);
           int fnm2 = fib(n-2);
           
           int fn = fnm1 + fnm2;
           return fn;
        }

        public static boolean isSorted (int arr[], int i) {

            if( i == arr.length-1) {
                return true;
            }

            if(arr[i]> arr[i+1]) {
                return false;
            }
            return isSorted(arr, i+1);
        }

        public static int firstOccurence( int arr[], int key, int i) {
            if(i == arr.length) {
                return -1;
            }
            if(arr[i] == key) {
                return i;
            }

           return firstOccurence(arr, key, i+1);
        }

        public static int power(int x, int n) {
            if( n==0 ) {
                return 1;
            }

            int xnm1 = power(x, n-1);
            int xn = x * xnm1;
            return xn;
        }

        

        //tiling problem
        public static int tilingProb(int n) { //2xn (floor size)

            //base case
            if( n==0 || n==1 ) {
                return 1;
            }

            //vertical choices.
            int fnm1 = tilingProb(n-1);
            
            //horizontal choices.
            int fnm2 = tilingProb(n-2);

            int totWays = fnm1 + fnm2;

            return totWays;

        }

        //remove duplicates from string.
        public static void removeDuplicates (String str, int idx, StringBuilder newStr, boolean map[]) {
            //base case.
            if(idx == str.length()) {
                System.out.println(newStr);
                return;
            }
                //kaam
                char currChr = str.charAt(idx);
            if(map[currChr-'a'] == true) {
                //duplicate
                removeDuplicates(str, idx+1, newStr, map);
            } else {
                map[currChr-'a'] = true;
                removeDuplicates(str, idx+1, newStr.append(currChr), map);
            }
        }

        public static int friendsPairing(int n) {

            if(n == 0 || n == 1) {
                return n;
            }
            //choice
            //single
            int fnm1 = friendsPairing(n-1);

            //pair
            int fnm2 = friendsPairing(n-2);
            int pairWays = (n-1) * fnm2;
            
            //totWays
            int totWays = fnm1 + pairWays;
            return totWays;
        }
    public static void main(String[] args) {
     System.out.println(friendsPairing(3));
    }
}