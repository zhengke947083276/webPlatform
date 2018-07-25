<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- 模态框（Modal） -->

<!-- 执行上传文件操作的函数 -->
<script type="text/javascript">
    function ajaxFileUpload(){
        var name = $("#itemNameI").val();
        var gitUrl = $("#itemGitUrlI").val();
        var describe = $("#itemDescribeI").val();
        var state=$('#itemStateI input:radio[name="itemState"]:checked').val();

        $.ajaxFileUpload({
                url:'${pageContext.request.contextPath}/item/addUpload',            //需要链接到服务器地址
                secureuri:false,
                data:{itemName:name,itemGitUrl:gitUrl,itemDescribe:describe,itemState:state},
                fileElementId:'fileI',                        //文件选择框的id属性
                dataType: 'text',                                     //服务器返回的格式，可以是json
                success: function (d) {//相当于java中try语句块的用法
                    if(d.trim()=="OK"){
                        alert("上传成功");
                    }else{
                        alert("上传失败");
                    }
                    window.location.reload(); //刷新当前页面
                },
            });
    }
</script>


<div class="modal fade" id="upliad" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
                <h4 class="modal-title" id="myModalLabel">上传项目</h4>
            </div>
            <br>
            <form class="form-horizontal" role="form" action="" method="post" enctype="multipart/form-data">
                <div class="form-group">
                    <label for="itemNameI" class="col-sm-2 control-label">项目名</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" id="itemNameI" name="itemName"/>
                    </div>
                </div>

                <div class="form-group">
                    <label for="fileI" class="col-sm-2 control-label">上传文件</label>
                    <div class="col-sm-5">
                        <input type="file" class="form-control" id="fileI" name="file" />
                    </div>
                </div>

                <div class="form-group">
                    <label  class="col-sm-2 control-label">状态</label>
                    <div class="col-sm-5" id="itemStateI">
                        <label class="radio-inline">
                            <input type="radio"  name="itemState" id="itemStateI1" value="1" checked> 可访问
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="itemState" id="itemStateI2"  value="2"> 可下载
                        </label>
                        <label class="radio-inline">
                            <input type="radio" name="itemState" id="itemStateI3"  value="3"> 升级中
                        </label>
                    </div>
                </div>

                <div class="form-group">
                    <label for="itemGitUrlI" class="col-sm-2 control-label">下载地址</label>
                    <div class="col-sm-5">
                        <input type="text" class="form-control" id="itemGitUrlI" name="itemGitUrl" />
                    </div>
                </div>
                <div class="form-group">

                    <label for="itemDescribeI" class="col-sm-2 control-label">描述</label>
                    <div class="col-sm-5">
                        <textarea class="form-control" rows="3" name="itemDescribe" id="itemDescribeI"></textarea>
                </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default" data-dismiss="modal">关闭</button>
                    <button type="button" class="btn btn-primary" data-dismiss="modal" onclick="ajaxFileUpload()">上传</button>
                </div>
            </form>
        </div><!-- /.modal-content -->
    </div><!-- /.modal -->
</div>
