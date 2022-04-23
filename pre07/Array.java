import java.io.*;
import java.util.*;

public class Array{
  public static void main(String[] args){
    double[] a = {0, 1, 2, 3};
    powArray (a,3);
  }


//Exercise 1 
  public static void powArray(double[] a, int power){
    double[] b = new double[a.length];
    for (int i = 0; i < a.length; i++) { 
      b[i] = Math.pow(a[i], power);
    }
    System.out.println(Arrays.toString(b)); 
  }
}