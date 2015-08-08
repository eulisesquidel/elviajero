package com.slort.model;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Data access object (DAO) for domain model class Calculoubicacion.
 * 
 * @see com.slort.model.Calculoubicacion
 * @author MyEclipse Persistence Tools
 */

public class CalculoubicacionDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(CalculoubicacionDAO.class);
	// property constants
	public static final String COD_UNIDAD = "codUnidad";

	protected void initDao() {
		// do nothing
	}

	public void save(Calculoubicacion transientInstance) {
		log.debug("saving Calculoubicacion instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Calculoubicacion persistentInstance) {
		log.debug("deleting Calculoubicacion instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Calculoubicacion findById(java.lang.Integer id) {
		log.debug("getting Calculoubicacion instance with id: " + id);
		try {
			Calculoubicacion instance = (Calculoubicacion) getHibernateTemplate()
					.get("com.slort.model.Calculoubicacion", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Calculoubicacion instance) {
		log.debug("finding Calculoubicacion instance by example");
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
		log.debug("finding Calculoubicacion instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Calculoubicacion as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByCodUnidad(Object codUnidad) {
		return findByProperty(COD_UNIDAD, codUnidad);
	}

	public List findAll() {
		log.debug("finding all Calculoubicacion instances");
		try {
			String queryString = "from Calculoubicacion";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Calculoubicacion merge(Calculoubicacion detachedInstance) {
		log.debug("merging Calculoubicacion instance");
		try {
			Calculoubicacion result = (Calculoubicacion) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Calculoubicacion instance) {
		log.debug("attaching dirty Calculoubicacion instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Calculoubicacion instance) {
		log.debug("attaching clean Calculoubicacion instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static CalculoubicacionDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (CalculoubicacionDAO) ctx.getBean("CalculoubicacionDAO");
	}
}