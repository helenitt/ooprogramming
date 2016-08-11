package q4;

import javax.swing.JOptionPane;

public class BadGuy {
	private String name;
	private int strength;
	private int ammo;
	private boolean alive;
	
	public BadGuy() {
		name = "";
		strength = 0;
		ammo = 0;
		alive = false;
	}
	
	public BadGuy(String nm, int sth, int am, boolean alive) {
		setName(nm);
		setStrength(sth);
		setAmmo(am);
		this.alive = alive;
	}
	
	
	public String getName() {
		return name;
	}
	public int getStrength() {
		return strength;
	}
	public int getAmmo() {
		return ammo;
	}
	public boolean isAlive() {
		return strength > 0 ? true : false;
	}
	
	public void setName(String nm) {
		name = nm;
	}
	public void setStrength(int sth) {
		strength = sth;
	}
	public void setAmmo(int am) {
		ammo = am;
	}

	public String toString() {
		String life;
		if(alive == true) {
			life = "Alive!";
		}
		else {
			life = "Dead";
			JOptionPane.showMessageDialog(null,"The Good Guy wins! Yeah!  :)");
			System.exit(0);
		}
		return " Bad Guy:\n Name: " + getName() + "\n Strength: " +
				getStrength() + "\n Ammo: " + getAmmo() + 
				"\n Life: " + life + "\n";
	}
	public void reduceAmmo() {
		int ammo = getAmmo();
		if(ammo == 0) 
			JOptionPane.showMessageDialog(null, "Sorry out of Ammo!");
		else
			setAmmo(ammo-1);
	}
	public void reduceStrength() {
		int strength = getStrength();
		strength -= 1;
		setStrength(strength);
		if(strength==0) {
			alive = false;
		}
	}
}
