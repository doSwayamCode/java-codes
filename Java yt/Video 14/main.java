
// import java.util.*;

// //Dutch National Flag Algorithm
// public class main {
//   public static void sortArray(ArrayList<Integer> arr, int n) {
//     int low = 0, mid = 0, high = n - 1; // 3 pointers

//     while (mid <= high) {
//       if (arr.get(mid) == 0) {
//         // swapping arr[low] and arr[mid]
//         int temp = arr.get(low);
//         arr.set(low, arr.get(mid));
//         arr.set(mid, temp);

//         low++;
//         mid++;

//       } else if (arr.get(mid) == 1) {
//         mid++;

//       } else {
//         // swapping arr[mid] and arr[high]
//         int temp = arr.get(mid);
//         arr.set(mid, arr.get(high));
//         arr.set(high, temp);

//         high--;
//       }
//     }
//   }

//   public static void main(String args[]) {
//     int n = 6;
//     ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] { 0, 2, 1, 2, 0, 1 }));
//     sortArray(arr, n);
//     System.out.println("After sorting:");
//     for (int i = 0; i < n; i++) {
//       System.out.print(arr.get(i) + " ");
//     }
//     System.out.println();

//   }

// }

// public class main {

//   public static int twoSum(int arr[], int n) {
//     int target = 14;
//     for (int i = 0; i < n; i++) {
//       for (int j = i + 1; j < n; j++) {
//         if (arr[i] + arr[j] == target) {
//           System.out.println(i);
//           System.out.print(j);
//           System.out.println();

//         }
//         // else{
//         //   return -1;
//         // }
//       }
//     }
//     return -1;
//   }

//   public static void main(String[] args) {
//     int arr[] = { 2, 6, 5, 8, 11 };
//     System.out.println(twoSum(arr, 5));
//   }
// }

// public class main {
//   public static int arrayOfZeroOneTwo(int arr[], int n) {
//     int cnt0 = 0;
//     int cnt1 = 0;
//     int cnt2 = 0;

//     for (int i = 0; i < n; i++) {
//       if (arr[i] == 0) {
//         cnt0++;

//       } else if (arr[i] == 1) {
//         cnt1++;

//       } else {
//         cnt2++;

//       }
//     }
//     for (int i = 0; i < cnt0; i++) {
//       arr[i] = 0;
//     }
//     for (int i = cnt0; i < cnt0 + cnt1; i++) {
//       arr[i] = 1;
//     }
//     for (int i = cnt1; i < cnt1 + cnt2; i++) {
//       arr[i] = 2;
//     }
//     return -1;
//   }

//   public static void main(String[] args) {
//     int arr[] = { 1, 0, 2, 0, 0, 1, 1, 0, 2, 1, 2, 0 };

//     System.out.println(arrayOfZeroOneTwo(arr, 12));
//   }
// }

// import java.util.*;

// public class main {
//   public static void sortArray(ArrayList<Integer> arr, int n) {
//     int cnt0 = 0, cnt1 = 0, cnt2 = 0;

//     for (int i = 0; i < n; i++) {
//       if (arr.get(i) == 0)
//         cnt0++;
//       else if (arr.get(i) == 1)
//         cnt1++;
//       else
//         cnt2++;
//     }

//     // Replace the places in the original array:
//     for (int i = 0; i < cnt0; i++)
//       arr.set(i, 0); // replacing 0's

//     for (int i = cnt0; i < cnt0 + cnt1; i++)
//       arr.set(i, 1); // replacing 1's

//     for (int i = cnt0 + cnt1; i < n; i++)
//       arr.set(i, 2); // replacing 2's
//   }

//   public static void main(String args[]) {
//     int n = 6;
//     ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(new Integer[] { 0, 2, 1, 2, 0, 1 }));
//     sortArray(arr, n);
//     System.out.println("After sorting:");
//     for (int i = 0; i < n; i++) {
//       System.out.print(arr.get(i) + " ");
//     }
//     System.out.println();

//   }

// }

// import java.util.*;

// public class main {

//   public static long kadanAlgo(int arr[], int n) {
//     long maxi = Long.MIN_VALUE;
//     long sum = 0;

//     for (int i = 0; i < n; i++) {
//       sum = sum + arr[i];

//       if (sum > maxi) {
//         maxi = sum;
//       }
//       if (sum < 0) {
//         sum = 0;
//       }

//     }
//     return maxi;
//   }

//   public static void main(String[] args) {
//     int arr[] = { -2, -3, 4, -1, -2, 1, 5, -3 };
//     int n = arr.length;
//     long maxSum = kadanAlgo(arr, n);
//     System.out.println("the maximum subarray sum using Kadan Algo is :" + maxSum);

//   }
// }

// public class main {

//   public static int buyAndSellStocks(int arr[]) {
//     int mini = arr[0];
//     int profit = 0;
//     for (int i = 1; i < arr.length; i++) {
//       int cost = arr[i] - mini;
//       profit = Math.max(profit, cost);
//       mini = Math.min(mini, arr[i]);

//     }
//     return profit;

//   }

//   public static void main(String[] args) {
//     int arr[] = { 7, 1, 5, 3, 6, 4 };
//     System.out.println(buyAndSellStocks(arr));
//   }
// }



// import java.util.*;

// public class main {
    
//     public static ArrayList<Integer> RearrangebySign(ArrayList<Integer> A) {
//         int n = A.size();

//         // Define array for storing the ans separately.
//         ArrayList<Integer> ans = new ArrayList<>(Collections.nCopies(n, 0));

//         // positive elements start from 0 and negative from 1.
//         int posIndex = 0, negIndex = 1;
//         for (int i = 0; i < n; i++) {

//             // Fill negative elements in odd indices and inc by 2.
//             if (A.get(i) < 0) {
//                 ans.set(negIndex, A.get(i));
//                 negIndex += 2;
//             }

//             // Fill positive elements in even indices and inc by 2.
//             else {
//                 ans.set(posIndex, A.get(i));
//                 posIndex += 2;
//             }
//         }

//         return ans;
//     }

//     public static void main(String[] args) {
//         // Array Initialization.
//         ArrayList<Integer> A = new ArrayList<>(Arrays.asList(3,1,-2,-5,2,-4));
//         ArrayList<Integer> ans = RearrangebySign(A);

//         for (int i = 0; i < ans.size(); i++) {
//             System.out.print(ans.get(i) + " ");
//         }
//     }
// }


// public class main{

//     public static int elementBySign(int arr[]){
//         int  pos[];
//         int  neg[];
        
//         for(int i=1;i<arr.length/2;i++){
//           arr[2*i]= pos[i];
//           arr[2*i+1]= neg[i];
//         }
//         return arr;
//     }
//     public static void main(String[] args) {
//         int arr[]= {3,1,-2,-5,2,-4};

//         System.out.println(elementBySign(arr));
        
//     }
// }