package models;

public class Salario {
	private double salarioBruto;
	private double vR;
	private double vT;
	private double vA;
	private double planoSaude;
	private int dependentes;
	
	public int getDependentes() {
		return dependentes;
	}
	public void setDependentes(int dependentes) {
		this.dependentes = dependentes;
	}
	public double getSalarioBruto() {
		return salarioBruto;
	}
	public void setSalarioBruto(double salarioBruto) {
		this.salarioBruto = salarioBruto;
	}
	public double getvR() {
		return vR;
	}
	public void setvR(double vR) {
		this.vR = vR;
	}
	public double getvT() {
		return vT;
	}
	public void setvT(double vT) {
		this.vT = vT;
	}
	public double getvA() {
		return vA;
	}
	public void setvA(double vA) {
		this.vA = vA;
	}
	public double getPlanoSaude() {
		return planoSaude;
	}
	public void setPlanoSaude(double planoSaude) {
		this.planoSaude = planoSaude;
	}
	
	

}
