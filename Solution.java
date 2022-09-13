/*Problem Statement: Given an array Arr[] of integers, rearrange the numbers of the given array into the lexicographically next greater permutation of numbers.
/*
/*If such an arrangement is not possible, it must rearrange it as the lowest possible order (i.e., sorted in ascending order).
/*
/*Example 1 :
/*
/*Input format: Arr[] = {1,3,2}
/*
/*Output: Arr[] = {2,1,3}
/*
/*Explanation: All permutations of {1,2,3} are {{1,2,3} , {1,3,2}, {2,13} , {2,3,1} , {3,1,2} , {3,2,1}}. So, the next permutation just after {1,3,2} is {2,1,3}.
 */
import java.util.* ;
import java.io.*; 
import java.util.ArrayList;
import java.util.Collections;

public class Solution 
{
	public static ArrayList<Integer> nextPermutation(ArrayList<Integer> a) 
	{
		// Write your code here.
        int i = a.size()  - 2;
        while(i>=0 && a.get(i)>=a.get(i+1))i--;
        if(i>=0){
            int j = a.size()-1;
            while(i>=0 && a.get(i)>=a.get(j))j--;
            Collections.swap(a,i,j);
            
        }reverse(a,i+1,a.size()-1);
        return a;
	}

    public static void reverse(ArrayList<Integer> a , int i ,int j){
        while(i<j)Collections.swap(a,i++,j--);
    }
   

 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of permutation : ");
    int n = sc.nextInt();
    System.out.println("Enter the permutation list : ");
    
    for(int i =0 ; i < n ; i++){
        int p = sc.nextInt();}
} 
}