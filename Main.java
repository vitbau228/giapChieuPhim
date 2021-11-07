/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giapchieuphim;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hello VIỆT
 */
public class Main {
    public static void main(String[] args) {
        List<IStatus> statusList = new ArrayList<>();
        System.out.println("Nhap 4 quay ban ve");
        for(int i = 0; i< 4;i++){
            TicketCounter ticketcounter = new TicketCounter();
            ticketcounter.input();
            statusList.add(ticketcounter);
        }
        System.out.println("Nhap 2 cua hang do an");
        for(int i = 0; i <2; i++) {
            Food food = new Food();
            food.input();
            statusList.add(food);
        }
        
        System.out.println("Nhap 2 bai do xe oto");
         for(int i = 0; i <2; i++){
             Parking parking = new Parking();
             parking.input();
             statusList.add(parking);
         }
         System.out.println("nhap 3 phong chieu phim");
         for(int i= 0; i<3; i++) {
        Room room = new Room();
        room.input();
        statusList.add(room);
    }
         System.out.println("Hien thi thong tin trang thai");
         followStatus(statusList);
       
    }
    static void followStatus(List<IStatus> StatusList) {
        for(IStatus istatus : StatusList ) {
            istatus.onStatus();
        }
    }
}
