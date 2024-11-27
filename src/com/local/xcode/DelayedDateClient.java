package com.local.xcode;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;

public class DelayedDateClient {

    public static void main(String[] args) {
        try {
            String apiUrl = "http://localhost:8080/sayHello";  // Update with your actual URL if different
            HttpClient client = HttpClient.newBuilder()
                    .connectTimeout(Duration.ofSeconds(10))  // Optional: set connect timeout
                    .build();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(apiUrl))
                    .timeout(Duration.ofMinutes(11))  // Set timeout to slightly longer than 10 minutes
                    .GET()
                    .build();

            // Send request and wait for the response
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            // Print the response
            if (response.statusCode() == 200) {
                System.out.println("Response received: " + response.body());
            } else {
                System.out.println("Request failed with status code: " + response.statusCode());
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}