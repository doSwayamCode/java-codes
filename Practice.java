// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.Comparator;
// import java.util.List;

// public class Practice {
// public static void main(String[] args) {
// ArrayList <Integer> lists = new ArrayList();
// lists.add(5);
// lists.add(3);
// lists.add(6);
// System.out.println(lists);
// lists.add(66);
// System.out.println(lists);
// lists.add(3,56);
// System.out.println(lists);
// List <Integer> list2 = new ArrayList();
// list2.add(150);
// list2.add(555);
// list2.addAll(list2);
// System.out.println(lists);
// System.out.println(lists.get(3));

// Stack <String> animals = new Stack<>();
// animals.push("Dog");
// animals.push("Cat");
// animals.push("Horse");
// animals.push("Lion");
// // System.out.println(animals);
// // System.out.println(animals.peek());
// animals.pop();
// System.out.println(animals.pop());

// int number[] ={1,2,3,4,5,6,7,8,9,10};
// int index = Arrays.binarySearch(number, 4);
// System.out.println(index);

// int number[] = { 34, 56, 12, 3, 9, 67, 78 };
// Arrays.sort(number);
// for (int i : number) {
// System.out.println(i + " ");

// List <Integer> numbers = new ArrayList<>();
// numbers.add(5);
// numbers.add(3);
// numbers.add(6);
// numbers.add(8);
// numbers.add(1);
// numbers.add(2);
// numbers.add(4);

// System.out.println(Collections.min(numbers));

// System.out.println(Collections.frequency(numbers, 8));

// Collections.sort(numbers);
// System.out.println(numbers);

// Collections.sort(numbers, Comparator.reverseOrder());
// System.out.println(numbers);

// }

// }

// public class Practice {

//     public static int lSeq(int x, int n) {
//         int largest = 1;

//         for (int i = 0; i < n; i++) {
//             x = arr[i];
//             int cnt = 1;
//             while (lSearch(arr, x + 1) == true) {
//                 x = x + 1;
//                 cnt = cnt + 1;
//             }
//         }
//     }

//     public static boolean lSearch(int arr[], int nums) {
//         for (int i = 0; i < n; i++) {
//             if (arr[i] == nums) {
//                 return true;
//             }
//         }
//         return false;

//     }

//     public static void main(String[] args) {
//           int arr[]={102,4,100,1,101,3,2,1,1};
//           System.out.println();
//     }
// }
// import java.util.*;

// public class Practice {

//     public static int largestSequence(int arr[]) {
//         int longest = 1;
//         int cntCrr = 0;
//         int lastSmaller = Integer.MIN_VALUE;

//         for (int i = 0; i < arr.length; i++) {
//             if (arr[i] - 1 == lastSmaller) {
//                 cntCrr += 1;
//                 lastSmaller = arr[i];
//             } else if (arr[i] - 1 != lastSmaller) {
//                 cntCrr = 1;
//                 lastSmaller = arr[i];
//             }

//             longest = Math.max(longest, cntCrr);
//         }
//         return longest;
//     }

//     public static void main(String[] args) {
//         int arr[] = { 1, 1, 1, 2, 2, 2, 3, 3, 4, 100, 101, 101, 102 };
//         // int n = arr.length;

//         System.out.println(largestSequence(arr));
//     }
// }

