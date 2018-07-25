<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script type="text/javascript">
    function del(id) {
        $("#itemId").val(id);
    }

    //删除
    function addshanchu(){
        var id = $("#itemId").val();
        $.ajax({
            url:"${pageContext.request.contextPath}/item/delete",
            data:{itemId:id},
            dataType:"TEXT",
            type:"POST",
            success: function(d){
                if(d.trim()=="OK"){
                    alert("删除成功");
                }else{
                    alert("删除失败");
                }
                window.location.reload(); //刷新当前页面
            }
        });
    }

</script>
<!-- 模态框（Modal） -->
<div class="modal fade" id="itemDelete" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">确定删除吗？</h4>
            </div>
            <br>

            <form class="form-horizontal" role="form" method="post" action="${pageContext.request.contextPath}/item/delete">
                <div class="form-group">
                    <%--<label for="itemId" class="col-sm-2 control-label"></label>--%>
                    <div class="col-sm-5">
                        <input type="hidden" class="form-control" id="itemId" name="itemId" />
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" onclick="addshanchu()" class="btn btn-primary" data-dismiss="modal">确定</button>
                </div>
            </form>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>