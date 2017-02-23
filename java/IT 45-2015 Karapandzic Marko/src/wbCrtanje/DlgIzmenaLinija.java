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

import geometrija.Linija;
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

public class DlgIzmenaLinija extends JDialog {

	private final JPanel contentPanel = new JPanel();
	private JTextField txtX1;
	private JTextField txtY1;
	private JTextField txtX2;
	private JTextField txtY2;
	private Linija l;
	private Linija novaL;
	private boolean izb = false;
	private boolean pot = true;
	private JTextField txtBoja;
	private JFrame mainFrame;
	private Color boja;
	private boolean stop = true;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			DlgIzmenaLinija dialog = new DlgIzmenaLinija();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public DlgIzmenaLinija() {
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
			JLabel lblVrednostX = new JLabel("Vrednost X1");
			GridBagConstraints gbc_lblVrednostX = new GridBagConstraints();
			gbc_lblVrednostX.anchor = GridBagConstraints.EAST;
			gbc_lblVrednostX.insets = new Insets(0, 0, 5, 5);
			gbc_lblVrednostX.gridx = 0;
			gbc_lblVrednostX.gridy = 0;
			contentPanel.add(lblVrednostX, gbc_lblVrednostX);
		}
		{
			txtX1 = new JTextField();
			GridBagConstraints gbc_txtX1 = new GridBagConstraints();
			gbc_txtX1.insets = new Insets(0, 0, 5, 0);
			gbc_txtX1.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtX1.gridx = 1;
			gbc_txtX1.gridy = 0;
			contentPanel.add(txtX1, gbc_txtX1);
			txtX1.setColumns(10);
		}
		{
			JLabel lblVrednostY = new JLabel("Vrednost Y1");
			GridBagConstraints gbc_lblVrednostY = new GridBagConstraints();
			gbc_lblVrednostY.anchor = GridBagConstraints.EAST;
			gbc_lblVrednostY.insets = new Insets(0, 0, 5, 5);
			gbc_lblVrednostY.gridx = 0;
			gbc_lblVrednostY.gridy = 1;
			contentPanel.add(lblVrednostY, gbc_lblVrednostY);
		}
		{
			txtY1 = new JTextField();
			GridBagConstraints gbc_txtY1 = new GridBagConstraints();
			gbc_txtY1.insets = new Insets(0, 0, 5, 0);
			gbc_txtY1.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtY1.gridx = 1;
			gbc_txtY1.gridy = 1;
			contentPanel.add(txtY1, gbc_txtY1);
			txtY1.setColumns(10);
		}
		{
			JLabel lblVrednostX_1 = new JLabel("Vrednost X2");
			GridBagConstraints gbc_lblVrednostX_1 = new GridBagConstraints();
			gbc_lblVrednostX_1.anchor = GridBagConstraints.EAST;
			gbc_lblVrednostX_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblVrednostX_1.gridx = 0;
			gbc_lblVrednostX_1.gridy = 2;
			contentPanel.add(lblVrednostX_1, gbc_lblVrednostX_1);
		}
		{
			txtX2 = new JTextField();
			GridBagConstraints gbc_txtX2 = new GridBagConstraints();
			gbc_txtX2.insets = new Insets(0, 0, 5, 0);
			gbc_txtX2.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtX2.gridx = 1;
			gbc_txtX2.gridy = 2;
			contentPanel.add(txtX2, gbc_txtX2);
			txtX2.setColumns(10);
		}
		{
			JLabel lblVrednostY_1 = new JLabel("Vrednost Y2");
			GridBagConstraints gbc_lblVrednostY_1 = new GridBagConstraints();
			gbc_lblVrednostY_1.anchor = GridBagConstraints.EAST;
			gbc_lblVrednostY_1.insets = new Insets(0, 0, 5, 5);
			gbc_lblVrednostY_1.gridx = 0;
			gbc_lblVrednostY_1.gridy = 3;
			contentPanel.add(lblVrednostY_1, gbc_lblVrednostY_1);
		}
		{
			txtY2 = new JTextField();
			GridBagConstraints gbc_txtY2 = new GridBagConstraints();
			gbc_txtY2.insets = new Insets(0, 0, 5, 0);
			gbc_txtY2.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtY2.gridx = 1;
			gbc_txtY2.gridy = 3;
			contentPanel.add(txtY2, gbc_txtY2);
			txtY2.setColumns(10);
		}
		{
			JLabel lblBoja = new JLabel("Boja");
			GridBagConstraints gbc_lblBoja = new GridBagConstraints();
			gbc_lblBoja.anchor = GridBagConstraints.EAST;
			gbc_lblBoja.insets = new Insets(0, 0, 0, 5);
			gbc_lblBoja.gridx = 0;
			gbc_lblBoja.gridy = 4;
			contentPanel.add(lblBoja, gbc_lblBoja);
		}
		{
			txtBoja = new JTextField();
			txtBoja.addMouseListener(new MouseAdapter() {
				@Override
				public void mouseClicked(MouseEvent arg0) {
					boja = JColorChooser.showDialog(
							mainFrame, 
							"Izaberi boju Linije", 
							Color.black
					);
					if (boja != null)
						txtBoja.setBackground(boja);
				}
			});
			GridBagConstraints gbc_txtBoja = new GridBagConstraints();
			gbc_txtBoja.fill = GridBagConstraints.HORIZONTAL;
			gbc_txtBoja.gridx = 1;
			gbc_txtBoja.gridy = 4;
			contentPanel.add(txtBoja, gbc_txtBoja);
			txtBoja.setColumns(10);
		}
		{
			JPanel buttonPane = new JPanel();
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			GridBagLayout gbl_buttonPane = new GridBagLayout();
			gbl_buttonPane.columnWidths = new int[]{282, 67, 75, 0};
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
						novaL = new Linija(
								new Tacka(
										Integer.parseInt(txtX1.getText()),
										Integer.parseInt(txtY1.getText())
								),
								new Tacka(
										Integer.parseInt(txtX2.getText()),
										Integer.parseInt(txtY2.getText())
								),
								boja,
								l.index
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
					txtBoja.setBackground(l.getBojaIvice());
					txtX1.setText(Integer.toString(l.gettPocetna().getX()));
					txtY1.setText(Integer.toString(l.gettPocetna().getY()));
					txtX2.setText(Integer.toString(l.gettKrajnja().getX()));
					txtY2.setText(Integer.toString(l.gettKrajnja().getY()));
					stop = false;
				}
			}
		});
	}

	public Linija getL() {
		return l;
	}

	public void setL(Linija l) {
		this.l = l;
	}

	public Linija getNovaL() {
		return novaL;
	}

	public void setNovaL(Linija novaL) {
		this.novaL = novaL;
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
