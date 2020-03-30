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
public class ProgramModel{
 public String startGame = "X";
    public int xCount;
    public int oCount;
    


public void setxCount(int xCount){ //encapsulation
    this.xCount = xCount;
}

public int getxCount (){
    return xCount;
}

public void setoCount(int oCount){
    this.oCount = oCount;
}

public int getoCount(){
    return oCount;
}
}
