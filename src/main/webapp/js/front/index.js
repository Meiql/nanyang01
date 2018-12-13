/**
 * 
 */
$(function() {// 初始化内容
	//alert(111);
		/*$.ajax({
            type:"post",  //传输方式为post，
            url:"${ctx}/front/info",
            success:function(data){
            	debugger;
            	var notice='';
            	var news='';
            	var law='';
            	for(var i=0;i<data.data.length;i++){
            		if(data.data[i].typeId=='notice'){
            			notice+='<li><a href="/" target="_blank">'+data.data[i].title+'</a><span tyle="float:right;">'+data.data[i].create_time+'</span></li>';
            		}
            		if(data.data[i].typeId=='news'){
            			news+='<li><a href="/" target="_blank">'+data.data[i].title+'</a><span tyle="float:right;">'+data.data[i].create_time+'</span></li>';
            		}
            		if(data.data[i].typeId=='law'){
            			law+='<li><a href="/" target="_blank">'+data.data[i].title+'</a><span tyle="float:right;">'+data.data[i].create_time+'</span></li>';
            		}
            	}
            	$("#notice").html(notice);
            	$("#news").html(news);
            	$("#law").html(law);
            }
        });*/
})


function show(){

$.ajax({
		url : _ctx+"/f/mp/122/"+host+"/"+siteId+"/ajax/bang122",
		data : $("#" + _form).serialize(),
		type:"post",
		async:false,
		success : function(data) {
			if (data.status == "success") {
				if(_form=="bindVehicleForm"){
					sessionStorage.setItem("hphm", $("#hphm").val());
                    sessionStorage.setItem("hpzl", $("#hpzl").val());
				}
				layer.msg(data.message, {
					shade : 0.1,
					icon:1,
					shadeClose : true,
					time:1500,
					shadeClose : false,
					end:function(){
						if(returnUrl=="/vehssurisQuery"){
							returnUrl=returnUrl+"?hphm="+$("#hphm").val()+"&hpzl="+$("#hpzl").val();
						}
						location.href=_ctx+"/f/mp/122/"+host+"/"+siteId+returnUrl;
					}
				});
			} else {
				layer.msg(data.message, {
					shade : 0.1,
					icon:2,
					shadeClose : true,
					shadeClose : false,
					time:1500
				});
			}
		}
	})
}