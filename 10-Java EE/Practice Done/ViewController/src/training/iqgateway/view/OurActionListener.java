package training.iqgateway.view;
import javax.faces.event.ActionEvent;

import javax.faces.event.ActionListener;
public class OurActionListener implements ActionListener{
   
    public void processAction(ActionEvent actionEvent) {
   System.out.println("Action Listener got fired !...");
    }
}
