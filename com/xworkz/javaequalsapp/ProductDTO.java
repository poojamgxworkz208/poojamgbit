package com.xworkz.javaequalsapp;



	import java.io.Serializable;
	import java.util.Objects;

	public class ProductDTO implements Serializable{

		private Integer id;
		private String name;
		private String type;
		private Double price;
		private Integer quantity;
		
		public ProductDTO() {
			
		}

		public ProductDTO(Integer id, String name, String type, Double price, Integer quantity) {
			super();
			this.id = id;
			this.name = name;
			this.type = type;
			this.price = price;
			this.quantity = quantity;
		}

		@Override
		public int hashCode() {
			return Objects.hash(name);
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj != null) {
				if(obj instanceof ProductDTO) {
					ProductDTO dto = (ProductDTO) obj;
					if(this.getName().equals(dto.getName())) {
						System.out.println("Name is same "+getName());
						return true;
					}else {
						return false;
					}
				}
			}
			return true;
		}
		
		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public Integer getQuantity() {
			return quantity;
		}

		public void setQuantity(Integer quantity) {
			this.quantity = quantity;
		}

		@Override
		public String toString() {
			return "ProductDTO [id=" + id + ", name=" + name + ", type=" + type + ", price=" + price + ", quantity="
					+ quantity + "]";
		}
		
		
	}

