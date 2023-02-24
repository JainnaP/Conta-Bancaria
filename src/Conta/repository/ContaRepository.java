package Conta.repository;

import Conta.model.ContaC;

public interface ContaRepository {
	
	public void procurarPorNumero(int numero);
	public void listarTodas();
	public void cadastrar(ContaC conta);
	public void atualizar(ContaC conta);
	public void deletar(int numero);
	
	
	public void sacar(int numero, float valor);
	public void depositar(int numero, float valor);
	public void transferir(int numeroOrigem, int numeroDestino, float valor);
	
}
