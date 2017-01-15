/**
 * 
 */
package simpleapp.bean;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.inject.Model;
import javax.inject.Inject;

import simpleapp.domain.Funcionario;
import simpleapp.service.FuncionarioService;

/**
 * @author delan
 *
 */
@Model
public class FuncionarioBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Funcionario funcionario = new Funcionario();

	private Iterable<Funcionario> funcionarios = null;

	@Inject
	private FuncionarioService funcionarioService;

	public FuncionarioBean() {

	}

	public String save() {
		funcionarioService.save(funcionario);
		return "";
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	public Iterable<Funcionario> getFuncionarios() {
		if (this.funcionarios == null)
			this.funcionarios = funcionarioService.findAll();
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public FuncionarioService getFuncionarioService() {
		return funcionarioService;
	}

	public void setFuncionarioService(FuncionarioService funcionarioService) {
		this.funcionarioService = funcionarioService;
	}

}
