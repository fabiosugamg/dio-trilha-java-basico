import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		
        int parametroUm, parametroDois;

        do {  
            System.out.println("Digite o primeiro parâmetro: ");
		    parametroUm = terminal.nextInt();

		    System.out.println("Digite o segundo parâmetro: ");
		    parametroDois = terminal.nextInt();
            
            if (parametroUm > parametroDois){
                System.out.println("O segundo parâmetro deve ser maior que o primeiro. Tente novamente. ");
                }
            }while (parametroUm > parametroDois);
        

		try {
			//chamando o método contendo a lógica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (ParametrosInvalidosException e) {
			System.out.println(e.getMessage());
            //imprimir a mensagem: O segundo parâmetro deve ser maior que o primeiro
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametroUm é MAIOR que parametroDois e lançar a exceção
		
		int contagem = parametroDois - parametroUm;
		for(int i = 0; i < contagem; i++){
        System.out.println("Imprimindo o número " + (parametroUm + i));
        }
        //realizar o for para imprimir os números com base na variável contagem
	}
}