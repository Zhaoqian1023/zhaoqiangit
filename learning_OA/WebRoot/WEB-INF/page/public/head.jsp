<%@ taglib prefix="s" uri="/struts-tags"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<script language="javascript" src="<%=basePath%>script/jquery.js"></script>
<script language="javascript" src="<%=basePath%>script/pageCommon.js"
	charset="utf-8"></script>
<script language="javascript" src="<%=basePath%>script/PageUtils.js"
	charset="utf-8"></script>
<script language="javascript"
	src="<%=basePath%>script/DataShowManager.js" charset="utf-8"></script>
<link type="text/css" rel="stylesheet"
	href="<%=basePath%>style/blue/pageCommon.css" />
<script type="text/javascript"> 
    </script>