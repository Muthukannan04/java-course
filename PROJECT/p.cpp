#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define MAX_PRODUCTS 100
#define MAX_NAME_LENGTH 50

struct Product {
    char name[MAX_NAME_LENGTH];
    double price;
    int quantity;
};

struct GroceryStore {
    struct Product inventory[MAX_PRODUCTS];
    struct Product cart[MAX_PRODUCTS];
    int inventory_count;
    int cart_count;
};

void addProduct(struct GroceryStore* store, const char* name, double price, int quantity) {
    if (store->inventory_count < MAX_PRODUCTS) {
        strcpy(store->inventory[store->inventory_count].name, name);
        store->inventory[store->inventory_count].price = price;
        store->inventory[store->inventory_count].quantity = quantity;
        store->inventory_count++;
        printf("Product added to inventory.\n");
    } else {
        printf("Inventory full. Cannot add more products.\n");
    }
}

void addProductByAdmin(struct GroceryStore* store, const char* name, double price, int quantity) {
    if (store->inventory_count < MAX_PRODUCTS) {
        strcpy(store->inventory[store->inventory_count].name, name);
        store->inventory[store->inventory_count].price = price;
        store->inventory[store->inventory_count].quantity = quantity;
        store->inventory_count++;
        printf("Product added to inventory by admin.\n");
    } else {
        printf("Inventory full. Cannot add more products.\n");
    }
}

void displayInventory(struct GroceryStore* store) {
    printf("Available Products:\n");
    printf("-------------------\n");
    printf("Name\tPrice\tQuantity\n");
    for (int i = 0; i < store->inventory_count; ++i) {
        printf("%s\t$%.2f\t%d\n", store->inventory[i].name, store->inventory[i].price, store->inventory[i].quantity);
    }
    printf("-------------------\n");
}

// Functions addToCart, removeFromCart, displayCart, and generateBill would be implemented similarly...

int main() {
    struct GroceryStore store;
    store.inventory_count = 0;
    store.cart_count = 0;

    addProduct(&store, "Apple", 1.99, 50);
    addProduct(&store, "Banana", 0.99, 70);
    addProduct(&store, "Milk", 2.49, 30);

    int role;
    printf("Enter 1 for Buyer, 2 for Admin: ");
    scanf("%d", &role);

    if (role == 1) { // Buyer
        // Buyer functionality
    } else if (role == 2) { // Admin
        char choice[10];
        do {
            char productName[MAX_NAME_LENGTH];
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
