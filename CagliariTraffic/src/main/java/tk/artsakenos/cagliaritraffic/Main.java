/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.artsakenos.cagliaritraffic;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.cert.X509Certificate;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

/**
 * Classe di esempio nel wrapping dei dati per Cagliari Traffic.
 *
 * @author Andrea Addis
 */
public class Main {

    public static void main(String[] args) throws MalformedURLException, IOException {

        // Creazione di un trust manager per la validazione dei certificati.
        TrustManager[] trustAllCerts = new TrustManager[]{new X509TrustManager() {
            @Override
            public X509Certificate[] getAcceptedIssuers() {
                return null;
            }

            @Override
            public void checkClientTrusted(X509Certificate[] certs, String authType) {
            }

            @Override
            public void checkServerTrusted(X509Certificate[] certs, String authType) {
            }
        }};

        try {
            SSLContext sc = SSLContext.getInstance("TLS");
            sc.init(null, trustAllCerts, new SecureRandom());
            HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
        } catch (NoSuchAlgorithmException | KeyManagementException e) {
            System.err.println(e.getLocalizedMessage());
        }

        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(DeserializationFeature.ACCEPT_SINGLE_VALUE_AS_ARRAY, true);

        // Esempio di traduzione da un file
        // Stations stations = mapper.readValue(new File("C:\\Users\\Andrea\\Desktop\\traffico.json"), Stations.class);
        // Esempio di traduzione da un URL
        Stations stations = mapper.readValue(new URL("https://www.cagliariopendata.it/api/v1/stations"), Stations.class);

        System.out.println(stations.getStations().size() + " stazioni disponibili.");
        System.out.println("-----------------------");

        for (Station s : stations.getStations()) {
            System.out.println("ID: " + s.getId());
            System.out.println("Coordinate: " + s.getCoordinate().getLatitudine() + ", " + s.getCoordinate().getLongitudine());
            System.out.println("Misurazione: " + s.getUriMisurazione());
            System.out.println("Sensori disponibili:" + s.getSensori().getSensore().size());
            System.out.println("-----------------------");
        }

        // Esempio di lettura delle misurazioni da una postazione.
        String uriMisurazione = stations.getStations().get(0).getUriMisurazione();
        MisuraPostazioneWrapper response = mapper.readValue(new URL(uriMisurazione), MisuraPostazioneWrapper.class);
        System.out.println(response.getResponse().getResult().getMisurePostazione().getMisurazioni());
    }

}
