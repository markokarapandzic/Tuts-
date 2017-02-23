package wbCrtanje;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import geometrija.Krug;
import geometrija.Kvadrat;
import geometrija.Linija;
import geometrija.Pravougaonik;
import geometrija.Tacka;

import java.awt.GridBagLayout;
import javax.swing.JButton;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.List;

import javax.swing.JToggleButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GlavniMeni extends JFrame {

	private JPanel contentPane;
	JToggleButton tglbtnTacka = new JToggleButton("Tacka");
	JToggleButton tglbtnLinija = new JToggleButton("Linija");
	JToggleButton tglbtnKvadrat = new JToggleButton("Kvadrat");
	JToggleButton tglbtnPravougaonik = new JToggleButton("Pravougaonik");
	JToggleButton tglbtnKrug = new JToggleButton("Krug");
	Color bojaIvice = Color.BLACK;
	Color bojaUnutrasnjosti = Color.BLACK;
	Tacka[] nizT = new Tacka[2];
	int index = 0;
	int listIndex = 0;
	private ArrayList<Object> lista = new ArrayList<Object>();
	ArrayList<Object> selektovani = new ArrayList<Object>();
	private final JButton btnIzadji = new JButton("Izadji");
	private final JToggleButton tglbtnSelektuj = new JToggleButton("Selektuj");
	private Tacka selektovaniElemT;
	private Linija selektovaniElemL;
	private Kvadrat selektovaniElemK;
	private Pravougaonik selektovaniElemP;
	private Krug selektovaniElemKr;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GlavniMeni frame = new GlavniMeni();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void setSelected(JToggleButton model, boolean selected) {
		if (selected)
			model.setSelected(true);
		else
			model.setSelected(false);
	}

	/**
	 * Create the frame.
	 */
	public GlavniMeni() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0,
				0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		tglbtnLinija.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnLinija.isSelected()) {
					tglbtnTacka.setSelected(false);
					tglbtnKvadrat.setSelected(false);
					tglbtnPravougaonik.setSelected(false);
					tglbtnKrug.setSelected(false);
					tglbtnSelektuj.setSelected(false);
				}
			}
		});

		GridBagConstraints gbc_tglbtnTacka = new GridBagConstraints();
		gbc_tglbtnTacka.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnTacka.gridx = 6;
		gbc_tglbtnTacka.gridy = 0;
		tglbtnTacka.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnTacka.isSelected()) {
					tglbtnLinija.setSelected(false);
					tglbtnKvadrat.setSelected(false);
					tglbtnPravougaonik.setSelected(false);
					tglbtnKrug.setSelected(false);
					tglbtnSelektuj.setSelected(false);
				}
			}
		});
		contentPane.add(tglbtnTacka, gbc_tglbtnTacka);
		GridBagConstraints gbc_tglbtnLinija = new GridBagConstraints();
		gbc_tglbtnLinija.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnLinija.gridx = 8;
		gbc_tglbtnLinija.gridy = 0;
		contentPane.add(tglbtnLinija, gbc_tglbtnLinija);

		tglbtnKvadrat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnKvadrat.isSelected()) {
					tglbtnLinija.setSelected(false);
					tglbtnTacka.setSelected(false);
					tglbtnPravougaonik.setSelected(false);
					tglbtnKrug.setSelected(false);
					tglbtnSelektuj.setSelected(false);
				}
			}
		});
		GridBagConstraints gbc_tglbtnKvadrat = new GridBagConstraints();
		gbc_tglbtnKvadrat.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnKvadrat.gridx = 9;
		gbc_tglbtnKvadrat.gridy = 0;
		contentPane.add(tglbtnKvadrat, gbc_tglbtnKvadrat);

		tglbtnPravougaonik.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnPravougaonik.isSelected()) {
					tglbtnLinija.setSelected(false);
					tglbtnKvadrat.setSelected(false);
					tglbtnTacka.setSelected(false);
					tglbtnKrug.setSelected(false);
					tglbtnSelektuj.setSelected(false);
				}
			}
		});
		GridBagConstraints gbc_tglbtnPravougaonik = new GridBagConstraints();
		gbc_tglbtnPravougaonik.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnPravougaonik.gridx = 10;
		gbc_tglbtnPravougaonik.gridy = 0;
		contentPane.add(tglbtnPravougaonik, gbc_tglbtnPravougaonik);

		tglbtnKrug.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnKrug.isSelected()) {
					tglbtnLinija.setSelected(false);
					tglbtnKvadrat.setSelected(false);
					tglbtnTacka.setSelected(false);
					tglbtnPravougaonik.setSelected(false);
					tglbtnSelektuj.setSelected(false);
				}
			}
		});
		GridBagConstraints gbc_tglbtnKrug = new GridBagConstraints();
		gbc_tglbtnKrug.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnKrug.gridx = 11;
		gbc_tglbtnKrug.gridy = 0;
		contentPane.add(tglbtnKrug, gbc_tglbtnKrug);

		// Odabir boje
		JButton btnBoja = new JButton("Boja");
		btnBoja.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				DlgBoja dlgB = new DlgBoja();
				dlgB.setVisible(true);
				if (dlgB.getBojaIvice() != null)
					bojaIvice = dlgB.getBojaIvice();
				if (dlgB.getBojaUnutrasnjosti() != null)
					bojaUnutrasnjosti = dlgB.getBojaUnutrasnjosti();
			}
		});
		GridBagConstraints gbc_btnBoja = new GridBagConstraints();
		gbc_btnBoja.insets = new Insets(0, 0, 5, 5);
		gbc_btnBoja.gridx = 13;
		gbc_btnBoja.gridy = 0;
		contentPane.add(btnBoja, gbc_btnBoja);

		GridBagConstraints gbc_tglbtnSelektuj = new GridBagConstraints();
		gbc_tglbtnSelektuj.insets = new Insets(0, 0, 5, 5);
		gbc_tglbtnSelektuj.gridx = 14;
		gbc_tglbtnSelektuj.gridy = 0;
		tglbtnSelektuj.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (tglbtnSelektuj.isSelected()) {
					tglbtnLinija.setSelected(false);
					tglbtnTacka.setSelected(false);
					tglbtnPravougaonik.setSelected(false);
					tglbtnKrug.setSelected(false);
					tglbtnKvadrat.setSelected(false);
				}
			}
		});

		// Crtanje i pozivanje dlgBoja
		JPanel pnlCrtanje = new JPanel();
		pnlCrtanje.addMouseListener(new MouseAdapter() {
			// Crtanje
			@Override
			public void mouseClicked(MouseEvent klik) {
				if (tglbtnSelektuj.isSelected()) {
					selektovani.clear();
					int vel = lista.size();
					for (int i = 0; i < vel; i++) {
						if (lista.get(i) instanceof Tacka) {
							Tacka t = (Tacka) lista.get(i);
							if (t.isSelektovan())
								System.out.println("Prihvacen " + t);
							selektovani.add(t);
						} else if (lista.get(i) instanceof Linija) {
							Linija l = (Linija) lista.get(i);
							if (l.isSelektovan())
								selektovani.add(l);
						} else if (lista.get(i) instanceof Kvadrat) {
							Kvadrat kv = (Kvadrat) lista.get(i);
							if (kv.isSelektovan())
								selektovani.add(kv);
						} else if (lista.get(i) instanceof Pravougaonik) {
							Pravougaonik pv = (Pravougaonik) lista.get(i);
							if (pv.isSelektovan())
								selektovani.add(pv);
						} else if (lista.get(i) instanceof Krug) {
							Krug kr = (Krug) lista.get(i);
							if (kr.isSelektovan())
								selektovani.add(kr);
						}
					}
					// Odabir poslednjeg elemnenta
					int velSel = selektovani.size();
					int max = 0;
					for (int i = 0; i < velSel; i++) {
						if (selektovani.get(i) instanceof Tacka) {
							Tacka t = (Tacka) selektovani.get(i);
							if (t.index > max)
								max = t.index;
						} else if (selektovani.get(i) instanceof Linija) {
							Linija l = (Linija) selektovani.get(i);
							if (l.index > max)
								max = l.index;
						} else if (selektovani.get(i) instanceof Kvadrat) {
							Kvadrat kv = (Kvadrat) selektovani.get(i);
							if (kv.index > max)
								max = kv.index;
						} else if (selektovani.get(i) instanceof Pravougaonik) {
							Pravougaonik pv = (Pravougaonik) selektovani.get(i);
							if (pv.index > max)
								max = pv.index;
						} else if (selektovani.get(i) instanceof Krug) {
							Krug kr = (Krug) selektovani.get(i);
							if (kr.index > max)
								max = kr.index;
						}
					}
					if (selektovani.size() == 0)
						System.out.println("Prazan");
					for (int i = 0; i < vel; i++) {
						if (lista.get(i) instanceof Tacka) {
							Tacka t = (Tacka) lista.get(i);
							if (t.index == max) {
								repaint();
								DlgIzmenaTacka dlgIT = new DlgIzmenaTacka();
								dlgIT.setT(t);
								dlgIT.setVisible(true);
								if (dlgIT.isIzb())
									lista.remove(t.index);
								else if (dlgIT.isPot()) {
									lista.remove(t.index);
									lista.add(t.index, dlgIT.getNovaT());
								}
								System.out.println("Usao");
								for (int j = 0; j < lista.size(); j++) {
									if (lista.get(j) instanceof Tacka) {
										Tacka p = (Tacka) lista.get(j);
										System.out.println(p);
										p.crtajSe(pnlCrtanje.getGraphics());
									}
									if (lista.get(j) instanceof Linija) {
										Linija p = (Linija) lista.get(j);
										System.out.println(p);
										p.crtajSe(pnlCrtanje.getGraphics());
									}
									if (lista.get(j) instanceof Kvadrat) {
										Kvadrat p = (Kvadrat) lista.get(j);
										p.crtajSe(pnlCrtanje.getGraphics());
										p.popuni(pnlCrtanje.getGraphics());
									}
									if (lista.get(j) instanceof Pravougaonik) {
										Pravougaonik p = (Pravougaonik) lista.get(j);
										p.crtajSe(pnlCrtanje.getGraphics());
										p.popuni(pnlCrtanje.getGraphics());
									}
									if (lista.get(j) instanceof Krug) {
										Krug p = (Krug) lista.get(j);
										p.crtajSe(pnlCrtanje.getGraphics());
										p.popuni(pnlCrtanje.getGraphics());
									}
								}
							}
						} else if (lista.get(i) instanceof Linija) {
							Linija l = (Linija) lista.get(i);
							if (l.index == max) {
								repaint();
								DlgIzmenaLinija dlgIL = new DlgIzmenaLinija();
								dlgIL.setL(l);
								dlgIL.setVisible(true);
								if (dlgIL.isIzb())
									lista.remove(l.index);
								else if (dlgIL.isPot()) {
									lista.remove(l.index);
									lista.add(l.index, dlgIL.getNovaL());
								}
								for (int j = 0; j < lista.size(); j++) {
									if (lista.get(j) instanceof Tacka) {
										Tacka p = (Tacka) lista.get(j);
										p.crtajSe(pnlCrtanje.getGraphics());
									} else if (lista.get(j) instanceof Linija) {
										Linija p = (Linija) lista.get(j);
										p.crtajSe(pnlCrtanje.getGraphics());
									} else if (lista.get(j) instanceof Kvadrat) {
										Kvadrat p = (Kvadrat) lista.get(j);
										p.crtajSe(pnlCrtanje.getGraphics());
										p.popuni(pnlCrtanje.getGraphics());
									} else if (lista.get(j) instanceof Pravougaonik) {
										Pravougaonik p = (Pravougaonik) lista.get(j);
										p.crtajSe(pnlCrtanje.getGraphics());
										p.popuni(pnlCrtanje.getGraphics());
									} else if (lista.get(j) instanceof Krug) {
										Krug p = (Krug) lista.get(j);
										p.crtajSe(pnlCrtanje.getGraphics());
										p.popuni(pnlCrtanje.getGraphics());
									}
								}
							}
						} else if (lista.get(i) instanceof Pravougaonik) {
							Pravougaonik pv = (Pravougaonik) lista.get(i);
							if (pv.index == max) {
								repaint();
								DlgIzmenaPravougaonik dlgIP = new DlgIzmenaPravougaonik();
								dlgIP.setPv(pv);
								dlgIP.setVisible(true);
								if (dlgIP.isIzb())
									lista.remove(pv.index);
								else if (dlgIP.isPot()) {
									lista.remove(pv.index);
									lista.add(pv.index, dlgIP.getNoviPv());
								}
								for (int j = 0; j < lista.size(); j++) {
									if (lista.get(j) instanceof Tacka) {
										Tacka p = (Tacka) lista.get(j);
										p.crtajSe(pnlCrtanje.getGraphics());
									} else if (lista.get(j) instanceof Linija) {
										Linija p = (Linija) lista.get(j);
										p.crtajSe(pnlCrtanje.getGraphics());
									} else if (lista.get(j) instanceof Pravougaonik) {
										Pravougaonik p = (Pravougaonik) lista.get(j);
										p.crtajSe(pnlCrtanje.getGraphics());
										p.popuni(pnlCrtanje.getGraphics());
									} else if (lista.get(j) instanceof Krug) {
										Krug p = (Krug) lista.get(j);
										p.crtajSe(pnlCrtanje.getGraphics());
										p.popuni(pnlCrtanje.getGraphics());
									} else {
										Kvadrat p = (Kvadrat) lista.get(j);
										p.crtajSe(pnlCrtanje.getGraphics());
										p.popuni(pnlCrtanje.getGraphics());
									}
								}
							}
						} else if (lista.get(i) instanceof Krug) {
							Krug kr = (Krug) lista.get(i);
							if (kr.index == max) {
								repaint();
								DlgIzmenaKrug dlgIK = new DlgIzmenaKrug();
								dlgIK.setKr(kr);
								dlgIK.setVisible(true);
								if (dlgIK.isIzb())
									lista.remove(kr.index);
								else if (dlgIK.isPot()) {
									lista.remove(kr.index);
									lista.add(kr.index, dlgIK.getNoviKr());
								}
								for (int j = 0; j < lista.size(); j++) {
									if (lista.get(j) instanceof Tacka) {
										Tacka p = (Tacka) lista.get(j);
										p.crtajSe(pnlCrtanje.getGraphics());
									} else if (lista.get(j) instanceof Linija) {
										Linija p = (Linija) lista.get(j);
										p.crtajSe(pnlCrtanje.getGraphics());
									} else if (lista.get(j) instanceof Pravougaonik) {
										Pravougaonik p = (Pravougaonik) lista.get(j);
										p.crtajSe(pnlCrtanje.getGraphics());
										p.popuni(pnlCrtanje.getGraphics());
									} else if (lista.get(j) instanceof Krug) {
										Krug p = (Krug) lista.get(j);
										p.crtajSe(pnlCrtanje.getGraphics());
										p.popuni(pnlCrtanje.getGraphics());
									} else {
										Kvadrat p = (Kvadrat) lista.get(j);
										p.crtajSe(pnlCrtanje.getGraphics());
										p.popuni(pnlCrtanje.getGraphics());
									}
								}
							}
						} else {
							Kvadrat kv = (Kvadrat) lista.get(i);
							if (kv.index == max) {
								repaint();
								DlgIzmeniKvadrat dlgIK = new DlgIzmeniKvadrat();
								dlgIK.setKv(kv);
								dlgIK.setVisible(true);
								if (dlgIK.isIzb())
									lista.remove(kv.index);
								else if (dlgIK.isPot()) {
									lista.remove(kv.index);
									lista.add(kv.index, dlgIK.getNoviKv());
								}
								for (int j = 0; j < lista.size(); j++) {
									if (lista.get(j) instanceof Tacka) {
										Tacka p = (Tacka) lista.get(j);
										p.crtajSe(pnlCrtanje.getGraphics());
									} else if (lista.get(j) instanceof Linija) {
										Linija p = (Linija) lista.get(j);
										p.crtajSe(pnlCrtanje.getGraphics());
									} else if (lista.get(j) instanceof Kvadrat) {
										Kvadrat p = (Kvadrat) lista.get(j);
										p.crtajSe(pnlCrtanje.getGraphics());
										p.popuni(pnlCrtanje.getGraphics());
									} else if (lista.get(j) instanceof Pravougaonik) {
										Pravougaonik p = (Pravougaonik) lista.get(j);
										p.crtajSe(pnlCrtanje.getGraphics());
										p.popuni(pnlCrtanje.getGraphics());
									} else if (lista.get(j) instanceof Krug) {
										Krug p = (Krug) lista.get(j);
										p.crtajSe(pnlCrtanje.getGraphics());
										p.popuni(pnlCrtanje.getGraphics());
									}
								}
							}
						}

					}
				}
				if (tglbtnTacka.isSelected()) { // Tacka
					int x = klik.getX();
					int y = klik.getY();
					bojaIvice = bojaIvice;
					Tacka t = new Tacka(x, y, bojaIvice, listIndex);
					t.crtajSe(pnlCrtanje.getGraphics());
					lista.add(t);
					listIndex++;
				}
				if (tglbtnLinija.isSelected()) { // Linija
					nizT[index] = new Tacka(klik.getX(), klik.getY());
					index++;
					if (index == 2) {
						Linija l = new Linija(nizT[0], nizT[1], bojaIvice, listIndex);
						l.crtajSe(pnlCrtanje.getGraphics());
						lista.add(l);
						listIndex++;
						index = 0;
					}
				}
				if (tglbtnKvadrat.isSelected()) { // Kvadrat
					DlgDodajKvadrat dlgDK = new DlgDodajKvadrat();
					dlgDK.setVisible(true);
					Kvadrat kv = new Kvadrat(new Tacka(klik.getX(), klik.getY()), dlgDK.getDuzinaStranice(), bojaIvice,
							bojaUnutrasnjosti, listIndex);
					kv.crtajSe(pnlCrtanje.getGraphics());
					kv.popuni(pnlCrtanje.getGraphics());
					lista.add(kv);
					listIndex++;
				}
				if (tglbtnPravougaonik.isSelected()) { // Pravougaonik
					DlgDodajPravougaonik dlgDP = new DlgDodajPravougaonik();
					dlgDP.setVisible(true);
					Pravougaonik pv = new Pravougaonik(new Tacka(klik.getX(), klik.getY()), dlgDP.getVisina(),
							dlgDP.getSirina(), bojaIvice, bojaUnutrasnjosti, listIndex);
					pv.crtajSe(pnlCrtanje.getGraphics());
					pv.popuni(pnlCrtanje.getGraphics());
					lista.add(pv);
					listIndex++;
				}
				if (tglbtnKrug.isSelected()) { // Krug
					DlgDodajKrug dlgDKrug = new DlgDodajKrug();
					dlgDKrug.setVisible(true);
					Krug kr = new Krug(new Tacka(klik.getX(), klik.getY()), dlgDKrug.getPoluPrecnik(), bojaIvice,
							bojaUnutrasnjosti, listIndex);
					kr.crtajSe(pnlCrtanje.getGraphics());
					kr.popuni(pnlCrtanje.getGraphics());
					lista.add(kr);
					listIndex++;
				}
			}
		});

		GridBagConstraints gbc_btnIzadji = new GridBagConstraints();
		gbc_btnIzadji.insets = new Insets(0, 0, 5, 5);
		gbc_btnIzadji.gridx = 17;
		gbc_btnIzadji.gridy = 0;
		btnIzadji.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});

		contentPane.add(tglbtnSelektuj, gbc_tglbtnSelektuj);
		contentPane.add(btnIzadji, gbc_btnIzadji);
		pnlCrtanje.setForeground(Color.BLACK);
		GridBagConstraints gbc_pnlCrtanje = new GridBagConstraints();
		gbc_pnlCrtanje.gridwidth = 18;
		gbc_pnlCrtanje.gridheight = 11;
		gbc_pnlCrtanje.insets = new Insets(0, 0, 5, 0);
		gbc_pnlCrtanje.fill = GridBagConstraints.BOTH;
		gbc_pnlCrtanje.gridx = 0;
		gbc_pnlCrtanje.gridy = 1;
		contentPane.add(pnlCrtanje, gbc_pnlCrtanje);
	}

	public ArrayList<Object> getLista() {
		return lista;
	}

	public void setLista(ArrayList<Object> lista) {
		this.lista = lista;
	}

	public Tacka getSelektovaniElemT() {
		return selektovaniElemT;
	}

	public void setSelektovaniElemT(Tacka selektovaniElemT) {
		this.selektovaniElemT = selektovaniElemT;
	}

	public Linija getSelektovaniElemL() {
		return selektovaniElemL;
	}

	public void setSelektovaniElemL(Linija selektovaniElemL) {
		this.selektovaniElemL = selektovaniElemL;
	}

	public Kvadrat getSelektovaniElemK() {
		return selektovaniElemK;
	}

	public void setSelektovaniElemK(Kvadrat selektovaniElemK) {
		this.selektovaniElemK = selektovaniElemK;
	}

	public Pravougaonik getSelektovaniElemP() {
		return selektovaniElemP;
	}

	public void setSelektovaniElemP(Pravougaonik selektovaniElemP) {
		this.selektovaniElemP = selektovaniElemP;
	}

	public Krug getSelektovaniElemKr() {
		return selektovaniElemKr;
	}

	public void setSelektovaniElemKr(Krug selektovaniElemKr) {
		this.selektovaniElemKr = selektovaniElemKr;
	}
}
