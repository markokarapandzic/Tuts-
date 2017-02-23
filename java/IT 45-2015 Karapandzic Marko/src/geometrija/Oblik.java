package geometrija;

import java.awt.Color;
import java.awt.Graphics;

public abstract class Oblik implements Comparable{
	private String boja = "crna";
	private boolean selektovan;
	private Color color = Color.BLACK;
	private Color colorUnutrasnjosti = Color.BLACK;
	private Color pvIvice = Color.BLACK;
	private Color pvUnutrasnjost = Color.BLACK;
	
	public Oblik(){
		
	}
	public Oblik(String boja){
		this.boja = boja;
	}

	public abstract void crtajSe(Graphics g);
	public abstract void selektovan(Graphics g);
	public abstract boolean sadrzi(int x, int y);
	
	public static Color pronadjiBoju(String boja){
		if(boja.equalsIgnoreCase("crna"))
			return Color.BLACK;
		else if(boja.equalsIgnoreCase("bela"))
			return Color.WHITE;
		else if(boja.equalsIgnoreCase("plava"))
			return Color.BLUE;
		else if(boja.equalsIgnoreCase("crvena"))
			return Color.RED;
		else if(boja.equalsIgnoreCase("zuta"))
			return Color.YELLOW;
		else if(boja.equalsIgnoreCase("zelena"))
			return Color.GREEN;
		else if(boja.equalsIgnoreCase("pink"))
			return Color.PINK;
		else
			return Color.BLACK;
	}
	
	public String getBoja() {
		return boja;
	}

	public void setBoja(String boja) {
		this.boja = boja;
	}
	public boolean isSelektovan() {
		return selektovan;
	}
	public void setSelektovan(boolean selektovan) {
		this.selektovan = selektovan;
	}
	public Color getColor() {
		return color;
	}
	public void setColor(Color color) {
		this.color = color;
	}
	public Color getColorUnutrasnjosti() {
		return colorUnutrasnjosti;
	}
	public void setColorUnutrasnjosti(Color colorUnutrasnjosto) {
		this.colorUnutrasnjosti = colorUnutrasnjosto;
	}
	public Color getPvIvice() {
		return pvIvice;
	}
	public void setPvIvice(Color pvIvice) {
		this.pvIvice = pvIvice;
	}
	public Color getPvUnutrasnjost() {
		return pvUnutrasnjost;
	}
	public void setPvUnutrasnjost(Color pvUnutrasnjost) {
		this.pvUnutrasnjost = pvUnutrasnjost;
	}
	
}
