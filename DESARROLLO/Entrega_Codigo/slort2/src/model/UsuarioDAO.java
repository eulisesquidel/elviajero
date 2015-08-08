package model;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Data access object (DAO) for domain model class Usuario.
 * 
 * @see model.Usuario
 * @author MyEclipse Persistence Tools
 */

public class UsuarioDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(UsuarioDAO.class);
	// property constants
	public static final String USUARIO = "usuario";
	public static final String PWD = "pwd";
	public static final String NOMBRE = "nombre";
	public static final String APELLIDO = "apellido";
	public static final String EMAIL = "email";
	public static final String TELEFONO = "telefono";
	public static final String ID_PERFIL = "idPerfil";

	protected void initDao() {
		// do nothing
	}

	public void save(Usuario transientInstance) {
		log.debug("saving Usuario instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Usuario persistentInstance) {
		log.debug("deleting Usuario instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Usuario findById(java.lang.Integer id) {
		log.debug("getting Usuario instance with id: " + id);
		try {
			Usuario instance = (Usuario) getHibernateTemplate().get(
					"model.Usuario", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Usuario instance) {
		log.debug("finding Usuario instance by example");
		try {
			List results = getHibernateTemplate().findByExample(instance);
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}

	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Usuario instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Usuario as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByUsuario(Object usuario) {
		return findByProperty(USUARIO, usuario);
	}

	public List findByPwd(Object pwd) {
		return findByProperty(PWD, pwd);
	}

	public List findByNombre(Object nombre) {
		return findByProperty(NOMBRE, nombre);
	}

	public List findByApellido(Object apellido) {
		return findByProperty(APELLIDO, apellido);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findByTelefono(Object telefono) {
		return findByProperty(TELEFONO, telefono);
	}

	public List findByIdPerfil(Object idPerfil) {
		return findByProperty(ID_PERFIL, idPerfil);
	}

	public List findAll() {
		log.debug("finding all Usuario instances");
		try {
			String queryString = "from Usuario";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Usuario merge(Usuario detachedInstance) {
		log.debug("merging Usuario instance");
		try {
			Usuario result = (Usuario) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Usuario instance) {
		log.debug("attaching dirty Usuario instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Usuario instance) {
		log.debug("attaching clean Usuario instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UsuarioDAO getFromApplicationContext(ApplicationContext ctx) {
		return (UsuarioDAO) ctx.getBean("UsuarioDAO");
	}
}