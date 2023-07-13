package main;
import inventory.Product;
import inventory.Inventory;
import inventory.Warehouse;
public class Main {
    public static void main(String[] args) {
Product product = new Product();
product.productId = 100;
product.productName = "laptop";
product.price = 120.00;

Inventory inventory = new Inventory();
inventory.product = product;
inventory.quantity = 5;

Warehouse warehouse = new Warehouse();
warehouse.warehouseId = 1;
warehouse.warehouseName = "Main Warehouse";
warehouse.inventories = "Placeholder";

System.out.println("Product ID: " + inventory.product.productId + ", Name: " + inventory.product.productName + ", Price: " + inventory.product.price);
System.out.println("Inventory Quantity: " + inventory.quantity);
System.out.println("Warehouse ID: " + warehouse.warehouseId + ", Name: " + warehouse.warehouseName);
    }
}
