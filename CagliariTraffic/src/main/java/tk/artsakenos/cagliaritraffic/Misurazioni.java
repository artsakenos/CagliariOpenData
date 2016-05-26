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
public class Misurazioni
{
    private Misurazione[] misurazione;

    private String numeroMisurazioni;

    private String fineRangeMisurazioni;

    private String inizioRangeMisurazioni;

    public Misurazione[] getMisurazione ()
    {
        return misurazione;
    }

    public void setMisurazione (Misurazione[] misurazione)
    {
        this.misurazione = misurazione;
    }

    public String getNumeroMisurazioni ()
    {
        return numeroMisurazioni;
    }

    public void setNumeroMisurazioni (String numeroMisurazioni)
    {
        this.numeroMisurazioni = numeroMisurazioni;
    }

    public String getFineRangeMisurazioni ()
    {
        return fineRangeMisurazioni;
    }

    public void setFineRangeMisurazioni (String fineRangeMisurazioni)
    {
        this.fineRangeMisurazioni = fineRangeMisurazioni;
    }

    public String getInizioRangeMisurazioni ()
    {
        return inizioRangeMisurazioni;
    }

    public void setInizioRangeMisurazioni (String inizioRangeMisurazioni)
    {
        this.inizioRangeMisurazioni = inizioRangeMisurazioni;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [misurazione = "+misurazione+", numeroMisurazioni = "+numeroMisurazioni+", fineRangeMisurazioni = "+fineRangeMisurazioni+", inizioRangeMisurazioni = "+inizioRangeMisurazioni+"]";
    }
}
