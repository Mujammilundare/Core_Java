/*
	Lab: 8
	objective: Create User define packages.
*/

package net;
import  com.*;

public class TestDate
{
	public static void main(String arg[])
	{
		MyDate.day = 23;
		MyDate.month = 7; 
		MyDate.year = 2012;

		MyDate.showDate();
	}
}