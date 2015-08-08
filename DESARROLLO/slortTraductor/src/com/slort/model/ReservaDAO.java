package com.slort.model;

import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * Data access object (DAO) for domain model class Reserva.
 * 
 * @see com.slort.model.Reserva
 * @author MyEclipse Persistence Tools
 */

public class ReservaDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(ReservaDAO.class);
	// property constants
	public static final String ESTADO = "estado";
	public static final String ID_USUARIO = "idUsuario";
	public static final String OBSERVACIONES = "observaciones";
	public static final String DIRECCION = "direccion";
	public static final String TELEFONO = "telefono";
	public static final String ENTRE_CALLES = "entreCalles";
	public static final String LOCALIDAD = "localidad";
	public static final String LATITUD = "latitud";
	public static final String LONGITUD = "longitud";

	protected void initDao() {
		// do nothing
	}

	public void save(Reserva transientInstance) {
		log.debug("saving Reserva instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Reserva persistentInstance) {
		log.debug("deleting Reserva instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Reserva findById(java.lang.Integer id) {
		log.debug("getting Reserva instance with id: " + id);
		try {
			Reserva instance = (Reserva) getHibernateTemplate().get(
					"com.slort.model.Reserva", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Reserva instance) {
		log.debug("finding Reserva instance by example");
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
		log.debug("finding Reserva instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Reserva as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByEstado(Object estado) {
		return findByProperty(ESTADO, estado);
	}

	public List findByIdUsuario(Object idUsuario) {
		return findByProperty(ID_USUARIO, idUsuario);
	}

	public List findByObservaciones(Object observaciones) {
		return findByProperty(OBSERVACIONES, observaciones);
	}

	public List findByDireccion(Object direccion) {
		return findByProperty(DIRECCION, direccion);
	}

	public List findByTelefono(Object telefono) {
		return findByProperty(TELEFONO, telefono);
	}

	public List findByEntreCalles(Object entreCalles) {
		return findByProperty(ENTRE_CALLES, entreCalles);
	}

	public List findByLocalidad(Object localidad) {
		return findByProperty(LOCALIDAD, localidad);
	}

	public List findByLatitud(Object latitud) {
		return findByProperty(LATITUD, latitud);
	}

	public List findByLongitud(Object longitud) {
		return findByProperty(LONGITUD, longitud);
	}

	public List findAll() {
		log.debug("finding all Reserva instances");
		try {
			String queryString = "from Reserva";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Reserva merge(Reserva detachedInstance) {
		log.debug("merging Reserva instance");
		try {
			Reserva result = (Reserva) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Reserva instance) {
		log.debug("attaching dirty Reserva instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Reserva instance) {
		log.debug("attaching clean Reserva instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static ReservaDAO getFromApplicationContext(ApplicationContext ctx) {
		return (ReservaDAO) ctx.getBean("ReservaDAO");
	}
}