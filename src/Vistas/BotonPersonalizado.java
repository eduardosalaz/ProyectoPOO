package Vistas;

import javax.swing.*;

public class BotonPersonalizado extends JButton {
    public boolean presionado = false;

    public boolean isPresionado() {
        return presionado;
    }

    public void setPresionado(boolean presionado) {
        this.presionado = presionado;
    }
    @Override
    public String toString(){
        return getName();
    }
}
