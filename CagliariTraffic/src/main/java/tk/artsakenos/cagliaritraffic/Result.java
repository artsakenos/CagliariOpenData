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
public class Result
{
    private MisurePostazione misurePostazione;

    private String[] html;

    public MisurePostazione getMisurePostazione ()
    {
        return misurePostazione;
    }

    public void setMisurePostazione (MisurePostazione misurePostazione)
    {
        this.misurePostazione = misurePostazione;
    }

    public String[] getHtml ()
    {
        return html;
    }

    public void setHtml (String[] html)
    {
        this.html = html;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [misurePostazione = "+misurePostazione+", html = "+html+"]";
    }
}
