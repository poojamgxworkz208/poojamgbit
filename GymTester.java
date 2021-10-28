package com.xworkz.gymapp;

import java.util.*;

import com.xworkz.gymapp.dto.EquipmentDTO;

public class GymTester{

		private static Scanner sc;

		public static void main(String ar[]){
			System.out.println("Enter no of Equipments");
			sc = new Scanner(System.in);
			int size = sc.nextInt();
		Gym gym = new Gym(1);
			if(size>0)
			{
			for(int i=0; i<size; i++)
			{
		EquipmentDTO dto = new EquipmentDTO();
			
			    System.out.println("Enter the Equipment Details");
			    
				System.out.println("Enter the EquipmentID");
					int EquipmentId = sc.nextInt();
					dto.setEquipmentId(EquipmentId);
					
				System.out.println("Enter the EquipmentName");
					String EquipmentName = sc.next();
					dto.EquipmentName(EquipmentName);
				
					
				System.out.println("Enter the EquipmentNo");
					long EquipmentNo = sc.nextLong();
					dto.setEquipmentNo(EquipmentNo);
				
			boolean isadded = gym.createEquipment(dto);
			System.out.println(isadded);
			
			}
			
			gym.getEquipmentByName("Smith Machine");
			gym.getEquipmentById(1);
			gym.getEquipmentByNo(8147);
			
			
			gym.getAllEquipmentDetails();
			
			gym.updateEquipmentNoByEquipmentId(1,29008762); 
			gym.getAllEquipmentDetails();
			
			}
		}
}
			
			
