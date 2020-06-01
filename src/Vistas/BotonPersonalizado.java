package Vistas;
import javax.swing.*;

public class BotonPersonalizado extends JButton {
    public boolean presionado = false;
    public String tipo;
    public boolean yaAgregado = false;

    public boolean isYaAgregado() {
        return yaAgregado;
    }

    public void setYaAgregado(boolean yaAgregado) {
        this.yaAgregado = yaAgregado;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

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
