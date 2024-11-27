package file.download;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class FileDownloadClient2 {

    private static final String FILE_DOWNLOAD_URL = "http://localhost:8080/downloadFile/334952.pdf";

    public static void downloadFile(String fileName) {
        HttpURLConnection connection = null;
        try {
            URL url = new URL(FILE_DOWNLOAD_URL);
            connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");
            connection.setConnectTimeout(5000);
            connection.setReadTimeout(5000);

            File downloadDir = new File("/Users/venkat/Desktop/download/newFolder");
            if (!downloadDir.exists()) {
                downloadDir.mkdirs();
            }

            int responseCode = connection.getResponseCode();
            InputStream is = connection.getInputStream();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                try (InputStream in = connection.getInputStream();
                     FileOutputStream out = new FileOutputStream("/Users/venkat/Desktop/download/newFolder/" + fileName)) {

                    byte[] buffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = in.read(buffer)) != -1) {
                        out.write(buffer, 0, bytesRead);
                    }
                    System.out.println("File downloaded: " + fileName);
                }
            } else {
                System.out.println("Failed to download file. HTTP error code: " + responseCode);
            }
            //downloadagain(is);

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (connection != null) {
                connection.disconnect();
            }
        }
    }

    public static void downloadagain(InputStream is) throws IOException {
        FileOutputStream out = new FileOutputStream("/Users/venkat/Desktop/download/file2");

            byte[] buffer = new byte[1024];
            int bytesRead;
            while ((bytesRead = is.read(buffer)) != -1) {
                out.write(buffer, 0, bytesRead);
            }
            System.out.println("File downloaded: completed");
    }

    public static void main(String[] args) {
        downloadFile("document.pdf");
    }
}
