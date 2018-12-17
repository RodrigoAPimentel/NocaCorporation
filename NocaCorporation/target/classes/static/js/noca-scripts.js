$(function(){
		$("#menu a").click(function( e ){
			e.preventDefault();
			var href = $( this ).attr('href');
			$("#content").load(href);
		});	
});

$(function(){ 
	  $('#menu a').click(function(event) {
	    event.preventDefault();
	    $('#menu > li').removeClass('active');
	    $(this).parent().addClass('active');
	  });
});

function incluiComissao(CARGO){
	if(CARGO == 'GERENTE'){
		document.getElementById("comissao").innerHTML=""; 
		$('#comissao').append('<div class="form-group"><label class="bmd-label-floating">% Comissão</label> <input type="text" class="form-control" th:field="*{porcentagemDeComissao}"></div>');
	}
	else if(CARGO == 'AGENTELOCACAO'){
		document.getElementById("comissao").innerHTML=""; 
		$('#comissao').append('<div class="form-group"><label class="bmd-label-floating">% Comissão</label> <input type="text" class="form-control" th:field="*{porcentagemDeComissao}"></div>');
	}else{
		document.getElementById("comissao").innerHTML="";
	}
}
