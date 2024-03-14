#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_PRODUCTS 100

struct Product {
    char name[50];
    double price;
    int quantity;
};

struct GroceryStore {
    struct Product inventory[MAX_PRODUCTS];
    struct Product cart[MAX_PRODUCTS];
    int inventoryCount;
    int cartCount;
};

void addProduct(struct GroceryStore *store, const char *name, double price, int quantity) {
    if (store->inventoryCount < MAX_PRODUCTS) {
        struct Product newProduct = {0};
        strcpy(newProduct.name, name);
        newProduct.price = price;
        newProduct.quantity = quantity;
        store->inventory[store->inventoryCount++] = newProduct;
        printf("Product added to inventory.\n");
    } else {
        printf("Inventory is full, cannot add more products.\n");
    }
}

void addProductByAdmin(struct GroceryStore *store, const char *name, double price, int quantity) {
    if (store->inventoryCount < MAX_PRODUCTS) {
        struct Product newProduct = {0};
        strcpy(newProduct.name, name);
        newProduct.price = price;
        newProduct.quantity = quantity;
        store->inventory[store->inventoryCount++] = newProduct;
        printf("Product added to inventory by admin.\n");
    } else {
        printf("Inventory is full, cannot add more products.\n");
    }
}

void displayInventory(const struct GroceryStore *store) {
    printf("Available Products:\n");
    printf("-------------------\n");
    printf("Name\tPrice\tQuantity\n");
    for (int i = 0; i < store->inventoryCount; ++i) {
        printf("%s\t$%.2f\t%d\n", store->inventory[i].name, store->inventory[i].price, store->inventory[i].quantity);
    }
    printf("-------------------\n");
}

void addToCart(struct GroceryStore *store, const char *name, int quantity) {
    for (int i = 0; i < store->inventoryCount; ++i) {
        if (strcmp(store->inventory[i].name, name) == 0 && store->inventory[i].quantity >= quantity) {
            struct Product purchasedProduct = store->inventory[i];
            purchasedProduct.quantity = quantity;
            store->cart[store->cartCount++] = purchasedProduct;
            store->inventory[i].quantity -= quantity;
            printf("Added to cart: %s\tQuantity: %d\n", purchasedProduct.name, quantity);
            return;
        }
    }
    printf("Product not available or insufficient quantity.\n");
}

void removeFromCart(struct GroceryStore *store, const char *name, int quantity) {
    for (int i = 0; i < store->cartCount; ++i) {
        if (strcmp(store->cart[i].name, name) == 0 && store->cart[i].quantity >= quantity) {
            store->cart[i].quantity -= quantity;
            printf("Removed from cart: %s\tQuantity: %d\n", store->cart[i].name, quantity);
            return;
        }
    }
    printf("Product not in cart or insufficient quantity.\n");
}

void displayCart(const struct GroceryStore *store) {
    if (store->cartCount == 0) {
        printf("Cart is empty.\n");
        return;
    }
    printf("Your Cart:\n");
    printf("-------------------\n");
    for (int i = 0; i < store->cartCount; ++i) {
        printf("Name: %s\tPrice: $%.2f\tQuantity: %d\n", store->cart[i].name, store->cart[i].price, store->cart[i].quantity);
    }
    printf("-------------------\n");
}

void generateBill(const struct GroceryStore *store) {
    double totalCost = 0.0;
    printf("Bill:\n");
    printf("-------------------\n");
    for (int i = 0; i < store->cartCount; ++i) {
        double productCost = store->cart[i].price * store->cart[i].quantity;
        totalCost += productCost;
        printf("Name: %s\tPrice: $%.2f\tQuantity: %d\tCost: $%.2f\n", store->cart[i].name, store->cart[i].price, store->cart[i].quantity, productCost);
    }
    printf("-------------------\n");
    printf("Total Cost: $%.2f\n", totalCost);1
    
}

int main() {
    struct GroceryStore store = {0};

    addProduct(&store, "Apple", 1.99, 50);
    addProduct(&store, "Banana", 0.99, 70);
    addProduct(&store, "Milk", 2.49, 30);

    int role;
    printf("Enter 1 for Buyer, 2 for Admin: ");
    scanf("%d", &role);

    if (role == 1) { // Buyer
        int choice;
        do {
            printf("\n1. Display Available Products\n2. Add to Cart\n3. Remove from Cart\n4. Display Cart\n5. Generate Bill\n6. Exit\n");
            printf("Enter your choice: ");
            scanf("%d", &choice);

            switch (choice) {
                case 1:
                    displayInventory(&store);
                    break;
                case 2: {
                    char productName[50];
                    int quantity;
                    printf("Enter product name and quantity to add to cart: ");
                    scanf("%s %d", productName, &quantity);
                    addToCart(&store, productName, quantity);
                    break;
                }
                case 3: {
                    char productName[50];
                    int quantity;
                    printf("Enter product name and quantity to remove from cart: ");
                    scanf("%s %d", productName, &quantity);
                    removeFromCart(&store, productName, quantity);
                    break;
                }
                case 4:
                    displayCart(&store);
                    break;
                case 5:
                    generateBill(&store);
                    break;
                case 6:
                    printf("Exiting...");
                    break;
                default:
                    printf("Invalid choice. Please try again.\n");
                    break;
            }
        } while (choice != 6);
    } else if (role == 2) { // Admin
        char choice[4];
        do {
            char productName[50];
            double price;
            int quantity;

            printf("Enter product name, price, and quantity to add: ");
            scanf("%s %lf %d", productName, &price, &quantity);
            addProductByAdmin(&store, productName, price, quantity);

            printf("Do you want to add more items? (yes/no): ");
            scanf("%s", choice);
        } while (strcmp(choice, "yes") == 0);
    } else {
        printf("Invalid role.\n");
    }

    return 0;
}
