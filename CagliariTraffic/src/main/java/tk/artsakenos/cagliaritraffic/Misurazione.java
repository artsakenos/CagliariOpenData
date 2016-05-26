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
public class Misurazione
{
    private String velocita;

    private String efficienza;

    private String tipoClassificazione;

    private String classe;

    private String ora;

    private String flusso;

    private String tasso;

    private String idClasse;

    public String getVelocita ()
    {
        return velocita;
    }

    public void setVelocita (String velocita)
    {
        this.velocita = velocita;
    }

    public String getEfficienza ()
    {
        return efficienza;
    }

    public void setEfficienza (String efficienza)
    {
        this.efficienza = efficienza;
    }

    public String getTipoClassificazione ()
    {
        return tipoClassificazione;
    }

    public void setTipoClassificazione (String tipoClassificazione)
    {
        this.tipoClassificazione = tipoClassificazione;
    }

    public String getClasse ()
    {
        return classe;
    }

    public void setClasse (String classe)
    {
        this.classe = classe;
    }

    public String getOra ()
    {
        return ora;
    }

    public void setOra (String ora)
    {
        this.ora = ora;
    }

    public String getFlusso ()
    {
        return flusso;
    }

    public void setFlusso (String flusso)
    {
        this.flusso = flusso;
    }

    public String getTasso ()
    {
        return tasso;
    }

    public void setTasso (String tasso)
    {
        this.tasso = tasso;
    }

    public String getIdClasse ()
    {
        return idClasse;
    }

    public void setIdClasse (String idClasse)
    {
        this.idClasse = idClasse;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [velocita = "+velocita+", efficienza = "+efficienza+", tipoClassificazione = "+tipoClassificazione+", classe = "+classe+", ora = "+ora+", flusso = "+flusso+", tasso = "+tasso+", idClasse = "+idClasse+"]";
    }
}
