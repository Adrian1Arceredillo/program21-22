/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author arceredillo.adrian
 */
public class Time {

    private int hour;
    private int minute;
    private int second;

    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public Time(String timeNew) {

        String separator = ":";
        int posSeparator = timeNew.indexOf(separator);
        this.hour = Integer.valueOf(timeNew.substring(0, posSeparator));
        this.minute = Integer.valueOf(timeNew.substring(posSeparator + separator.length(), 5));
        this.second = Integer.valueOf(timeNew.substring(6, timeNew.length()));

    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {

        return second;
    }

    public void setHour(int hour) {
        this.hour = hour;

        if (this.getHour() > 23) {
            this.setHour(0);
        }

    }

    public void setMinute(int minute) {
        this.minute = minute;

        if (this.getMinute() > 59) {
            this.setHour(this.getHour() + 1);
            this.minute = minute - 60;
        }
    }

    public void setSecond(int second) {

        this.second = second;

        if (this.getSecond() > 59) {
            this.setMinute(this.getMinute() + 1);
            this.second = second - 60;
        }
        //this.second = second;
    }

    public void setTime(int hour, int minute, int second) {

        /*if ((hour >= 0 && hour <= 23) && (minute >= 0 && minute <= 59) && (second >= 0 && second <= 59)) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        } else {
            System.out.println("Los valores introducidos no son correctos. ");
            this.hour = 0;
            this.minute = 0;
            this.second = 0;
        }*/
        if ((hour >= 0 && hour <= 23)) {
            this.hour = hour;
        } else {
            this.hour = 0;
        }
        if ((minute >= 0 && minute <= 59)) {
            this.minute = minute;
        } else {
            this.minute = 0;
        }
        if ((second >= 0 && second <= 59)) {
            this.second = second;
        } else {
            this.second = 0;
        }
    }

    public String toString() {
        return String.format("%02d:%02d:%02d", this.getHour(), this.getMinute(), this.getSecond());
    }

    public Time nextSecond() {
        this.setSecond(this.getSecond() + 1);

        return this;

    }

    public Time previousSecond() {
        //this.setSecond(this.getSecond() - 1);
        if (this.getSecond() >0 && this.getSecond() <= 59) {
            this.setSecond(this.getSecond() - 1);
        } else if (this.getSecond() == 0) {
            this.setSecond(59);
            this.setMinute(this.getMinute() - 1);
            if (this.getMinute() == 0) {
                this.setMinute(59);
                this.setHour(this.getHour() - 1);
            }
        }

        /*if (this.getSecond() == 00) {
            this.setMinute(this.getMinute() - 1);
            if (this.getMinute() == 59) {
                this.setHour(this.getHour() - 1);
            }
        }*/
        return this;
    }

}
