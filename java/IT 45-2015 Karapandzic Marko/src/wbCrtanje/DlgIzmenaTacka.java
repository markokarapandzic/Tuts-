package wbCrtanje;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import geometrija.Tacka;

import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class DlgIzmenaTacka extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtX;
	private JTextField txtY;
	private JTextField txtBojaIvice;
	private Tacka t;
	private Tacka novaT;
	public Color boja = Color.BLACK;
	private Color bojaIvice;
	private JFrame mainFrame;
	GlavniMeni g = new GlavniMeni();
	boolean stop = true;
	private boolean pot = false;
	private boolean izb = false;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgIzmenaTacka dialog = new DlgIzmenaTacka();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgIzmenaTacka() {
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblVrednostX = new JLabel("Vrednost X");
			GridBagConstraints gbc_lblVrednostX = new GridBagConstraints();
			gbc_lblVrednostX.anchor = GridBagConstraints.EAST;
			gbc_lblVrednostX.insets = new Insets(0, 0, 5, 5);
			gbc_lblVrednostX.gridx = 0;
			gbc_lblVrednostX.gridy = 0;
			contentPanel.add(lblVrednostX, gbc_lblVrednostX);
		}
		{
			txtX = new JTextField();
			GridBagConstraints gbc_txtX = new GridBagConstraints();
			gbc_txtX.insets = new Insets(0, 0, 5, 0);
			gbc_txtX.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtX.gridx = 1;
			gbc_txtX.gridy = 0;
			contentPanel.add(txtX, gbc_txtX);
			txtX.setColumns(10);
		}
		{
			JLabel lblVrednostY = new JLabel("Vrednost Y");
			GridBagConstraints gbc_lblVrednostY = new GridBagConstraints();
			gbc_lblVrednostY.anchor = GridBagConstraints.EAST;
			gbc_lblVrednostY.insets = new Insets(0, 0, 5, 5);
			gbc_lblVrednostY.gridx = 0;
			gbc_lblVrednostY.gridy = 1;
			contentPanel.add(lblVrednostY, gbc_lblVrednostY);
		}
		{
			txtY = new JTextField();
			GridBagConstraints gbc_txtY = new GridBagConstraints();
			gbc_txtY.insets = new Insets(0, 0, 5, 0);
			gbc_txtY.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtY.gridx = 1;
			gbc_txtY.gridy = 1;
			contentPanel.add(txtY, gbc_txtY);
			txtY.setColumns(10);
		}
		{
			JLabel lblBojaIvice = new JLabel("Boja Ivice");
			GridBagConstraints gbc_lblBojaIvice = new GridBagConstraints();
			gbc_lblBojaIvice.anchor = GridBagConstraints.EAST;
			gbc_lblBojaIvice.insets = new Insets(0, 0, 5, 5);
			gbc_lblBojaIvice.gridx = 0;
			gbc_lblBojaIvice.gridy = 2;
			contentPanel.add(lblBojaIvice, gbc_lblBojaIvice);
		}
		{
			txtBojaIvice = new JTextField();
			GridBagConstraints gbc_txtBojaIvice = new GridBagConstraints();
			gbc_txtBojaIvice.anchor = GridBagConstraints.NORTH;
			gbc_txtBojaIvice.insets = new Insets(0, 0, 5, 0);
			gbc_txtBojaIvice.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtBojaIvice.gridx = 1;
			gbc_txtBojaIvice.gridy = 2;
			contentPanel.add(txtBojaIvice, gbc_txtBojaIvice);
			txtBojaIvice.setColumns(10);
			txtBojaIvice.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					boja = JColorChooser.showDialog(
							mainFrame, 
							"Izaberi boju tačke", 
							Color.black
					);
					if (boja != null)
						txtBojaIvice.setBackground(boja);
				}
			});
		}
		{
			JLabel label = new JLabel("");
			GridBagConstraints gbc_label = new GridBagConstraints();
			gbc_label.insets = new Insets(0, 0, 0, 5);
			gbc_label.gridx = 0;
			gbc_label.gridy = 3;
			contentPanel.add(label, gbc_label);
		}
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				GridBagLayout gbl_buttonPane = new GridBagLayout();
				gbl_buttonPane.columnWidths = new int[]{282, 67, 75, 0};
				gbl_buttonPane.rowHeights = new int[]{23, 0};
				gbl_buttonPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
				gbl_buttonPane.rowWeights = new double[]{0.0, Double.MIN_VALUE};
				buttonPane.setLayout(gbl_buttonPane);
				{
					JButton btnOdustani = new JButton("Odustani");
					btnOdustani.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							pot = false;
							setVisible(false);
						}
					});
					JButton btnPotvrdi = new JButton("Potvrdi");
					btnPotvrdi.addActionListener(new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							novaT = new Tacka(
									Integer.parseInt(txtX.getText()),
									Integer.parseInt(txtY.getText()),
									boja,
									t.index
							);
							pot = true;
							setVisible(false);
						}
					});
					{
						JButton btnIzbrisi = new JButton("Izbrisi");
						btnIzbrisi.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								izb = true;
								pot = false;
								setVisible(false);
							}
						});
						GridBagConstraints gbc_btnIzbrisi = new GridBagConstraints();
						gbc_btnIzbrisi.insets = new Insets(0, 0, 0, 5);
						gbc_btnIzbrisi.gridx = 0;
						gbc_btnIzbrisi.gridy = 0;
						buttonPane.add(btnIzbrisi, gbc_btnIzbrisi);
					}
					btnPotvrdi.setActionCommand("OK");
					GridBagConstraints gbc_btnPotvrdi = new GridBagConstraints();
					gbc_btnPotvrdi.anchor = GridBagConstraints.NORTHWEST;
					gbc_btnPotvrdi.insets = new Insets(0, 0, 0, 5);
					gbc_btnPotvrdi.gridx = 1;
					gbc_btnPotvrdi.gridy = 0;
					buttonPane.add(btnPotvrdi, gbc_btnPotvrdi);
					getRootPane().setDefaultButton(btnPotvrdi);
					btnOdustani.setActionCommand("Cancel");
					GridBagConstraints gbc_btnOdustani = new GridBagConstraints();
					gbc_btnOdustani.anchor = GridBagConstraints.NORTHWEST;
					gbc_btnOdustani.gridx = 2;
					gbc_btnOdustani.gridy = 0;
					buttonPane.add(btnOdustani, gbc_btnOdustani);
				}
			}
		}
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				if (stop){
					txtBojaIvice.setBackground(t.getBojaIvice());
					txtX.setText(Integer.toString(t.getX()));
					txtY.setText(Integer.toString(t.getY()));
					stop = false;
				}
			}
		});
	}

	public Tacka getT() {
		return t;
	}

	public void setT(Tacka t) {
		this.t = t;
	}

	public Color getBojaIvice() {
		return bojaIvice;
	}

	public void setBojaIvice(Color bojaIvice) {
		this.bojaIvice = bojaIvice;
	}

	public Tacka getNovaT() {
		return novaT;
	}

	public void setNovaT(Tacka novaT) {
		this.novaT = novaT;
	}

	public boolean isPot() {
		return pot;
	}

	public void setPot(boolean pot) {
		this.pot = pot;
	}

	public boolean isIzb() {
		return izb;
	}

	public void setIzb(boolean izb) {
		this.izb = izb;
	}

}
