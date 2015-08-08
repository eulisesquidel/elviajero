package com.slort.model;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Data access object (DAO) for domain model class Conexion.
 * 
 * @see com.slort.model.Conexion
 * @author MyEclipse Persistence Tools
 */

public class ConexionDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ConexionDAO.class);
	// property constants
	public static final String AMBIENTE = "ambiente";
	public static final String NOMBRE = "nombre";
	public static final String DRIVER = "driver";
	public static final String URL = "url";
	public static final String USUARIO = "usuario";
	public static final String PASSWORD = "password";

	protected void initDao() {
		// do nothing
	}

	public void save(Conexion transientInstance) {
		log.debug("saving Conexion instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Conexion persistentInstance) {
		log.debug("deleting Conexion instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Conexion findById(java.lang.Integer id) {
		log.debug("getting Conexion instance with id: " + id);
		try {
			Conexion instance = (Conexion) getHibernateTemplate().get(
					"com.slort.model.Conexion", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Conexion instance) {
		log.debug("finding Conexion instance by example");
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
		log.debug("finding Conexion instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Conexion as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByAmbiente(Object ambiente) {
		return findByProperty(AMBIENTE, ambiente);
	}

	public List findByNombre(Object nombre) {
		return findByProperty(NOMBRE, nombre);
	}

	public List findByDriver(Object driver) {
		return findByProperty(DRIVER, driver);
	}

	public List findByUrl(Object url) {
		return findByProperty(URL, url);
	}

	public List findByUsuario(Object usuario) {
		return findByProperty(USUARIO, usuario);
	}

	public List findByPassword(Object password) {
		return findByProperty(PASSWORD, password);
	}

	public List findAll() {
		log.debug("finding all Conexion instances");
		try {
			String queryString = "from Conexion";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Conexion merge(Conexion detachedInstance) {
		log.debug("merging Conexion instance");
		try {
			Conexion result = (Conexion) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Conexion instance) {
		log.debug("attaching dirty Conexion instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Conexion instance) {
		log.debug("attaching clean Conexion instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ConexionDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ConexionDAO) ctx.getBean("ConexionDAO");
	}
}