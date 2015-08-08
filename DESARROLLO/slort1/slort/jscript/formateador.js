/*
* Author(s)   : Jordi Raya
* Date        : 19/02/2003
* Version     : 1.01
* Last update : 28/06/2003
* File        : formateador.js
* Description : Funciones de formateo ES_es de campos de formularios
*/

// Funci�n para dar formatear n�meros
// Pensada para llamar al onblur de un campo de texto pas�ndole this como par�metro
function formatNumero(obj){
  var valor = obj.value;
  if (valor != ""){
    var valid = "0123456789,.";    
    var allValid = true;  
    for (n=0;  n<valor.length; n++){
      for (m=0;  m<valid.length; m++){
      	if (valor.charAt(n) == valid.charAt(m)){ 
      	  break;
      	}
      }	
      if (m == valid.length){ 
      	allValid = false; 
      	break;
      }      
    }    
    if (!allValid){
      return;
    }
// si no hay puntos ni comas  
    if ((valor.indexOf(".")==-1) && (valor.indexOf(",")==-1)){
      obj.value = processIntPart(valor);
      return;
    }
// si hay punto pero no hay coma
    if ((valor.indexOf(".")!=-1) && (valor.indexOf(",")==-1)){
      pos = valor.lastIndexOf(".");
      intPart = processIntPart(valor.substring(0,pos));
      decPart = processDecPart(valor.substring(pos+1,valor.length));
      obj.value = intPart+ ","+ decPart; 
      return;
    }  
// si hay coma pero no hay punto
    if ((valor.indexOf(".")==-1) && (valor.indexOf(",")!=-1)){
      pos = valor.lastIndexOf(",");
      intPart = processIntPart(valor.substring(0,pos));
      decPart = processDecPart(valor.substring(pos+1,valor.length));
      obj.value = intPart+ ","+ decPart; 
      return;
    }
// si hay puntos y comas
    if ((valor.indexOf(".")!=-1) && (valor.indexOf(",")!=-1)){
      posComa = valor.lastIndexOf(",");
      posPunt = valor.lastIndexOf(".");
      pos = posComa>posPunt? posComa:posPunt;
      intPart = processIntPart(valor.substring(0,pos));
      decPart = processDecPart(valor.substring(pos+1,valor.length));
      obj.value = intPart+ ","+ decPart; 
      return;
    }         
  }
}

// Funci�n para formatear n�meros decimales
// Pone una coma y un cero en caso de que no los haya, 
// Pensada para llamar al onblur de un campo de texto pas�ndole this como par�metro
function formatNumeroDecimal(obj){
  var valor = obj.value;
  if (valor != ""){
    var valid = "0123456789,.";
    var allValid = true;
    for (n=0;  n<valor.length; n++){
      for (m=0;  m<valid.length; m++){
      	if (valor.charAt(n) == valid.charAt(m)){ break; }
      }
      if (m == valid.length){ allValid = false; break; }
    }
    if (!allValid){
      alert("Por favor introduzca un valor num�rico");
      obj.focus();
      return;
    }
// si no hay puntos ni comas
    if ((valor.indexOf(".")==-1) && (valor.indexOf(",")==-1)){
      obj.value = processIntPart(valor) + ".00";
      return;
    }
// si hay punto pero no hay coma
    if ((valor.indexOf(".")!=-1) && (valor.indexOf(",")==-1)){
      pos = valor.lastIndexOf(".");
      intPart = processIntPart(valor.substring(0,pos));
      decPart = processDecPart(valor.substring(pos+1,valor.length));
      obj.value = intPart+ "."+ decPart;
      return;
    }
// si hay coma pero no hay punto
    if ((valor.indexOf(".")==-1) && (valor.indexOf(",")!=-1)){
      pos = valor.lastIndexOf(",");
      intPart = processIntPart(valor.substring(0,pos));
      decPart = processDecPart(valor.substring(pos+1,valor.length));
      obj.value = intPart+ "."+ decPart;
      return;
    }
// si hay puntos y comas
    if ((valor.indexOf(".")!=-1) && (valor.indexOf(",")!=-1)){
      posComa = valor.lastIndexOf(",");
      posPunt = valor.lastIndexOf(".");
      pos = posComa>posPunt? posComa:posPunt;
      intPart = processIntPart(valor.substring(0,pos));
      decPart = processDecPart(valor.substring(pos+1,valor.length));
      obj.value = intPart+ "."+ decPart;
      return;
    }
  }
}

