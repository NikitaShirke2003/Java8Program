package com.csi.jdkfeatures;

import java.util.StringJoiner;

public class StreamJoinerEx {
	public static void main(String[] args) {

		StringJoiner joiner = new StringJoiner(" $ ");

		joiner.add("TCS");
		joiner.add("CSI");
		joiner.add("WIPRO");

		System.out.println(joiner);
	}

}
