import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);//initialize scanner
		int rate;
		int sum=0, count=0;
		int oneStar=0, twoStar=0, threeStar=0,fourStar=0, fiveStar=0;
		boolean flag=true;

		System.out.println("Input a rating from 1-5 or input '-1' to end: ");


		while (flag) { //while loop to keep collecting ratings
			rate = scnr.nextInt();

			if(rate == -1) {//set flag check for sentinel
				rate=0;
				flag = false;//ends initial while loop

			}
			else if (rate<1 || rate>5) {//check for invalid numbers outside of (1-5) range
				System.out.println("Invalid input, input a rating from 1-5 or input '-1' to end: ");
			}

			else {
				if (rate==5) { //flag check for '5' input for special output
					fiveStar++;
					count++;
					System.out.println("Excellent rating received!");//Special output
				}
				switch (rate) {//execution for all other ratings within range
				case 1:
					oneStar++;
					count++;
					break;
				case 2:
					twoStar++;
					count++;
					break;
				case 3:
					threeStar++;
					count++;
					break;
				case 4:
					fourStar++;
					count++;
					break;
				}
				sum+=rate;
				System.out.println("Input next rating 1-5 or input '-1' to end: ");
			}

		}
		float average = (float)sum/(float)count;//type-cast to calculate the average
		System.out.println("You recived '" + count + "' ratings.");
		System.out.println("You received '" + oneStar + "' 1-star ratings");
		System.out.println("You received '" + twoStar + "' 2-star ratings");
		System.out.println("You received '" + threeStar + "' 3-star ratings");
		System.out.println("You received '" + fourStar + "' 4-star ratings");
		System.out.println("You received '" + fiveStar + "' 5-star ratings");
		System.out.println("Your average rating is " + average + " stars.");

	}
}
