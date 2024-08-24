import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class AnswerSheet {

	// The correct answers
	private static char[] key;

	// set up the correct answers
	public static void setKey(String data) {
		String[] elements = data.split(",");

		if (elements[0].equals("KEY")) {

			key = new char[elements.length - 1];
			for (int i = 1; i < elements.length; i++) {
				key[i - 1] = elements[i].charAt(0);
			}
		}
	}

	// calculate score
	public static double getScore(char[] ans) {
		double score = 0;
		for (int i = 0; i < ans.length; i++) {
			if (ans[i] == key[i]) {
				score += 1;
			} else if (ans[i] == '?') {
				score += 0;
			} else {
				score -= 0.25;
			}
		}

		return score;
	}

	public static void main(String[] args) {

        double highestScore = Integer.MIN_VALUE;
        String bestStudents = "";

        File midRecords = new File("Midterm.txt");
        File finRecords = new File("Final.txt");
        File results = new File("results.txt");

        try {
            FileWriter fw = new FileWriter(results);
            BufferedWriter bw = new BufferedWriter(fw);

            Scanner myScanner = new Scanner(midRecords);

            String data = myScanner.nextLine();
            setKey(data);

            String output = "";

            while (myScanner.hasNextLine()) {
                data = myScanner.nextLine();
                String[] info = data.split(",");

                String name = info[0];
                char[] answers = new char[info.length - 1];

                for (int i = 1; i < info.length; i++) {
                    answers[i - 1] = info[i].charAt(0);
                }
                double score = getScore(answers);
                if (score > highestScore) {
                    highestScore = score;
                    bestStudents = name;
                } else if (score == highestScore) {
                    bestStudents += " " + name;
                }

                output += name;
                for (char answer : answers) {
                    output += " " + answer;
                }
                output += " score = " + score + "\n";
            }

            output += "Best Student(s): " + bestStudents;

            bw.write(output);
            bw.close();
        } catch (IOException e) {
            System.out.println("Midterm.txt may not exist");
        }

        try {
            FileWriter fw1 = new FileWriter(results,true);
            BufferedWriter bw1 = new BufferedWriter(fw1);

            Scanner myScanner = new Scanner(finRecords);

            String data = myScanner.nextLine();
            setKey(data);

            String output = "";

            while (myScanner.hasNextLine()) {
                data = myScanner.nextLine();
                String[] info = data.split(",");

                String name = info[0];
                char[] answers = new char[info.length - 1];

                for (int i = 1; i < info.length; i++) {
                    answers[i - 1] = info[i].charAt(0);
                }
                double score = getScore(answers);
                if (score > highestScore) {
                    highestScore = score;
                    bestStudents = name;
                } else if (score == highestScore) {
                    bestStudents += " " + name;
                }

                output += name;
                for (char answer : answers) {
                    output += " " + answer;
                }
                output += " score = " + score + "\n";
            }

            output += "Best Student(s): " + bestStudents;
            
            
            bw1.write(output);
            bw1.close();
        } catch (IOException e) {
            System.out.println("Final.txt may not exist");
        }


    }

}