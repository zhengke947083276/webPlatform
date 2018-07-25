<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta charset="utf-8"/>
    <title>首页</title>
<%@include file="/WEB-INF/jsp/util/head.jsp" %>
</head>
<body>

<%@include file="/WEB-INF/jsp/item/upload.jsp"%>
<%@include file="/WEB-INF/jsp/customer/login.jsp"%>
<%--<h1>${servletPath}</h1>--%>
<div class="container">
    <div class="row clearfix">
        <div class="col-md-12 column">
            <nav class="navbar navbar-default" role="navigation">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1"> <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span class="icon-bar"></span><span class="icon-bar"></span></button><a class="navbar-brand" href="${pageContext.request.contextPath}/item/selectAll">首界面</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <%--<li class="active">--%>
                            <%--<a href="#">1</a>--%>
                        <%--</li>--%>
                        <li>
                            <a href="#">2</a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">项目管理<strong class="caret"></strong></a>
                            <ul class="dropdown-menu">
                                <c:if test="${user!=null}">
                                    <li>
                                        <!-- 按钮触发模态框 -->
                                        <a href="#" class="" data-toggle="modal" data-target="#upliad">上传项目</a>
                                    </li>
                                </c:if>

                                <li>
                                    <a href="${pageContext.request.contextPath}/item/selectAllMy">查看自我项目</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                    <form class="navbar-form navbar-left" role="search" action="${pageContext.request.contextPath}/item/selectAllByItemName"  method="post">
                        <div class="form-group">
                            <input type="text" class="form-control" name="itemName"/>
                        </div> <button type="submit" class="btn btn-default">搜索</button>
                    </form>
                    <ul class="nav navbar-nav navbar-right">

                        <c:choose>
                            <c:when test="${user!=null}">
                                <li>
                                    <a href="#">欢迎${user.customerTelnum}</a>
                                </li>
                                <li>
                                    <a href="${pageContext.request.contextPath}/customer/exit">退出</a>
                                </li>
                            </c:when>

                            <c:otherwise>
                                <li>
                                    <!-- 按钮触发模态框 -->
                                    <a href="#" class="" data-toggle="modal" data-target="#login">登录</a>
                                </li>
                            </c:otherwise>
                        </c:choose>

                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">用户管理<strong class="caret"></strong></a>
                            <ul class="dropdown-menu">

                                <li>
                                    <a href="#">注册</a>
                                </li>
                                <li>
                                    <a href="#">修改个人信息</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>

            </nav>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <div class="row">

                <c:forEach items="${pageInfo.list}" var="item">
                    <div class="col-md-4">
                        <div class="thumbnail">
                            <%--<img alt="300x200" src="v3/default4.jpg" />--%>
                            <div class="caption">
                                <table class="table table-hover">
                                    <tr>
                                        <th>标题</th>
                                        <td><a href="/${item.itemUrl}" target="_blank">${item.itemName}</a></td>
                                    </tr>
                                    <tr>
                                        <th>状态</th>
                                        <td>
                                            <c:choose>
                                                <c:when test="${item.itemState==1}">可访问</c:when>
                                                <c:when test="${item.itemState==2}">可下载</c:when>
                                                <c:when test="${item.itemState==3}">升级中</c:when>
                                            </c:choose>
                                        </td>
                                    </tr>
                                    <tr>
                                        <th>描述</th>
                                        <td>${item.itemDescribe}</td>
                                    </tr>
                                    <tr>
                                        <th>操作</th>
                                        <td>
                                            <c:if test="${item.itemState==2}">
                                            <a class="btn btn-primary" href="${item.itemGitUrl}" target="_blank">下载</a>
                                            </c:if>

                                        </td>
                                    </tr>
                                </table>
                            </div>
                        </div>
                    </div>


                </c:forEach>



            <div class="row clearfix">
                <div class="col-md-4 column">
                </div>
                <div class="col-md-4 column">
                    <ul class="pagination">
                        <li>
                            <a href="${pageContext.request.contextPath}${servletPath}?pn=1">首页</a>
                        </li>
                        <c:if test="${pageInfo.hasPreviousPage}">
                            <li>
                                <a href="${pageContext.request.contextPath}${servletPath}?pn=${pageInfo.pageNum-1}">上一页</a>
                            </li>
                        </c:if>

                        <c:forEach items="${pageInfo.navigatepageNums}" var="page_Num">
                            <c:if test="${page_Num== pageInfo.pageNum}">
                                <%--高量--%>
                                <li class="active"><a href="${pageContext.request.contextPath}${servletPath}?pn=${page_Num}">${page_Num}</a></li>
                            </c:if>
                            <c:if test="${page_Num != pageInfo.pageNum}">
                                <li><a href="${pageContext.request.contextPath}${servletPath}?pn=${page_Num}">${page_Num}</a></li>
                            </c:if>
                        </c:forEach>


                        <c:if test="${pageInfo.hasNextPage}">
                            <li><a href="${pageContext.request.contextPath}${servletPath}?pn=${pageInfo.pageNum+1}">下一页</a></li>
                        </c:if>
                        <li class="next">
                            <a href="${pageContext.request.contextPath}${servletPath}?pn=${pageInfo.pages}">末  页</a>
                        </li>
                    </ul>
                </div>
                <div class="col-md-4 column">
                </div>
            </div>
        </div>
    </div>
    <div class="row clearfix">
        <div class="col-md-12 column">
            <blockquote>
                <p>
                    Lorem ipsum dolor sit amet, consectetur adipiscing elit. Integer posuere erat a ante.
                </p> <small>Someone famous <cite>Source Title</cite></small>
            </blockquote>
        </div>
    </div>
</div>
</div>
</body>
</html>
