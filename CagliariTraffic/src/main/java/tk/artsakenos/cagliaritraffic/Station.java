/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.artsakenos.cagliaritraffic;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 *
 * @author Andrea Addis
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Station {

    private int id;
    private String tipoApparato;
    private String nome;
    private String descrizione;
    private Coordinate coordinate;
    private String uriMisurazione;
    private Sensori sensori;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @return the tipoApparato
     */
    public String getTipoApparato() {
        return tipoApparato;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @return the descrizione
     */
    public String getDescrizione() {
        return descrizione;
    }

    /**
     * @return the coordinate
     */
    public Coordinate getCoordinate() {
        return coordinate;
    }

    /**
     * @return the uriMisurazione
     */
    public String getUriMisurazione() {
        return uriMisurazione.replaceAll("misurepostazione", "misurepostazione.json");
    }

    /**
     * @return the sensori
     */
    public Sensori getSensori() {
        return sensori;
    }

}
