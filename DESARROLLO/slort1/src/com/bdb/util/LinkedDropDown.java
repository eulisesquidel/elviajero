/**
 * Created on 14-oct-2004
 * @author a999942
 *
 */

package com.bdb.util;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.BodyTagSupport;

import org.apache.ecs.ElementContainer;
import org.apache.struts.Globals;
import org.apache.struts.util.RequestUtils; 

/**
 * Este tag sirve para el caso en que existan 2 dropdowns en un JSP
 * en donde en base a la seleccion del primer dropdown se llene dinamicamente
 * el 2do. dropdown.
 *
 */
public class LinkedDropDown extends BodyTagSupport {
	private Object mapaObj			= null;
	private String mapa				= null;
	private String origen			= null;
	private String destino			= null;
	private String idOrigen			= null;
	private Object idPadre			= null;
	private String idDestino		= null;
	private Object idHijo			= null;
	private String form				= null;
	private String propertyOrigen	= null;
	private String propertyDestino	= null;
	private String keyOrigen		= null;
	private String keyDestino		= null;
	private String styleOrigen		= null;
	private String styleDestino		= null;
	private String onChangeOrigen	= null;
	private String onChangeDestino	= null;
    private boolean disabledOrigen  = false;
    private boolean disabledDestino = false;
	private String orientacion		= null;
	private String colspan			= null;
    private String identificador    = null;    
    private String widthTituloOrigen          = null;
    private String widthTituloDestino         = null;
    private String widthSelectOrigen          = null;    
    private String widthSelectDestino         = null;
    private String keyMensajeSeleccionOrigen  = null;
    private String keyMensajeSeleccionDestino = null;    
	private String messageOrigen	          = new String();
	private String messageDestino	          = new String();
    private String messageSeleccionOrigen     = new String();
    private String messageSeleccionDestino    = new String();


	/**
	 * The servlet context attribute key for our resources.
	 */
	
	
	
	
	protected String bundle = null;

	public String getBundle() {
		return (this.bundle);
	}

	public void setBundle(String bundle) {
		this.bundle = bundle;
	}

	/**
	 * The session scope key under which our Locale is stored.
	 */
	protected String localeKey = Globals.LOCALE_KEY;

	public String getLocale() {
		return (this.localeKey);
	}

	public void setLocale(String localeKey) {
		this.localeKey = localeKey;
	}

	/**
	 * The first optional argument.
	 */
	protected String arg0 = null;

	public String getArg0() {
		return (this.arg0);
	}

	public void setArg0(String arg0) {
		this.arg0 = arg0;
	}


	/**
	 * The second optional argument.
	 */
	protected String arg1 = null;

	public String getArg1() {
		return (this.arg1);
	}

	public void setArg1(String arg1) {
		this.arg1 = arg1;
	}


	/**
	 * The third optional argument.
	 */
	protected String arg2 = null;

	public String getArg2() {
		return (this.arg2);
	}

	public void setArg2(String arg2) {
		this.arg2 = arg2;
	}


	/**
	 * The fourth optional argument.
	 */
	protected String arg3 = null;

	public String getArg3() {
		return (this.arg3);
	}

	public void setArg3(String arg3) {
		this.arg3 = arg3;
	}

	/**
	 * The fifth optional argument.
	 */
	protected String arg4 = null;

	public String getArg4() {
		return (this.arg4);
	}

	public void setArg4(String arg4) {
		this.arg4 = arg4;
	}