// Funci�n para formatear fechas
// Compureba que la fecha tenga separadores. Si no los tiene, los pone. Si hay 7 caracteres, se a�ade un 0 al dia
// Pensada para llamar al onblur de un campo de texto pas�ndole this como par�metro
function formatearFecha(obj){
  var cad = obj.value;
  var separador = "/";
  var format = /^(\d{1,2})(\/|-)(\d{1,2})\2(\d{4})$/;
  var match = cad.match(format);
  if (match == null){
    cad = toDigits(cad);
    if ((cad.length != 6) && (cad.length != 7) && (cad.length != 8)){ return; }
    if (cad.length == 8){
      var dia = cad.charAt(0) + cad.charAt(1);
      var mes = cad.charAt(2) + cad.charAt(3);
      var anyo = cad.charAt(4) + cad.charAt(5) + cad.charAt(6) + cad.charAt(7);
      obj.value = dia + separador + mes + separador + anyo;
    }
    if (cad.length == 7){
      var mes = cad.charAt(1) + cad.charAt(2);
      var numMes = 0;
      if (cad.charAt(1) == "0"){
        numMes = parseInt(cad.charAt(2));
      } else {
        numMes = parseInt(mes);
      } 
      if (numMes <= 12){
        var dia = "0" + cad.charAt(0);
        var anyo = cad.charAt(3) + cad.charAt(4) + cad.charAt(5) + cad.charAt(6);
        obj.value = dia + separador + mes + separador + anyo;
      } else {
        var dia = cad.charAt(0) + cad.charAt(1);
        var numDia = parseInt(dia)
        if (numDia <= 31){
          var mes = "0" + cad.charAt(2);
          var anyo = cad.charAt(3) + cad.charAt(4) + cad.charAt(5) + cad.charAt(6);
          obj.value = dia + separador + mes + separador + anyo;
        }
      }
    }
    if (cad.length == 6){
      var dia = "0" + cad.charAt(0);
      var mes = "0" + cad.charAt(1);
      var anyo = cad.charAt(2) + cad.charAt(3) + cad.charAt(4) + cad.charAt(5);
      obj.value = dia + separador + mes + separador + anyo;
    }
  }
}

// Funciones privadas
function toDigits(str){
  cad = "";
  for (n=0; n<str.length; n++){
    car = str.charAt(n);
    if (!isNaN(parseInt(car))){	
      cad += car;	
    } 	
  }
  return cad;	
}

function processIntPart(valor){
  if (valor==""){
    valor = "0";
  }
// quitar los puntos y comas
  valor = trimPointers(valor);
// quitar los ceros a la izquierda
  valor = trimLeftZeroes(valor);
// a�adir los puntos dando la vuelta
  var valor1 = "";
  var cont = 0;
  for(n=valor.length; n>=0; n--){
    valor1 += valor.charAt(n);
    if (cont == 3){
      cont = 0;
//      valor1 += ".";
    }
    cont ++;
  }
// dar la vuelta
  valor1 = reverse(valor1);
// si hay un punto inicial lo quitamos  
  if (valor1.charAt(0)=="."){
    valor1 = valor1.substring(1,valor1.length);
  }  
  return valor1;  
}

function processDecPart(valor){
  if (valor==""){
    valor = "00";
  }
  valor = trimPointers(valor);
  valor = trimRightZeroes(valor);
  return valor;
}

function reverse(valor){
  var valor1 = "";
  for(n=valor.length; n>=0; n--){
    valor1 += valor.charAt(n);
  }
  return valor1;
}

function trimPointers(valor){
  var valor1 = "";  
  for(n=0; n<valor.length; n++){
    if ((valor.charAt(n)!=".") && (valor.charAt(n)!=",")){
      valor1 += valor.charAt(n);
    }
  }
  return valor1;
}

function trimLeftZeroes(valor){
  var valor1 = "";
  var trimer = true;
  for(n=0; n<valor.length; n++){
    if (!((valor.charAt(n)=="0") && (trimer))){
      valor1 += valor.charAt(n);
      trimer = false;
    }
  }
  if (valor1==""){
    valor1 = "0";
  }
  return valor1;
}

function trimRightZeroes(valor){
  var valor1 = "";
  var trimer = true;
  for(n=valor.length-1; n>=0; n--){
    if (!((valor.charAt(n)=="0") && (trimer))){
      valor1 += valor.charAt(n);
      trimer = false;
    }
  }
  valor1 = reverse(valor1);
  if (valor1==""){
    valor1 = "00";
  }  
  return valor1;
}
