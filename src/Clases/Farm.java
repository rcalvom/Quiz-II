
package Clases;

import java.util.ArrayList;

public class Farm extends Eslabon {

    private ArrayList<MateriaPrima> materiasPrimas;
    
    public Farm(String nombre, String descripcion, Ubicacion ubicacion) {
        super(nombre, descripcion, ubicacion);
    }

    @Override
    public boolean Envio(Eslabon eslabon) {
        
        return true;
    }

    public ArrayList<MateriaPrima> getMateriasPrimas() {
        return materiasPrimas;
    }

    public void setMateriasPrimas(ArrayList<MateriaPrima> materiasPrimas) {
        this.materiasPrimas = materiasPrimas;
    }   
    
}
