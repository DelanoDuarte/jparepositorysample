/**
 * 
 */
package simpleapp.repository;

import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import simpleapp.domain.Funcionario;

/**
 * @author delan
 *
 */
@Repository(forEntity = Funcionario.class)
public interface FuncionarioRepository extends EntityRepository<Funcionario, Long> {

}
