package conta_banco;

/**pra esse projeto eu pesquisei na internet como fazer!
 * basicamente é uma copia de um video que vi no youtube,
 * mas me ajudou bastante a entender a estruturação do codigo,
 * ja que eu fiz e refiz umas 5 vezes até acertar sem precisar olhar o video novamente.
 * pra mim que nao tenho muito tempo pra estudar ja é uma grande coisa!
 * URL DO VIDEO DE BASE: https://www.youtube.com/watch?v=AExKQiCqwGs
 */

public class Conta {
private static int contadorDeConta = 1;
private int numeroConta;
private String agencia;
private Double saldo = 0.0;
private Usuario cliente;

public Conta(Usuario cliente) {
    this.numeroConta = contadorDeConta;
    this.cliente= cliente;
this.agencia = "1245-7";
    contadorDeConta ++;
}

public int getNumeroConta() {
    return numeroConta;
}

public void setNumeroConta(int numeroConta) {
    this.numeroConta = numeroConta;
}

public String getAgencia() {
    return agencia;
}

public void setAgencia(String agencia) {
    this.agencia = agencia;
}

public Double getSaldo() {
    return saldo;
}

public void setSaldo(Double saldo) {
    this.saldo = saldo;
}
public Usuario getCliente() {
    return cliente;
}

public void setCliente(Usuario cliente) {
    this.cliente = cliente;
}

public String toString(){
    return "\nNúmero da conta: " + this.getNumeroConta() +
    "\nagencia: " + this.getAgencia()+
     "\nNome: " + this.cliente.getNome() +
    "\nCPF:" + this.cliente.getCpf()+
    "\nSaldo:" + FormatoSaldo.doubleString(this.getSaldo()) +
    "\n";

}
public void depositar (Double valor) {
    if (valor >0) {
    setSaldo(getSaldo() + valor);
    System.out.println("seu deposito foi realizado com sussesso!");
    }
    else{
        System.out.println("nao foi possivel realizar o deposito!");
    } 
}
public void sacar (Double valor)  {
    if(valor >0 && this.getSaldo() >= valor ){
        setSaldo(getSaldo() - valor);
        System.out.println("saque realizado com susesso");
    } 
        else{
            System.out.println("saldo insuficiente");

        }
    }  
    public void transferir (Conta ContaParaDeposito , Double valor){
        if(valor >0 && this.getSaldo() >= valor ){
            
                setSaldo(getSaldo() - valor);

            ContaParaDeposito.saldo = ContaParaDeposito.getSaldo() + valor;
            System.out.println("trasnferencia realizada com sucesso!");

            
        }else{
            System.out.println("saldo insuficiênte");
        }
    }
        


}