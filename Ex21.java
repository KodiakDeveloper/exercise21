package selectionStructures;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex21 {

	public static void main(String[] args) {

		int hour, minutes, seconds;

		double finalResult;

		String answer;

		DecimalFormat df = new DecimalFormat("0.00");

		hour = Integer.parseInt(JOptionPane.showInputDialog(null, "Input hours: "));

		minutes = Integer.parseInt(JOptionPane.showInputDialog(null, "Input minutes: "));

		seconds = Integer.parseInt(JOptionPane.showInputDialog(null, "Input seconds: "));

		if (hour < 0 || minutes < 0 || seconds < 0) {

			JOptionPane.showMessageDialog(null, "Only positive values are available, try again!!");

			return;

		}

		answer = JOptionPane.showInputDialog(null, "Choose the type of output: hours, minutes, or seconds");

		answer = answer.toLowerCase();

		answer = answer.trim();

		switch (answer) {

		case "hours":

			finalResult = hour + (minutes / 60.0) + (seconds / 3600.0);

			JOptionPane.showMessageDialog(null, "Hours output : " + df.format(finalResult));

			break;

		case "minutes":

			finalResult = (hour * 60.0) + minutes + (seconds / 60.0);

			JOptionPane.showMessageDialog(null, "Minutes output : " + df.format(finalResult));

			break;

		case "seconds":

			finalResult = ((hour * 60) * 60.0) + (minutes * 60.0) + seconds;

			JOptionPane.showMessageDialog(null, "Seconds output : " + df.format(finalResult));

			break;

		default:

			JOptionPane.showMessageDialog(null, "Invalid data, please enter 'hours', 'minutes' or 'seconds'.");
		}

	}

}
