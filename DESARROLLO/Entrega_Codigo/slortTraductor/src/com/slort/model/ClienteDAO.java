package com.slort.model;

import java.util.Date;
import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Data access object (DAO) for domain model class Cliente.
 * 
 * @see com.slort.model.Cliente
 * @author MyEclipse Persistence Tools
 */

public class ClienteDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ClienteDAO.class);
	// property constants
	public static final String TIPO_CLIENTE = "tipoCliente";
	public static final String NOMBRE = "nombre";
	public static final String APELLIDO = "apellido";
	public static final String RAZONSOCIAL = "razonsocial";
	public static final String DOMICILIO = "domicilio";
	public static final String COD_POSTAL = "codPostal";
	public static final String LOCALIDAD = "localidad";
	public static final String TELEFONO = "telefono";
	public static final String CARGO = "cargo";
	public static final String EMAIL = "email";
	public static final String TIPO_DOCU = "tipoDocu";
	public static final String NUM_DOC = "numDoc";
	public static final String ESTADO = "estado";
	public static final String FLELIMINADO = "fleliminado";

	protected void initDao() {
		// do nothing
	}

	public void save(Cliente transientInstance) {
		log.debug("saving Cliente instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Cliente persistentInstance) {
		log.debug("deleting Cliente instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Cliente findById(java.lang.Integer id) {
		log.debug("getting Cliente instance with id: " + id);
		try {
			Cliente instance = (Cliente) getHibernateTemplate().get(
					"com.slort.model.Cliente", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Cliente instance) {
		log.debug("finding Cliente instance by example");
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
		log.debug("finding Cliente instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Cliente as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByTipoCliente(Object tipoCliente) {
		return findByProperty(TIPO_CLIENTE, tipoCliente);
	}

	public List findByNombre(Object nombre) {
		return findByProperty(NOMBRE, nombre);
	}

	public List findByApellido(Object apellido) {
		return findByProperty(APELLIDO, apellido);
	}

	public List findByRazonsocial(Object razonsocial) {
		return findByProperty(RAZONSOCIAL, razonsocial);
	}

	public List findByDomicilio(Object domicilio) {
		return findByProperty(DOMICILIO, domicilio);
	}

	public List findByCodPostal(Object codPostal) {
		return findByProperty(COD_POSTAL, codPostal);
	}

	public List findByLocalidad(Object localidad) {
		return findByProperty(LOCALIDAD, localidad);
	}

	public List findByTelefono(Object telefono) {
		return findByProperty(TELEFONO, telefono);
	}

	public List findByCargo(Object cargo) {
		return findByProperty(CARGO, cargo);
	}

	public List findByEmail(Object email) {
		return findByProperty(EMAIL, email);
	}

	public List findByTipoDocu(Object tipoDocu) {
		return findByProperty(TIPO_DOCU, tipoDocu);
	}

	public List findByNumDoc(Object numDoc) {
		return findByProperty(NUM_DOC, numDoc);
	}

	public List findByEstado(Object estado) {
		return findByProperty(ESTADO, estado);
	}

	public List findByFleliminado(Object fleliminado) {
		return findByProperty(FLELIMINADO, fleliminado);
	}

	public List findAll() {
		log.debug("finding all Cliente instances");
		try {
			String queryString = "from Cliente";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Cliente merge(Cliente detachedInstance) {
		log.debug("merging Cliente instance");
		try {
			Cliente result = (Cliente) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Cliente instance) {
		log.debug("attaching dirty Cliente instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Cliente instance) {
		log.debug("attaching clean Cliente instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ClienteDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ClienteDAO) ctx.getBean("ClienteDAO");
	}
}