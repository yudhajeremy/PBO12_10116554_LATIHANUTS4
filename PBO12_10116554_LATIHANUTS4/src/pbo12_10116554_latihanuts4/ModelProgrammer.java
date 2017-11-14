/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo12_10116554_latihanuts4;

/**
 *
 * @author Jemmy
 */
class ModelProgrammer extends ModelEmployee{
    int bonus = 60000;
    public void BonusProgrammer (int bonus, float salary){
        System.out.println("Salary Employee Programmer = "+salary);
        System.out.println("Bonus Programmer = "+bonus);
    }
}
