var ajax = null;

function getAjax()
{
	ajax = null;
	
	if(window.XMLHttpRequest) 
	{
    	try 
    	{
			ajax = new XMLHttpRequest();
        } 
        catch(e) 
        {
			ajax = false;
        }
    } 
    else if(window.ActiveXObject) // branch for IE/Windows ActiveX version
    {
       	try 
       	{
        	ajax = new ActiveXObject("Msxml2.XMLHTTP");
      	} 
      	catch(e) 
      	{
        	try 
        	{
          		ajax = new ActiveXObject("Microsoft.XMLHTTP");
        	} 
        	catch(e) 
        	{
       			ajax = false;
       		}
		}
    }
}

function getURI(url)
{	
	getAjax();
	ajax.onreadystatechange=proccessReqChange;
	ajax.open("GET",url,true);
	ajax.send();
}

function proccessReqChange()
{
	// unicamente si esta siendo leido
	if (ajax.readystate == 4)
	{
		// vemos si esta correcto el procesamiento
		if (ajax.status!=200)
		{
			alert("There was a problem retrieving the XML data:\n" + ajax.statusText);
		}
		else
		{						
			operacionAjax(ajax.responseText);
		}
	}
}
function getURIXML(url)
{	
	getAjax();
	ajax.onreadystatechange=proccessReqChangeXML;
	ajax.open("GET",url,true);
	ajax.send();
}

function proccessReqChangeXML()
{
	// unicamente si esta siendo leido
	if (ajax.readystate == 4)
	{
		// vemos si esta correcto el procesamiento
		if (ajax.status!=200)
		{
			alert("There was a problem retrieving the XML data:\n" + ajax.statusText);
		}
		else
		{						
			operacionAjaxXML(ajax.responseText);
		}
	}
}


