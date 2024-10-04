package brandingsystem;

public class Branding {

	public static void main(String[] args) {
		 // Define an array of product names for branding
        String[] products = {"Laptop", "Smartphone", "Tablet", "Smartwatch", "Headphones"};

        // Define a base brand name
        String brandName = "TechCorp";

        // Use a for loop to generate branded labels for each product
        for (int i = 0; i < products.length; i++) {
            // Generate a unique identifier for the product
            String uniqueID = "ID" + (i + 1) + "2024";

            // Create the branding label
            String brandedLabel = brandName + " " + products[i] + " - " + uniqueID;

            // Display the branded label
            System.out.println(brandedLabel);
        }
    }









	}