// import java.util.*;
// class Practice {
//     static void rotate(int[][] matrix) {
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = i; j < matrix[0].length; j++) {
//                 int temp = 0;
//                 temp = matrix[i][j];
//                 matrix[i][j] = matrix[j][i];
//                 matrix[j][i] = temp;
//             }
//         }
//         for (int i = 0; i < matrix.length; i++) {
//             for (int j = 0; j < matrix.length / 2; j++) {
//                 int temp = 0;
//                 temp = matrix[i][j];
//                 matrix[i][j] = matrix[i][matrix.length - 1 - j];
//                 matrix[i][matrix.length - 1 - j] = temp;
//             }
//         }
//     }

//     public static void main(String args[]) {
//         int arr[][] =  {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//         rotate(arr);
//         System.out.println("Rotated Image");
//         for (int i = 0; i < arr.length; i++) {
//             for (int j = 0; j < arr.length; j++) {
//                 System.out.print(arr[i][j] + " ");
//             }
//             System.out.println();
//         }

//     }
// }




// import java.util.*;

// class Practice {
//     static int[][] rotate(int[][] matrix) {
//         int n = matrix.length;
//         int rotated[][] = new int[n][n];
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 rotated[j][n - i - 1] = matrix[i][j];
//             }
//         }
//         return rotated;
//     }

//     public static void main(String args[]) {
//         int arr[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//         int rotated[][] = rotate(arr);
//         System.out.println("Rotated Image");
//         for (int i = 0; i < rotated.length; i++) {
//             for (int j = 0; j < rotated.length; j++) {
//                 System.out.print(rotated[i][j] + " ");
//             }
//             System.out.println();
//         }

//     }
// }


// import java.util.ArrayList;
// import java.util.List;

// public class Practice {
    
//     public static List<Integer> printSpiral(int[][] mat) {
        
//         // Define ans list to store the result.
//         List<Integer> ans = new ArrayList<>();
        
//         int n = mat.length; // no. of rows
//         int m = mat[0].length; // no. of columns
        
//         // Initialize the pointers required for traversal.
//         int top = 0, left = 0, bottom = n - 1, right = m - 1;

//         // Loop until all elements are not traversed.
//         while (top <= bottom && left <= right) {

//             // For moving left to right
//             for (int i = left; i <= right; i++)
//                 ans.add(mat[top][i]);

//             top++;

//             // For moving top to bottom.
//             for (int i = top; i <= bottom; i++)
//                 ans.add(mat[i][right]);

//             right--;

//             // For moving right to left.
//             if (top <= bottom) {
//                 for (int i = right; i >= left; i--)
//                     ans.add(mat[bottom][i]);

//                 bottom--;
//             }

//             // For moving bottom to top.
//             if (left <= right) {
//                 for (int i = bottom; i >= top; i--)
//                     ans.add(mat[i][left]);

//                 left++;
//             }
//         }
//         return ans;
//     }

//     public static void main(String[] args) {
        
//         //Matrix initialization.
//         int[][] mat = {{1, 2, 3, 4},
//                        {5, 6, 7, 8},
//                        {9, 10, 11, 12},
//                        {13, 14, 15, 16}};
        
//         List<Integer> ans = printSpiral(mat);

//         for(int i = 0;i<ans.size();i++){
//             System.out.print(ans.get(i) + " ");
//         }

//         System.out.println();
//     }
// }


//Hashing
// import java.util.*;
// public class Practice {
//     public static void main(String[] args) {
        
//         HashMap<String, Integer> map = new HashMap<>();

//         map.put("INDIA", 1);
//         map.put("USA", 2); 
//         map.put("RUSSIA", 3);
//         map.put("CANADA", 4);

//         //Iterate
//         Set<String> keys = map.keySet();

//         for (String k : keys) {
//             System.out.println("key="+k+",value="+map.get(k));
//         }
//     }
// }



//HashSet

import java.util.HashSet;
import java.util.Iterator;
import java.util.*;


// class Practice{
//     public static void main(String[] args) {
//         HashSet<String> cities = new HashSet<>();

//         cities.add("Delhi");
//         cities.add("Kanpur");
//         cities.add("Lucknow");
//         cities.add("Mumbai");

//         Iterator it = cities.iterator();

//         while(it.hasNext()){
//             System.out.println(it.next());
//         }

//     }
// }

// import java.util.Arrays;

// public class Practice {

//     public static void main(String[] args) {
//         int[][] arr = {
//             {10, 20, 30, 40},
//             {15, 25, 35, 45},
//             {27, 29, 37, 48},
//             {32, 33, 39, 50}
//         };

//         System.out.println(Arrays.toString(search(arr, 50)));
//     }

//     static int[] search(int[][] matrix, int target) {
//         int r = 0;
//         int c = matrix[0].length - 1;

//         while (r < matrix.length && c >= 0) {
//             if (matrix[r][c] == target) {
//                 return new int[]{r, c};
//             }
//             if (matrix[r][c] < target) {
//                 r++;
//             } else {
//                 c--;
//             }
//         }
//         return new int[]{-1, -1}; 
//     }
// }


public class Practice {

    public static void main(String[] args) {
        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9},
        };

        System.out.println(Arrays.toString(search(arr, 6)));
    }

    static int[] search(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else {
                c--;
            }
        }
        return new int[]{-1, -1}; 
    }

    static int[] matrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int rStart = 0;
        int rEnd = rows - 1;
        int cMid = cols / 2;

        while (rStart < (rEnd - 1)) {
            int mid = (rStart + rEnd) / 2;

            if (matrix[mid][cMid] == target) {
                return new int[]{mid, cMid};
            }

            if (matrix[mid][cMid] < target) {
                rStart = mid;
            } else {
                rEnd = mid;
            }
        }

        // Now we have two rows remaining
        if (matrix[rStart][cMid] == target) {
            return new int[]{rStart, cMid};
        }
        if (matrix[rStart + 1][cMid] == target) {
            return new int[]{rStart + 1, cMid};
        }

        // Search in 1st half
        if (target <= matrix[rStart][cMid - 1]) {
            return binarySearch(matrix, rStart, 0, cMid - 1, target);
        }
        // Search in 2nd half
        if (target >= matrix[rStart][cMid + 1] && target <= matrix[rStart][cols - 1]) {
            return binarySearch(matrix, rStart, cMid + 1, cols - 1, target);
        }
        // Search in 3rd half
        if (target <= matrix[rStart + 1][cMid - 1]) {
            return binarySearch(matrix, rStart + 1, 0, cMid - 1, target);
        }
        // Search in 4th half
        else {
            return binarySearch(matrix, rStart + 1, cMid + 1, cols - 1, target);
        }
    }

    static int[] binarySearch(int[][] matrix, int row, int cStart, int cEnd, int target) {
        while (cStart <= cEnd) {
            int mid = (cStart + cEnd) / 2;

            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            } else {
                cEnd = mid - 1;
            }
        }
        return new int[]{-1, -1};
    }
}