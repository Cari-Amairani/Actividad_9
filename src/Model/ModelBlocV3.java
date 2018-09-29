/**
 *
 * @author Carina Amairani Díaz Ramirez
 */
package Model;

import View.ViewBloc;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class ModelBlocV3 {

     private String abrir;

    public String getAbrir() {
        return abrir;
    }

    public void setAbrir(String abrir) {
        this.abrir = abrir;
    }
    private String guardar;
    
    public String getGuardar() {
        return guardar;
    }

    public void setGuardar(String guardar) {
        this.guardar = guardar;
    }
    
      
    //Almacena la ruta del archivo
        private String path = " "; 

    public String getPath() {
        return path;
    }
    public void setPath(String path) {
        this.path = path;
    }
    
    
    String cesar = "";

    public String getCesar() {
        return cesar;
    }

    public void setCesar(String cesar) {
        this.cesar = cesar;
    }
    
    //Guarda el contenido 
    private String message = ""; 

    public String getMessage() {
        return message;
    }
    public void setMessage(String message) {
        this.message = message;
    }

    
    /**
     * Selecciona un archivo 
     */
    ViewBloc viewBloc;
    
    public void openFile(){
        JFileChooser jfc = new JFileChooser();
        jfc.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        jfc.showOpenDialog(viewBloc);
        File archivo = jfc.getSelectedFile();
        if ((archivo == null) || (archivo.getName().equals(" "))){
            JOptionPane.showMessageDialog(viewBloc, "Nombre del archvio inválido");
        }
        else
            path = archivo.getAbsolutePath();
    }
    
    /**
     * Método para mostrar contenido del archivo.
     *
     * @param path: Indica la ruta donde se encuentra el archivo.
     * @return
     */
    public void readFile(){
       try{
                String row; 
            try (FileReader file = new FileReader(path); BufferedReader bufferedReader = new BufferedReader(file)){
                while ((row = bufferedReader.readLine()) != null){    
                        message = message + row + "\n";
                }
            } 
        }catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(viewBloc,"No se econtró el archivo" + ex.getMessage());
        } catch (IOException ex) {
                JOptionPane.showMessageDialog(viewBloc,"Error en I/O operación" + ex.getMessage());
        }
    
    }
    
    /**
     * Método para escribir Guardar  el nuevo contenido del fichero
     * @param path: Ruta del archivo
     * @param message: Almacena el texto 
     */
    public void writeFile(){
              try {
            //Abre el archivo, si no existe se crea
            File archivo = new File(path); 
            FileWriter filewriter = new FileWriter(archivo, false);

            try (PrintWriter printwriter = new PrintWriter(filewriter)) {
                printwriter.println(message);
                printwriter.close();
            }
        } 
        //Evalua si no hay errores
        catch (FileNotFoundException err) {
            System.err.println("Archivo no encontrado: " + err.getMessage());
        } catch (IOException err) {
            System.err.println("Error en operación I/O: " + err.getMessage());
        }
            }
    /**
     * Cifra el texto introducido con el método Cesar
     */
    public void string2Cesar(){
        int ascii;
        for(int i=0; i < message.length(); i++){
            if(message.charAt(i) >= 'a' && message.charAt(i) <= 'z'){
                if((message.charAt(i) + 1) > 'z'){
                    ascii = ((int)message.charAt(i));
                    ascii = ascii + 1 - 26;
                    cesar= cesar + ((char)ascii);
                }else{
                    ascii =((int)message.charAt(i));
                    ascii = ascii + 1;
                    cesar = cesar + ((char)ascii);
                }
            }
            else if(message.charAt(i)>= 'A' && message.charAt(i) <='Z'){
                if((message.charAt(i) + 1) > 'Z'){
                    ascii = ((int)message.charAt(i));
                    ascii = ascii + 1 - 26;
                    cesar= cesar + ((char)ascii);
                }else{
                    ascii =((int)message.charAt(i));
                    ascii = ascii + 1;
                    cesar = cesar + ((char)ascii);
                }
            }
            
        }
    }
        
    
    /**
     * Descifrara el texto introducido con el método Cesar
     */
    public void Cesar2String(){
        int ascii;
        for(int i=0; i < message.length(); i++){
            if(message.charAt(i) >= 'a' && message.charAt(i) <= 'z'){
                if((message.charAt(i) - 1) < 'a'){
                    ascii = ((int)message.charAt(i));
                    ascii = ascii - 1 + 26;
                    cesar= cesar + ((char)ascii);
                }else{
                    ascii =((int)message.charAt(i));
                    ascii = ascii - 1;
                    cesar = cesar + ((char)ascii);
                }
            }
            else if(message.charAt(i)>= 'A' && message.charAt(i) <='Z'){
                if((message.charAt(i) - 1) < 'A'){
                    ascii = ((int)message.charAt(i));
                    ascii = ascii - 1 + 26;
                    cesar= cesar + ((char)ascii);
                }else{
                    ascii =((int)message.charAt(i));
                    ascii = ascii - 1;
                    cesar = cesar + ((char)ascii);
                }
            }
            
        }
    }



    
    
}


