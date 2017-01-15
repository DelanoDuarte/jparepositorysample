/**
 * 
 */
package simpleapp.service;

import java.io.Serializable;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import simpleapp.domain.Funcionario;
import simpleapp.repository.FuncionarioRepository;

/**
 * @author delan
 *
 */
@Stateless
public class FuncionarioService implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Inject
	FuncionarioRepository funcionarioRepository;

	public void save(Funcionario funcionario) {
		funcionarioRepository.save(funcionario);
	}

	public List<Funcionario> findAll() {
		return funcionarioRepository.findAll();
	}

}
