/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9;

/**
 *
 * @author logra
 */
public class Salary {
    private Integer hour_pay_rate;
    private Integer reg_hours;
    private Integer over_hours;
    private Double salary;

    public Salary(Integer hour_pay_rate, Integer reg_hours, Integer over_hours) {
        this.hour_pay_rate = hour_pay_rate;
        this.reg_hours = reg_hours;
        this.over_hours = over_hours;
        this.salary = (reg_hours * hour_pay_rate) + (over_hours * 1.5 * hour_pay_rate);
    }

    public void setHour_pay_rate(Integer hour_pay_rate) {
        this.hour_pay_rate = hour_pay_rate;
    }

    public void setReg_hours(Integer reg_hours) {
        this.reg_hours = reg_hours;
    }

    public void setOver_hours(Integer over_hours) {
        this.over_hours = over_hours;
    }

    public Integer getHour_pay_rate() {
        return hour_pay_rate;
    }

    public Integer getReg_hours() {
        return reg_hours;
    }

    public Integer getOver_hours() {
        return over_hours;
    }

    public Double getSalary() {
        return salary;
    }
    
    public String overtimePay(){
        return String.format("El salario es $%.2f", this.salary);
    }
    
}
