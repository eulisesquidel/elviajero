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
 * Data access object (DAO) for domain model class Flota.
 * 
 * @see com.slort.model.Flota
 * @author MyEclipse Persistence Tools
 */

public class FlotaDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory.getLog(FlotaDAO.class);
	// property constants
	public static final String ACTIVO = "activo";
	public static final String USER_YAHOO = "userYahoo";
	public static final String PASSW_YAHOO = "passwYahoo";
	public static final String NOMBRE = "nombre";
	public static final String APELLIDO = "apellido";
	public static final String DOMICILIO = "domicilio";
	public static final String COD_POSTAL = "codPostal";
	public static final String LOCALIDAD = "localidad";
	public static final String TELEFONO = "telefono";
	public static final String CARGO = "cargo";
	public static final String EMAIL = "email";
	public static final String CUIT = "cuit";
	public static final String LICENCIA = "licencia";
	public static final String FLELIMINADO = "fleliminado";
	public static final String FLSIMULADA= "flSimulada";
	
	protected void initDao() {
		// do nothing
	}

	public void save(Flota transientInstance) {
		log.debug("saving Flota instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Flota persistentInstance) {
		log.debug("deleting Flota instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Flota findById(java.lang.Integer id) {
		log.debug("getting Flota instance with id: " + id);
		try {
			Flota instance = (Flota) getHibernateTemplate().get(
					"com.slort.model.Flota", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Flota instance) {
		log.debug("finding Flota instance by example");
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
		log.debug("finding Flota instance with property: " + propertyName
				+ ", value: " + value);
		try {
			String queryString = "from Flota as model where model."
					+ propertyName + "= ?";
			return getHibernateTemplate().find(queryString, value);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}

	public List findByActivo(Object activo) {
		return findByProperty(ACTIVO, activo);
	}

	public List findByUserYahoo(Object userYahoo) {
		return findByProperty(USER_YAHOO, userYahoo);
	}

	public List findByPasswYahoo(Object passwYahoo) {
		return findByProperty(PASSW_YAHOO, passwYahoo);
	}

	public List findByNombre(Object nombre) {
		return findByProperty(NOMBRE, nombre);
	}

	public List findByApellido(Object apellido) {
		return findByProperty(APELLIDO, apellido);
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

	public List findByCuit(Object cuit) {
		return findByProperty(CUIT, cuit);
	}

	public List findByLicencia(Object licencia) {
		return findByProperty(LICENCIA, licencia);
	}

	public List findByFleliminado(Object fleliminado) {
		return findByProperty(FLELIMINADO, fleliminado);
	}

	public List findAll() {
		log.debug("finding all Flota instances");
		try {
			String queryString = "from Flota";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Flota merge(Flota detachedInstance) {
		log.debug("merging Flota instance");
		try {
			Flota result = (Flota) getHibernateTemplate().merge(
					detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Flota instance) {
		log.debug("attaching dirty Flota instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Flota instance) {
		log.debug("attaching clean Flota instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static FlotaDAO getFromApplicationContext(ApplicationContext ctx) {
		return (FlotaDAO) ctx.getBean("FlotaDAO");
	}
	
	
	public List<Flota> findByTraductor() {
		log.debug("finding Flota findByTraductor");
		try {
			String queryString = "from Flota as model where model.activo=1";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find by property name failed", re);
			throw re;
		}
	}
}