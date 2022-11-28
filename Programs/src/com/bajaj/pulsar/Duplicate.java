package com.bajaj.pulsar;

public class Duplicate {

	public static void main(String[] args) {      
        
        //Initialize array      
        String[] arr= {"ABA", "AAB", "ABA", "ABC", "121", "121"};   
        System.out.println("Duplicate elements in given array: ");  
        //Searches for duplicate element  
        for(int i = 0; i < arr.length; i++) {  
            for(int j = i + 1; j < arr.length; j++) {  
                if(arr[i] == arr[j])  
                    System.out.println(arr[j]);  
            }  
        }  
    }
}
