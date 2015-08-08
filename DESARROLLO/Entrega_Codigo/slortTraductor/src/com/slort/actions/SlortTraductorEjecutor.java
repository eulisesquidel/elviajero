package com.slort.actions;


import org.apache.log4j.Logger;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SlortTraductorEjecutor {

    private static final Logger log;
    private ClassPathXmlApplicationContext applicationContext=null;
    
    static  {
        log = Logger.getLogger(com.slort.actions.SlortTraductorEjecutor.class);
    }
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		new SlortTraductorEjecutor();
	}
		
    public SlortTraductorEjecutor() throws InterruptedException {
    	log.debug("HOLA UDEMM");
    	while (true){
    		// si no podemos inicializar Spring esperamos y volvemos a intentar
    		try {initSpring();} catch (Exception e) { this.wait(3000); continue;}
    		// si spring inicializo correctamente empezamos la logica del traductor
    		SlortTraductorEjecutorHilos slortTraductorEjecutorHilos = new SlortTraductorEjecutorHilos(applicationContext);
    	  	while (true){
    	  		//  si se enuentra algun problema reinicialimos todo
	    		if (!(slortTraductorEjecutorHilos.hacerTraducciones())){
	    			this.wait(3000); break;
	    		}
	    		// si todo esta ok seguimos procesando
    	  	}
    	}
	}


	private  void initSpring() {
		// TODO Auto-generated method stub
		applicationContext = new ClassPathXmlApplicationContext(new String[]{"applicationContext.xml"});
        log.debug("Spring Hibernate inicializado correctamente");
		return;
    }
}
