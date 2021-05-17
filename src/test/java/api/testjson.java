package api;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import metier.Livre2;

public class testjson {


	public static void main(String[] args) throws IOException {
		Livre2 livre;
		Gson g = new Gson();

		String sURL = "https://www.googleapis.com/books/v1/volumes?key=AIzaSyAGLF6JPs832TP11n22Xod8APdAy4hEHbc"; //just a string

		// Connect to the URL using java's native library
		URL url = new URL(sURL);
		URLConnection request = url.openConnection();
		request.connect();

		// Convert to a JSON object to print data
		JsonParser jp = new JsonParser(); //from gson
		JsonElement root = jp.parse(new InputStreamReader((InputStream) request.getContent())); //Convert the input stream to a json element
		JsonObject rootobj = root.getAsJsonObject(); //May be an array, may be an object. 
		//JsonObject zipcode = rootobj.get("volumeInfo").getAsJsonObject(); //just grab the zipcode
		//System.out.println(zipcode);
		Livre2[] livres= g.fromJson(rootobj.get("items"), Livre2[].class);
		for (Livre2 l : livres)
		{
			System.out.println(l.toString());
		}
	}

}
