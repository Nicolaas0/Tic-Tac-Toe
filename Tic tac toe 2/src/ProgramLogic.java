
import javax.swing.JOptionPane;
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nicol
 */
public class ProgramLogic extends ProgramModel{
    
public void choose_a_player(){
    if (startGame.equalsIgnoreCase("X"))
        {
        startGame ="O";
        }
        else
        {
        startGame ="X";
        }
}
}