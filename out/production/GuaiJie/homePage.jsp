<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">

  <head>
    <meta charset="UTF-8">
    <meta name="renderer" content="webkit">
    <meta name="force-rendering" content="webkit" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <link rel="stylesheet" type="text/css" href="./css/reset.css">
    <!-- <link rel="stylesheet" type="text/css" href="./plugin/owl-carousel/owl.carousel.min.css" /> -->
    <link rel="stylesheet" type="text/css" href="./plugin/layui/css/layui.css" />
    <title>首页</title>
    <style type="text/css">
      html,body{
        min-width:1140px;
        background-color:white
      }
      .header{
        box-sizing:border-box;
        width:1140px;
        background-color:#f5f5f5;
        padding:20px 100px;
        margin:0 auto 30px;
      }
      .title{
        margin-bottom:20px;
        color:black;
        font-size:26px;
        font-weight:bold;
      }
      .description>p{
        text-indent:2em;
        font-size:15px;
        line-height:1.5em;
        color:black;
      }
      .main{
        width:1140px;
        margin:0 auto;
      }
      .nav{
        width:1140px;
        margin:20px auto 20px;
        text-align:right
      }
      .nav-item{
        text-decoration:underline;
      }
      .main-title{
        padding-bottom:20px;
        margin-bottom:20px;
        border-bottom:solid 1px #dcdcdc;
      }
      .main-title>span{
        color:black;
        font-size:;
      }
      .layui-form{
        padding-left:100px;
      }
      .layui-form-item .layui-input-inline{
        width:500px;
      }

      .option{
        float:right;
      }
      .option>span{
        display:none;
        font-size:14px;
        color:black;
        cursor:pointer;
      }
      .option>span.show{
        display:inline;
      }
      .option>span:hover{
        color:#878787;
      }
      .option>span:active{
        color:black;
      }
    </style>
  </head>
  <body>
    <div class="nav">
      <a href="javascript:void(0)" class="nav-item">返回留言板</a>
    </div>
    
    <div class="header">
      <h1 class="title">Hello<span>admin</span></h1>
      <div class="description">
        信息都在这里了^_^
      </div>
    </div>

    <div class="main">
      <div class="main-title clearfix">
        <span>个人信息</span>
        <div class="option">
          <span class="show">编辑</span>
          <span>保存</span>
        </div>
      </div>
      <form class="layui-form">
        <div class="layui-form-item layui-form-text">
          <label class="layui-form-label">用户名</label>
          <div class="layui-input-inline">
            <input name="username" placeholder="请输入用户名" class="layui-input" />
          </div>
        </div>
        <div class="layui-form-item layui-form-text">
          <label class="layui-form-label">姓名</label>
          <div class="layui-input-inline">
            <input name="name" placeholder="未填写" class="layui-input" />
          </div>
        </div>
        <div class="layui-form-item layui-form-text">
          <label class="layui-form-label">生日</label>
          <div class="layui-input-inline">
            <input name="birthday" placeholder="未填写" class="layui-input" />
          </div>
        </div>
        <div class="layui-form-item layui-form-text">
          <label class="layui-form-label">电话</label>
          <div class="layui-input-inline">
            <input name="phone" placeholder="未填写" class="layui-input" />
          </div>
        </div>
        <div class="layui-form-item layui-form-text">
          <label class="layui-form-label">地址</label>
          <div class="layui-input-inline">
            <input name="address" placeholder="未填写" class="layui-input" />
          </div>
        </div>
      </form>
    </div>
  </body>
  <script src="./plugin/jquery-3.2.1.min.js"></script>
  <script src="./plugin/jquery.cookie.js"></script>
  <script src="./plugin/layui/layui.js" type="text/javascript" charset="utf-8"></script>
  <!-- <script src="./plugin/owl-carousel/owl.carousel.min.js" type="text/javascript" charset="utf-8"></script> -->
  <script type="text/javascript">
    layui.use(['element','form', 'layer'], function() {

      var element = layui.element,
        form = layui.form,
        layer = layui.layer;
      
      

    });
  </script>

</html>