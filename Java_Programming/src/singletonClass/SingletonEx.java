package singletonClass;

import java.io.*;
import java.util.*;
public class SingletonEx 
{
	public static void main(String[] args) 
	{
		Singleton ex=Singleton.getInstance();
		ex.getInfo();

	}

}