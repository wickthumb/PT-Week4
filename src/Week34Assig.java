import java.util.ArrayList;
import java.util.List;

public class Week34Assig {
	
	
	public static int firstMinusLast (int [] arr) {
		return (arr[arr.length-1]-arr[0]);
	}
	
	public static int[] addToArray (int [] arr, int newAge) {
		int [] agesNew = new int[(arr.length+1)]; {
		for(int i = 0; i < arr.length; i++) {
			agesNew[i] = arr[i];
			}		
		agesNew[arr.length] = newAge;
		};
		return agesNew;
	}
	
	public static int aveAgeFromArr (int [] arr) {
		int sumAges = 0;
		for (int age:arr) {
			sumAges+=age;
		};
		return sumAges/arr.length;
	}
	
	public static Double aveLetterInName (List<String> lst) {
		Double sumAges = 0.0;
		for (String name:lst) {
			StringBuilder nm = new StringBuilder();
			nm.append(name);
			Double len = (double) nm.length();
			sumAges+=len;
		};
		return sumAges/lst.size();
	}
	
	public static String concatNames (List<String> lst) {
		StringBuilder conName = new StringBuilder();
		for (String name: lst) {
			conName.append(name);
			conName.append(" ");
		}
		return conName.toString();
	}
	
	public static String concatWord (String word, int reps) {
		StringBuilder cW = new StringBuilder();
		for(int i = 0; i < reps; i++) {
			cW.append(word);
		}
		return cW.toString();
	}
	
	public static String fullName (String first, String last) {
		StringBuilder fName = new StringBuilder();
		fName.append(first);
		fName.append(" ");
		fName.append(last);
		return fName.toString();
	}
	
	public static Boolean sumArray (List<Integer> lstI) {
		int sumAr = 0;
		for(int in: lstI) {
			sumAr += in;
		}
		if (sumAr>100) {
			return true;
		}else {
			return false;
		}
	}
	
	public static Double aveDouble (List<Double> dArr) {
		Double sumD = 0.0;
		for (Double dub: dArr) {
			sumD += dub;
		}
		Double aveD = sumD / dArr.size();
		return aveD;
	}
	
	public static Boolean compareArrDouble (List<Double> lst1, List<Double> lst2) {
		Double ave1 = aveDouble(lst1);
		Double ave2 = aveDouble(lst2);
		Boolean si = (ave1>ave2);
		return si;
		
	}
	
	public static Boolean willBuyDrink (Boolean temp, Double cash) {
		if (temp == true && cash > 10.50) {
			return true;
		} else {
			return false;
		}
	}
	
	public static Double areaOfTri (Double b, Double h) {
		Double areaTri = (b/2)*h;
		return areaTri;
	}

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		System.out.println("WEEK 3&4 project");
		
		
		//1A
		System.out.println("");
		System.out.println("---1A---");
		int [] ages = {3,9,22,64,2,8,28,93};
		int a = firstMinusLast(ages);
		System.out.println("First minus last index: " + a);
		
		//1B
		System.out.println("");
		System.out.println("---1B---");
		int ageToAdd = 33;
		int [] ages2 = addToArray(ages,ageToAdd);
		System.out.println("Age Added: "+ ageToAdd);
		System.out.println("First minus last index: " + firstMinusLast(ages2));
		
		//1C
		System.out.println("");
		System.out.println("---1C---");
		int aveA = aveAgeFromArr (ages2);
		System.out.println("Average age of new array: " + aveA);
		
		//2A
		System.out.println("");
		System.out.println("---2A---");
		List<String> names = new ArrayList<String>();
		names.add("Sam");
		names.add("Tommy");
		names.add("Tim");
		names.add("Sally");
		names.add("Buck");
		names.add("Bob");
		Double aveLetter = aveLetterInName(names);
		System.out.println(aveLetter);
		
		//2B 
		System.out.println("");
		System.out.println("---2B---");
		String concatedNames = concatNames(names);
		System.out.println(concatedNames);
		
		//3. How do you access the last element of any array?
		System.out.println("");
		System.out.println("---3---");
		String lastElement = names.get(names.size()-1);
		System.out.println(lastElement);
		System.out.println("names.get(names.size()-1)");
		
		//4. How do you access the first element of any array?
		System.out.println("");
		System.out.println("---4---");
		String firstElement = names.get(0);
		System.out.println(firstElement);
		System.out.println("names.get(0)");
		
		//5.	Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
		System.out.println("");
		System.out.println("---5---");
		List<Integer> nameLengths = new ArrayList<Integer>();
		for (String name: names) {
			StringBuilder strName = new StringBuilder();
			strName.append(name);
			int nameLen = strName.length();
			nameLengths.add(nameLen);
		}
		System.out.println(nameLengths);
		
		//6.	Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
		System.out.println("");
		System.out.println("---6---");
		int sumOfSums = 0;
		for(int sum : nameLengths) {
			sumOfSums += sum;
		}
		System.out.println(sumOfSums);
		
		//7.	Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I expect the method to return “HelloHelloHello”).
		System.out.println("");
		System.out.println("---7---");
		String wordToCon = "Hello";
		int reps = 3;
		String repWord = concatWord(wordToCon, reps);
		System.out.println(repWord);
		
		//8.	Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
		System.out.println("");
		System.out.println("---8---");
		String first = "Steven";
		String last = "Brown";
		String fulName = fullName(first, last);
		System.out.println(fulName);
		
		//9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
		System.out.println("");
		System.out.println("---9---");
		List<Integer> arrInt = new ArrayList<Integer>();
		arrInt.add(5);
		arrInt.add(95);
		Boolean ifGE100 = sumArray(arrInt);
		System.out.println(ifGE100);
		
		//10.Write a method that takes an array of double and returns the average of all the elements in the array.
		System.out.println("");
		System.out.println("---10---");
		List<Double> dLst = new ArrayList<Double>();
		dLst.add(9.99);
		dLst.add(8.44);
		Double averageDouble = aveDouble(dLst);
		System.out.println(averageDouble);
		
		//11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
		System.out.println("");
		System.out.println("---11---");
		List<Double> dLst2 = new ArrayList<Double>();
		dLst2.add(2.00);
		dLst2.add(4.20);
		Boolean boolLstsDoubles = compareArrDouble(dLst, dLst2);
		System.out.println(boolLstsDoubles);
		
		//12.	Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
		System.out.println("");
		System.out.println("---12---");
		Boolean isHotOutside = false;
		Double moneyInPocket = 10.51;
		Boolean drinkPurchaseStatus = willBuyDrink(isHotOutside, moneyInPocket);
		System.out.println(drinkPurchaseStatus);
		
		
		//13.	Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
		System.out.println("");
		System.out.println("---13---");
		//1/2 base*height
		Double base = 2.4;
		Double height = 3.6;
		Double area = areaOfTri(base,height);
		System.out.println(area);
		//This method finds the area of a triangle... this was the first thing that came to mind because my wife is refreshing her basic
		//math skills during her down time at work. She asked me today if I remember how to find the area of basic shapes.
		//I had forgot how to find the area of a triangle! Now... I do not have to remember.
		
		
	}
	}
