package file.download;


import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileDownloadClient {

    private static final String FILE_DOWNLOAD_URL = "http://localhost:8080/downloadFile/334952.pdf";

    public static void downloadFile(String fileName) {
        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(FILE_DOWNLOAD_URL + fileName))
                    .build();

            HttpResponse<InputStream> response = client.send(request, HttpResponse.BodyHandlers.ofInputStream());

            if (response.statusCode() == 200) {
                try (InputStream in = response.body();
                     FileOutputStream out = new FileOutputStream("/Users/venkat/Desktop/download/" + fileName)) {

                    byte[] buffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = in.read(buffer)) != -1) {
                        out.write(buffer, 0, bytesRead);
                    }
                    System.out.println("File downloaded: " + fileName);
                }
            } else {
                System.out.println("Failed to download file. HTTP error code: " + response.statusCode());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        downloadFile("document.pdf");
    }
}