

/**
 * 
 * @param Nombre del option del cual se desea obtener el valor
 * @return Retorna el valor actual.
 * @autor Diego
 */
function getValue(selectName)
{
  var index = document.getElementById(selectName).selectedIndex;
  var valor = document.getElementById(selectName).options[index].value;
  return valor;
}



function removeSpaces(v) {
      while (v.substring(0,1) == ' ') 
      	v = v.substring(1);
      while (v.substring(v.length-1,v.length) == ' ')  
      	v = v.substring(0,v.length-1);
      return v
}



function isEmpty(element)
{
  var empty = true;
  var type = element.type;

  if (((type == "password" || type == "text" || type == "textarea")
        && element.value != "")
      ||
      ((type == "checkbox" || type == "radio")
        && element.checked))
  {
    empty = false;
    
  } else if (type == "select-one" || type == "select-multiple") {
    if (removeSpaces(element.options[element.options.selectedIndex].value) != '') { 
    	empty=false;
    }
  }
  return empty;
}

function CheckFechaNoFocus(controlToFocus) {
	alert('Seleccione una fecha por medio del link');
	if (document.getElementById(controlToFocus)==null)
		return;
		
	if (document.getElementById(controlToFocus).visible==true){
		document.getElementById(controlToFocus).focus();
	}
}

function IsValidTime(timeStr, emptyOk) {
	// Verifica que la hora este en el formato HH:MM.

	if (emptyOk!=null && emptyOk && timeStr=="") {
		return true;
	}

	var timePat = /^(\d{2}):(\d{2})(:(\d{2}))?(\s?(AM|am|PM|pm))?$/;

	var matchArray = timeStr.match(timePat);
	if (matchArray == null) {
		alert("Formato de hora incorrecto");
		return false;
	}
	hour = matchArray[1];
	minute = matchArray[2];

	if (hour < 0  || hour > 23) {
		alert("La hora debe estar entre 0 y 23");
		return false;
	}
	if (minute<0 || minute > 59) {
		alert ("Los minutos deben estar entre 0 y 59.");
		return false;
	}
	return true;
}


function checkDecimals(fieldValue, blankIsValid, decPlaces) {

	if (blankIsValid && fieldValue == "") {
		return true;
	}
	if (fieldValue.indexOf(',') >= 0) {
		return false;
	}
	if (fieldValue.indexOf('.') == -1) {
		return true;
	}

	decallowed = 1;  // how many decimals are allowed?
	if (decPlaces==null || decPlaces=="") {
		// Nada
	} else {
		decallowed = decPlaces;
	}
	
	if (isNaN(fieldValue) || fieldValue == "") {
		alert("Número inválido");
	} else {
		if (fieldValue.indexOf('.') == -1) {
			fieldValue += ".";
		}
		dectext = fieldValue.substring(fieldValue.indexOf('.')+1, fieldValue.length);

		if (dectext.length > decallowed) {
			alert ("Ha ingresado demasiados decimales.");
		}
	}
	return true;
}

function numberBetween(value, min, max) {
	if (!isNumber(value)) {
		return false;
	}

	var valueInt = parseInt(value);
	if (valueInt<min || valueInt>max) {
		return false;
	}

	return true;
} 

function bdbSubmitForm(formName, arrayKeys, arrayValues) {
	if (arrayKeys!=null) {
		for (i = 0 ; i < arrayKeys.length ; i++) { 
		  document.forms[formName][arrayKeys[i]].value=arrayValues[i]; 
		} 
	}
	document.forms[formName].submit() 
}
	

function openWindow(form, w, h) {
	var prop;
	prop  = "width=" + w;
	prop += " ,height=" + h;
	prop += " ,scrollbars=1, toolbar=0, location=0";
	prop += " ,directories=0, status=0, menubar=0";
	prop += " ,resizable=1";

	window.open('about:blank', 'popup', prop );

	var target = form.target;
	form.target='popup';
	form.submit();
	form.target = target;
		
	return false;
}

function closeWindow() {
	window.close();
}


function printWindow() {
	window.print();
}


function checkNota(fieldName, min, max) {
	var notaVal = fieldName.value;
	if (notaVal=="") {
		return true;
	}
	if (!numberBetween(notaVal, min, max)) {
		alert("El valor debe estar entre "+min+" y "+max);
		fieldName.select();
		fieldName.focus();
		return false;
	}
	if (!checkDecimals(notaVal, true, 1)) {
		alert("Verifique los decimales");
		fieldName.select();
		fieldName.focus();
		return false;
	}
	return true;				
} 



function checboxSubmitValues(formName, checkboxName, toName, valueChecked, valueNoChecked) {
	var form = document.forms[formName];
	var checkBox = form.elements[checkboxName];
	var to = form.elements[toName];
  
	if (checkBox.length==null) {	
		if (eval("document."+formName+"."+checkboxName+".checked") == true) {
			to[0].value = valueChecked;
			to[0].text = valueChecked;
			to[0].selected = true;
		} else {
			to[0].value = valueNoChecked;
			to[0].text = valueNoChecked;
			to[0].selected = true;
		}		
		return;
	}
	
    
	for (var idx = 0; idx < checkBox.length; idx++) {

		if (eval("document."+formName+"."+checkboxName+"[" + idx + "].checked") == true) {
			to[idx].value = valueChecked;
			to[idx].text = valueChecked;
			to[idx].selected = true;
		} else {
			to[idx].value = valueNoChecked;
			to[idx].text = valueNoChecked;
			to[idx].selected = true;
		}
	}
}







