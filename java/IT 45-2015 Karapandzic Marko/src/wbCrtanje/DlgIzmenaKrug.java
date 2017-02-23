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

import geometrija.Krug;
import geometrija.Tacka;

import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class DlgIzmenaKrug extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtX;
	private JTextField txtY;
	private JTextField txtR;
	private JTextField txtBojaIvice;
	private JTextField txtBojaUnutrasnjosti;
	private Color bojaIvice;
	private Color bojaUnutrasnjosti;
	private Krug kr;
	private Krug noviKr;
	private boolean izb = false;
	private boolean pot = false;
	private boolean stop = true;
	private JFrame mainFrame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgIzmenaKrug dialog = new DlgIzmenaKrug();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgIzmenaKrug() {
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
			JLabel lblTackaX = new JLabel("Tacka X");
			GridBagConstraints gbc_lblTackaX = new GridBagConstraints();
			gbc_lblTackaX.anchor = GridBagConstraints.EAST;
			gbc_lblTackaX.insets = new Insets(0, 0, 5, 5);
			gbc_lblTackaX.gridx = 0;
			gbc_lblTackaX.gridy = 0;
			contentPanel.add(lblTackaX, gbc_lblTackaX);
		}
		{
			txtX = new JTextField();
			GridBagConstraints gbc_txtX = new GridBagConstraints();
			gbc_txtX.anchor = GridBagConstraints.NORTH;
			gbc_txtX.insets = new Insets(0, 0, 5, 0);
			gbc_txtX.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtX.gridx = 1;
			gbc_txtX.gridy = 0;
			contentPanel.add(txtX, gbc_txtX);
			txtX.setColumns(10);
		}
		{
			JLabel lblTackaY = new JLabel("Tacka Y");
			GridBagConstraints gbc_lblTackaY = new GridBagConstraints();
			gbc_lblTackaY.anchor = GridBagConstraints.EAST;
			gbc_lblTackaY.insets = new Insets(0, 0, 5, 5);
			gbc_lblTackaY.gridx = 0;
			gbc_lblTackaY.gridy = 1;
			contentPanel.add(lblTackaY, gbc_lblTackaY);
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
			JLabel lblPoluprecnik = new JLabel("Poluprecnik");
			GridBagConstraints gbc_lblPoluprecnik = new GridBagConstraints();
			gbc_lblPoluprecnik.anchor = GridBagConstraints.EAST;
			gbc_lblPoluprecnik.insets = new Insets(0, 0, 5, 5);
			gbc_lblPoluprecnik.gridx = 0;
			gbc_lblPoluprecnik.gridy = 2;
			contentPanel.add(lblPoluprecnik, gbc_lblPoluprecnik);
		}
		{
			txtR = new JTextField();
			GridBagConstraints gbc_txtR = new GridBagConstraints();
			gbc_txtR.insets = new Insets(0, 0, 5, 0);
			gbc_txtR.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtR.gridx = 1;
			gbc_txtR.gridy = 2;
			contentPanel.add(txtR, gbc_txtR);
			txtR.setColumns(10);
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
				public void mouseClicked(MouseEvent e) {
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
						noviKr = new Krug(
								new Tacka(
										Integer.parseInt(txtX.getText()),
										Integer.parseInt(txtY.getText())
								),
								Integer.parseInt(txtR.getText()),
								bojaIvice,
								bojaUnutrasnjosti,
								kr.index
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
					txtBojaIvice.setBackground(kr.getBojaIvice());
					txtX.setText(Integer.toString(kr.getCentar().getX()));
					txtY.setText(Integer.toString(kr.getCentar().getY()));
					txtBojaUnutrasnjosti.setBackground(kr.getKrUnutrasnjost());
					txtR.setText(Integer.toString(kr.getR()));
					stop = false;
				}
			}
		});
	}

	public Krug getKr() {
		return kr;
	}

	public void setKr(Krug kr) {
		this.kr = kr;
	}

	public Krug getNoviKr() {
		return noviKr;
	}

	public void setNoviKr(Krug noviKr) {
		this.noviKr = noviKr;
	}

	public boolean isIzb() {
		return izb;
	}

	public void setIzb(boolean izb) {
		this.izb = izb;
	}

	public boolean isPot() {
		return pot;
	}

	public void setPot(boolean pot) {
		this.pot = pot;
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}

}
