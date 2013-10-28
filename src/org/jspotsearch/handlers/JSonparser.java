package org.jspotsearch.handlers;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public class JSonparser {

	protected static String getJsonFromUrl(String url){
		String jsonData = "";
		URI uri;
		JSONTokener tokener;
		try {
			uri = new URI(url);
			tokener = new JSONTokener(uri.toURL().openStream());
			JSONObject root = new JSONObject(tokener);
			jsonData = root.toString();
		} catch (JSONException | IOException e) {
			e.printStackTrace();
		}
		catch (URISyntaxException e1) {
			e1.printStackTrace();
		}
		return jsonData;
	}
	
	
}
