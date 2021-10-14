<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>뉴스</title>
    <link rel="stylesheet" href="css/style.css">
    <link rel="stylesheet" href="css/mainNav.css">
    <link rel="stylesheet" href="css/notice.css">
</head>
<body>

    <div class="container">
    	<jsp:include page="include/index_include/index_header.jsp"></jsp:include>
        
        <main>
            <div class="notice_header">
                <ul>
                    <li class="notice_num">번호</li>
                    <li class="notice_title">제목</li>
                    <li class="notice_writer">작성자</li>
                    <li class="notice_date">작성일</li>
                    <li class="notice_count">조회수</li>
                </ul>
            </div>
            <div class="notice_main">
            	
            	<c:forEach var="notice" items="${noticeList }">
            		<a href="a">
            			<ul>
		                    <li class="notice_num">${notice.notice_code }</li>
		                    <li class="notice_title">${notice.notice_title }</li>
		                    <li class="notice_writer">${notice.notice_writer }</li>
		                    <li class="notice_date">${notice.notice_date }</li>
		                    <li class="notice_count">${notice.notice_count }</li>
		                </ul>
            		</a>
            	</c:forEach>
                
            </div>    
            
        </main>
        <footer>
			<div class="notice_footer">
                <ul>
                	<a href="notice?notice-page=1"><li>1</li></a>
                	<a href="notice?notice-page=2"><li>2</li></a>
                	<a href="notice?notice-page=3"><li>3</li></a>
                	<a href="notice?notice-page=4"><li>4</li></a>
                	<a href="notice?notice-page=5"><li>5</li></a>
                </ul>
            </div>
        </footer>
    </div>
    <script src="https://kit.fontawesome.com/a04df2c0ca.js" crossorigin="anonymous"></script>

</body>
</html>