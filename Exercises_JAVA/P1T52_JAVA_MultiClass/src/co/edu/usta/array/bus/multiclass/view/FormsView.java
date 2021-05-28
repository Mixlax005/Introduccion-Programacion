package co.edu.usta.array.bus.multiclass.view;

import co.edu.usta.array.bus.multiclass.logic.Vehicle;

import javax.swing.*;

public class FormsView {
    private static Vehicle myVehicle;
    public static void main(String []params){
        myVehicle=new Vehicle();
        String value, showinfo;
        value=JOptionPane.showInputDialog("Please type the kind of service of your vehicle");
        myVehicle.setServiceType(value);
        showinfo=myVehicle.getServiceType();

        JOptionPane.showMessageDialog(null, "Your kind service for this vehicle is: "+showinfo);

    }
}
