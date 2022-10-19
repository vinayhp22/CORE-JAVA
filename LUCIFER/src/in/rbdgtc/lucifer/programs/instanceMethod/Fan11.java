package in.rbdgtc.lucifer.programs.instanceMethod;

public class Fan11 {
	
		public double price;
		public int noOfWings;
		public String material;
		public String brand;
		public int productRating;

		public String[] category;
		public String[] brands;
		public String[] seller;
		public boolean[] energySaving;

		public Fan11(double price, int noOfWings, String material, String brand, int productRating, String[] category, String[] brands, String[] seller, boolean[] energySaving)
		{
			this.price=price;
			this.noOfWings=noOfWings;
			this.material=material;
			this.brand=brand;
			this.productRating=productRating;
			
			this.category=category;
			this.brands=brands;
			this.seller=seller;
			this.energySaving=energySaving;
		}
		public void display()
		{
			System.out.println("class fan started");
			System.out.println(this.price);
			System.out.println(this.noOfWings);
			System.out.println(this.material);
			System.out.println(this.brand);
			System.out.println(this.productRating);
			
			
			 for (int i = 0; i < category.length; i++) {
				 System.out.println(category[i]);
			
			}
			 for (int i = 0; i < brands.length; i++) {
				System.out.println(brands[i]);
				
			}
			 for (int i = 0; i < seller.length; i++) {
				System.out.println(seller[i]);
				
			}
			 
			 for(int i =0; i<energySaving.length; i++ )
			 {
				 System.out.println(energySaving[i]);
			 }
		}
	}

