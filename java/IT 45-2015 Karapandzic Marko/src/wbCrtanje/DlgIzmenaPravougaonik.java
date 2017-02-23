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

import geometrija.Pravougaonik;
import geometrija.Tacka;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgIzmenaPravougaonik extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtGoreLevoX;
	private JTextField txtGoreLevoY;
	private JTextField txtVisina;
	private JTextField txtSirina;
	private JTextField txtBojaIvice;
	private JTextField txtBojaUnutrasnjosti;
	private Pravougaonik pv;
	private Pravougaonik noviPv;
	private boolean pot = false;
	private boolean izb = false;
	private boolean stop = true;
	private Color bojaIvice;
	private Color bojaUnutrasnjosti;
	private JFrame mainFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgIzmenaPravougaonik dialog = new DlgIzmenaPravougaonik();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgIzmenaPravougaonik() {
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblGoreLevoX = new JLabel("Gore Levo X");
			GridBagConstraints gbc_lblGoreLevoX = new GridBagConstraints();
			gbc_lblGoreLevoX.anchor = GridBagConstraints.EAST;
			gbc_lblGoreLevoX.insets = new Insets(0, 0, 5, 5);
			gbc_lblGoreLevoX.gridx = 0;
			gbc_lblGoreLevoX.gridy = 0;
			contentPanel.add(lblGoreLevoX, gbc_lblGoreLevoX);
		}
		{
			txtGoreLevoX = new JTextField();
			GridBagConstraints gbc_txtGoreLevoX = new GridBagConstraints();
			gbc_txtGoreLevoX.insets = new Insets(0, 0, 5, 0);
			gbc_txtGoreLevoX.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtGoreLevoX.gridx = 1;
			gbc_txtGoreLevoX.gridy = 0;
			contentPanel.add(txtGoreLevoX, gbc_txtGoreLevoX);
			txtGoreLevoX.setColumns(10);
		}
		{
			JLabel lblGoreLevoY = new JLabel("Gore Levo Y");
			GridBagConstraints gbc_lblGoreLevoY = new GridBagConstraints();
			gbc_lblGoreLevoY.anchor = GridBagConstraints.EAST;
			gbc_lblGoreLevoY.insets = new Insets(0, 0, 5, 5);
			gbc_lblGoreLevoY.gridx = 0;
			gbc_lblGoreLevoY.gridy = 1;
			contentPanel.add(lblGoreLevoY, gbc_lblGoreLevoY);
		}
		{
			txtGoreLevoY = new JTextField();
			GridBagConstraints gbc_txtGoreLevoY = new GridBagConstraints();
			gbc_txtGoreLevoY.insets = new Insets(0, 0, 5, 0);
			gbc_txtGoreLevoY.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtGoreLevoY.gridx = 1;
			gbc_txtGoreLevoY.gridy = 1;
			contentPanel.add(txtGoreLevoY, gbc_txtGoreLevoY);
			txtGoreLevoY.setColumns(10);
		}
		{
			JLabel lblVisina = new JLabel("Visina");
			GridBagConstraints gbc_lblVisina = new GridBagConstraints();
			gbc_lblVisina.anchor = GridBagConstraints.EAST;
			gbc_lblVisina.insets = new Insets(0, 0, 5, 5);
			gbc_lblVisina.gridx = 0;
			gbc_lblVisina.gridy = 2;
			contentPanel.add(lblVisina, gbc_lblVisina);
		}
		{
			txtVisina = new JTextField();
			GridBagConstraints gbc_txtVisina = new GridBagConstraints();
			gbc_txtVisina.insets = new Insets(0, 0, 5, 0);
			gbc_txtVisina.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtVisina.gridx = 1;
			gbc_txtVisina.gridy = 2;
			contentPanel.add(txtVisina, gbc_txtVisina);
			txtVisina.setColumns(10);
		}
		{
			JLabel lblSirina = new JLabel("Sirina");
			GridBagConstraints gbc_lblSirina = new GridBagConstraints();
			gbc_lblSirina.anchor = GridBagConstraints.EAST;
			gbc_lblSirina.insets = new Insets(0, 0, 5, 5);
			gbc_lblSirina.gridx = 0;
			gbc_lblSirina.gridy = 3;
			contentPanel.add(lblSirina, gbc_lblSirina);
		}
		{
			txtSirina = new JTextField();
			GridBagConstraints gbc_txtSirina = new GridBagConstraints();
			gbc_txtSirina.insets = new Insets(0, 0, 5, 0);
			gbc_txtSirina.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtSirina.gridx = 1;
			gbc_txtSirina.gridy = 3;
			contentPanel.add(txtSirina, gbc_txtSirina);
			txtSirina.setColumns(10);
		}
		{
			JLabel lblBojaIvice = new JLabel("Boja Ivice");
			GridBagConstraints gbc_lblBojaIvice = new GridBagConstraints();
			gbc_lblBojaIvice.anchor = GridBagConstraints.EAST;
			gbc_lblBojaIvice.insets = new Insets(0, 0, 5, 5);
			gbc_lblBojaIvice.gridx = 0;
			gbc_lblBojaIvice.gridy = 4;
			contentPanel.add(lblBojaIvice, gbc_lblBojaIvice);
		}
		{
			txtBojaIvice = new JTextField();
			txtBojaIvice.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					bojaIvice = JColorChooser.showDialog(
							mainFrame, 
							"Izaberi boju ivice", 
							Color.black
					);
					if (bojaIvice != null)
						txtBojaIvice.setBackground(bojaIvice);
				}
			});
			GridBagConstraints gbc_txtBojaIvice = new GridBagConstraints();
			gbc_txtBojaIvice.insets = new Insets(0, 0, 5, 0);
			gbc_txtBojaIvice.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtBojaIvice.gridx = 1;
			gbc_txtBojaIvice.gridy = 4;
			contentPanel.add(txtBojaIvice, gbc_txtBojaIvice);
			txtBojaIvice.setColumns(10);
		}
		{
			JLabel lblBojaUnutrasnjosti = new JLabel("Boja Unutrasnjosti");
			GridBagConstraints gbc_lblBojaUnutrasnjosti = new GridBagConstraints();
			gbc_lblBojaUnutrasnjosti.anchor = GridBagConstraints.EAST;
			gbc_lblBojaUnutrasnjosti.insets = new Insets(0, 0, 0, 5);
			gbc_lblBojaUnutrasnjosti.gridx = 0;
			gbc_lblBojaUnutrasnjosti.gridy = 5;
			contentPanel.add(lblBojaUnutrasnjosti, gbc_lblBojaUnutrasnjosti);
		}
		{
			txtBojaUnutrasnjosti = new JTextField();
			txtBojaUnutrasnjosti.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent e) {
					bojaUnutrasnjosti = JColorChooser.showDialog(
							mainFrame,
							"Izaberi boju unutrasnjosti", 
							Color.black
					);
					if (bojaUnutrasnjosti != null)
						txtBojaUnutrasnjosti.setBackground(bojaUnutrasnjosti);
				}
			});
			GridBagConstraints gbc_txtBojaUnutrasnjosti = new GridBagConstraints();
			gbc_txtBojaUnutrasnjosti.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtBojaUnutrasnjosti.gridx = 1;
			gbc_txtBojaUnutrasnjosti.gridy = 5;
			contentPanel.add(txtBojaUnutrasnjosti, gbc_txtBojaUnutrasnjosti);
			txtBojaUnutrasnjosti.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			GridBagLayout gbl_buttonPane = new GridBagLayout();
			gbl_buttonPane.columnWidths = new int[]{312, 47, 65, 0};
			gbl_buttonPane.rowHeights = new int[]{23, 0};
			gbl_buttonPane.columnWeights = new double[]{0.0, 0.0, 0.0, Double.MIN_VALUE};
			gbl_buttonPane.rowWeights = new double[]{0.0, Double.MIN_VALUE};
			buttonPane.setLayout(gbl_buttonPane);
			{
				JButton btnIzbrisi = new JButton("Izbrisi");
				btnIzbrisi.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						izb = true;
						pot = false;
						setVisible(false);
					}
				});
				GridBagConstraints gbc_btnIzbrisi = new GridBagConstraints();
				gbc_btnIzbrisi.anchor = GridBagConstraints.SOUTH;
				gbc_btnIzbrisi.insets = new Insets(0, 0, 0, 5);
				gbc_btnIzbrisi.gridx = 0;
				gbc_btnIzbrisi.gridy = 0;
				buttonPane.add(btnIzbrisi, gbc_btnIzbrisi);
			}
			{
				JButton btnPotvrdi = new JButton("Potvrdi");
				btnPotvrdi.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {
						noviPv = new Pravougaonik(
								new Tacka(
										Integer.parseInt(txtGoreLevoX.getText()),
										Integer.parseInt(txtGoreLevoY.getText())	
								),
								Integer.parseInt(txtVisina.getText()),
								Integer.parseInt(txtSirina.getText()),
								bojaIvice,
								bojaUnutrasnjosti,
								pv.index
						);
						pot = true;
						izb = false;
						setVisible(false);
					}
				});
				btnPotvrdi.setActionCommand("OK");
				GridBagConstraints gbc_btnPotvrdi = new GridBagConstraints();
				gbc_btnPotvrdi.anchor = GridBagConstraints.NORTHWEST;
				gbc_btnPotvrdi.insets = new Insets(0, 0, 0, 5);
				gbc_btnPotvrdi.gridx = 1;
				gbc_btnPotvrdi.gridy = 0;
				buttonPane.add(btnPotvrdi, gbc_btnPotvrdi);
				getRootPane().setDefaultButton(btnPotvrdi);
			}
			{
				JButton btnOdustani = new JButton("Odustani");
				btnOdustani.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						pot = false;
						izb = false;
						setVisible(false);
					}
				});
				btnOdustani.setActionCommand("Cancel");
				GridBagConstraints gbc_btnOdustani = new GridBagConstraints();
				gbc_btnOdustani.anchor = GridBagConstraints.NORTHWEST;
				gbc_btnOdustani.gridx = 2;
				gbc_btnOdustani.gridy = 0;
				buttonPane.add(btnOdustani, gbc_btnOdustani);
			}
		}
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
				if (stop){
					txtBojaIvice.setBackground(pv.getBojaIvice());
					txtGoreLevoX.setText(Integer.toString(pv.getGoreLevo().getX()));
					txtGoreLevoY.setText(Integer.toString(pv.getGoreLevo().getY()));
					txtBojaUnutrasnjosti.setBackground(pv.getBojaUnutrasnjosti2());
					txtVisina.setText(Integer.toString(pv.getDuzinaStranica()));
					txtSirina.setText(Integer.toString(pv.getDuzinaStranica()));
					stop = false;
				}
			}
		});
	}

	public Pravougaonik getPv() {
		return pv;
	}

	public void setPv(Pravougaonik pv) {
		this.pv = pv;
	}

	public Pravougaonik getNoviPv() {
		return noviPv;
	}

	public void setNoviPv(Pravougaonik noviPv) {
		this.noviPv = noviPv;
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

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

}