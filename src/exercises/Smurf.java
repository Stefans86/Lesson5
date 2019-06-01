package exercises;

public class Smurf {

	private String name;

	Smurf(String name) {
		this.name = name;
	}

	public String getName() {
		return "Hi, my name is " + name + " Smurf." + " Welcome to SmurfLand.";

	}

	public String Eating() {

		if (this.name.equals("Handy")) {
			return "Sorry that i dont't have time to show you around, cause i need to go to eat.";
		} else {
			return "Not hungry. ";
		}
	}

	public String HatColor() {

		if (this.name.equals("Papa Smurf")) {
			return "I wear a red hat cause i'm the chief around here.";
		} else {
			return "I wear a white hat";
		}
	}

	public String IsGirlOrBoy() {

		if (this.name.equals("Smurfette")) {
			return "I'am a only girl in village.";
		} else {
			return "I am a boy and it's obvious around here cause of hat (Man world).";
		}

	}

	public String KnowToCook() {

		if (this.name.equals("Smurfette")) {
			return "Don't dare to think cause im girl i need to know to cook? Think again!";
		} else {
			return "I know to cook cause there is no other way not to starve to death.";
		}

	}

	public static void main(String[] args) {
		Smurf HandySmurf = new Smurf("Handy");

		System.out.println(HandySmurf.getName() + " " + HandySmurf.Eating());

		Smurf PapaSmurf = new Smurf("Papa Smurf");
		System.out.println(PapaSmurf.getName() + " " + PapaSmurf.HatColor() + " " + PapaSmurf.IsGirlOrBoy() + " "
				+ PapaSmurf.KnowToCook());

		Smurf SmurfetteSmurf = new Smurf("Smurfette");
		System.out.println(SmurfetteSmurf.getName() + " " + SmurfetteSmurf.HatColor() + " and "
				+ SmurfetteSmurf.IsGirlOrBoy() + " " + SmurfetteSmurf.KnowToCook());
	}

}
