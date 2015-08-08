package com.slort.model;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Data access object (DAO) for domain model class Parametro.
 * 
 * @see com.slort.model.Parametro
 * @author MyEclipse Persistence Tools
 */

public class ParametroDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ParametroDAO.class);
	// property constants
	public static final String CLAVE = "clave";
	public static final String VALOR = "valor";

	protected void initDao() {
		// do nothing
	}

	public void save(Parametro transientInstance) {
		log.debug("saving Parametro instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Parametro persistentInstance) {
		log.debug("deleting Parametro instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Parametro findById(java.lang.Integer id) {
		log.debug("getting Parametro instance with id: " + id);
		try {
			Parametro instance = (Parametro) getHibernateTemplate().get(
					"com.slort.model.Parametro", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Parametro instance) {
		log.debug("finding Parametro instance by example");
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
		log.debug("finding Parametro instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Parametro as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByClave(Object clave) {
		return findByProperty(CLAVE, clave);
	}

	public List findByValor(Object valor) {
		return findByProperty(VALOR, valor);
	}

	public List findAll() {
		log.debug("finding all Parametro instances");
		try {
			String queryString = "from Parametro";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Parametro merge(Parametro detachedInstance) {
		log.debug("merging Parametro instance");
		try {
			Parametro result = (Parametro) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Parametro instance) {
		log.debug("attaching dirty Parametro instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Parametro instance) {
		log.debug("attaching clean Parametro instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ParametroDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ParametroDAO) ctx.getBean("ParametroDAO");
	}
}