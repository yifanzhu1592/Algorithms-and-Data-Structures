	Queue queue = new LinkedList();
	queue.add(2); // [2]
	queue.add(4); // [2,4]
	System.out.println(queue.peek()); // prints 2
	queue.add(5); // [2,4,5]
	queue.poll();
	System.out.println(queue); // prints [4,5]
