package tk.artsakenos.cagliaritraffic;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrea Addis
 */
public class Response
{
    private Result result;

    private String errors;

    public Result getResult ()
    {
        return result;
    }

    public void setResult (Result result)
    {
        this.result = result;
    }

    public String getErrors ()
    {
        return errors;
    }

    public void setErrors (String errors)
    {
        this.errors = errors;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [result = "+result+", errors = "+errors+"]";
    }
}
