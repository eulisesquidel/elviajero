package com.slort.model;

import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.context.ApplicationContext;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.bdb.util.BDBUtils;

/**
 * Data access object (DAO) for domain model class Historicoubicaciondetalle.
 * 
 * @see com.slort.model.Historicoubicaciondetalle
 * @author MyEclipse Persistence Tools
 */

public class HistoricoubicaciondetalleDAO extends HibernateDaoSupport {
	private static final Log log = LogFactory
			.getLog(HistoricoubicaciondetalleDAO.class);
	// property constants
	public static final String GPSACTIVO = "gpsactivo";
	public static final String RANKING = "ranking";
	public static final String OBSERVACIONES = "observaciones";
	public static final String DISTANCIA_OBJETIVO = "distanciaObjetivo";
	public static final String MOTIVO_NO_ASIGNADO = "motivoNoAsignado";

	protected void initDao() {
		// do nothing
	}

	public void save(Historicoubicaciondetalle transientInstance) {
		log.debug("saving Historicoubicaciondetalle instance");
		try {
			getHibernateTemplate().save(transientInstance);
			log.debug("save successful");
		} catch (RuntimeException re) {
			log.error("save failed", re);
			throw re;
		}
	}

	public void delete(Historicoubicaciondetalle persistentInstance) {
		log.debug("deleting Historicoubicaciondetalle instance");
		try {
			getHibernateTemplate().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	
	public Historicoubicaciondetalle findById(java.lang.Integer id) {
		log.debug("getting Ubicacionreal instance with id: " + id);
		try {
			Historicoubicaciondetalle instance = (Historicoubicaciondetalle) getHibernateTemplate()
					.get("com.slort.model.Historicoubicaciondetalle", id);
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List findByExample(Historicoubicaciondetalle instance) {
		log.debug("finding Historicoubicaciondetalle instance by example");
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
		log.debug("finding Historicoubicaciondetalle instance with property: "
				+ propertyName + ", value: " + value);
		try {
			String queryString = "from Historicoubicaciondetalle as model where model."
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

	public List findByRanking(Object ranking) {
		return findByProperty(RANKING, ranking);
	}

	public List findByObservaciones(Object observaciones) {
		return findByProperty(OBSERVACIONES, observaciones);
	}

	public List findByDistanciaObjetivo(Object distanciaObjetivo) {
		return findByProperty(DISTANCIA_OBJETIVO, distanciaObjetivo);
	}

	public List findByMotivoNoAsignado(Object motivoNoAsignado) {
		return findByProperty(MOTIVO_NO_ASIGNADO, motivoNoAsignado);
	}

	public List findAll() {
		log.debug("finding all Historicoubicaciondetalle instances");
		try {
			String queryString = "from Historicoubicaciondetalle";
			return getHibernateTemplate().find(queryString);
		} catch (RuntimeException re) {
			log.error("find all failed", re);
			throw re;
		}
	}

	public Historicoubicaciondetalle merge(
			Historicoubicaciondetalle detachedInstance) {
		log.debug("merging Historicoubicaciondetalle instance");
		try {
			Historicoubicaciondetalle result = (Historicoubicaciondetalle) getHibernateTemplate()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public void attachDirty(Historicoubicaciondetalle instance) {
		log.debug("attaching dirty Historicoubicaciondetalle instance");
		try {
			getHibernateTemplate().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Historicoubicaciondetalle instance) {
		log.debug("attaching clean Historicoubicaciondetalle instance");
		try {
			getHibernateTemplate().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public static HistoricoubicaciondetalleDAO getFromApplicationContext(
			ApplicationContext ctx) {
		return (HistoricoubicaciondetalleDAO) ctx
				.getBean("HistoricoubicaciondetalleDAO");
	}
	
	
	public List<Historicoubicaciondetalle>  findByGUIPosibilitiesReporte(Historicoubicaciondetalle objeto, Date fechadesde, Date fechahasta){

		DetachedCriteria criteria = DetachedCriteria.forClass(Historicoubicaciondetalle.class);
	
	
		 if (BDBUtils.AdaptarCamposNulos(objeto.getCalculoubicacion().getReserva().getUsuario().getUsuario())!=""){

			criteria.createAlias("calculoubicacion", "calcu");
			criteria.createAlias("calcu.reserva", "reserv");
			criteria.createAlias("reserv.usuario", "usu");
			
			criteria.add(Restrictions.ilike("usu.usuario", BDBUtils.AdaptarLike( BDBUtils.AdaptarCamposNulos(objeto.getCalculoubicacion().getReserva().getUsuario().getUsuario()))));
		}	
		
		
		//criteria.add(Restrictions.ilike("flota", BDBUtils.AdaptarLike( BDBUtils.AdaptarCamposNulos(objeto.getFlota().getLicencia()))));
		if (BDBUtils.AdaptarCamposNulos(objeto.getFlota().getLicencia())!=""){
			criteria.createAlias("flota", "fl");
			criteria.add(Restrictions.ilike("fl.licencia", BDBUtils.AdaptarLike( BDBUtils.AdaptarCamposNulos(objeto.getFlota().getLicencia()))));
		}				
		
		
		if (BDBUtils.AdaptarCamposNulos(fechadesde)!="")  {
			criteria.add(Restrictions.ge("fecha", fechadesde));			
	    }		
		

		if (BDBUtils.AdaptarCamposNulos(fechahasta)!="")  {
			criteria.add(Restrictions.le("fecha", fechahasta));			
	    }		
	
		
		return  getHibernateTemplate().findByCriteria(criteria);
		
	}

	
}