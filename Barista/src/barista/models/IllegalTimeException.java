/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barista.models;

/**
 *
 * @author Mohammed Hussein
 */
public class IllegalTimeException extends Exception{
    public IllegalTimeException(){
        super("Time must minimally be negative!");
    }
}
