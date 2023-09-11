import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt(0);
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt(0);
		
		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}//catch (? exception) {
			//imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		//}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		int contagem;
        if(parametroUm>parametroDois){
            contagem = parametroUm-parametroDois;
        }else{
            contagem = parametroDois-parametroUm;
        }
		for (int i=0;i<contagem;i++){
            System.out.println("Imprimindo o número: "+(i+1));
        }
		//realizar o for para imprimir os números com base na variável contagem
	}
}