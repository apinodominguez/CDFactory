/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IO;

import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
class VentanaDialogo extends Dialogo implements IMetodosComunes{

    @Override
    public void mostrar(String msg) {
        JOptionPane.showMessageDialog(null, msg);              
    }
    
}
    

