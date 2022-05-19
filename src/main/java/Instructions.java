import javax.swing.*;

import java.awt.*;

public class Instructions extends JPanel {

    // Setting the Instructions panel
    public Instructions(){
        this.setLayout(null);
        this.setBackground((ModelBMI.DARK_PURPLE));
        this.setPreferredSize(new Dimension(ModelBMI.PANEL_WIDTH, ModelBMI.PANEL_HEIGHT/11));

        // Setting the headline label
        Label headLine = new Label("BMI Calculator", ModelBMI.FRAME_WIDTH / 2 - ModelBMI.LABEL_WIDTH, 0);
        this.add(headLine);

        // Setting the caption label
        Label caption = new Label("Please complete this form. Press the Submit button when complete. ");
        caption.setBounds(ModelBMI.FRAME_WIDTH/2-(3* ModelBMI.LABEL_WIDTH),20, ModelBMI.FRAME_WIDTH, ModelBMI.LABEL_HEIGHT);
        this.add(caption);
    }
}