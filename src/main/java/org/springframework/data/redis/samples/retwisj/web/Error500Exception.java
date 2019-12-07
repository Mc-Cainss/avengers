package org.springframework.data.redis.samples.retwisj.web;



public class Error500Exception extends Exception
{ 
	public Error500Exception(){
		System.out.println("Error 500 ");
	}  
}