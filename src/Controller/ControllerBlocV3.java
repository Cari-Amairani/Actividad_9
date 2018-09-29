/**
 *
 * @author Carina Amairani Díaz Ramirez
 */
package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import View.ViewBloc;
import Model.ModelBlocV3;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ControllerBlocV3 {

    
    // Crea un objeto para modelo
    ModelBlocV3 modelBloc;
    
    ViewBloc viewBloc; 
    // Crea un objeto para ls vista

    
    
    
    ActionListener actionlistener = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == viewBloc.abrir) {
                jb_abrir_action_performed();
            } else if (e.getSource() == viewBloc.Guardar) {
                jb_guardar_action_performed();
            } else if (e.getSource() == viewBloc.Cifrar){
                jb_cifrar_action_performed();
            } else if (e.getSource() == viewBloc.Descifrar){
                jb_decifrar_action_performed();
            }
        }

        private void jb_cifrar_action_performed() {
            modelBloc.setMessage(viewBloc.Jta_texto.getText());
        modelBloc.string2Cesar();
        viewBloc.Jta_texto.setText(modelBloc.getCesar());

        }

        private void jb_decifrar_action_performed() {
            modelBloc.setMessage(viewBloc.Jta_texto.getText());
        modelBloc.Cesar2String();
        viewBloc.Jta_texto.setText(modelBloc.getCesar());
        }
    };

    
    
   
    public ControllerBlocV3(ModelBlocV3 modelBloc, ViewBloc viewBloc) {
        this.modelBloc = modelBloc;
        this.viewBloc = viewBloc;

        this.viewBloc.abrir.addActionListener(actionlistener);
        this.viewBloc.Guardar.addActionListener(actionlistener);
        this.viewBloc.Cifrar.addActionListener(actionlistener);
        this.viewBloc.Descifrar.addActionListener(actionlistener);
        initComponents();
    }

    /**
     * Método para el boton abrir
     */
   
    public void jb_abrir_action_performed() {
     modelBloc.openFile();
        jb_leer_action_performed();       
    }
     /**
     * Método para leer el archivo
     */
     private void jb_leer_action_performed() {
          modelBloc.readFile();
        viewBloc.Jta_texto.setText(modelBloc.getMessage());
    }

    /**
     * Método para el boton guardar
     */
    public void jb_guardar_action_performed() {
       modelBloc.setMessage(viewBloc.Jta_texto.getText());
        modelBloc.writeFile();
        viewBloc.Jta_texto.setText("");

    }
    
    private void initComponents(){
        viewBloc.setVisible(true);
    }
}
   
