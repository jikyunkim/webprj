<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>        
<!DOCTYPE html>
<html>

<head>
    <title>�ڵ� �������� ����� ���� �¶��� ���� �ý���</title>
    <meta charset="UTF-8">
    <title>�������׸��</title>

    <link href="/css/layout.css" type="text/css" rel="stylesheet" />
    <link href="/css/index.css" type="text/css" rel="stylesheet" />
    <script>
    
    </script>
</head>

<body>
    <!-- header �κ� -->

	<tiles:insertAttribute name="header" />


    <!-- --------------------------- <body> --------------------------------------- -->

	<tiles:insertAttribute name="body" />


    <!-- ------------------- <footer> --------------------------------------- -->

	<tiles:insertAttribute name="footer" />


</body>

</html>