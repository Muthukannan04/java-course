#include <iostream>
#include <vector>
#include <string>
#include <iomanip>

using namespace std;

struct Product {
    string name;
    double price;
    int quantity;
};

class GroceryStore {
private:
    vector<Product> inventory;
    vector<Product> cart;

public:
    void addProduct(const string& name, double price, int quantity) {
        Product newProduct = {name, price, quantity};
        inventory.push_back(newProduct);
        cout << "Product added to inventory." << endl;
    }

    void addProductByAdmin(const string& name, double price, int quantity) {
        Product newProduct = {name, price, quantity};
        inventory.push_back(newProduct);
        cout << "Product added to inventory by admin." << endl;
    }

    void displayInventory() {
        cout << "Available Products:" << endl;
        cout << "-------------------" << endl;
        cout << "Name\tPrice\tQuantity" << endl;
        for (const auto& product : inventory) {
            cout << product.name << "\t$" << product.price << "\t" << product.quantity << endl;
        }
        cout << "-------------------" << endl;
    }

    void addToCart(const string& name, int quantity) {
        for (auto& product : inventory) {
            if (product.name == name && product.quantity >= quantity) {
                Product purchasedProduct = {product.name, product.price, quantity};
                cart.push_back(purchasedProduct);
                product.quantity -= quantity;
                cout << "Added to cart: " << purchasedProduct.name << "\tQuantity: " << quantity << endl;
                return;
            }
        }
        cout << "Product not available or insufficient quantity." << endl;
    }

    void removeFromCart(const string& name, int quantity) {
        for (auto& product : cart) {
            if (product.name == name && product.quantity >= quantity) {
                product.quantity -= quantity;
                cout << "Removed from cart: " << product.name << "\tQuantity: " << quantity << endl;
                return;
            }
        }
        cout << "Product not in cart or insufficient quantity." << endl;
    }

    void displayCart() {
        if (cart.empty()) {
            cout << "Cart is empty." << endl;
            return;
        }
        cout << "Your Cart:" << endl;
        cout << "-------------------" << endl;
        for (const auto& product : cart) {
            cout << "Name: " << product.name << "\tPrice: $" << product.price << "\tQuantity: " << product.quantity << endl;
        }
        cout << "-------------------" << endl;
    }

    void generateBill() {
        double totalCost = 0.0;
        cout << "Bill:" << endl;
        cout << "-------------------" << endl;
        for (const auto& product : cart) {
            double productCost = product.price * product.quantity;
            totalCost += productCost;
            cout << "Name: " << product.name << "\tPrice: $" << product.price << "\tQuantity: " << product.quantity << "\tCost: $" << productCost << endl;
        }
        cout << "-------------------" << endl;
        cout << "Total Cost: $" << fixed << setprecision(2) << totalCost << endl;
    }
};

int main() {
    GroceryStore store;

    store.addProduct("Apple", 1.99, 50);
    store.addProduct("Banana", 0.99, 70);
    store.addProduct("Milk", 2.49, 30);

    int role;
    cout << "Enter 1 for Buyer, 2 for Admin: ";
    cin >> role;

    if (role == 1) { // Buyer
        int choice;
        do {
            cout << "\n1. Display Available Products\n2. Add to Cart\n3. Remove from Cart\n4. Display Cart\n5. Generate Bill\n6. Exit\n";
            cout << "Enter your choice: ";
            cin >> choice;

            switch (choice) {
                case 1:
                    store.displayInventory();
                    break;
                case 2: {
                    string productName;
                    int quantity;
                    cout << "Enter product name and quantity to add to cart: ";
                    cin >> productName >> quantity;
                    store.addToCart(productName, quantity);
                    break;
                }
                case 3: {
                    string productName;
                    int quantity;
                    cout << "Enter product name and quantity to remove from cart: ";
                    cin >> productName >> quantity;
                    store.removeFromCart(productName, quantity);
                    break;
                }
                case 4:
                    store.displayCart();
                    break;
                case 5:
                    store.generateBill();
                    break;
                case 6:
                    cout << "Exiting...";
                    break;
                default:
                    cout << "Invalid choice. Please try again." << endl;
                    break;
            }
        } while (choice != 6);
    } else if (role == 2) { // Admin
        string choice;
        do {
            string productName;
            double price;
            int quantity;

            cout << "Enter product name, price, and quantity to add: ";
            cin >> productName >> price >> quantity;
            store.addProductByAdmin(productName, price, quantity);

            cout << "Do you want to add more items? (yes/no): ";
            cin >> choice;
        } while (choice == "yes");
    } else {
        cout << "Invalid role." << endl;
    }

    return 0;
}
