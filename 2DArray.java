	public class Medals_2D { public static void main(String args[]){
//Array that keep track of each country's name and their gold, silver and bronze medal totals.
		String countries[] = {"USA", "CHI", "BRI","RUS","GER","FRA","Jap","AUS","ITA","CAN","KOR","NED","BRA","NZL","AZE"};
	//2D Array that holds the gold, silver and bronze medal totals for each country respectively
		int medalCount[][] = {{46,37,38},{26,18,26},{27,23,17},{19,18,19},{17,10,15},{10,18,14},{12,8,21},{8,11,10},{8,12,8},{4,3,15},{9,3,9},{8,7,4},{7,6,6},{4,9,5},{1,7,10},{7,4,6},{3,5,9},{8,3,4},{2,6,7},{6,2,1}};

//Blank arry to hold the medal totals of each country which will be calculated later.
		int totalMedals[] = new int[20];
//Counters for the for loops that we will be using.
		int counter, i;
//Int for the highest gold, silver, bronze, and total medals so we can keep track of which country has the most of each.
//medal counts are listed in the order: gold, silver, then bronze in the 2D array, highest gold, silver, and bronze
		int highestGold = medalCount[0][0],highestSilver = medalCount[0][1], highestBronze = medalCount[0][2], highestTotal = 0;

//Int keeps track of the counter number associated with the country that has the highest medal total.
		int highestCount = 0;
//Strings that keep track of the name of the country with the highest gold, silver and bronze medal count.
		String mostGold = countries[0], mostSilver = countries[0], mostBronze = countries[0];
		System.out.println("Country\t\t\tGold\t\tSilver\t\tBronze\t\tTotal");
		for(counter = 0; counter < medalCount.length;counter++ ){
			for(i =0; i < medalCount[counter].length; i++){
				totalMedals[counter] = medalCount[counter][i] + totalMedals[counter];
			}
		}
		//Two for loops that sort the countries in descending order by total medals.
		for(counter = 0; counter < countries.length; counter++ ){
			for (i = 0; i < countries.length; i++){
				//Checks to see if a country's total medals are higher the the highest total recorded, if it is then it keeps track of the counter to see
				//where it is in it's so we can print it out later.
				if (totalMedals[i] > highestTotal){
					highestTotal = totalMedals[i];
					highestCount = i;
				}
			}
			//Prints everything out in tabular format, in descending order.
			System.out.println(countries[highestCount] + "\t\t\t" + medalCount[highestCount][0] + "\t\t" + medalCount[highestCount][1] + "\t\t" + medalCount[highestCount][2] + "\t\t" + totalMedals[highestCount]);
			//Sets the total medal count of the country with the highest value (most total medals) to zero so it does not 
			//print out the same country more than once.
			totalMedals[highestCount] = 0;
			//Resets the variable that keeps track of the counter and highest total so we can go through the loop again.
			highestCount = 0;
			highestTotal = 0;

		}
		//For loop that goes through each country and determines which has the most gold, then prints it's name and gold medal count.
		//the ZERO column for each country's array within the 2D array since it holds the number of GOLD medals.
	for (counter = 0; counter < medalCount.length; counter++){
		//Checks to see if the country's gold medal count is higher than the highest gold medal count recorded, if it is then it
		//sets the highest gold value to the value of the country.
		if(medalCount[counter][0] > highestGold){
			highestGold = medalCount[counter][0];
			mostGold = countries[counter];
		}
	}
	System.out.println("The country with the most gold medals is " + mostGold + " with " + highestGold);
	//For loop that does the exact same function as the one above, but for silver medals.
	//the ONE column for each country's arry within the 2D array since it holds the number of SILVER medals.
	for (counter = 0; counter < medalCount.length; counter++){
		if(medalCount[counter][1] > highestSilver){
			highestSilver = medalCount[counter][1];
			mostSilver = countries[counter];
		}
	}
	System.out.println("The country with the most silver medals is " + mostSilver + " with " + highestSilver);
	//For loop that does the exact same function as the two above, but for bronze medals.
	//the TWO column for each country's arry within the 2D array since it holds the number of BRONZE medals.
	for (counter = 0; counter < medalCount.length; counter++){
		if(medalCount[counter][2] > highestBronze){
			highestBronze = medalCount[counter][2];
			mostBronze = countries[counter];
		}
	}
	System.out.println("The country with the most bronze medals is " + mostBronze + " with " + highestBronze);

	}
	}
