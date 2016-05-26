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
public class MisuraPostazioneWrapper {

    private Response response;

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    @Override
    public String toString() {
        return "ClassPojo [response = " + response + "]";
    }
}
