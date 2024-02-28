package jv.prueba1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;


public class AppController extends NumSecreto{
    @FXML
    private Slider num_intro;

    @FXML
    private Label num_selecionado;

    int numSelecionado;

    @FXML
    public void actualizarEtiqueta() {
        numSelecionado = (int)(num_intro.getValue());

        System.out.println(numSelecionado);

        num_selecionado.setText(Integer.toString(numSelecionado));
    }

    @FXML
    private Label resultado;

    @FXML
    protected void comprobar_num_secreto() {
        setNumero(numSelecionado);

        if (validarNum()) {
            resultado.setText("Filicidades, has adivinado el numero secreto con " + intentos() + " intentos");
        } else {
            resultado.setText("El numero es " + mayorMenor());
        }
    }
}