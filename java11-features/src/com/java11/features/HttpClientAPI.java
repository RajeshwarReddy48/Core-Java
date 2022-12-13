package com.java11.features;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpClient.Version;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

public class HttpClientAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//HTTP Client API using HTTP requests.
		//Unlike HttpConnection, HttpClient synchronous and asynchronous request mechanisms.
		
		String uri="https://postman-echo.com/get?uname=javabeans&pwd=12345";
		HttpRequest httpreq=HttpRequest.newBuilder()
				.uri(URI.create(uri))
				.GET()   //.header("",value)
				.version(Version.HTTP_2)// 400-error,500-internal server error, 200-success
				.build();
		
		HttpClient client= HttpClient.newBuilder().build();
		
		try {
			HttpResponse response= client.send(httpreq, BodyHandlers.ofString());
			System.out.println(response.statusCode());
			System.out.println(response.body());

			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
