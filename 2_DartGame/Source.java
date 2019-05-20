import java.util.Scanner;

class Source {

    public static void main(String[] args) {
    	
        Scanner in = new Scanner(System.in);

	int bid, score1, score2, score3;

	System.out.print("Enter your bid : ");
        bid = in.nextInt();

	System.out.print("Enter your 3 scores: ");
	score1 = in.nextInt();
	score2 = in.nextInt();
	score3 = in.nextInt();	

        //Create object of Dart class
	Dart dartObj = new Dart(bid, score1, score2, score3);
	
	//Print the output as expected
	System.out.println(dartObj.findEffectiveScore());
   }
}
class Dart{
    // Declare your attributes herei
    int score1, score2, score3, bid;

    // Write your code logic here
    public Dart(int bid, int score1, int score2, int score3)
    {
	this.bid=bid;
	this.score1=score1;
	this.score2=score2;
	this.score3=score3;
    }

    public int findEffectiveScore()
    {
    	int effectiveScore = 0, sum;

	sum = this.score1 + this.score2 + this.score3;

	//--- Rule 1 ---- (If you score same as the bid then your final effective score is double the points you bid.)
	if(sum==this.bid)
		effectiveScore = bid * 2;

	//--- Rule 2 ---- (If it is more than the bid score, your effective point is equal to the bid score.)
	if(sum > this.bid)
		effectiveScore = bid;

	//--- Rule 3 --- (If it is less then your bid score but more than half the bid score, your effective point is 0.)
	if(sum < this.bid && (sum > this.bid/2))
		effectiveScore = 0;

	//--- Rule 4 --- (If it is less than half your bid score, your effective score is -5.)
	if(sum < this.bid/2)
		effectiveScore = -5;

	//--- Rule 5 --- (If your score is negative, your effective score is -20.)
	if(sum < 0)
		effectiveScore = -20;
	
	return effectiveScore;
    }    
   
}
