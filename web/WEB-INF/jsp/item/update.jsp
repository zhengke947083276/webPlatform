
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<script type="text/javascript">
    function update(id,itemName,itemGitUrl,itemDescribe,itemState) {
        $("#itemIdU").val(id);
        $("#itemNameU").val(itemName);
        $("#itemGitUrlU").val(itemGitUrl);
        $("#itemDescribeU").val(itemDescribe);
        // alert(itemState);
        if (itemState==1) {
            $("#itemStateU1").attr("checked",true);
        }
        if (itemState==2) {
            $("#itemStateU2").attr("checked",true);
        }
        if (itemState==3) {
            $("#itemStateU3").attr("checked",true);
        }
    }


    //修改
    function addxiugai(){
        var id = $("#itemIdU").val();
        var name = $("#itemNameU").val();
        var gitUrl = $("#itemGitUrlU").val();
        var describe = $("#itemDescribeU").val();
        var state=$('#itemStateU input:radio[name="itemState"]:checked').val();
        // alert(state);
        $.ajax({
            url:"${pageContext.request.contextPath}/item/update",
            data:{itemId:id,itemName:name,itemGitUrl:gitUrl,itemDescribe:describe,itemState:state},
            dataType:"json",
            type:"POST",
        }).done(function (data) {
                if(data.success){
                    $('#itemUpdate').modal('hide');
                    // swal({
                    //     title: data.msg,
                    //     icon: "success",
                    //     button: "确定"
                    //
                    // });

                    alert(data.msg);
                    window.location.reload(); //刷新当前页面

                }else {
                    // swal({
                    //     title: data.msg,
                    //     icon: "error",
                    //     button: "确定"
                    // });
                    alert(data.msg);
                }

        });
        return false;
    }

</script>

<!-- 模态框（Modal） -->
<div class="modal fade" id="itemUpdate" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">修改</h4>
            </div>
            <br>
            <form class="form-horizontal" role="form" method="post" action="">

                <div class="form-group">
                    <%--<label for="itemId" class="col-sm-2 control-label"></label>--%>
                    <div class="col-sm-5">
                        <input type="hidden" class="form-control" id="itemIdU" name="itemId" />
                    </div>
                </div>
                <div class="form-group">
                    <label for="itemNameU" class="col-sm-2 control-label">项目名</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" id="itemNameU" name="itemName" />
                    </div>
                </div>

                <div class="form-group">
                    <label for="itemGitUrlU" class="col-sm-2 control-label">下载地址</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" id="itemGitUrlU" name="itemGitUrl"/>
                    </div>
                </div>

                <div class="form-group">

                    <label for="itemDescribeU" class="col-sm-2 control-label">描述</label>
                    <div class="col-sm-5">
                        <textarea class="form-control" rows="3" name="itemDescribe" id="itemDescribeU"></textarea>
                    </div>
                </div>

                <div class="form-group">
                    <label  class="col-sm-2 control-label">状态</label>
                    <div class="col-sm-5" id="itemStateU">
                        <label class="radio-inline">
                            <input type="radio"  name="itemState" id="itemStateU1" value="1"> 可访问
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="itemState" id="itemStateU2"  value="2"> 可下载
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="itemState" id="itemStateU3"  value="3"> 升级中
                        </label>
                    </div>
                </div>



                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" onclick="addxiugai()"  class="btn btn-primary" >修改</button>
                </div>
            </form>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>