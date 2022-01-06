public class phraseomatic{
	public static void main(String[] args) {


		// Three sets of word to chosse form
		String[] wordListOne = {"24/7", "mulyi-Tier", "30,000 foot", "B-to-B", "win-win", "front-end", "web-based", "pervaisve", "smart", "six-sigma", "critical-path", "dynamic"};

		String[] wordListTwo = {"empowered", "sticky", "value-added", "oriented", "centric", "distributed", "clustered", "branded", "outside-the-box", "positioned", "networked", "focused", "leeraged", "aligned","targeted", "shared", "coperative", "acclerated"};

		String[] wordListThree = {"process", "tipping-point", "solution", "architecture", "core competency", "startegy", "mindshare", "portal", "space", "vision", "paradigm", "mission"};

		// Finding out how many words are there in each list
		int oneLength = wordListOne.length;
		int twoLength = wordListTwo.length;
		int threeLength  = wordListThree.length;

		//Generate three random numbers
		int rand1 = (int) Math.random() * oneLength;
		int rand2 = (int) Math.random() * twoLength;
		int rand3 = (int) Math.random() * threeLength;

		//Now building the phrase
		String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];

		//Printng out the phrase
		System.out.println("What we need is a " + phrase);

	}
}