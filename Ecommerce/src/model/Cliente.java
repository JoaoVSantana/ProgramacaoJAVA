package model;

import java.util.ArrayList;
import java.util.Calendar;
import java.time.LocalDate;
import java.util.Date;
import java.util.GregorianCalendar;

public class Cliente {

	private String nome;
	private String cpf;
	private Date dataNascimento;
	private String email;
	private Endereco endereco;
	private String telefone;
	private String senha;
	private Pagamento formaPagamento;
	private Double saldo;

	public Cliente() {

	}

	public void setNome(String cnome) {
		if (cnome.matches("[A-Za-z]") && cnome.length() > 2) {
			this.nome = cnome;

		} else {
			System.out.println("Nome inválido\n");

		}
	}

	public String getNome() {
		return nome;
	}

	public void setCpf(String ccpf) {
		if (ccpf.matches("([0-9]{3}.[0-9]{3}.[0-9]{3}-[0-9]{2})*")) {
			this.cpf = ccpf;

		} else {
			System.out.println("Cpf inválido\n");
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setDataNascimento(Date cdataNascimento) {
		Calendar calendar = new GregorianCalendar();

		calendar.setTime(cdataNascimento);

		if (calendar.get(Calendar.YEAR) >= 1900 && calendar.get(Calendar.YEAR) < LocalDate.now().getYear()) {
			this.dataNascimento = cdataNascimento;
		
		} else {
			System.out.println("Data de nascimento inválida!");
		}
	}

	public Date getDataNascimento() {
		return dataNascimento;
	}

	public void setEmail(String cemail) {
		if (cemail.matches("([a-z0-9]+[a-z0-9_\\-.]*@[a-z]+[.a-z]*)")) {
			this.email = cemail;

		} else {
			System.out.println("Email inválido\n");
		}

	}

	public String getEmail() {
		return email;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Endereco getEndereco() {
		return endereco;
	}

}
