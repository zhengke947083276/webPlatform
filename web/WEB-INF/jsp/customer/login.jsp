<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 模态框（Modal） -->
<div class="modal fade" id="login" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">登录</h4>
            </div>
            <br>
            <form class="form-horizontal" role="form" method="post" action="${pageContext.request.contextPath}/customer/login">
                <div class="form-group">
                    <label for="tel1" class="col-sm-2 control-label">账号</label>
                    <div class="col-sm-5">
                        <input type="tel" class="form-control" id="tel1" name="customerTelnum" />
                    </div>
                </div>
                <div class="form-group">
                    <label for="inputPassword" class="col-sm-2 control-label">密码</label>
                    <div class="col-sm-5">
                        <input type="password" class="form-control" id="inputPassword" name="customerPassword"/>
                    </div>
                </div>

                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-5">
                        <div class="checkbox">
                            <label>
                                <input type="checkbox">请记住我
                            </label>
                        </div>
                    </div>
                </div>

                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="submit" class="btn btn-primary">登录</button>
                </div>
            </form>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>