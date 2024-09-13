package ufc;

import java.util.Random;

public class luta {
	private int rounds;
	private boolean aprovado;
	private lutador desafiado;
	private lutador desafiante;

	//
	
	public int getRounds() {
		return rounds;
	}

	public void setRounds(int rounds) {
		this.rounds = rounds;
	}
	
	public boolean getAprovado() {
		return aprovado;
	}
	
	public void setAprovado(boolean aprovado) {
		this.aprovado = aprovado;
	}
	
	public lutador getDesafiado() {
		return desafiado;
	}

	public void setDesafiado(lutador desafiado) {
		this.desafiado = desafiado;
	}

	public lutador getDesafiante() {
		return desafiante;
	}

	public void setDesafiante(lutador desafiante) {
		this.desafiante = desafiante;
	}

	public void marcarLuta(lutador l1, lutador l2) {
		if(l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
			this.aprovado = true;
			this.desafiado = l1;
			this.desafiante = l2;
		} else {
			this.aprovado = false;
			this.desafiado = null;
			this.desafiante = null;
		}
	}
	
	public void lutar() {
		if(this.aprovado) {
			this.desafiado.apresentar();
			this.desafiante.apresentar();
			
			Random al = new Random();
			int vencedor  = al.nextInt(3);
			
				switch(vencedor) {
				case 0:
					this.desafiado.empatarLuta();
					this.desafiante.empatarLuta();
					break;
				case 1:
					this.desafiado.ganharLuta();
					this.desafiante.perderLuta();
					break;
				case 2:
					this.desafiante.ganharLuta();
					this.desafiado.perderLuta();
					break;
				}
		}
	}
}
