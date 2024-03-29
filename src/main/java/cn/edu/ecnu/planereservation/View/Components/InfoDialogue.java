/*
 * Created by JFormDesigner on Thu Dec 24 02:22:30 CST 2020
 */

package cn.edu.ecnu.planereservation.View.Components;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * @author unknown
 */
public class InfoDialogue extends JDialog {
    public InfoDialogue() {
        initComponents();
    }
    
    public InfoDialogue(String msg) {
        initComponents();
        labMessage.setText("<html>" + msg +  "</html>");
    }
    
    public InfoDialogue(String msg, String title) {
        initComponents();
        labMessage.setText(msg);
        this.setTitle(title);
    }

    private void btnOKActionPerformed(ActionEvent e) {
        dispose();
    }

    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
		dialogPane = new JPanel();
		contentPanel = new JPanel();
		labMessage = new JLabel();
		buttonBar = new JPanel();
		btnOK = new JButton();

		//======== this ========
		setTitle("Message");
		var contentPane = getContentPane();
		contentPane.setLayout(new BorderLayout());

		//======== dialogPane ========
		{
			dialogPane.setBorder(new EmptyBorder(12, 12, 12, 12));
			dialogPane.setLayout(new BorderLayout());

			//======== contentPanel ========
			{
				contentPanel.setLayout(new BorderLayout());

				//---- labMessage ----
				labMessage.setText("Your reservation has been confirmed.");
				labMessage.setFont(new Font("SF Pro Display", Font.PLAIN, 14));
				contentPanel.add(labMessage, BorderLayout.NORTH);
			}
			dialogPane.add(contentPanel, BorderLayout.CENTER);

			//======== buttonBar ========
			{
				buttonBar.setBorder(new EmptyBorder(12, 0, 0, 0));
				buttonBar.setLayout(new GridBagLayout());
				((GridBagLayout)buttonBar.getLayout()).columnWidths = new int[] {0, 80};
				((GridBagLayout)buttonBar.getLayout()).columnWeights = new double[] {1.0, 0.0};

				//---- btnOK ----
				btnOK.setText("OK");
				btnOK.setFont(new Font("SF Pro Display", Font.PLAIN, 14));
				btnOK.addActionListener(e -> btnOKActionPerformed(e));
				buttonBar.add(btnOK, new GridBagConstraints(1, 0, 1, 1, 0.0, 0.0,
					GridBagConstraints.CENTER, GridBagConstraints.BOTH,
					new Insets(0, 0, 0, 0), 0, 0));
			}
			dialogPane.add(buttonBar, BorderLayout.SOUTH);
		}
		contentPane.add(dialogPane, BorderLayout.CENTER);
		setSize(415, 180);
		setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
	private JPanel dialogPane;
	private JPanel contentPanel;
	private JLabel labMessage;
	private JPanel buttonBar;
	private JButton btnOK;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
}
