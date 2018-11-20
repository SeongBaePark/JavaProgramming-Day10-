package my.day11;

import java.util.*;

public class Words {
	int len;
	String[] words = { "java", "count", "school", "book", "student", "programmer" };

	public Words() {
		Random rand = new Random();

		Scanner scan = new Scanner(System.in);
		int index = rand.nextInt(words.length);

		len = index;
	}

	public String getWords() {
		return words[len];
	}
}
