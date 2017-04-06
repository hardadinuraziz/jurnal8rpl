/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;



/**
 *
 * @author Praktikan
 */
public class JavaApplication2 {

    /**
     * @param args
     */
   
        
        static int fib(int n)
	{
	
	int f[] = new int[n+1];
	int i;
	
	
	f[0] = 0;
	f[1] = 1;
	
	for (i = 2; i <= n; i++)
	{
	
		
		f[i] = f[i-1] + f[i-2];
	}
	
	return f[n];
	}
	
	public static void main (String args[])
	{
		int n = 7; 
		System.out.println("Jumlah Deret Bilangan Fibonacci:");
		System.out.println(fib(n));
	}
    }
    
    

