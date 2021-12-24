package com.xworkz.javaequalsapp;


	import java.util.LinkedHashSet;
	import java.util.Optional;
	import java.util.Set;
	
	import com.xworkz.javaequalsapp.ProductDTO;
	public class Product {
		public static void main(String[] args) {
			
			ProductDTO dto = new ProductDTO(1, "Acer", "Laptop", 30000.00, 1);
			ProductDTO dto1 = new ProductDTO(2, "Moto", "Cell", 25000.00, 2);
			ProductDTO dto2 = new ProductDTO(3, "Lakme", "Cosmetics", 1000.00, 10);
			ProductDTO dto3 = new ProductDTO(4, "LG", "Fridge", 60000.00, 1);
			ProductDTO dto4 = new ProductDTO(5, "Usha", "Fan", 10000.00, 1);
			ProductDTO dto5 = new ProductDTO(6, "Realme", "Mobile", 15000.00, 3);
			
			Set<ProductDTO> dtos = new LinkedHashSet<ProductDTO>();
			dtos.add(dto5);
			dtos.add(dto3);
			dtos.add(dto2);
			dtos.add(dto4);
			dtos.add(dto);
			dtos.add(dto1);
			
			boolean b = dto.equals(dto1);
			System.out.println(b);
			
			Optional<ProductDTO> optional = dtos.stream().filter((d)->d.getPrice()>10000.0).findFirst();
			System.out.println(dtos.size());
			System.out.println(optional);
		}
	}
