import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HolaMundo {

    private JPanel rootPanel;
    private JButton okButton;
    private JLabel resultado;
    private JTextField numero1;
    private JTextField numero2;
    int i=0;
    float val1=0, val2=0, val3=0;
    public HolaMundo() {
        okButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                /*
                //resultado.setText("Presionaste el boton OK");
                i++;
                //convierte un entero a string Integer.toString(i)
                //resultado.setText(Integer.toString(i));
                resultado.setText(numero1.getText()+numero2.getText()+Integer.toString(i));
                numero1.getText();
                if (i==3){
                    resultado.setText("Has presionado el boton 3 veces");
                    System.out.println("Has presionado el boton 3 veces");}*/
                val1=Float.parseFloat(numero1.getText());
                val2=Float.parseFloat(numero2.getText());
                val3=val1/(val2*val2);
                System.out.println(val3);
                resultado.setText(Float.toString(val3));

            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("HolaMundo");
        frame.setContentPane(new HolaMundo().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }


}
