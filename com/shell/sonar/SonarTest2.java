package com.shell.sonar;

public class SonarTest2 {
public static void main(String[] args) {
	SonarTest2 test=new SonarTest2();
	test.mymethod(2,3);
	System.out.println("after method execution");
}
int mymethod(int i,int j)
{
	return i+j;
	}
}
