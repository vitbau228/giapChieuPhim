/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giapchieuphim;


/**
 *
 * @author Hello VIỆT
 */
public class TicketCounter extends Area {

    public TicketCounter() {
        super("Quay ban ve");
    }
    
    public TicketCounter(String name) {
        super(name);
    }

    public TicketCounter(String currentTime, AREA_STATUS status, String name) {
        super(currentTime, status, name);
    }
    
    
    
}
