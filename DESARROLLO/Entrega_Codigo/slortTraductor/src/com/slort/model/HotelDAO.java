package com.slort.model;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Data access object (DAO) for domain model class Hotel.
 * 
 * @see com.slort.model.Hotel
 * @author MyEclipse Persistence Tools
 */

public class HotelDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(HotelDAO.class);
	// property constants
	public static final String NOMBRE = "nombre";

	protected void initDao() {
		// do nothing
	}

	public void save(Hotel transientInstance) {
		log.debug("saving Hotel instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Hotel persistentInstance) {
		log.debug("deleting Hotel instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Hotel findById(java.lang.Integer id) {
		log.debug("getting Hotel instance with id: " + id);
		try {
			Hotel instance = (Hotel) getHibernateTemplate().get(
					"com.slort.model.Hotel", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Hotel instance) {
		log.debug("finding Hotel instance by example");
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
		log.debug("finding Hotel instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Hotel as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByNombre(Object nombre) {
		return findByProperty(NOMBRE, nombre);
	}

	public List findAll() {
		log.debug("finding all Hotel instances");
		try {
			String queryString = "from Hotel";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Hotel merge(Hotel detachedInstance) {
		log.debug("merging Hotel instance");
		try {
			Hotel result = (Hotel) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Hotel instance) {
		log.debug("attaching dirty Hotel instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Hotel instance) {
		log.debug("attaching clean Hotel instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static HotelDAO getFromApplicationContext(ApplicationContext ctx) {
		return (HotelDAO) ctx.getBean("HotelDAO");
	}
}