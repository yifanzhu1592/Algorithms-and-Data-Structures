	// create a new stack
	Stack stack = new Stack();
	stack.push(new Integer(3)); // [3]
	stack.push(new Integer(5)); // [3,5]
	System.out.println(stack.peek()); // prints 5
	stack.push(new Integer(6)); // [3,5,6]
	int x = stack.pop();
	System.out.println(x); // prints 6
	System.out.println(stack); // prints [3,5]
