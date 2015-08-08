package com.slort.model;

import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Data access object (DAO) for domain model class Opcionmenu.
 * 
 * @see com.slort.model.Opcionmenu
 * @author MyEclipse Persistence Tools
 */

public class OpcionmenuDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(OpcionmenuDAO.class);
	// property constants
	public static final String DESCRIPCION_CORTA = "descripcionCorta";
	public static final String DESCRIPCION_LARGO = "descripcionLargo";
	public static final String LINK = "link";

	protected void initDao() {
		// do nothing
	}

	public void save(Opcionmenu transientInstance) {
		log.debug("saving Opcionmenu instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Opcionmenu persistentInstance) {
		log.debug("deleting Opcionmenu instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Opcionmenu findById(java.lang.Integer id) {
		log.debug("getting Opcionmenu instance with id: " + id);
		try {
			Opcionmenu instance = (Opcionmenu) getHibernateTemplate().get(
					"com.slort.model.Opcionmenu", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Opcionmenu instance) {
		log.debug("finding Opcionmenu instance by example");
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
		log.debug("finding Opcionmenu instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Opcionmenu as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByDescripcionCorta(Object descripcionCorta) {
		return findByProperty(DESCRIPCION_CORTA, descripcionCorta);
	}

	public List findByDescripcionLargo(Object descripcionLargo) {
		return findByProperty(DESCRIPCION_LARGO, descripcionLargo);
	}

	public List findByLink(Object link) {
		return findByProperty(LINK, link);
	}

	public List<Opcionmenu> findAll() {
		log.debug("finding all Opcionmenu instances");
		try {
			String queryString = "from Opcionmenu";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Opcionmenu merge(Opcionmenu detachedInstance) {
		log.debug("merging Opcionmenu instance");
		try {
			Opcionmenu result = (Opcionmenu) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Opcionmenu instance) {
		log.debug("attaching dirty Opcionmenu instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Opcionmenu instance) {
		log.debug("attaching clean Opcionmenu instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static OpcionmenuDAO getFromApplicationContext(ApplicationContext ctx) {
		return (OpcionmenuDAO) ctx.getBean("OpcionmenuDAO");
	}
}