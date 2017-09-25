<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<html>
<head>
    <script src="js/jquery-1.8.3.min.js"></script>
    <script>
        function rest1(){
            $.ajax({
                type: 'POST',
                url: 'http://localhost:8080/rest/users',
                dataType: "json",
                contentType: "application/json",
                data: "{\"userId\":\"004\", \"userName\":\"Susan\", \"age\":\"33\"}",
                cache : false,
                error:function(){
                    alert('系统连接失败，请稍后再试！')
                },
                success: function(obj){
                    alert(obj.userName);
                }
            });
        }
    </script>

    <script>
        function rest2(){
            $.ajax({
                type: 'POST',
                url: 'http://localhost:8080/rest/users/user',
                dataType: "json",
                contentType: "application/x-www-form-urlencoded",
                data:  {
                    "user": "{\"userId\":\"004\", \"userName\":\"Susan\", \"age\":\"33\"}"
                },
                cache : false,
                error:function(){
                    alert('系统连接失败，请稍后再试！')
                },
                success: function(obj){
                    alert(obj.userName);
                }
            });
        }
    </script>

    <script>
        function rest3(){
            $.ajax({
                type: 'POST',
                url: 'http://localhost:8080/rest/users/delete/001',
                dataType: "json",
                contentType: "application/json",
                //  data: "{\"userId\":\"004\", \"userName\":\"Susan\", \"age\":\"33\"}",
                cache : false,
                error:function(){
                    alert('系统连接失败，请稍后再试！')
                },
                success: function(obj){
                    alert(obj.userName);
                }
            });
        }
    </script>

    <script>
        function getAllUsers() {
            $.ajax({
                type: 'GET',
                url: 'http://localhost:8080/rest/users',
                dataType: "json",
//                contentType: "application/x-www-form-urlencoded",
//                data:  {
//                    "user": "{\"userId\":\"004\", \"userName\":\"Susan\", \"age\":\"33\"}"
//                },
                cache : false,
                error:function(){
                    alert('系统连接失败，请稍后再试！')
                },
                success: function(obj){
                    console.log(obj);
//                    alert(obj.userName);
                }
            });
        }

    </script>

</head>

<body>
    <input type="button" onclick="rest1();"  value="sss">
    <input type="button" onclick="rest2();" value="aaa">
    <input type="button" onclick="rest3();" value="ddd">
    <input type="button" onclick="getAllUsers();" value="getAllUsers">
</body>

</html>


