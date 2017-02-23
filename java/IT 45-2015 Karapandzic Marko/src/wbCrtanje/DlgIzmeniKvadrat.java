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

import geometrija.Kvadrat;
import geometrija.Tacka;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DlgIzmeniKvadrat extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtGornjaLevaX;
	private JTextField txtGornjaLevaY;
	private JTextField txtDuzinaStranice;
	private JTextField txtBojaIvice;
	private JTextField txtBojaUnutrasnjosti;
	private Kvadrat kv;
	private Kvadrat noviKv;
	private Color bojaIvice;
	private Color bojaUnutrasnjosti;
	private boolean stop = true;
	private boolean pot = false;
	private boolean izb = false;
	private JFrame mainFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgIzmeniKvadrat dialog = new DlgIzmeniKvadrat();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgIzmeniKvadrat() {
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		GridBagLayout gbl_contentPanel = new GridBagLayout();
		gbl_contentPanel.columnWidths = new int[]{0, 0, 0};
		gbl_contentPanel.rowHeights = new int[]{0, 0, 0, 0, 0, 0};
		gbl_contentPanel.columnWeights = new double[]{0.0, 1.0, Double.MIN_VALUE};
		gbl_contentPanel.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPanel.setLayout(gbl_contentPanel);
		{
			JLabel lblGornjaLevaTacka = new JLabel("Gornja Leva Tacka X");
			GridBagConstraints gbc_lblGornjaLevaTacka = new GridBagConstraints();
			gbc_lblGornjaLevaTacka.anchor = GridBagConstraints.EAST;
			gbc_lblGornjaLevaTacka.insets = new Insets(0, 0, 5, 5);
			gbc_lblGornjaLevaTacka.gridx = 0;
			gbc_lblGornjaLevaTacka.gridy = 0;
			contentPanel.add(lblGornjaLevaTacka, gbc_lblGornjaLevaTacka);
		}
		{
			txtGornjaLevaX = new JTextField();
			GridBagConstraints gbc_txtGornjaLevaX = new GridBagConstraints();
			gbc_txtGornjaLevaX.insets = new Insets(0, 0, 5, 0);
			gbc_txtGornjaLevaX.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtGornjaLevaX.gridx = 1;
			gbc_txtGornjaLevaX.gridy = 0;
			contentPanel.add(txtGornjaLevaX, gbc_txtGornjaLevaX);
			txtGornjaLevaX.setColumns(10);
		}
		{
			JLabel lblGornjaLevaTacka_1 = new JLabel("Gornja Leva Tacka Y");
			GridBagConstraints gbc_lblGornjaLevaTacka_1 = new GridBagConstraints();
			gbc_lblGornjaLevaTacka_1.anchor = GridBagConstraints.EAST;
			gbc_lblGornjaLevaTacka_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblGornjaLevaTacka_1.gridx = 0;
			gbc_lblGornjaLevaTacka_1.gridy = 1;
			contentPanel.add(lblGornjaLevaTacka_1, gbc_lblGornjaLevaTacka_1);
		}
		{
			txtGornjaLevaY = new JTextField();
			GridBagConstraints gbc_txtGornjaLevaY = new GridBagConstraints();
			gbc_txtGornjaLevaY.insets = new Insets(0, 0, 5, 0);
			gbc_txtGornjaLevaY.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtGornjaLevaY.gridx = 1;
			gbc_txtGornjaLevaY.gridy = 1;
			contentPanel.add(txtGornjaLevaY, gbc_txtGornjaLevaY);
			txtGornjaLevaY.setColumns(10);
		}
		{
			JLabel lblDuzinaStranice = new JLabel("Duzina Stranice");
			GridBagConstraints gbc_lblDuzinaStranice = new GridBagConstraints();
			gbc_lblDuzinaStranice.anchor = GridBagConstraints.EAST;
			gbc_lblDuzinaStranice.insets = new Insets(0, 0, 5, 5);
			gbc_lblDuzinaStranice.gridx = 0;
			gbc_lblDuzinaStranice.gridy = 2;
			contentPanel.add(lblDuzinaStranice, gbc_lblDuzinaStranice);
		}
		{
			txtDuzinaStranice = new JTextField();
			GridBagConstraints gbc_txtDuzinaStranice = new GridBagConstraints();
			gbc_txtDuzinaStranice.insets = new Insets(0, 0, 5, 0);
			gbc_txtDuzinaStranice.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtDuzinaStranice.gridx = 1;
			gbc_txtDuzinaStranice.gridy = 2;
			contentPanel.add(txtDuzinaStranice, gbc_txtDuzinaStranice);
			txtDuzinaStranice.setColumns(10);
		}
		{
			JLabel lblBojaIvice = new JLabel("Boja Ivice");
			GridBagConstraints gbc_lblBojaIvice = new GridBagConstraints();
			gbc_lblBojaIvice.anchor = GridBagConstraints.EAST;
			gbc_lblBojaIvice.insets = new Insets(0, 0, 5, 5);
			gbc_lblBojaIvice.gridx = 0;
			gbc_lblBojaIvice.gridy = 3;
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
			gbc_txtBojaIvice.gridy = 3;
			contentPanel.add(txtBojaIvice, gbc_txtBojaIvice);
			txtBojaIvice.setColumns(10);
		}
		{
			JLabel lblBojaUnutrasnjosti = new JLabel("Boja Unutrasnjosti");
			GridBagConstraints gbc_lblBojaUnutrasnjosti = new GridBagConstraints();
			gbc_lblBojaUnutrasnjosti.anchor = GridBagConstraints.EAST;
			gbc_lblBojaUnutrasnjosti.insets = new Insets(0, 0, 0, 5);
			gbc_lblBojaUnutrasnjosti.gridx = 0;
			gbc_lblBojaUnutrasnjosti.gridy = 4;
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
			gbc_txtBojaUnutrasnjosti.gridy = 4;
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
			{
				JButton btnPotvrdi = new JButton("Potvrdi");
				btnPotvrdi.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						noviKv = new Kvadrat(
								new Tacka(
									Integer.parseInt(txtGornjaLevaX.getText()),
									Integer.parseInt(txtGornjaLevaY.getText())	
								),
								Integer.parseInt(txtDuzinaStranice.getText()),
								bojaIvice,
								bojaUnutrasnjosti,
								kv.index
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
					txtBojaIvice.setBackground(kv.getBojaIvice());
					txtGornjaLevaX.setText(Integer.toString(kv.getGoreLevo().getX()));
					txtGornjaLevaY.setText(Integer.toString(kv.getGoreLevo().getY()));
					txtBojaUnutrasnjosti.setBackground(kv.getBojaUnutrasnjosti2());
					txtDuzinaStranice.setText(Integer.toString(kv.getDuzinaStranica()));
					stop = false;
				}
			}
		});
	}

	public Kvadrat getKv() {
		return kv;
	}

	public void setKv(Kvadrat kv) {
		this.kv = kv;
	}

	public Kvadrat getNoviKv() {
		return noviKv;
	}

	public void setNoviKv(Kvadrat noviKv) {
		this.noviKv = noviKv;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

	public boolean isPot() {
		return pot;
	}

	public void setPot(boolean pri) {
		this.pot = pri;
	}

	public boolean isIzb() {
		return izb;
	}

	public void setIzb(boolean izb) {
		this.izb = izb;
	}

}
