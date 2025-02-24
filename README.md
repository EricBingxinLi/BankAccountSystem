Bank Account System GUI Application
A simple Java Swing-based GUI application that simulates basic bank account operations, allowing users to check their balance, deposit funds, withdraw money, and exit the system.

Features
Check Balance: Displays the current account balance.

Deposit Funds: Adds a specified amount to the account balance.

Withdraw Funds: Subtracts a specified amount from the account balance (if sufficient funds exist).

Exit: Closes the application.

Input Validation: Handles non-numeric input with error messages.

GUI Interface: Built using Java Swing with a clean GridLayout.

Installation
Prerequisites
Java Development Kit (JDK) 8 or later.

Steps
Clone the repository or download the source code file BankAccountSystem2Mode.java.

Compile the code:


javac BankAccountSystem2Mode.java
Run the application:


java BankAccountSystem2Mode
Usage
Enter an Amount:

Type a numeric value in the "Money (CAD)" text field for transactions.

Buttons:

CHECK YOUR BALANCE: Displays the current balance.

SAVE MONEY: Deposits the entered amount into the account.

WITHDRAW: Deducts the entered amount from the balance (if sufficient funds).

EXIT: Closes the application (requires a numeric input due to a known issue).

Error Handling:

Non-numeric inputs trigger a "Not a number" warning.

Insufficient funds during withdrawal display "Your balance is not enough."

Code Structure
Key Components
Class: BankAccountSystem2Mode

Variables:

balance: Tracks the account balance (starts at 0.0).

x: Temporary storage for user-inputted transaction amounts.

GUI Elements:

JFrame: Main application window.

JPanel with GridLayout: Organizes components into 5 rows and 2 columns.

JTextField: Input field for transaction amounts.

JLabels: Display instructions, balance, and error messages.

JButtons: Trigger deposit, withdrawal, balance check, and exit actions.

Event Handling
Check Balance: Updates the display with the current balance.

Deposit: Adds the input amount to balance.

Withdrawal: Subtracts the input amount from balance (checks for sufficiency).

Exit: Closes the app (requires numeric input due to a bug).

Known Issues
Withdrawal Allows Negative Balance:

The balance may go negative after a withdrawal, though a warning message appears.

Exit Requires Numeric Input:

The exit button erroneously requires a number in the text field.

Misleading Input Label:

The label "Money (CAD)" suggests an initial balance setup, but the field is used for transactions.

Layout Crowding:

The UI may appear cramped on smaller screens.

Contributing
Contributions are welcome! To improve this project:

Fork the repository.

Create a feature branch (git checkout -b feature/improvement).

Commit changes (git commit -m 'Add feature').

Push to the branch (git push origin feature/improvement).

Open a Pull Request.

License
This project is open-source and available under the MIT License.

Contact
For questions or feedback, please contact [Eric Li] at [ericbingxinli@gmail.com].

