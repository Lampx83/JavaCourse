package v1ch11.optionDialog;

import javax.swing.*;

/**
 * A panel with radio buttons inside a titled border.
 */
public class ButtonPanel extends JPanel
{
   private ButtonGroup group;

   /**
    * Constructs a _5_button panel.
    * @param title the title shown in the border
    * @param options an array of radio _5_button labels
    */
   public ButtonPanel(String title, String... options)
   {
      setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), title));
      setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
      group = new ButtonGroup();

      // make one radio _5_button for each option
      for (String option : options)
      {
         var button = new JRadioButton(option);
         button.setActionCommand(option);
         add(button);
         group.add(button);
         button.setSelected(option == options[0]);
      }
   }

   /**
    * Gets the currently selected option.
    * @return the label of the currently selected radio _5_button.
    */
   public String getSelection()
   {
      return group.getSelection().getActionCommand();
   }
}

