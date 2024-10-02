package conta_banco;
import java.util.ArrayList;
import java.util.Scanner;

public class ContaTerminal {
 
    static Scanner teclado = new Scanner(System.in);
    static ArrayList <Conta> contasBancarias;
    

public static void main(String[] args) {
    
    contasBancarias = new ArrayList <Conta>();
operacoes();
}
public static void operacoes() {
    System.out.println("-------------------------------------------");
    System.out.println("-----------bem vindo a nossa agência-------");
    System.out.println("-------selecione a opção desejada----------");
    System.out.println("-------------------------------------------");
    System.out.println("| opção 1    criar conta    |");
    System.out.println("| opção 2    depositar      |"); 
    System.out.println("| opção 3    sacar          |");
    System.out.println("| opção 4    transferir     |");
    System.out.println("| opção 5    listar         |");
    System.out.println("| opção 6    sair           |");
    System.out.println("-------------------------------------------");
    System.out.println("-------------------------------------------");



int opcao = teclado.nextInt(); 
    switch (opcao) {
        case 1:
        criarConta();
        break;
        case 2:
        depositar();
        break;
        case 3:
        sacar();
        break;
        case 4:
        transferir();
        break;
        case 5:
        listar();
        break;
        case 6:
        System.out.println("obrigado por usar a nossa agencia");
System.exit(0);
   default:
   System.out.print("opção inválida!");     
operacoes();
            }
    }
                              public static void criarConta() {
        System.out.println("\nNome:");
        String nome = teclado.next(); 
        
        System.out.println("\ncpf:");
        String cpf = teclado.next();
    
       Usuario cliente = new Usuario(nome, cpf, 0);
       Conta gp = new Conta(cliente);
       contasBancarias.add(gp);
 System.out.println("sua conta foi criada com sucesso!");
 operacoes();       
    }
    private static Conta encontrarConta (int numeroConta ){
        Conta conta = null;
        if  (contasBancarias.size()>0){
            for (Conta c : contasBancarias) {
                if(c.getNumeroConta()==numeroConta){
                    conta = c ;
              
            }  break;
            }
        }
        return conta;
    }
    public static void depositar() {
        System.out.println("numero da conta para deposito");
        int numeroConta = teclado.nextInt();

        Conta conta = encontrarConta(numeroConta);

        if (conta != null){
            System.out.println("qual valor deseja depositar?...");
            Double valorDeposito = teclado.nextDouble();
            conta.depositar(valorDeposito);
            System.out.println("valor depositado com sucesso!");
        } else{
            System.out.println("erro de sistema, tente novamente!");
        }
        operacoes();

    }


                         public static void sacar() {
        
                         System.out.println("numero da conta");
                         int numeroConta = teclado.nextInt();

                        Conta conta = encontrarConta(numeroConta);

                     if (conta != null){
                    System.out.println("qual valor deseja sacar?...");
                     Double valorSaque = teclado.nextDouble();
                conta.sacar(valorSaque);
          //1 System.out.println("saque realizado  com sucesso!");
                }       
                else{
            System.out.println("saldo insuficiente , tente novamente!");
        }
        operacoes();
    } 
 
    public static void transferir(){
        System.out.println("numero da conta do remetente");
        int numeroContaRemetente = teclado.nextInt();
        Conta contaRemetente = encontrarConta(numeroContaRemetente);

        if (contaRemetente !=null){
            System.out.println ("numero da conta de destino!");
            int numeroContaDestinatario = teclado.nextInt();
            Conta contaDestinatario = encontrarConta(numeroContaDestinatario);
            if (contaDestinatario != null){
                System.out.println("qual valor a tranferir");
                Double valor = teclado.nextDouble();
                
                contaRemetente.transferir(contaDestinatario, valor);

            }
            else{
                System.out.println("conta nao encontrada!");
            }
        }operacoes();
    }
public static void listar() {
    if( contasBancarias.size() >0){
        for (Conta conta : contasBancarias){
            System.out.println( conta);
        }
    }    else {
        System.out.println("não hà contas cadastradas!");
} operacoes();
}

}


