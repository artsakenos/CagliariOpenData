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
public class MisurePostazione
{
    private Postazione postazione;

    private Misurazioni misurazioni;

    public Postazione getPostazione ()
    {
        return postazione;
    }

    public void setPostazione (Postazione postazione)
    {
        this.postazione = postazione;
    }

    public Misurazioni getMisurazioni ()
    {
        return misurazioni;
    }

    public void setMisurazioni (Misurazioni misurazioni)
    {
        this.misurazioni = misurazioni;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [postazione = "+postazione+", misurazioni = "+misurazioni+"]";
    }
}
