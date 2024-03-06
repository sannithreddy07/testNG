package com.dataprovider;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Dataprowithdatatypes {

	//single dimension array
	
//	@Test(dataProvider="test1")
//	public void m1(Object sr) {
//		System.out.println(sr);
//	}
//	
//	@DataProvider(name="test1")
//	public Object[] m2() {
//		Object[] s= {"rip",123,"cat",'A'};
//		return s;
//	}
	
	//two-dimension array (same number of rows and coloumns
	
//	@Test(dataProvider="test1")
//	public void m1(Object[] sr) {
//		System.out.println(sr[0]+"  "+sr[1]);
//	}
//	
//	@DataProvider(name="test1")
//	public Object[][] m2() {
//		Object[][] s= {{"rip",123},{"cat",'A'}};
//		return s;
//	}
	
	//two-dimension jagged array different number of coloumns

//	@Test(dataProvider="test1")
//	public void m1(Object[] sr) {
//		for (int i = 0; i < sr.length; i++) {
//			System.out.println(sr[i]);
//		}
//	//	System.out.println(Arrays.toString(sr));
//	}
//	
//	@DataProvider(name="test1")
//	public Object[][] m2() {
//		Object[][] s= {{"rip",123},{"cat",'A',123}};
//		return s;
//	}
	
	
	//Using collections but convert the collections to iterator Object as return type then the test method will read data of dataprovider 
	
	
//	@Test(dataProvider="test1")
//	public void m1(Object sr) {
//		System.out.println(sr);
//	}
//	@DataProvider(name="test1")
//	public Iterator <Object>m2() {
//	List<Object> ls=new ArrayList<Object>();
//	ls.add("apple");
//	ls.add(123);
//	ls.add('A');
//	ls.add(null);
//	
//		return ls.iterator();
//	}
	
//	@Test(dataProvider="test1")
//	public void m1(Object sr) {
//		System.out.println(sr);
//	}
//	@DataProvider(name="test1")
//	public Iterator <Object>m2() {
//	Set<Object> ls=new HashSet<Object>();
//	ls.add("apple");
//	ls.add(123);
//	ls.add('A');
//	ls.add("apple"); //duplication is not allowed so it will consider only 3 sets of data fro test method
//	
//		return ls.iterator();
//	}
	@Test(dataProvider="test1")
	public void m1(Object[] sr) {
		//System.out.println(sr[0]+ "  "+sr[1])
		for (int i = 0; i < sr.length; i++) {
			System.out.println(sr[i]);
			
		}
	}
	@DataProvider(name="test1")
	public Iterator <Object>m2() {
	Set<Object> ls=new HashSet<Object>();
	ls.add(new Object[] {"ball", "cat"});
	ls.add(new Object[] {"balls", "cats",123});
	
	
		return ls.iterator();
	
	}
}
