package a4.contactclientrestful;

import contactclient.ContactClient;

/**
 *
 * @author queralt
 */
public class A4ContactClientRestful {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContactClient client = new ContactClient();
        System.out.println(client.countREST());
    }   
}