import java.util.Scanner;
public class Ex1 {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		//Exerc�cio 01
		System.out.println("Digite o valor investido");
		double v = in.nextDouble();
		System.out.println("Digite o n�mero de meses que o valor ficou investido");
		int m = in.nextInt();
		double nv = investiu (v, m);
		System.out.println(nv);
		
		//Exerc�cio 02
		int b = 0;
		System.out.println("Digite o gasto total");
		double gasto = in.nextDouble();
		System.out.println("A seguir selecione a op��o desejada");
		opcao();
		int o = in.nextInt();
			switch(o) {
			case 1:
				System.out.println("Valor a pagar: R$"+opcao1(gasto));
				break;
			case 2: 
				System.out.println("2x de R$"+opcao2(gasto));
				break;
			case 3:
				System.out.println("Em quantas presta��es voc� deseja dividir?");
				int prest = in.nextInt();
				if(prest < 3 || prest > 10) {
					System.out.println("Quantidade inv�lida. Reinicie o programa e tente novamente");
				}
				System.out.println(prest+"x de R$"+opcao3(gasto, prest));
				break;
		}

	}
	
	public static double investiu(double v, int m) {
		double nv = 0, p = 0;
		for(int i = 0; i < m; i++) {
			p = v / 100;
			v += p; 
		}
		nv += v;
		return nv;
	}
	
	public static void opcao (){
		System.out.println("Op��o 1: a vista (10% de desconto)");
		System.out.println("Op��o 2: em 2x");
		System.out.println("Op��o 3: de 3x at� 10x (3% de juros por m�s)");
	}
	
	
	public static double opcao1(double gasto){
		double p = (gasto * 10)/100;
		double vt = gasto - p;
		return vt;
	}
	
	public static double opcao2 (double gasto) {
		double p = gasto / 2;
		return p;
	}
	
	public static double opcao3 (double gasto, int prest) {
		double vt = gasto / prest;
		double p = vt * 0.03;
		vt += p;
		return vt;
	}
}
