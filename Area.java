/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giapchieuphim;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Hello VIỆT
 */
public class Area implements IStatus{
    static enum AREA_STATUS {
        EMPTY,LESS,NORMAL,FULL
    }
    
     String currentTime;
    AREA_STATUS status;
    String name;
    
    public void autoCurrentTime() {
        SimpleDateFormat format = new SimpleDateFormat("H:m:s dd:mm:yyyy");
        Date time = new Date();
        currentTime = format.format(time);
        
    }
    @Override
    public void onStatus() {
        switch (status) {
            case EMPTY -> System.out.println(name+" Quay ban ve dang trong");
            case LESS -> System.out.println(this.name+ " Quay dang it khach");
            case NORMAL -> System.out.println(name+" Quay dang co khach vua dua");
            case FULL -> System.out.println(this.name+ " Quay dang full khach");
            default -> {
            }
                
        }
    }

    public Area() {
    }

   
    public Area(String name) {
        currentTime = " ";
        this.name = name;
        this.status = AREA_STATUS.EMPTY;
    }

    public Area(String currentTime, AREA_STATUS status, String name) {
        this.currentTime = currentTime;
        this.status = status;
        this.name = name;
    }


    public String getCurrentTime() {
        return currentTime;
    }

    public void setCurrentTime(String currentTime) {
        this.currentTime = currentTime;
    }

    public AREA_STATUS getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    

    public void setStatus(AREA_STATUS status) {
        autoCurrentTime();
        this.status = status;
    }
    public void input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap trang thai ");
        System.out.println(" 1: Empty \n 2:Less \n 3: normal \n 4: Full");
        
        int option = input.nextInt();
        
        switch (option) {
            case 1:
                this.setStatus(AREA_STATUS.EMPTY);
                break;
            case 2:
                setStatus(AREA_STATUS.LESS);
                
                break;
            case 3:
                this.status = AREA_STATUS.NORMAL;
                break;
             case 4:
                status = AREA_STATUS.FULL;
                break;
            default:
                throw new AssertionError();
        }
        autoCurrentTime();
    }
        
}
