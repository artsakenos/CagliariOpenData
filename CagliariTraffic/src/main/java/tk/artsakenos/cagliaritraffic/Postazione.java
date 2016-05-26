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
public class Postazione
{
    private String id;

    private String descrizione;

    private Coordinate coordinate;

    private String tipoApparato;

    private Sensori sensori;

    private String uriMisurazione;

    private String nome;

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }

    public String getDescrizione ()
    {
        return descrizione;
    }

    public void setDescrizione (String descrizione)
    {
        this.descrizione = descrizione;
    }

    public Coordinate getCoordinate ()
    {
        return coordinate;
    }

    public void setCoordinate (Coordinate coordinate)
    {
        this.coordinate = coordinate;
    }

    public String getTipoApparato ()
    {
        return tipoApparato;
    }

    public void setTipoApparato (String tipoApparato)
    {
        this.tipoApparato = tipoApparato;
    }

    public Sensori getSensori ()
    {
        return sensori;
    }

    public void setSensori (Sensori sensori)
    {
        this.sensori = sensori;
    }

    public String getUriMisurazione ()
    {
        return uriMisurazione;
    }

    public void setUriMisurazione (String uriMisurazione)
    {
        this.uriMisurazione = uriMisurazione;
    }

    public String getNome ()
    {
        return nome;
    }

    public void setNome (String nome)
    {
        this.nome = nome;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [id = "+id+", descrizione = "+descrizione+", coordinate = "+coordinate+", tipoApparato = "+tipoApparato+", sensori = "+sensori+", uriMisurazione = "+uriMisurazione+", nome = "+nome+"]";
    }
}
