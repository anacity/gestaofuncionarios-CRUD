package sistema;

import java.util.Scanner;

import models.Salario;

public class Sistema {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		menu();
		int opcao = sc.nextInt();
		switch(opcao) {
		case 1: {
			System.out.println("Para fazermos os cálculos corretamente, certifique-se que os dados estejam corretos.");
			System.out.println("Digite o salário bruto do funcionário: ");
			Salario s = new Salario();
			s.setSalarioBruto(sc.nextDouble());
			System.out.println("Qual é o valor do Vale Refeição?");
			s.setvR(sc.nextDouble());
			System.out.println("Qual é o valor do Vale Transporte?");
			s.setvT(sc.nextDouble());
			System.out.println("Qual é o valor do Vale Alimentação?");
			s.setvA(sc.nextDouble());
			System.out.println("Qual é o número de dependentes do funcionário?");
			
			if(s.getSalarioBruto() <= 1320) {
				double inss1 = s.getSalarioBruto() - ((s.getSalarioBruto() * 7.5) / 100);
				if(inss1 < 2112) { 
					double descontoIRRF1 = 0;
					double irrf1 = inss1 - descontoIRRF1;			
					}
				if(2112.01 <= inss1 && inss1 <= 2826.65) { 
					double descontoIRRF2 = (inss1 * 7.5) / 100;
					double irrf2 = inss1 - descontoIRRF2;
				}
				if(2826.66 <= inss1 && inss1 <= 3751.05) {
					double descontoIRRF3 = (inss1 * 15) / 100;
					double irrf3 = inss1 - descontoIRRF3;
					}
				if(3751.06 <= inss1 && inss1 <= 4664.68){
					double descontoIRRF4 = (inss1 * 22.5) / 100;
					double irrf4 = inss1 - descontoIRRF4;
				}
				if(inss1 > 4664.69){
					double descontoIRRF5 = (inss1 * 27.5) / 100;
					double irrf4 = inss1 - descontoIRRF5;
				}
			}else if (1320.01 <= s.getSalarioBruto() && s.getSalarioBruto() <= 2571.29){
				double inss2 = s.getSalarioBruto() - ((s.getSalarioBruto() * 9) / 100);
				if(inss2 < 2112) { 
					double descontoIRRF1 = 0;
					double irrf1 = inss2 - descontoIRRF1;			
					}
				if(2112.01 <= inss2 && inss2 <= 2826.65) { 
					double descontoIRRF2 = (inss2 * 7.5) / 100;
					double irrf2 = inss2 - descontoIRRF2;
				}
				if(2826.66 <= inss2 && inss2 <= 3751.05) {
					double descontoIRRF3 = (inss2 * 15) / 100;
					double irrf3 = inss2 - descontoIRRF3;
					}
				if(3751.06 <= inss2 && inss2 <= 4664.68){
					double descontoIRRF4 = (inss2 * 22.5) / 100;
					double irrf4 = inss2 - descontoIRRF4;
				}
				if(inss1 > 4664.69){
					double descontoIRRF5 = (inss2 * 27.5) / 100;
					double irrf4 = inss2 - descontoIRRF5;
				}
			}else if(2571.30 <= s.getSalarioBruto() && s.getSalarioBruto() <= 3856.94) {
				double inss3 = s.getSalarioBruto() - ((s.getSalarioBruto() * 12) / 100);
					
			}else if(3856.95 <= s.getSalarioBruto() && s.getSalarioBruto() <= 7507.49) {
				double inss4 = s.getSalarioBruto() - ((s.getSalarioBruto() * 14) / 100);
				
			}else if(s.getSalarioBruto() > 7507.50) {
				double inss5 = s.getSalarioBruto() - ((s.getSalarioBruto() * 14) / 100);

			}
			
			
			
		}
		case 2: {
			System.exit(0);
			break;
		}
		default:
		}

	}
	
	public static void menu() {
		System.out.println("----------------------------------");
		System.out.println("Bem vindo! Esse é um sistema utilizado para o cálculo do salário líquido de funcionários. Deseja começar?");
		System.out.println("1 - Sim");
		System.out.println("2 - Não");
	}
}