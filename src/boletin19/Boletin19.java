/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin19;

import com.libreria.jose.ExcepcionNulo;
import com.libreria.jose.Libreria;
import com.libreria.jose.Libros;
import javax.swing.JOptionPane;

/**
 *
 * @author jdominguezmartinan
 */
public class Boletin19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Libreria Libreria1 =new Libreria(); // creamos un obxeto de tipo libreria
        // creamos un menu para realizar as operacions 
       boolean sair=true;
        while(sair==true){
        int op=Integer.parseInt(JOptionPane.showInputDialog("seleccione a opción \n"
                + "1.Engadir libro a libreria \n"
                + "2. Vender libro \n"
                + "3. Amosar os libro \n"
                + "4. Eliminar os rexistros dos que se esgotaron todas as unidades \n"
                + "5. Consultar un libro polo seu titulo \n"
                + "0. Para sair do programa"));
        switch(op){
            case 0:
                sair=false;
                break;
            case 1:
               String titulo= JOptionPane.showInputDialog("Inserte o titulo do libro");
               String autor= JOptionPane.showInputDialog("Inserte o autor do libro");
               String isbn= JOptionPane.showInputDialog("Inserte o isbn do libro");
               float prezo= Float.parseFloat(JOptionPane.showInputDialog("Inserte o prezo do libro"));
                int numeroUnidades=Integer.parseInt(JOptionPane.showInputDialog("inserte o numero de unidades do libro"));
                Libros libro=new Libros(titulo,autor,isbn,prezo,numeroUnidades);
                Libreria1.engade(libro);
                break;
            case 2:
                try{
                String is=JOptionPane.showInputDialog("inserte o isbn do libro que vai a vender");
                Libreria1.vender(is);
                }catch(ExcepcionNulo e){
                   JOptionPane.showMessageDialog(null,"non hay libros , inserte outra opción"); 
                }
                break;
            case 3:
                try{
                Libreria1.amosar();
                }catch (ExcepcionNulo e){
                    JOptionPane.showMessageDialog(null,"non hay libros , inserte outra opción");
                }
                break;
            case 4:
                try{
                Libreria1.elimina();
                }catch (ExcepcionNulo e){
                    JOptionPane.showMessageDialog(null,"non hay libros , inserte outra opción");
                }
                break;
            case 5:
                try{
                Libreria1.consultarLibro(JOptionPane.showInputDialog("inserte o titutlo do libro a consultar"));
                }catch (ExcepcionNulo e){
                    JOptionPane.showMessageDialog(null,"non hay libros , inserte outra opción");
                }
                break;
            default:
                System.out.println("opción non valida");
        }
        }
        
        
    }
    
}
