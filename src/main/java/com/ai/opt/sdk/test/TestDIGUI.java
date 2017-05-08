package com.ai.opt.sdk.test;

public class TestDIGUI {
	public String reverse(String str) {
        if ((null == str) || (str.length()  <= 1)) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
	public static void main(String[] args) {
		System.out.println(new TestDIGUI().reverse("123456"));
		System.out.println("abcde".charAt(0));
	}
}