	public int doStartTag() throws JspException {
		JspWriter out = pageContext.getOut();

		//Logger log = Logger.getLogger(this.getClass());
		//log.info("doStartTag()" , "Inicio");
	
		mapaObj 	= pageContext.findAttribute(mapa);

//		TODO reemplazar el try/catch de abajo por el codigo comentado (es más correcto)
//		Enumeration atributesInScope = pageContext.getAttributeNamesInScope(pageContext.SESSION_SCOPE);
//		while (atributesInScope.hasMoreElements()) {
//			Object nombreAtributo = atributesInScope.nextElement();
//			log.info("doStartTag","nombreAtributo="+nombreAtributo );
//			if (nombreAtributo.equals(idOrigen)) {
//				idPadre = (String) pageContext.findAttribute(idOrigen);
//			}
//			if (nombreAtributo.equals(idDestino)) {
//				idHijo = (String) pageContext.findAttribute(idDestino);
//			}
//		}

		try {
			idPadre = pageContext.findAttribute(idOrigen);
			idHijo  = pageContext.findAttribute(idDestino);
		} catch (NullPointerException e1) {
			// No hago nada --> soy un vago, ja, ja!!
		}
		
		try {
			// Construct the optional arguments array we will be using
			Object args[] = new Object[5];
			args[0] = arg0;
			args[1] = arg1;
			args[2] = arg2;
			args[3] = arg3;
			args[4] = arg4;

			if (keyOrigen!=null  && keyOrigen.length()>0)  this.messageOrigen  = RequestUtils.message(pageContext, this.bundle, this.localeKey, keyOrigen, args);
			if (keyDestino!=null && keyDestino.length()>0) this.messageDestino = RequestUtils.message(pageContext, this.bundle, this.localeKey, keyDestino, args);
            
            if (keyMensajeSeleccionOrigen!=null && keyMensajeSeleccionOrigen.length()>0)
                this.messageSeleccionOrigen = RequestUtils.message(pageContext, this.bundle, this.localeKey, keyMensajeSeleccionOrigen, args);
            else
                this.messageSeleccionOrigen = RequestUtils.message(pageContext, this.bundle, this.localeKey, "mensaje.seleccion.generico", args);
            
            if (keyMensajeSeleccionDestino!=null && keyMensajeSeleccionDestino.length()>0) 
                this.messageSeleccionDestino = RequestUtils.message(pageContext, this.bundle, this.localeKey, keyMensajeSeleccionDestino, args);
            else
                this.messageSeleccionDestino = RequestUtils.message(pageContext, this.bundle, this.localeKey, "mensaje.seleccion.generico", args);
            
            if (identificador == null) this.identificador = new String("1");
            
            //System.out.println("---->messageSeleccionOrigen="+this.messageSeleccionOrigen);
            //System.out.println("---->messageSeleccionDestino="+this.messageSeleccionDestino);
	
			out.print(scriptGenerateArrays());
			out.print(scriptPopulate());

			// Imprime el HTML con los select
//			out.print("<tr>");
			
            String indDisabled = "";
            if (disabledOrigen) {
                indDisabled = " DISABLED ";
            }
            
			//out.print("<table width='100%'>");
            
			out.print("		<tr>");
//			out.print("			<td>");
//			out.print("				<table>");
            
//			out.print("					<tr>");
            if (keyOrigen!=null)		
				System.out.println("<th valign='top' class="+styleOrigen+" "+((widthTituloOrigen!=null)?" width='"+widthTituloOrigen+"'":"")+"><span class="+styleOrigen+">"+messageOrigen+"</span></th>");
            out.print("						<th valign='top' class="+styleOrigen+" "+((widthTituloOrigen!=null)?" width='"+widthTituloOrigen+"'":"")+"><span class="+styleOrigen+">"+messageOrigen+"</span></th>");
			out.print("						<td valign='top' "+((widthSelectOrigen!=null)?" width='"+widthSelectOrigen+"'":"")+">");
			out.print("							<select class="+styleOrigen+" name="+origen+" onchange='populateDropDown"+identificador+"(document."+form+",document."+form+"."+origen+".options[document."+form+"."+origen+".selectedIndex].value);"+onChangeOrigen+"'"+ ((disabledOrigen)?" DISABLED ":"")+">" );
			if(messageSeleccionOrigen!=null)
				out.print("								<option value='0'>...</option>");
				//out.print("								<option value='0'>"+messageSeleccionOrigen+"...</option>");
			else
				out.print("								<option value='0'>...</option>");
			// Genero el resto de los option
			Object padre		 = null;
			Object padreSelected = null;
			Iterator it			 = ((Map) this.mapaObj).entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry entry = (Map.Entry)it.next();
				padre 			= entry.getKey();
				Collection hijos	= (Collection) entry.getValue();

				// Genero el option del padre unicamente si este tiene hijos 
				if (hijos.size() > 0) { 
					Class claseDePadre	= padre.getClass();
					
					// Recupero el Id del objeto padre
					Method metodo 		= claseDePadre.getMethod(generarNombreMetodo(propertyOrigen), null);
					Long id			= (Long)metodo.invoke(padre, null);
					
					// Evalua si esta ocurrencia se encuentra seleccionada de antemano (por ej.
					// para las pantallas de modificacion)
					String selected 	= "'";
					if (this.idPadre != null) {
						if (this.idPadre.equals(id)) {
							padreSelected = padre;
							selected = "' selected";
						}
					}
			
					// Recupero la descripcion del objeto padre
					metodo		 	= claseDePadre.getMethod(generarNombreMetodo("descrip"), null);
					String label	= (String)metodo.invoke(padre, null);
					out.print("<option value='"+id+selected+">"+label+"</option>");
				}
			}
			out.print("							</select>");
			out.print("						</td>");
			if (this.orientacion.equals("V")) {
				out.print("			</tr>");
				out.print("			<tr>");
			}
            if (keyDestino!=null)
				System.out.println("<th valign='top' class="+styleDestino+" "+((widthTituloDestino!=null)?" width='"+widthTituloDestino+"'":"")+"><span class="+styleOrigen+">"+messageDestino+"</span></th>");
	        out.print("					<th valign='top' class="+styleDestino+" "+((widthTituloDestino!=null)?" width='"+widthTituloDestino+"'":"")+"><span class="+styleOrigen+">"+messageDestino+"</span></th>");				
			out.print("					<td valign='top' "+((widthSelectDestino!=null)?" width='"+widthSelectDestino+"'":"")+"><select class="+this.styleDestino+" name="+destino+" onchange='"+onChangeDestino+"'" +((disabledDestino)?" DISABLED ":"")+">");
			
			if(messageSeleccionDestino!=null)
				out.print("								<option value='0'>...</option>");
				//out.print("								<option value='0'>"+messageSeleccionDestino+"...</option>");
			else
				out.print("								<option value='0'>...</option>");
			
			// Si el idDestino viene informado entonces debo dibujar los option para ese padre
			if (padreSelected != null) {
				Map mapa 			= (Map) this.mapaObj;
				Collection hijos	= (Collection) mapa.get(padreSelected);
				it					= hijos.iterator();
				while (it.hasNext()) {
					Object hijo 		= it.next();
					Class claseDeHijo 	= hijo.getClass();
					// Recupero la descripcion para el 2do. drop down. Para ello antes debo recuperar el 
					// getter correspondiente a la property solicitada
					Method metodo			= claseDeHijo.getMethod(generarNombreMetodo("descrip"), null);
					String descripcionHijo	= (String) metodo.invoke(hijo, null);
					metodo					= claseDeHijo.getMethod(generarNombreMetodo(propertyDestino), null);	
					Long idHijoRenglon	= (Long)metodo.invoke(hijo, null);

					// Evalua si esta ocurrencia se encuentra seleccionada de antemano (por ej.
					// para las pantallas de modificacion)
					String selected 	= "'";
					if (this.idHijo != null) {
						if (this.idHijo.equals(idHijoRenglon)) {
							padreSelected = padre;
							selected = "' selected";
						}
					}
					out.print("<option value='"+idHijoRenglon+selected+">"+descripcionHijo+"</option>");
				}
			}

			out.print("							</select>");
			out.print("						</td>");
//			out.print("					</tr>");
//			out.print("				</table>");
//			out.print("			</td>");
			out.print("		</tr>");
//			out.print("</table>");
			
			
//			out.print("		</tr>");
			

		} catch(IOException e) {
			e.printStackTrace();
		} catch (SecurityException e) {
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			e.printStackTrace();
		}
		
