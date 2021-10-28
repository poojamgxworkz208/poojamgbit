package com.xworkz.movieapp;

import java.util.*;

import com.xworkz.movieapp.dto.CastDTO;

public class MovieTester{

		private static Scanner sc;

		public static void main(String ar[]){
			System.out.println("Enter no of Cast");
			sc = new Scanner(System.in);
			int size = sc.nextInt();
		Movie movie = new Movie(1);
			if(size>0)
			{
			for(int i=0; i<size; i++)
			{
		CastDTO dto = new CastDTO();
			
			    System.out.println("Enter the Cast Details");
			    
				System.out.println("Enter the CastID");
					int CastId = sc.nextInt();
					dto.setCastId(CastId);
					
				System.out.println("Enter the CastName");
					String CastName = sc.next();
					dto.CastName(CastName);
				
					
				System.out.println("Enter the CastNo");
					long CastNo = sc.nextLong();
					dto.setCastNo(CastNo);
				
			boolean isadded = movie.createCast(dto);
			System.out.println(isadded);
			
			}
			
			movie.getCastByName("Smitha");
			movie.getCastById(1);
			movie.getCastByNo(8147);
			
			
			movie.getAllCastDetails();
			
			movie.updateCastNoByCastId(1,29008762); 
			movie.getAllCastDetails();
			
			}
		}
}
			
			

