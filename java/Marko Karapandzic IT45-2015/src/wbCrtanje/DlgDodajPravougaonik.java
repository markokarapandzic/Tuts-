package wbCrtanje;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgDodajPravougaonik extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtVisina;
	private JTextField txtDuzina;
	private int sirina;
	private int visina;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgDodajPravougaonik dialog = new DlgDodajPravougaonik();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgDodajPravougaonik() {
		setModal(true);
		setBounds(100, 100, 450, 300);
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{434, 0};
		gridBagLayout.rowHeights = new int[]{228, 33, 0};
		gridBagLayout.columnWeights = new double[]{0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		getContentPane().setLayout(gridBagLayout);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		GridBagConstraints gbc_contentPanel = new GridBagConstraints();
		gbc_contentPanel.fill = GridBagConstraints.BOTH;
		gbc_contentPanel.insets = new Insets(0, 0, 5, 0);
		gbc_contentPanel.gridx = 0;
		gbc_contentPanel.gridy = 0;
		getContentPane().add(contentPanel, gbc_contentPanel);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblVisina = new JLabel("Visina");
			GridBagConstraints gbc_lblVisina = new GridBagConstraints();
			gbc_lblVisina.anchor = GridBagConstraints.EAST;
			gbc_lblVisina.insets = new Insets(0, 0, 5, 5);
			gbc_lblVisina.gridx = 0;
			gbc_lblVisina.gridy = 0;
			contentPanel.add(lblVisina, gbc_lblVisina);
		}
		{
			txtVisina = new JTextField();
			GridBagConstraints gbc_textField = new GridBagConstraints();
			gbc_textField.insets = new Insets(0, 0, 5, 0);
			gbc_textField.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField.gridx = 1;
			gbc_textField.gridy = 0;
			contentPanel.add(txtVisina, gbc_textField);
			txtVisina.setColumns(10);
		}
		{
			JLabel lblSirina = new JLabel("Sirina");
			GridBagConstraints gbc_lblSirina = new GridBagConstraints();
			gbc_lblSirina.anchor = GridBagConstraints.EAST;
			gbc_lblSirina.insets = new Insets(0, 0, 0, 5);
			gbc_lblSirina.gridx = 0;
			gbc_lblSirina.gridy = 1;
			contentPanel.add(lblSirina, gbc_lblSirina);
		}
		{
			txtDuzina = new JTextField();
			GridBagConstraints gbc_textField_1 = new GridBagConstraints();
			gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
			gbc_textField_1.gridx = 1;
			gbc_textField_1.gridy = 1;
			contentPanel.add(txtDuzina, gbc_textField_1);
			txtDuzina.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			GridBagConstraints gbc_buttonPane = new GridBagConstraints();
			gbc_buttonPane.anchor = GridBagConstraints.NORTH;
			gbc_buttonPane.fill = GridBagConstraints.HORIZONTAL;
			gbc_buttonPane.gridx = 0;
			gbc_buttonPane.gridy = 1;
			getContentPane().add(buttonPane, gbc_buttonPane);
			{
				JButton btnPotvrdi = new JButton("Potrvrdi");
				btnPotvrdi.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						sirina = Integer.parseInt(txtDuzina.getText());
						visina = Integer.parseInt(txtVisina.getText());
						setVisible(false);
					}
				});
				btnPotvrdi.setActionCommand("OK");
				buttonPane.add(btnPotvrdi);
				getRootPane().setDefaultButton(btnPotvrdi);
			}
			{
				JButton btnOdustani = new JButton("Odustani");
				btnOdustani.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						setVisible(false);
					}
				});
				btnOdustani.setActionCommand("Cancel");
				buttonPane.add(btnOdustani);
			}
		}
	}

	public int getSirina() {
		return sirina;
	}

	public void setSirina(int duzina) {
		this.sirina = duzina;
	}

	public int getVisina() {
		return visina;
	}

	public void setVisina(int visina) {
		this.visina = visina;
	}

}