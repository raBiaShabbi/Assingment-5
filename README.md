Standard Calculator and Scientific Calculatlor

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

This Java program implements a comprehensive Scientific Calculator with a graphical user interface (GUI) built using Swing. The calculator is designed to handle a variety of arithmetic, trigonometric, logarithmic, power, and statistical operations.

### Key Features:

- **Arithmetic Operations**: Supports basic operations like addition, subtraction, multiplication, division, and modulus.
- **Trigonometric Functions**: Includes standard functions like sine, cosine, and tangent, along with their inverse functions.
- **Logarithmic Functions**: Handles both base-10 logarithm (`log`) and natural logarithm (`ln`), as well as the exponential constant (`e`).
- **Power and Root Functions**: Includes power (`^`) and square root (`√`) operations.
- **Statistical Functions**: Provides the ability to calculate statistical values like mean (`μ`), median (`M`), mode (`Mo`), and standard deviation (`σ`).
- **Special Constants**: Allows easy access to mathematical constants like π (pi) and e (Euler's number).
- **User Interface**: The UI is structured using a `GridLayout` with buttons organized for ease of use. The display is a non-editable text field that shows the user input and results.

### Functionality:

1. **Number Input**: The calculator allows for numeric input via buttons (`0-9`) and supports decimal input.
2. **Clear and Delete**: The `C` button clears the entire input, while the `D` button deletes the last digit entered.
3. **Operations Handling**: 
   - Arithmetic operations are handled by storing the first number and the selected operator, then applying the operation when the equal (`=`) button is pressed.
   - Trigonometric and logarithmic functions are processed similarly, with results displayed in the text field.
   - The power and root functions are applied directly to the entered numbers.
   - Statistical functions calculate the desired statistical value based on the input sequence and display the result.

4. **Action Listeners**: Each button is equipped with an action listener that defines its behavior, ensuring that all operations and inputs are handled correctly.

### Design and Usability:

- The calculator interface is intuitive, with buttons that are easy to identify and use.
- The layout is clean and organized, making the application user-friendly.
- The calculator is capable of handling a wide range of mathematical calculations, making it suitable for both basic and advanced users.

This program provides a robust and flexible calculator with a broad range of functionalities, making it an essential tool for users who need to perform scientific calculations.
