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
public class PBO12_10116554_LATIHANUTS4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ModelProgrammer programmer = new ModelProgrammer();
        ModelDesigner designer = new ModelDesigner();
        ModelSystemAnalyst analyst = new ModelSystemAnalyst();
        designer.BonusDesigner(designer.bonus, designer.salary);
        programmer.BonusProgrammer(programmer.bonus,programmer.salary);
        analyst.BonusSystemAnalyst(analyst.bonus,analyst.salary);
        
    }
    
}
