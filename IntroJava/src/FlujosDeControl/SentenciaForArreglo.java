package FlujosDeControl;

import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"daniel", "dani", "andres", "andrew", "juan", "mari"};
        int count = nombres.length;
        for (int i = 0; i < count; i++){
            if (nombres[i].toLowerCase().contains("daniel".toLowerCase()) ||
                    (nombres[i].toLowerCase().contains("juan".toLowerCase()))){
                continue;
            }
            System.out.println(i + ".- " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre:");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase(buscar)){
                encontrado = true;
                break;
            }
        }
        if (encontrado){
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " no existe");
        }
    }
}
