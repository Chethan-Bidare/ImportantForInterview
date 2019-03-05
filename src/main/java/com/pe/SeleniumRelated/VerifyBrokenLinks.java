package com.pe.SeleniumRelated;


import java.io.IOException;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VerifyBrokenLinks {
	
	public WebDriver driver ;

	public void verifyURLstatus(String url) throws ClientProtocolException, IOException {
		HttpClient client = HttpClientBuilder.create().build();
		HttpGet request = new HttpGet(url);
		HttpResponse response = client.execute(request); 
		
		if(response.getStatusLine().getStatusCode() == 200) {
			System.out.println("valid link : "+url);
		}
		else
			System.out.println("broken link : "+ url);
	}
	
	public void getBrokenLinks() throws ClientProtocolException, IOException {
		  List<WebElement> li = driver.findElements(By.tagName("a"));
		  System.out.println("Total Number of links : "+ li.size());
		  for(WebElement we : li) {
			  if (we != null) {
				String url = we.getAttribute("href");
				if (url != null && url.contains("javascript")) {
					verifyURLstatus(url);
				} 
				else
					System.out.println("broken link : "+url);
		  }
		}
	}
}
