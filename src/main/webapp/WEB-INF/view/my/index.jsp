<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html>
<html>
<head>
<link href="/resouce/css/bootstrap.min.css" rel="stylesheet">
<script type="text/javascript" src="/resouce/js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="/resouce/js/bootstrap.min.js"></script>
<meta charset="UTF-8">
<!-- 视窗 -->
<meta name="viewport" content="width=device-width, initial-scale=1.0">

<title>Insert title here</title>
</head>
<body>
<form method="post" action="index">
	<div class="form-group form-inline">
    <label for="name">姓名</label>
    <input type="text" class="form-control" id="name" name="name" value="${vo.name }">
 	
 	 </div>
  <div class="form-group form-inline">
    <label for="phone">手机号</label>
    <input type="text" class="form-control" id="phone" name="phone"  value="${vo.phone }">
  </div>
  <div class="form-group form-inline">
    <label for="tid" >房型</label>
    
    <select class="form-control" id="tid" name="tid" >
      <option value="1">豪华双人间</option>
      <option value="2">豪华单人间</option>
      <option value="3">总统房</option>
    </select>
  </div>
  <div class="form-group form-inline">
    <label for="p1">房价</label>
    <input type="text" class="form-control" id="p1" name="p1" value="${vo.p1 }" >-
    <input type="text" class="form-control" id="p2" name="p2" value="${vo.p2}">
  </div>
  <div class="form-group form-inline">
    <label for="p1">日期</label>
    <input type="date" class="form-control" id="d1" name="d1" value="${vo.d1 }">-
    <input type="date" class="form-control" id="d2" name="d2" value="${vo.d2 }">
  </div>
  <div>
   <input type="submit" value="提交">
  </div>
  <table class="table">
  <thead>
    <tr>
      <th scope="col">预定日期</th>
      <th scope="col">姓名</th>
      <th scope="col">手机</th>
      <th scope="col">房型</th>
      <th scope="col">房价</th>
      <th scope="col">备注</th>
    </tr>
  </thead>
  <tbody>
  	<c:forEach items="${info.list }" var="a">
  	
  	
    <tr>
      <td><fmt:formatDate value="${a.creattime }" pattern="yyyy-MM-dd"/></td>
      <td>${a.name }</td>
       <td>${a.phone }</td>
        <td>${a.tname }</td>
         <td>${a.price }</td>
         <td>${a.other }</td>
    </tr>
  	</c:forEach>
  <tr>
  <td>
		<jsp:include page="/WEB-INF/view/page.jsp"></jsp:include>
  </td>
  </tr>
  </tbody>
</table>
</form>
	<script type="text/javascript">
		function goPage(pageNum) {
			location="index?pageNum="+pageNum;
					
		}
		/* function tj() {
			var name=$("#name").val();
			var phone=$("#phone").val();
			var tid=$("[name=tid]:selected").val();
			;
			var p1=$("#p1").val();
			var p2=$("#p2").val();
			var d1=$("#d1").val();
			var d2=$("#d2").val();
			location="index?name="+name+"&phone="+phone+"&tid="+tid+"&p1="+p1+"&p2="+p2+
					"&d1="+d1+"&d2="+d2;
		} */
	</script>
</body>
</html>