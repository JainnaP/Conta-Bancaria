package Conta.Controller;

import java.util.ArrayList;

import Conta.model.ContaC;
import Conta.repository.ContaRepository;

public class ContaController implements ContaRepository {
	
	private ArrayList<ContaC> listaContas = new ArrayList<ContaC>();

	@Override
	public void procurarPorNumero(int numero) {
		var conta = buscarNaCollection (numero);
		
		if (conta!= null)
			conta.visualizar();
		else
			System.out.println("A Conta número: "+numero+" não foi encontrada!");
		
	}

	@Override
	public void listarTodas() {
		for (var conta : listaContas) {
			conta.visualizar();
		}
		
	}

	@Override
	public void cadastrar(ContaC conta) {
		listaContas.add(conta);
		System.out.println("A conta número: "+ conta.getNumero()+ " foi criada com sucesso!");
		
	}

	@Override
	public void atualizar(ContaC conta) {
		var buscaConta = buscarNaCollection(conta.getNumero());
		
		if (buscaConta != null) {
			listaContas.set(listaContas.indexOf(buscaConta), conta);
			System.out.println("A conta número: "+ conta.getNumero()+ " foi atualizada com sucesso!");			
		} else 
			System.out.println("A conta número: "+ conta.getNumero()+ " não foi encontrada!");		
	}

	@Override
	public void deletar(int numero) {
		var conta = buscarNaCollection(numero);
		
		if (conta != null) {
			if(listaContas.remove(conta)==true)
				System.out.println("A conta número: "+numero+" foi deletada com sucesso");			
		}else
			System.out.println("A conta numero: "+numero+" não foi encontrada!");
		
	}

	@Override
	public void sacar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositar(int numero, float valor) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		// TODO Auto-generated method stub
		
	}
	public int gerarNumero(){
		return listaContas.size()+1;
		}
	
	public ContaC buscarNaCollection (int numero){
		for (var conta : listaContas) {
			if (conta.getNumero()==numero) {
				return conta;
			}
		}
		
		return null;
	}
	
	public int retornaTipo (int numero) {
		for (var conta : listaContas) {
			if (conta.getNumero() == numero) {
				return conta.getTipo();
			}
			
		}
		return 0;
	}
	
	
	
	
	
	
	
	
	
	
}
