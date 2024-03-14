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

    int itemCount;
    cout << "Enter the number of items to add: ";
    cin >> itemCount;

    for (int i = 0; i < itemCount; ++i) {
        string name;
        int quantity;
        double price;

        cout << "Enter name of item " << i + 1 << ": ";
        cin.ignore(); // Clear the input buffer
        getline(cin, name);

        cout << "Enter quantity of item " << i + 1 << ": ";
        cin >> quantity;

        cout << "Enter price of item " << i + 1 << ": ";
        cin >> price;

        stockManager.addItem(name, quantity, price);
    }

    stockManager.displayStock();
}
