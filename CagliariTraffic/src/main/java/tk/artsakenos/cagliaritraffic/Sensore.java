/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tk.artsakenos.cagliaritraffic;

/**
 *
 * @author Andrea Addis
 */
public class Sensore {

    private int id;
    private String tipoApparato;
    private String nome;
    private String descrizione;
    private String uriMisurazione;

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
     * @return the uriMisurazione
     */
    public String getUriMisurazione() {
        return uriMisurazione;
    }

}
