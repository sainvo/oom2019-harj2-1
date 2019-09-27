package fi.utu.tech;

import java.util.*;
import java.util.regex.PatternSyntaxException;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

/**
 * Ohjelma joka laskee 2. asteen yhtälön ratkaisun
 * tai ratkaisut, graafisesti.
 * 
 * Käytin tässä lukiossa opittua ratkaisukaavaa:
 * https://fi.wikipedia.org/wiki/Toisen_asteen_yht%C3%A4l%C3%B6#Toisen_asteen_yht%C3%A4l%C3%B6n_ratkaisukaava
 * 
 * @author 1. vuoden opiskelija
 */
public class CalculatorApp extends Application {
	
	// ensimmäinen Java-yritelmäni
	// joskus toimii, joskus ei
	//
	// t. 1. vuoden opiskelija
	//-------------------------------------//
	//REFRAKTOROINTI
	/*
	 * ottaa tekstimuotoisen inputin ja splittaa sen
	 * evaluoi inputin muodon " " löytymisen perusteella 
	 * @.pre input != null && input.contains(" ").
	 * @.post RESULT.length == 3) 
	 */
	public String[] inputSplitter(String input) throws PatternSyntaxException{
		String[] returnValue = {};
		try {
			int valit = 0;
			for( int i = 0; i < input.length(); i++) {
				if(input.charAt(i)==' ') {
					valit++;
				}
			}
			if(valit == 2) {
				String[] j= input.split(" ",3);
				returnValue = j;	
			}
		}
		catch (PatternSyntaxException e) {
				System.out.println(e.getMessage());
				returnValue = null;
			}
		return returnValue;
	}	
	
	/*
	 * laskee determinantin syötteenä saadusta double-listasta
	 * @.pre inputAsDouble != null && inputAsDouble.length == 3
	 * @.post RESULT > 0 || RESULT = 0
	 * 
	 */
	ArrayList <Double> discriminantCounter (String[] splitInput) throws NoResultsException {
		ArrayList <Double> doubles = new ArrayList <Double>();
		double a = Double.parseDouble(splitInput[0]);
		double b = Double.parseDouble(splitInput[1]);
		double c = Double.parseDouble(splitInput[2]);
	
		double disc = b*b - 4*a*c;
		if(disc < 0) {
			doubles = null;
			throw new NoResultsException("Ei reaaliratkaisuja");
		}else {
			doubles.add(a);
			doubles.add(b);
			doubles.add(c);
			doubles.add(disc);
			
		}return doubles;
	}
	
	String calculate(String input) throws NoResultsException {
		String[] valid = inputSplitter(input);
		ArrayList<Double> doubles = new ArrayList<>();
		if(valid != null) {
			if(discriminantCounter(valid) != null) {
				doubles = discriminantCounter(valid); 
			}
		}
	
		double r1, r2;
		
		r1 = (-doubles.get(1)+Math.sqrt(doubles.get(3)))/(2*doubles.get(0));
		r2 = (-doubles.get(1)-Math.sqrt(doubles.get(3)))/(2*doubles.get(0));
		
		if (r1 == r2)
			return "Ratkaisu on: x = " + r1;
		else
			return "Ratkaisut ovat: x = " + r1 + " ja x = " + r2;
	}
	
	// tämä vaikuttaa valmiilta
	// tätä ei tarvitse muuttaa
	@Override
	public void start(Stage window) {
		window.setTitle("2. asteen yhtälön ratkaisin");

		VBox root = new VBox();
		root.setSpacing(12);
		root.getChildren().add(new Label("Ratkaistaan yhtälö ax^2 + bx + c."));
		root.getChildren().add(new Label("Syötä alle muodossa: a väli b väli c"));

		TextField input = new TextField();
		root.getChildren().add(input);

		Button btn = new Button("Laske");
		root.getChildren().add(btn);
		
		root.getChildren().add(new Label("Tulos:"));
		
		Label output = new Label("");
		root.getChildren().add(output);

		btn.setOnAction(e -> output.setText(calculate(input.getText())));
		
		window.setScene(new Scene(root, 400, 300));
		window.show();
	}
}