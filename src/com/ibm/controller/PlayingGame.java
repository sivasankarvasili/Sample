package com.ibm.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class PlayingGame {
	public static void main(String[] args) {
		int players=0,top=0;
		Map<String,Integer> scores=new HashMap<>();
		//reading the no .of players
		List<String> names=new ArrayList<String>();
		System.out.print("Enter the No.of Players: ");
		Scanner sc=new Scanner(System.in);
		players=sc.nextInt();
		//reading the player names
		for(int i=0;i<players;i++){
			String name=null;
			System.out.print("Enter the Player "+(i+1)+" Name:");
			name=sc.next();
			names.add(i, name);
		}
		System.out.println();
		System.out.print("Enter the Most Score");
		top=sc.nextInt();
		while(names.size()!=1)
		{
			int sum=0;
			for(int i=0;i<names.size();i++){
				sum=0;
				System.out.print("Enter the "+names.get(i)+" Score: ");
				int score=sc.nextInt();
				if(scores.containsKey(names.get(i))){
					
				    sum=scores.get(names.get(i));
				}
				sum=sum+score;
				
				scores.put(names.get(i), sum);
				System.out.println();
			}
			Set keys = scores.keySet();
	        Iterator itr = keys.iterator();
	 
	        String key;
	        int value;
	       /* while(itr.hasNext())
	        {
	            key = (String)itr.next();
	            value = scores.get(key);
	            if(value>=top){
	            	System.out.println(key+"  finishes the game");
	            	int index=names.indexOf(key);
	            	System.out.println("index: "+index);
	            	names.remove(index);
	            	scores.remove(key);
	            	System.out.println("Array Size"+names.size());
	            }
	            System.out.println(key + " -------- "+ value);
	        }*/
	        for(Iterator<String> iterator =keys.iterator();iterator.hasNext();){
	        	key = (String)iterator.next();
	        	value = scores.get(key);
	        	if(value>=top){
	            	System.out.println(key+"  finishes the game");
	            	int index=names.indexOf(key);
	            	//System.out.println("index: "+index);
	            	names.remove(index);
	            	iterator.remove();
	            	//System.out.println("Array Size"+names.size());
	            }
	        	System.out.println(key + " -------- "+ value);
	        }
	
			
		}
		//to display winner
		System.out.println("Winner Is: Mr."+names.get(0));
		String choice=sc.next();
	}

}
