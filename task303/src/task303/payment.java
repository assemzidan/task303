/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package task303;

/**
 *
 * @author asemz
 */
public class payment {
    private authorizeBehavior IauthorizeBehavior;
    private printBehavior IprintBehavior;
    public payment(){
        this.IprintBehavior= new printBehavior();
        this.IauthorizeBehavior= new authorizeBehavior();
    }
}
