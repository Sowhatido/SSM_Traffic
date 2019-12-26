<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%
  String path = request.getContextPath();
  String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
  %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<base href="<%=basePath%>">
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" />
<title>注册界面</title>
<style type="text/css">
<!--
body {
	margin-left: 0px;
	margin-top: 0px;
	margin-right: 0px;
	margin-bottom: 0px;
}
-->
</style>
<link href="css/css.css" rel="stylesheet" type="text/css" />
<script src="http://libs.baidu.com/jquery/2.1.4/jquery.min.js"></script> 
</head>

<body>

<h1 align="center">注册</h1>
<form action=""  method="post" id="form-register">
<table width="100%" border="0" cellspacing="0" cellpadding="0">
  <tr>
    <td height="147" background="images/top02.gif"><img src="images/top03.gif" width="776" height="147" /></td>
  </tr>
</table>
<table width="562" border="0" align="center" cellpadding="0" cellspacing="0" class="right-table03">
  <tr>
    <td width="221"><table width="95%" border="0" cellpadding="0" cellspacing="0" class="login-text01">
      
      <tr>
        <td><table width="100%" border="0" cellpadding="0" cellspacing="0" class="login-text01">
          <tr>
            <td align="center"><img src="images/ico13.gif" width="107" height="97" /></td>
          </tr>
          <tr>
            <td height="40" align="center">&nbsp;</td>
          </tr>
          
        </table></td>
        <td><img src="images/line01.gif" width="5" height="292" /></td>
      </tr>
    </table></td>
    <td><table width="100%" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="31%" height="35" class="login-text02">用户名称：<br /></td>
        <td width="69%"><input name="username" id="u" type="text" size="30" >
        <span id="testUname" color="red"></span></td>
      </tr>
      <tr>
        <td height="35" class="login-text02">密　码：<br /></td>
        <td><input name="password" type="password" size="33" />
        <span id="testPwd" color="red"></span></td>
      </tr>
      
      
      <tr>
          <td height="35">&nbsp;</td>
      		<td >
      			<select class="btn btn-default dropdown-toggle" name="permission">
				  <option value="车主">车主</option>
                  <option value="货主">货主</option>
                  <option value="管理员">管理员</option>
                  <option value="业务员">业务员</option>
				</select>		
			</td>
      
      
      </tr>
      
      
      <tr>
        <td height="35">&nbsp;</td>
        <td><input id="sm-register" type="submit" class="right-button01" value="注册"  />
          <input type="reset" class="right-button02" value="重 置" />
          <input type="reset" class="right-button02" value="登 录" onclick="javascript:location.href='user/showLogin.do'"/></td>
      </tr>
      
    </table></td>
  </tr>
</table>

</form>

<script type="text/javascript">
		$('#sm-register').click(function(){
			$.ajax({
	    		url:"user/userRegister.do",
	    		data:$("#form-register").serialize(),
	    		type:"post",
	    		dataType:"json",
	    		success:function(obj){
	    			alert(obj.message);
   					//alert(obj.state);
	    			if(obj.state==1){
	    				location="user/showLogin.do";
	    			}else if(obj.state==0){
	    				location="user/showRegister.do";
	    			}
	    		}
	    	});
		})
		</script>




<script type="text/javascript">
		$('#sm-login').click(function(){
			$.ajax({
	    		url:"user/userLogin.do",
	    		data:$("#form-login").serialize(),
	    		type:"post",
	    		dataType:"json",
	    		success:function(obj){
	    			alert(obj.message);
   					//alert(obj.state);
	    			if(obj.state==0){
	    				location="user/showLogin.do";
	    			}else if(obj.state==1){
	    				location="user/showDriver.do";
	    			}else if(obj.state==2){
	    				location="user/showUser.do";
	    			}else if(obj.state==3){
	    				location="user/showSuperadmin.do";
	    			}else if(obj.state==4){
	    				location="user/showAdmin.do";
	    			}
	    		}
	    	});
		})
		</script>
		
</body>
</html>