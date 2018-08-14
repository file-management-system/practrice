package com.excep;
//use of throws
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Throws{
	public static void main(String[] args)throws IOException {
	int i =8,j=0,k=0;
	System.out.println("enter the value of j :");
	BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
	j=Integer.parseInt(br.readLine()) ;
	k=i+j;
	System.out.println("output k is :" +k);
	}
}