/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package giapchieuphim;

import java.util.Scanner;

/**
 *
 * @author Hello VIỆT
 */
public class Room  extends Area{
//    num : la so ghe;
//total la tong so ghe;
    private int total;
    private int num;
    public Room() {
        super("Phong xem phim");
    }

    public Room(String name) {
        super(name);
    }

    public Room(String currentTime, AREA_STATUS status, String name) {
        super(currentTime, status, name);
    }

    public Room(int total, int num) {
        this();
        this.total = total;
        this.num = num;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
    public void setupStatus() {
        int percent = (num * 100) / total;
//        status -> empty : < 0%;
    if(num == 0 ){
        status =AREA_STATUS.EMPTY;
    }else if(percent <= 40){
        status = AREA_STATUS.LESS;
    }else {
        status = AREA_STATUS.FULL;
    }
    }
    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap tong so ghe");
        total = input.nextInt();
        
        System.out.println("Nhap so ghe dang duoc su dung");
        num = input.nextInt();
        
        this.setupStatus();
        
    }
}
