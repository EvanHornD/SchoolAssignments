/* CS2401: Lab 10
 *
 * Class PlayWithStacks:
 * In this file, you are given a BONUS activity: the implementation of 
 * a method that uses Stacks as defined in Stack.java.
 * This method, called evaluatePostFix, takes a String str as parameter
 * which represents a post-fix arithmetic expression and returns the numeric 
 * value of this expression
 */

public class PlayWithStacks {

	/* evaluatePostFix -- BONUS
	 * Takes a String str as parameter, which represents a post-fix arithmetic 
	 * expression and returns the numeric value of this expression
	 * Examples: 
	 * 	- String "3 4 +" represents the (infix) expression 3+4 
	 * 		and should be evaluated as 7
	 *  - String "16 5 - 3 +" represents the (infix) expression 16-5+3
	 *  	and should be evaluated as 14
	 */
	public static int evaluatePostFix(String postfixExpression) {
		Stack<String> stack = new Stack<String>();
		String currentString = "";
		for (int i = 0; i <= postfixExpression.length(); i++) {
			if(i==postfixExpression.length()||postfixExpression.charAt(i)==' '){
				addToStack(stack, currentString);
				currentString = "";
			} else {
				currentString+=postfixExpression.charAt(i);
			}
		}
		return Integer.parseInt((String)stack.pop());
	}

	private static void addToStack(Stack<String> stack,String currentString){
		if(!isOperator(currentString)){
			stack.push(currentString);
			return;
		}
		int operand1 = Integer.parseInt((String)stack.pop());
		int operand2 = Integer.parseInt((String)stack.pop());
		int result = performOperation(operand1, operand2, currentString);

		stack.push(""+result);
	}

	private static int performOperation(int operand1, int operand2, String operator){
		int result = 0;
		switch (operator) {
			case "+":
				result = operand2+operand1;
			break;
			case "-":
				result = operand2-operand1;
			break;
			case "*":
				result = operand2*operand1;
			break;
			case "/":
				result = operand2/operand1;
			break;
		}
		return result;
	}
	
	//helper methods
	public static boolean isOperator(String str) {
		return "+-*/".contains(str);
	}
	
	//helper methods
	public static boolean isOperand(String str) {
		return true;
	}
	
	public static void main(String[] args) {
		Stack<Integer> myStack = new Stack<Integer>();

		myStack.push(5);
		myStack.push(10);

		System.out.println(myStack.pop() + " has been popped from the stack.");

		myStack.push(25);
		System.out.println(myStack.peek() + " is at the top of the stack.");

		myStack.clear();

		System.out.println("Stack empty: " + myStack.isEmpty() );
		System.out.println(evaluatePostFix("100 200 + 2 / 5 * 7 +"));
		System.out.println(evaluatePostFix("100 200 + 2 / 5 *"));
	}
}
