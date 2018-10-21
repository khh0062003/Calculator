package se.kh_codepool.processing;

import java.util.function.BiFunction;
import java.util.function.Function;

public class functionalInterfaces {

	public String calc(double N1, double N2, BiFunction<Double, Double, String> process) {

		return process.apply(N1, N2);

	}

	public double userInput(double num, Function<Double, Double> input) {

		return input.apply(num);
	}



}
