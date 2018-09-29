/**
 *
 * @author Ami
 */
package Main;

import Controller.ControllerBlocV3;
import Model.ModelBlocV3;
import View.ViewBloc;


public class MainBlocV3 {
    
    public static void main(String[] args) {
        ModelBlocV3 modelblocnotas = new ModelBlocV3();
        ViewBloc viewblocnotas = new ViewBloc();
        ControllerBlocV3 ontrollerblocnotas = new ControllerBlocV3(modelblocnotas, viewblocnotas); 
    }
    
}
