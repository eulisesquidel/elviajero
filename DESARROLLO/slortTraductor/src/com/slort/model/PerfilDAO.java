package com.slort.model;

import java.util.List;
import java.util.Set;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Data access object (DAO) for domain model class Perfil.
 * 
 * @see com.slort.model.Perfil
 * @author MyEclipse Persistence Tools
 */

public class PerfilDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(PerfilDAO.class);
	// property constants
	public static final String DESCRIPCION_CORTA = "descripcionCorta";
	public static final String DESCRIPCION_LARGA = "descripcionLarga";
	public static final String OPCION_DEFECTO = "opcionDefecto";

	protected void initDao() {
		// do nothing
	}

	public void save(Perfil transientInstance) {
		log.debug("saving Perfil instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Perfil persistentInstance) {
		log.debug("deleting Perfil instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Perfil findById(java.lang.Integer id) {
		log.debug("getting Perfil instance with id: " + id);
		try {
			Perfil instance = (Perfil) getHibernateTemplate().get(
					"com.slort.model.Perfil", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Perfil instance) {
		log.debug("finding Perfil instance by example");
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
		log.debug("finding Perfil instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Perfil as model where model."
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

	public List findByDescripcionLarga(Object descripcionLarga) {
		return findByProperty(DESCRIPCION_LARGA, descripcionLarga);
	}

	public List findByOpcionDefecto(Object opcionDefecto) {
		return findByProperty(OPCION_DEFECTO, opcionDefecto);
	}

	public List findAll() {
		log.debug("finding all Perfil instances");
		try {
			String queryString = "from Perfil";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Perfil merge(Perfil detachedInstance) {
		log.debug("merging Perfil instance");
		try {
			Perfil result = (Perfil) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Perfil instance) {
		log.debug("attaching dirty Perfil instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Perfil instance) {
		log.debug("attaching clean Perfil instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static PerfilDAO getFromApplicationContext(ApplicationContext ctx) {
		return (PerfilDAO) ctx.getBean("PerfilDAO");
	}
}