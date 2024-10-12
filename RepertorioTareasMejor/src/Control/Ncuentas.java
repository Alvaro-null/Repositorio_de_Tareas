
package Control;

import Modelo.Cuenta;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;



public class Ncuentas {
    //direccion del archivo
    String direccion = "DOCUMENTOS//BD_CUENTA.txt";
    //almacenar contenido del archivo
    BufferedReader br;
    //leera el archivo
    FileReader fr;
    //escribir en el archivo
    FileWriter fw;
    public ArrayList<Cuenta> array = new ArrayList<>();
    Cuenta c;
    /*
    consiste en insertar en archivos
    @param Cuenta c lo cual es para tomar los parametros para insertar
    @param direccion lo cual es la direccion del archivo
    @param true lo cual lo abre
    @param cad son los parametros de User, Usuario, Password
    @param 10  significa enter o salto de linea
    @() para cerrar el FileWriter
    */
    public void insertar (Cuenta c)throws FileNotFoundException, IOException{
        fw = new FileWriter(direccion, true);
        String cad = c.getUser() + "-" + c.getUsuario() + "-" + c.getPassword();
            fw.write(cad);
            fw.write(10);
            fw.close();
    
    }
    /*
    consiste en leer el archivo
    @param direccion del archivo
    @param fr lo cual leera el archivo
    @param br lo cual almacenera el texto del archivo
    */
    public void leer()throws FileNotFoundException, IOException{
        array.clear();
        fr = new FileReader(direccion);  
        br = new BufferedReader(fr);
        
        String cad=br.readLine();
        String vec[];
        
        while(cad != null){
            vec=cad.split("-");
            c = new Cuenta(vec[0],vec[1],vec[2]);
            array.add(c);
            cad = br.readLine();
        }
    }
    
}
