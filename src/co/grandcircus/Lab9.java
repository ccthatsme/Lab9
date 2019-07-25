package co.grandcircus;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Lab9 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Map<String, Double> food = new HashMap<>();
		ArrayList<String> foodOrder = new ArrayList<>();
		ArrayList<Double> foodPrice = new ArrayList<>();

		food.put("apple", 0.99);
		food.put("banana", 0.59);
		food.put("cauliflower", 1.59);
		food.put("dragonfruit", 2.19);
		food.put("elderberry", 1.79);
		food.put("figs", 2.09);
		food.put("grapefruit", 1.99);
		food.put("honeydew", 3.49);



		ArrayList<Double> priceList = new ArrayList<>();
		priceList.add(0, 0.99);
		priceList.add(1, 0.59);
		priceList.add(2, 1.59);
		priceList.add(3, 2.19);
		priceList.add(4, 1.79);
		priceList.add(5, 2.09);
		priceList.add(6, 1.99);
		priceList.add(7, 3.49);
		String order = " ";
		int index = 0;
		boolean check = false;
		boolean check2 = false;
		boolean check3 = false;

			while (!check2) {
			System.out.println("Welcome to Chris's Market!");
			System.out.println("Item                  Price");
			System.out.println("================================");
			for (String x : food.keySet()) {
				System.out.println(x + "              $" + food.get(x));
			}
				System.out.println("What item would you like to order?");
			order = scan.next();
				if (!food.containsKey(order)) {
					System.out.println("Sorry, we dont have those, try again");
					check2 = false;
				} else {
					foodOrder.add(order);
					foodPrice.add(food.get(order));
				System.out.println("Adding " + order + " to cart at $" + foodPrice.get(index));
					index++;
				check2 = true;
				check3 = false;

			}


				while (!check3) {
				System.out.println("would you like to continue (y/n)");
				String y = scan.next();
				if (y.equalsIgnoreCase("y")) {
					check2 = false;
				check3 = true;
					}
				else if (y.equalsIgnoreCase("n")) {
					System.out.println("Thanks for the order!\nHere is what you got:");
					check2 = true;
					check3 = true;
				} else {
					System.out.println("Please try again");
					check2 = true;
					check3 = false;
				}

			} // ending of check3 while loop

		} // ending of check 2 while loop

		for (int i = 0; i < foodOrder.size(); i++) {
			System.out.println(foodOrder.get(i) + "         $" + foodPrice.get(i));
		}
		System.out.println("Average price per item in order was $" + averagePrice(foodOrder.size(), foodPrice));
		System.out.println(highestPriceItem(foodPrice, food));
		System.out.println(lowestPriceItem(foodPrice, food));


		scan.close();


	}// ending of the main method here

	public static double averagePrice(int x, ArrayList<Double> y) {
		double sum = 0.0;
		for (int i = 0; i < y.size(); i++) {
			sum += y.get(i);
		}
		return sum / x;
	}

	public static String highestPriceItem(ArrayList<Double> x, Map<String, Double> y) {
//		Collections.max(x);
//		Collections.max
//		y.get(x.get(x.size() - 1));
		String a = " ";
		for (String key : y.keySet()) {
			if (y.get(key) >= Collections.max(x)) {
				a = key;
			}

		}


		return "The highest price item you ordered was " + a;
	}

	public static String lowestPriceItem(ArrayList<Double> x, Map<String, Double> y) {
		// Collections.sort(y);
		// Collections.sort(x);
		String a = " ";
		for (String key : y.keySet()) {
			if (y.get(key) <= Collections.min(x)) {
				a = key;
			}

		}

		return "The lowest price item you ordered was " + a;
	}


}