		//log.info("doStartTag()" , "Fin");

		return (EVAL_BODY_AGAIN);
	}

	/**
	 * Genera el JavaScript que se utiliza para popular el 2do. drop down.
	 * @return
	 */
	public ElementContainer scriptPopulate () {
		ElementContainer script = new ElementContainer();
		script.setPrettyPrint(false);

//		Creo:
//		function populateAgentes(inForm,selected) {
//			var selectedArray = eval("Array" + selected);
//			// Borra el contenido de la Selection de destino
//			for (var i=1; i < inForm.idAgenteFiltro.options.length; i++) { 
//				inForm.idAgenteFiltro.options[i] = null;
//			}
//			for (var i=1; i < selectedArray.length; i++) {
//				var texto = selectedArray[i];
//				var posicion = texto.indexOf ("&");
//				var descripcion = texto.substring(2,posicion);
//				var clave = texto.substring(posicion+1,texto.length - 2);
//				eval("inForm.idAgenteFiltro.options[i]=" + "new Option(descripcion,clave)");
//			}
//			if (inForm.idAgenteFiltro.options[0].value == '') {
//				inForm.idAgenteFiltro.options[0].value = 'Seleccione un Agente Colaborador ... ';
//			}
//		}

		script.addElement("function populateDropDown"+identificador+"(inForm,selected) { ");
        
        script.addElement("     var descripcion = null;");
        script.addElement("     var texto = null;");
        script.addElement("     var selectedArray = null;");
        script.addElement("     var posicion = null;");

        // Borra 2do. combo
        script.addElement("     var cantidad = inForm."+destino+".options.length;");        
        script.addElement("     for (var i = (cantidad-1); i >= 0; i--) { ");
        script.addElement("         inForm."+destino+".options[i] = null;");
        script.addElement("     }");        
        
        script.addElement("     if (selected != 0) {");
        script.addElement("         selectedArray = eval('Array' + selected +"+identificador+");");        
        script.addElement("         for (var i=0; i < selectedArray.length; i++) { ");            
        
        script.addElement("             if (i == 0) {");
        //script.addElement("                 var descripcion='"+messageSeleccionDestino+" ...';");
		script.addElement("                 var descripcion='...';");
        script.addElement("                 var clave=0;");
        script.addElement("             } else {");
        script.addElement("                 texto = selectedArray[i];");
        script.addElement("                 posicion = texto.indexOf ('&');");
        script.addElement("                 descripcion = texto.substring(2,posicion);");
        script.addElement("                 clave = texto.substring(posicion+1,texto.length - 2);");
        script.addElement("             }");
        
        script.addElement("             inForm."+destino+".options[i]= new Option(descripcion,clave);");
        
        script.addElement("             if (i == 0) { ");
        script.addElement("                 inForm."+destino+".options[0].selected=true;");
        script.addElement("             }");
        script.addElement("         }");
        script.addElement("     } else {");
        //script.addElement("         inForm."+destino+".options[0]= new Option('"+messageSeleccionDestino+" ...',0);");
		script.addElement("         inForm."+destino+".options[0]= new Option('...',0);");
        script.addElement("         inForm."+destino+".options[0].selected=true;");
        script.addElement("     }");        
        
		script.addElement("}");
		script.addElement("</SCRIPT>");
		
		return script;
	}

	/**
	 * Generacion de JavaScript para cambiar dinamicamente el 2do. drop down
	 * 
	 * @return
	 */
	public ElementContainer scriptGenerateArrays() throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		
		//Logger log = Logger.getLogger(this.getClass());
		//log.info("scriptGenerateArrays" , "Inicio");
				
		ElementContainer script = new ElementContainer();
		script.setPrettyPrint(true);
		
		script.addElement("<SCRIPT language=JavaScript>");
		
		// La key del mapa contiene el padre y el value contiene una Collection de hijos
		Object padre	= null;
		Iterator it		= ((Map) mapaObj).entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry entry 	= (Map.Entry)it.next();
			padre 				= (Object) entry.getKey();
			Collection hijos	= (Collection) entry.getValue();

			// Creo tantos array de hijos, como padres existan 
			if (hijos.size() > 0) { 
				Class claseDePadre	= padre.getClass();
				
				// Recupero el Id del objeto padre
				//Method metodo 		= claseDePadre.getMethod(propertyOrigen, null);
				Method metodo 		= claseDePadre.getMethod(generarNombreMetodo(propertyOrigen), null);
				Long id			= (Long)metodo.invoke(padre, null);
				//String mensaje 		= new String("'Seleccione " + messageSeleccionOrigen + " ...'");
				String mensaje 		= new String("'Seleccione...'");

				script.addElement("var Array"+id+identificador+" = new Array(\"("+messageSeleccionOrigen+",'',true,true)\","); 
//				var Array<%=empresa.getId()%> = new Array("('Seleccione un Agente ...','',true,true)",<%

				// Ahora pre-cargo los arrays de JavaScript con los posibles contenidos del 2do.drop down
				Iterator it2   		= hijos.iterator();
				int j 		   		= 0;

				while (it2.hasNext()) {
					Object hijo 		= it2.next();
					Class claseDeHijo 	= hijo.getClass(); 
					// Recupero la descripcion para el 2do. drop down. Para ello antes debo recuperar el 
					// getter correspondiente a la property solicitada	
					metodo					= claseDeHijo.getMethod(generarNombreMetodo("descrip"), null);
					String descripcionHijo	= (String) metodo.invoke(hijo, null);
					metodo					= claseDeHijo.getMethod(generarNombreMetodo(propertyDestino), null);					
					String idHijo			= (Long)metodo.invoke(hijo, null)+"'";
					
					if (j < hijos.size() - 1) {
						String texto 		= new String ("'"+descripcionHijo);
						script.addElement("\"("+texto+"&"+idHijo+")\" ,");
//						"('<%=agente.getNombre()%>&<%=agente.getId()%>')", <%
					} else {
						String texto 		= new String ("'"+descripcionHijo);
						script.addElement("\"("+texto+"&"+idHijo+")\");");
//						"('<%=agente.getNombre()%>&<%=agente.getId()%>')";<%
					}
					j++;
				}
			} else {
				//String mensaje 	= new String("'Seleccione " + messageSeleccionDestino + " ...'");
				String mensaje 	= new String("'Seleccione...'");
				script.addElement("var Array0"+identificador+" = new Array(\"("+messageSeleccionDestino+",'',true,true)\");");
//				var Array<%=empresa.getId()%> = new Array("('Seleccione un Agente ...','',true,true)");<%
			}
		}

		return script;
	}

	/** Devuelve el nombre del getter de acuerdo al property (nombre del campo) que
	 *  se desea mostrar como descripcion del drop down.
	 * @param property
	 * @return
	 */
	private String generarNombreMetodo(String property) {
		
		String primeraLetra = property.substring(0,1);
		String resto		= property.substring(1);

		String nombreMetodo = "get" + primeraLetra.toUpperCase() + resto;
		
		return nombreMetodo;
	}
	
	/**
	 * @return
	 */
	public String getDestino() {
		return this.destino;
	}

	/**
	 * @return
	 */
	public String getForm() {
		return this.form;
	}

	/**
	 * @return
	 */
	public String getKeyDestino() {
		return this.keyDestino;
	}

	/**
	 * @return
	 */
	public String getKeyOrigen() {
		return this.keyOrigen;
	}

	/**
	 * @return
	 */
	public String getMapa() {
		return this.mapa;
	}

	/**
	 * @return
	 */
	public String getOrientacion() {
		return this.orientacion;
	}

	/**
	 * @return
	 */
	public String getOrigen() {
		return this.origen;
	}

	/**
	 * @return
	 */
	public String getStyleDestino() {
		return this.styleDestino;
	}

	/**
	 * @return
	 */
	public String getStyleOrigen() {
		return this.styleOrigen;
	}

	/**
	 * @param string
	 */
	public void setDestino(String destino) {
		this.destino = destino;
	}

	/**
	 * @param string
	 */
	public void setForm(String form) {
		this.form = form;
	}

	/**
	 * @param string
	 */
	public void setKeyDestino(String keyDestino) {
		this.keyDestino = keyDestino;
	}

	/**
	 * @param string
	 */
	public void setKeyOrigen(String keyOrigen) {
		this.keyOrigen = keyOrigen;
	}

	/**
	 * @param map
	 */
	public void setMapa(String newMapa) {
		this.mapa = newMapa;
	}

	/**
	 * @param string
	 */
	public void setOrientacion(String orientacion) {
		this.orientacion = orientacion;
	}

	/**
	 * @param string
	 */
	public void setOrigen(String origen) {
		this.origen = origen;
	}

	/**
	 * @param string
	 */
	public void setStyleDestino(String styleDestino) {
		this.styleDestino = styleDestino;
	}

	/**
	 * @param string
	 */
	public void setStyleOrigen(String styleOrigen) {
		this.styleOrigen = styleOrigen;
	}

	/**
	 * @return
	 */
	public String getPropertyDestino() {
		return this.propertyDestino;
	}

	/**
	 * @return
	 */
	public String getPropertyOrigen() {
		return this.propertyOrigen;
	}

	/**
	 * @param string
	 */
	public void setPropertyDestino(String propertyDestino) {
		this.propertyDestino = propertyDestino;
	}

	/**
	 * @param string
	 */
	public void setPropertyOrigen(String propertyOrigen) {
		this.propertyOrigen = propertyOrigen;
	}

	/**
	 * @return
	 */
	public String getIdDestino() {
		return this.idDestino;
	}

	/**
	 * @return
	 */
	public String getIdOrigen() {
		return this.idOrigen;
	}

	/**
	 * @param string
	 */
	public void setIdDestino(String idDestino) {
		this.idDestino = idDestino;
	}

	/**
	 * @param string
	 */
	public void setIdOrigen(String idOrigen) {
		this.idOrigen = idOrigen;
	}



	/**
	 * @return
	 */
	public String getOnChangeDestino() {
		return onChangeDestino;
	}

	/**
	 * @return
	 */
	public String getOnChangeOrigen() {
		return onChangeOrigen;
	}

	/**
	 * @param string
	 */
	public void setOnChangeDestino(String string) {
		onChangeDestino = string;
	}

	/**
	 * @param string
	 */
	public void setOnChangeOrigen(String string) {
		onChangeOrigen = string;
	}

	/**
	 * @return
	 */
	public String getColspan() {
		return colspan;
	}

	/**
	 * @param string
	 */
	public void setColspan(String string) {
		colspan = string;
	}

    /**
     * @return Returns the disabledDestino.
     */
    public boolean isDisabledDestino() {
        return disabledDestino;
    }
    
    /**
     * @param disabledDestino The disabledDestino to set.
     */
    public void setDisabledDestino(boolean disabledDestino) {
        this.disabledDestino = disabledDestino;
    }
    
    /**
     * @return Returns the disabledOrigen.
     */
    public boolean isDisabledOrigen() {
        return disabledOrigen;
    }
    
    /**
     * @param disabledOrigen The disabledOrigen to set.
     */
    public void setDisabledOrigen(boolean disabledOrigen) {
        this.disabledOrigen = disabledOrigen;
    }
    
    /**
     * @return Returns the identificador.
     */
    public String getIdentificador() {
        if (identificador == null) {
            identificador = new String("1");
        }
        return identificador;
    }
    
    /**
     * @param identificador The identificador to set.
     */
    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    
    /**
     * @return Returns the widthSelectDestino.
     */
    public String getWidthSelectDestino() {
        return widthSelectDestino;
    }
    
    /**
     * @param widthSelectDestino The widthSelectDestino to set.
     */
    public void setWidthSelectDestino(String widthSelectDestino) {
        this.widthSelectDestino = widthSelectDestino;
    }
    
    /**
     * @return Returns the widthSelectOrigen.
     */
    public String getWidthSelectOrigen() {
        return widthSelectOrigen;
    }
    
    /**
     * @param widthSelectOrigen The widthSelectOrigen to set.
     */
    public void setWidthSelectOrigen(String widthSelectOrigen) {
        this.widthSelectOrigen = widthSelectOrigen;
    }
    
    /**
     * @return Returns the widthTituloDestino.
     */
    public String getWidthTituloDestino() {
        return widthTituloDestino;
    }
    
    /**
     * @param widthTituloDestino The widthTituloDestino to set.
     */
    public void setWidthTituloDestino(String widthTituloDestino) {
        this.widthTituloDestino = widthTituloDestino;
    }
    
    /**
     * @return Returns the widthTituloOrigen.
     */
    public String getWidthTituloOrigen() {
        return widthTituloOrigen;
    }
    
    /**
     * @param widthTituloOrigen The widthTituloOrigen to set.
     */
    public void setWidthTituloOrigen(String widthTituloOrigen) {
        this.widthTituloOrigen = widthTituloOrigen;
    }
    
    
    /**
     * @return Returns the keyMensajeSeleccionDestino.
     */
    public String getKeyMensajeSeleccionDestino() {
        return keyMensajeSeleccionDestino;
    }
    
    /**
     * @param keyMensajeSeleccionDestino The keyMensajeSeleccionDestino to set.
     */
    public void setKeyMensajeSeleccionDestino(String keyMensajeSeleccionDestino) {
        this.keyMensajeSeleccionDestino = keyMensajeSeleccionDestino;
    }
    
    /**
     * @return Returns the keyMensajeSeleccionOrigen.
     */
    public String getKeyMensajeSeleccionOrigen() {
        return keyMensajeSeleccionOrigen;
    }
    
    /**
     * @param keyMensajeSeleccionOrigen The keyMensajeSeleccionOrigen to set.
     */
    public void setKeyMensajeSeleccionOrigen(String keyMensajeSeleccionOrigen) {
        this.keyMensajeSeleccionOrigen = keyMensajeSeleccionOrigen;
    }

	public String getMessageDestino() {
		return messageDestino;
	}

	public void setMessageDestino(String messageDestino) {
		this.messageDestino = messageDestino;
	}

	public String getMessageOrigen() {
		return messageOrigen;
	}

	public void setMessageOrigen(String messageOrigen) {
		this.messageOrigen = messageOrigen;
	}

	public String getMessageSeleccionDestino() {
		return messageSeleccionDestino;
	}

	public void setMessageSeleccionDestino(String messageSeleccionDestino) {
		this.messageSeleccionDestino = messageSeleccionDestino;
	}

	public String getMessageSeleccionOrigen() {		
		return messageSeleccionOrigen;
	}

	public void setMessageSeleccionOrigen(String messageSeleccionOrigen) 
	{
		this.messageSeleccionOrigen = messageSeleccionOrigen;
	}
}
