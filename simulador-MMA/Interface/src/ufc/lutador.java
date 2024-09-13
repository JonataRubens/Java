package ufc;

public class lutador {
	private String nome, nacinalidade,categoria;
	private int idade, vitorias, empates, derrotas;
	private double altura, peso;
	
	//metodos
	public void apresentar() {
		System.out.println("AGORA lutador:"+ this.getNome());
		System.out.println("vindo de:" + this.getNacinalidade());
		System.out.println("sua idade: "+this.getIdade()+" e altura "+ this.getAltura());
		System.out.println("pesando "+ this.getPeso());
		System.out.println(this.getVitorias() +" vitorias ");
		System.out.println(this.getDerrotas()+" derrotas ");
		System.out.println(this.getEmpates()+" empates\n ");
	}
	
	public void status() {
		System.out.println(this.getNome()+" é um peso "+this.getCategoria());
		System.out.println(this.getVitorias() +" vitorias");
		System.out.println(this.getDerrotas()+" derrotas");
		System.out.println(this.getEmpates()+" empates\n");
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias()+1);
	}
	
	public void empatarLuta() {
		this.setEmpates(this.getEmpates()+1);
	}
	
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas()+1);
	}
	
	//metodos especiais
	public lutador(String nome, String nacinalidade, int idade, int vitorias, int empates,
			int derrotas, double altura, double peso) {
		super();
		this.nome = nome;
		this.nacinalidade = nacinalidade;
		this.idade = idade;
		this.vitorias = vitorias;
		this.empates = empates;
		this.derrotas = derrotas;
		this.altura = altura;
		this.setPeso(peso);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacinalidade() {
		return nacinalidade;
	}

	public void setNacinalidade(String nacinalidade) {
		this.nacinalidade = nacinalidade;
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria() {
		if(peso <52.2) {
			categoria = "Invalido";
			
		} else if(peso <= 70.3) {
			categoria = "leve";
	
		} else if(peso <= 83.9) {
			categoria = "medio";
			
		} else if(peso <= 120.2) {
			categoria = "pesado";
			
		} else {
			categoria = "invalido";
		}
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
		this.setCategoria();
	}
	
}