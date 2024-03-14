#include <iostream>
#include <vector>
#include <string>

using namespace std;

struct Task {
    string description;
    bool completed;
};

class TaskManager {
private:
    vector<Task> tasks;

public:
    void addTask(const string& description) {
        Task newTask = {description, false};
        tasks.push_back(newTask);
        cout<<"----------------------------------------------------------"<<endl;
        cout << "            Task added successfully." << endl;
        cout<<"----------------------------------------------------------"<<endl;
    }

    void markTaskAsCompleted(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            tasks[taskIndex].completed = true;
            cout<<"----------------------------------------------------------"<<endl;
            cout << "              Task marked as completed." << endl;
            cout<<"----------------------------------------------------------"<<endl;
        } else {
            cout << "Invalid task index." << endl;
        }
    }

    void deleteTask(int taskIndex) {
        if (taskIndex >= 0 && taskIndex < tasks.size()) {
            tasks.erase(tasks.begin() + taskIndex);
            cout<<"----------------------------------------------------------"<<endl;
            cout << "            Task deleted successfully." << endl;
            cout<<"----------------------------------------------------------"<<endl;
        } else {
            cout << "Invalid task index." << endl;
        }
    }

    void displayTasks() {
        if (tasks.empty()) {
            cout<<"----------------------------------------------------------"<<endl;
            cout << "              No tasks available." << endl;
            cout<<"----------------------------------------------------------"<<endl;
            return;
        }

        cout << "Tasks:" << endl;
        cout << "-------------------" << endl;
        cout << "Index\t3\tDescription\t\tStatus" << endl;
        for (size_t i = 0; i < tasks.size(); ++i) {
            cout << i << "\t" << tasks[i].description << "\t" << (tasks[i].completed ? "Completed" : "Pending") << endl;
        }
        cout << "-------------------" << endl;
    }
};

int main() {
    TaskManager taskManager;
    int choice;

    while (true) {
        cout << "\n<<<<<<<<<<<<<<<<Task Manager>>>>>>>>>>>>>>>>:" << endl;
        cout << "1. Add Task" << endl;
        cout << "2. Mark Task as Completed" << endl;
        cout << "3. Delete Task" << endl;
        cout << "4. Display Tasks" << endl;
        cout << "5. Exit" << endl;
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1: {
                string description;
                cout << "Enter task description: "<<endl;
                cin.ignore();
                getline(cin, description);
                taskManager.addTask(description);
                break;
            }
            case 2: {
                int taskIndex;
                cout << "Enter task index to mark as completed: "<<endl;
                cin >> taskIndex;
                taskManager.markTaskAsCompleted(taskIndex);
                break;
            }
            case 3: {
                int taskIndex;
                cout << "Enter task index to delete: ";
                cin >> taskIndex;
                taskManager.deleteTask(taskIndex);
                break;
            }
            case 4:
                taskManager.displayTasks();
                break;
            case 5:
                cout << "Exiting task manager." << endl;
                return 0;
            default:
                cout << "Invalid choice. Please try again." << endl;
                break;
        }
    }

    return 0;
}
