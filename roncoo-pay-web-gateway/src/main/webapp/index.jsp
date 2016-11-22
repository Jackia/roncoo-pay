<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
<script type="text/javascript" src="http://160066vd23.51mypc.cn/roncoo-pay-web-gateway/js/jquery-1.7.2.min.js"></script>
<script type="text/javascript">  
    $(document).ready(function(){  
        var jsonData = '{{"amount":"10","message":"成功","orderid":"OF161117181921F2H0PP1A","response_code":"00","tradetrace":"D147937787672736842","trans_time":"1479377876727"}=}'
        	alert(jsonData)
        $.ajax({ 
            type:"POST", 
            url:"http://160066vd23.51mypc.cn/roncoo-pay-web-gateway/scanPayNotify/notify/JIMI_WEIXIN", 
            dataType:"text",      
            contentType:"application/json",               
            data:jsonData, 
            success:function(data){ 
            } 
        
         }); 
    });  
</script> 
<body>
<h2>Hello World!000000000000</h2>
</body>
</html>
