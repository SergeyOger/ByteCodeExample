package com.zmex.byteCodeExample;
import com.zmex.byteCodeExample.user.User;

class ByteCodeExample {
	public static void main(String[] args) {
		System.out.println("Hello byte");
		printForCycle();
User user = new User("name", 26, "email");
		System.out.println(user.getUserName());

	}

public static void printForCycle() {
	for (int i = 0; i < 20; i++) {
		System.out.println(i);
	}
}

}