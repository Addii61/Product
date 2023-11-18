# Online Marketplace - Java Project

This repository contains a Java application representing an online marketplace that connects buyers and sellers. The project utilizes inheritance to create a flexible and extensible structure for handling different product categories.

## Features

- Implemented base class `Product` and derived classes `Electronics`, `Clothing`, and `Books`.
- Each product category has its specific attributes and methods.
- Includes methods for displaying product information according to their category.

## Usage

To run the application:
1. Clone this repository to your local machine.
2. Open the project in your Java IDE (e.g., IntelliJ IDEA, Eclipse, or NetBeans).
3. Locate the `Testproducts` class in the `testproducts` package.
4. Run the `main()` method within `Testproducts` to see sample product information displayed.

Feel free to explore the codebase, modify it, or extend it as needed for your specific requirements.

## Project Structure

The project is structured as follows:

- `products.java`: Contains the base `Product` class with basic product attributes and methods.
- `Electronics.java`, `Clothing.java`, `Books.java`: Derived classes extending `Product`, representing specific product categories.
- `Testproducts.java`: Main class to instantiate objects of different product categories and display their information.

## Folder Structure

│ README.md
│ .gitignore
└───src
└───testproducts
│ products.java
│ Electronics.java
│ Clothing.java
│ Books.java
│ Testproducts.java
## Contributing

Contributions are welcome! If you have any suggestions, improvements, or bug fixes, please create a pull request or open an issue.
