
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class SelectingCheckBox {
  public static void main(String args[]) {
    JFrame frame = new JFrame("Selecting CheckBox");
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JCheckBox checkBox = new JCheckBox("A");
    // Define ActionListener
    ActionListener actionListener = new ActionListener() {
      public void actionPerformed(ActionEvent actionEvent) {
        AbstractButton abstractButton = (AbstractButton) actionEvent.getSource();
        boolean selected = abstractButton.getModel().isSelected();
        String newLabel = (selected ? "A" : "B");
        abstractButton.setText(newLabel);
      }
    };
    // Define ChangeListener
    ChangeListener changeListener = new ChangeListener() {
      public void stateChanged(ChangeEvent changeEvent) {
        AbstractButton abstractButton = (AbstractButton) changeEvent.getSource();
        ButtonModel buttonModel = abstractButton.getModel();
        boolean armed = buttonModel.isArmed();
        boolean pressed = buttonModel.isPressed();
        boolean selected = buttonModel.isSelected();
        System.out.println("Changed: " + armed + "/" + pressed + "/" + selected);
      }
    };
    // Define ItemListener
    ItemListener itemListener = new ItemListener() {
      public void itemStateChanged(ItemEvent itemEvent) {
        AbstractButton abstractButton = (AbstractButton) itemEvent.getSource();
        Color foreground = abstractButton.getForeground();
        Color background = abstractButton.getBackground();
        int state = itemEvent.getStateChange();
        if (state == ItemEvent.SELECTED) {
          abstractButton.setForeground(background);
          abstractButton.setBackground(foreground);
        }
      }
    };
    // Attach Listeners
    checkBox.addActionListener(actionListener);
    checkBox.addChangeListener(changeListener);
    checkBox.addItemListener(itemListener);
    checkBox.setMnemonic(KeyEvent.VK_S);
    frame.add(checkBox, BorderLayout.NORTH);
    frame.setSize(300, 100);
    frame.setVisible(true);
  }
}