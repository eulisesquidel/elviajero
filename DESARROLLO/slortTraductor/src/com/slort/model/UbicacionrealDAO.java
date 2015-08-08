package com.slort.model;

import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Data access object (DAO) for domain model class Ubicacionreal.
 * 
 * @see com.slort.model.Ubicacionreal
 * @author MyEclipse Persistence Tools
 */

public class UbicacionrealDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(UbicacionrealDAO.class);
	// property constants
	public static final String GPSACTIVO = "gpsactivo";
	public static final String LATITUD = "latitud";
	public static final String LONGITUD = "longitud";
	public static final String SIMULADA = "simulada";
	public static final String ID_CALCULO_DE_UBICACION_INT = "idCalculoDeUbicacionInt";

	protected void initDao() {
		// do nothing
	}

	public void save(Ubicacionreal transientInstance) {
		log.debug("saving Ubicacionreal instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Ubicacionreal persistentInstance) {
		log.debug("deleting Ubicacionreal instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Ubicacionreal findById(java.lang.Integer id) {
		log.debug("getting Ubicacionreal instance with id: " + id);
		try {
			Ubicacionreal instance = (Ubicacionreal) getHibernateTemplate()
					.get("com.slort.model.Ubicacionreal", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("dato no encontrado", re);
			return null;
		}
	}

	public List findByExample(Ubicacionreal instance) {
		log.debug("finding Ubicacionreal instance by example");
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

	public Ubicacionreal findByFlota(Integer id) {
		log.debug("finding Ubicacionreal instance with flota");
		try {
			String queryString = "from Ubicacionreal as model where model.flota.codUnidad= ?";
			
			List lista = getHibernateTemplate().find(queryString, id);
			if (lista.size()==0) return null; 
			return ((Ubicacionreal) lista.get(0));
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			return null;
		}
	}
	
	public List findByProperty(String propertyName, Object value) {
		log.debug("finding Ubicacionreal instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Ubicacionreal as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByGpsactivo(Object gpsactivo) {
		return findByProperty(GPSACTIVO, gpsactivo);
	}

	public List findByLatitud(Object latitud) {
		return findByProperty(LATITUD, latitud);
	}

	public List findByLongitud(Object longitud) {
		return findByProperty(LONGITUD, longitud);
	}

	public List findBySimulada(Object simulada) {
		return findByProperty(SIMULADA, simulada);
	}

	public List findByIdCalculoDeUbicacionInt(Object idCalculoDeUbicacionInt) {
		return findByProperty(ID_CALCULO_DE_UBICACION_INT,
				idCalculoDeUbicacionInt);
	}

	public List findAll() {
		log.debug("finding all Ubicacionreal instances");
		try {
			String queryString = "from Ubicacionreal";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Ubicacionreal merge(Ubicacionreal detachedInstance) {
		log.debug("merging Ubicacionreal instance");
		try {
			Ubicacionreal result = (Ubicacionreal) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Ubicacionreal instance) {
		log.debug("attaching dirty Ubicacionreal instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Ubicacionreal instance) {
		log.debug("attaching clean Ubicacionreal instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static UbicacionrealDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (UbicacionrealDAO) ctx.getBean("UbicacionrealDAO");
	}
}