import java.util.*;

class SavingAmount {
	//write your code here
	private int saving;

	public int getSaving() {
		return this.saving;
	}

	public void setInitialSaving(int saving) {
		this.saving = saving;
	}

	public void incrementSaving() {
		this.saving += 1000;
		//System.out.println(this.getSaving());
	}

	public void decrementSaving() {
		this.saving -= 100;
		//System.out.println(this.getSaving());
	}

	public void checkSaving(){
		if(saving >=1000)
			System.out.println("Congratulations! You have saved a good amount");
		else if(saving < 1000 && saving >= 0)
			System.out.println("Insufficient saving!");
		else
			System.out.println("You are in debt");
	}
}

public class Source {
    public static void main(String[] args) {

        SavingAmount obj = new SavingAmount();
        Scanner in = new Scanner(System.in);
        obj.setInitialSaving(in.nextInt());
        obj.decrementSaving();
        obj.checkSaving();
        obj.incrementSaving();
        System.out.println("Your current savings are Rs " + obj.getSaving());
    }
}
