
#Standard Calculator

This Java Swing-based Standard Calculator application provides a basic arithmetic calculator with a clean and user-friendly interface. It allows users to perform fundamental arithmetic operations like addition, subtraction, multiplication, and division, along with other functionalities like clearing the screen, deleting the last entry, and entering decimal numbers.

## Features

- **Basic Arithmetic Operations**: Supports addition (`+`), subtraction (`-`), multiplication (`*`), and division (`/`).
- **Decimal Support**: Includes a button for entering decimal points.
- **Clear Function**: A `Clear` button to reset the input field.
- **Delete Function**: A `Delete` button to remove the last entered digit or character.
- **Responsive UI**: The calculator buttons and display are designed to be responsive and visually appealing with a bold font style.
- **Real-time Computation**: The calculator updates the display in real-time as you enter numbers and operators.

## Implementation Details

### Components
- **JFrame**: The main window (`frame`) of the application.
- **JTextField**: A non-editable text field (`textField`) that serves as the display or screen of the calculator.
- **JButtons**: Buttons for digits (`0-9`), arithmetic operations (`+`, `-`, `*`, `/`), and special functions like clear, delete, decimal point, and equal to (`=`).
- **JPanel**: A panel (`panel`) that holds the buttons in a grid layout to provide a structured and organized layout.

### Layout and Design
- The buttons are arranged in a 4x4 grid, where:
  - The first three rows contain the number buttons (`1-9`) and arithmetic operation buttons (`+`, `-`, `*`, `/`).
  - The last row includes the decimal point button, the `0` button, the division button, and the equal to (`=`) button.
  - Clear and delete buttons are placed at the bottom of the calculator for easy access.

### Action Listeners
- **Number Buttons**: Each number button appends its value to the text field when clicked.
- **Operation Buttons**: When an operation button is clicked, the first operand is stored, and the operation is noted. The display is cleared for the next input.
- **Equal Button**: Computes the result of the operation based on the stored operand and the current input, then displays the result.
- **Clear Button**: Clears the entire input field.
- **Delete Button**: Removes the last character from the input field.

### Additional Features
- The calculator includes a custom icon.
- The font is set to bold and large to enhance readability.

## How to Run
1. Ensure you have Java installed on your system.
2. Clone this repository and navigate to the project directory.
3. Compile the `StandardCalculator.java` file.
4. Run the compiled class file to launch the calculator.

```bash
javac StandardCalculator.java
java StandardCalculator
```

---

This description provides a comprehensive overview of your calculator application, highlighting the key features and explaining the implementation details.
