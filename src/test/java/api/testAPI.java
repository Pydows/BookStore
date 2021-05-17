package api;

import java.net.*;

import java.io.*;
import javax.json.*;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;

public class testAPI {
	public static void main(String[] args) throws Exception {
		//String motCle = "Legardinier";
		//URL url = new URL("https://www.googleapis.com/books/v1/volumes?q=" + motCle + "&key=AIzaSyAGLF6JPs832TP11n22Xod8APdAy4hEHbc");
		//possibilité d'ajouter des filtres sur les parametres (auteur, titre, ...)
		URL url = new URL("https://www.googleapis.com/books/v1/volumes/RaD8AAAAQBAJ");

		BufferedReader read = new BufferedReader(new InputStreamReader(url.openStream()));

		String inputLine;
		while ((inputLine = read.readLine()) != null)
		{
			//System.out.println(inputLine);

			/*
		JsonReader reader = Json.createReader(new StringReader(inputLine));
		JsonArray array = reader.readArray();
		JsonObject obj = array.getJsonObject(1);
		String nom = obj.getJsonString("nom").getString();
		System.out.println(nom);
			 */
			JsonParser parser = Json.createParser(new StringReader(inputLine));
			Event event = null;
			//while (parser.hasNext()) {
				//System.out.println("toto");
				event = parser.next();
				System.out.print("event=" + event);
				switch (event) {
				case KEY_NAME:
					System.out.print(" cle=" + parser.getString());
					break;
				case VALUE_STRING:
					System.out.print(" valeur=" + parser.getString());
					break;
				case VALUE_NUMBER:
					if (parser.isIntegralNumber()) {
						System.out.println(" valeur=" + parser.getInt());
					} else {
						System.out.println(" valeur=" + parser.getBigDecimal());
					}
					break;
				case VALUE_NULL:
					System.out.print(" valeur=null");
					break;
				}
				System.out.println("");
			//}
			
		}
		read.close();
	}
}