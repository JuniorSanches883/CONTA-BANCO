package conta_banco;

public class Usuario {
    private int contador =1;
private int numero;
private String nome;
private String cpf ;

public Usuario(String nome, String cpf, int numero) {
    this.numero = contador;
    this.nome = nome;
    this.cpf = cpf;
    contador+=1;
}
public int getNumero() {
    return numero;
}
public void setNumero(int numero) {
    this.numero = numero;
}
public int getContador() {
    return contador;
}
public void setContador(int contador) {
    this.contador = contador;
}
public String getNome() {
    return nome;
}
public void setNome(String nome) {
    this.nome = nome;
}
public String getCpf() {
    return cpf;
}
public void setCpf(String cpf) {
    this.cpf = cpf;
}

}