package com.slort.model.bdconector;


import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.orm.hibernate3.HibernateTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;

public class AdmSpringBD {

	private ClassPathXmlApplicationContext applicationContext=null;
	private static final Logger log;

	TransactionDefinition midef= new DefaultTransactionDefinition();
	TransactionStatus miTrans=null; 

	static  {
		log = Logger.getLogger(com.slort.actions.SlortTraductorEjecutor.class);
	}


	public Object getBean(String nombreBean)  {
		log.debug("getBean = " + nombreBean);
		return applicationContext.getBean(nombreBean);
	}


	public ClassPathXmlApplicationContext getApplicationContext() {
		return applicationContext;
	}


	public void setApplicationContext(
			ClassPathXmlApplicationContext applicationContext) {
		this.applicationContext = applicationContext;
	}


	public   void beginTransactionSpring()  {
		log.debug("beginTransactionSpring++");
		HibernateTransactionManager txManager =(HibernateTransactionManager) getBean("txManager");
		//mySettings.setPropagationBehavior(DefaultTransactionDefinition.PROPAGATION_MANDATORY); 
		miTrans = txManager.getTransaction(midef);
		log.debug("beginTransactionSpring--");
	}


	public   void rollbackTransactionSpring()  {
		log.debug("rollbackTransactionSpring++");
		HibernateTransactionManager txManager =(HibernateTransactionManager) getBean("txManager");
		txManager.rollback(miTrans);
		log.debug("rollbackTransactionSpring--");		
	}    


	public void  commitTransactionSpring()  {
		log.debug("commitTransactionSpring++");
		HibernateTransactionManager txManager =(HibernateTransactionManager) getBean("txManager");
		txManager.setTransactionSynchronization(HibernateTransactionManager.SYNCHRONIZATION_ON_ACTUAL_TRANSACTION);
		txManager.commit(miTrans);  
		txManager.setTransactionSynchronization(HibernateTransactionManager.SYNCHRONIZATION_ALWAYS);
		log.debug("commitTransactionSpring--");

	}

}
