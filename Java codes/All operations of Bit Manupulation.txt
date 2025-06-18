import java.util.*;
public class BitManupulation {

public static void OddOrEven(int n) {
    int bitMask = 1;
    if((n & bitMask)==0) {
        //even number 
        System.out.println("even number !");
    } else {
            System.out.println("odd");
        }
    }

 public static int GetIthBit (int n, int i) {
    int bitMask= 1<<i;
    if((n & bitMask)==0) {
        return 0;
    } else {
        return 1;
    }
 }

 public static int SetIthBit (int n , int i) {
    int bitMask = 1<<i;
    return n | bitMask;

 }

 public static int ClearIthBit (int n, int i) {
    int bitMask= ~(1<<i);
    return n & bitMask;
 }

 public static int UpdateIthBit (int n, int i, int newBit) {
    if(newBit==0) {
        return ClearIthBit(n,i);
    } else {
        return SetIthBit(n,i);
    }
 }

 public static int ClearIbits (int n , int i) {
    int bitMask = (~0)<<i;
    return n & bitMask;
 }

 public static int ClearIbitsInRange( int n , int i, int j) {
    int a = ((~0)<<(j+1));
    int b = ((1<<i)-1);
    int bitMask = a|b;
    return n & bitMask;

 }

 public static boolean isPowerOfTwo (int n) {
    return (n&(n-1))==0;
 }

 public static int countSetBits (int n) {
   int count =0;
   while ( n>0) {
      if((n & 1)!=0) {  // check LSB
         count++;
      }
      n = n>>1;
   }
   return count;
 }

 public static int FastExpo (int a, int n) {
   int ans =1;

   while (n>0) {
      if((n&1) !=0) {  // check LSB
          ans = ans * a;
      }
      a = a * a;
      n = n>>1;
   }
     return ans;
 }
    public static void main(String[] args) {
    System.out.println(FastExpo(3,5));
    } 
}