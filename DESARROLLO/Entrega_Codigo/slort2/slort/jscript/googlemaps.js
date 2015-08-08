/************************************************************************************************************
	(C) www.dhtmlgoodies.com, April 2006
	
	This is a script from www.dhtmlgoodies.com. You will find this and a lot of other scripts at our website.	
	
	Terms of use:
	You are free to use this script as long as the copyright message is kept intact. However, you may not
	redistribute, sell or repost it without our permission.
	
	Thank you!
	
	www.dhtmlgoodies.com
	Alf Magne Kalleland
	
	************************************************************************************************************/	

	var ajaxBox_offsetX = 0;
	var ajaxBox_offsetY = 0;
	var ajax_list_externalFile = 'SuggestAjax.do';	// Path to external file
	var ajax_guardarAJAXAction = 'guardarAjax.do';	// Path to external file

	var minimumLettersBeforeLookup = 1;	// Number of letters entered before a lookup is performed.
	
	var ajax_list_objects = new Array();
	var ajax_list_cachedLists = new Array();
	var ajax_list_activeInput = false;
	var ajax_list_activeItem;
	var ajax_list_optionDivFirstItem = false;
	var ajax_list_currentLetters = new Array();
	var ajax_optionDiv = false;
	var ajax_optionDiv_iframe = false;

	var ajax_list_MSIE = false;
	if(navigator.userAgent.indexOf('MSIE')>=0 && navigator.userAgent.indexOf('Opera')<0)ajax_list_MSIE=true;
	
	var currentListIndex = 0;
	
	function ajax_getTopPos(inputObj)
	{
		
	  var returnValue = inputObj.offsetTop;
	  while((inputObj = inputObj.offsetParent) != null){
	  	returnValue += inputObj.offsetTop;
	  }
	  return returnValue;
	}
	function ajax_list_cancelEvent()
	{
		return false;
	}
	
	function ajax_getLeftPos(inputObj)
	{
	  var returnValue = inputObj.offsetLeft;
	  while((inputObj = inputObj.offsetParent) != null)returnValue += inputObj.offsetLeft;
	  
	  return returnValue;
	}
	
	
	function ajax_option_list_buildList_2(letters,paramToExternalFile)
	{
		
		ajax_optionDiv.innerHTML = '';
		ajax_list_activeItem = false;
		if(ajax_list_cachedLists[paramToExternalFile][letters.toLowerCase()].length<=1){
			ajax_options_hide();
			return;			
		}

		ajax_list_optionDivFirstItem = false;
		var optionsAdded = false;
		for(var no=0;no<ajax_list_cachedLists[paramToExternalFile][letters.toLowerCase()].length;no++){
			if(ajax_list_cachedLists[paramToExternalFile][letters.toLowerCase()][no].length==0)continue;
			optionsAdded = true;
			var div = document.createElement('DIV');
			var items = ajax_list_cachedLists[paramToExternalFile][letters.toLowerCase()][no].split(/###/gi);
			
			if(ajax_list_cachedLists[paramToExternalFile][letters.toLowerCase()].length==1 && ajax_list_activeInput.value == items[0]){
				ajax_options_hide();
				return;						
			}
			/* codigo modificado por eulises */
			//div.innerHTML = "<table cellspacing='1' cellpadding='1' border='1' style='border-collapse: collapse;border-spacing:0.5em 0.5em;'><tr><td>" + items[0] + "</td><td>" + items[items.length-1]+"</td></tr></table>";
			div.innerHTML = "<table cellspacing='1' cellpadding='1' border='1' style='border-collapse: collapse;border-spacing:0.5em 0.5em;'><tr><td>" + items[items.length-1]+"</td></tr></table>";
			div.id = items[0];
			div.className='optionDiv_2';
			div.onmouseover = function(){ ajax_options_rollOverActiveItem(this,false) }
			/* linea modificada por eulises */
			div.onclick = ajax_option_setValue_2;
			if(!ajax_list_optionDivFirstItem)ajax_list_optionDivFirstItem = div;
			ajax_optionDiv.appendChild(div);
		}	
		
		
		if(optionsAdded){
			ajax_optionDiv.style.display='block';
			if(ajax_optionDiv_iframe)ajax_optionDiv_iframe.style.display='';
			ajax_options_rollOverActiveItem(ajax_list_optionDivFirstItem,true);
		}
	}
	


	
	