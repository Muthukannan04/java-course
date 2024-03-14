#include <iostream>
#include <vector>
#include <string>

using namespace std;

struct StockItem {
    string name;
    int quantity;
    double price;
};

class StockManager {
private:
    vector<StockItem> stock;

public:
    void addItem(const string& itemName, int itemQuantity, double itemPrice) {
        StockItem newItem;
        newItem.name = itemName;
        newItem.quantity = itemQuantity;
        newItem.price = itemPrice;

        stock.push_back(newItem);
        cout << "Item added successfully." << endl;
    }

    void displayStock() {
        cout << "Stock List:" << endl;
        for (const StockItem& item : stock) {
            cout << "Name: " << item.name << ", Quantity: " << item.quantity << ", Price: $" << item.price << endl;
        }
    }
};

int main() {
    StockManager stockManager;

    stockManager.addItem("Product1", 50, 20.99);
    stockManager.addItem("Product2", 30, 15.49);
    stockManager.addItem("Product3", 90, 23.49);

    stockManager.displayStock();
}
