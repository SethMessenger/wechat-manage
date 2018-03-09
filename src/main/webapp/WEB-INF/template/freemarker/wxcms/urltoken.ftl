<!DOCTYPE html>
<html>

<head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">


    <title>H+ 后台主题UI框架 - 主页</title>
    <meta name="keywords" content="H+后台主题,后台bootstrap框架,会员中心主题,后台HTML,响应式后台">
    <meta name="description" content="H+是一个完全响应式，基于Bootstrap3最新版本开发的扁平化主题，她采用了主流的左右两栏式布局，使用了Html5+CSS3等现代技术">

    <link rel="shortcut icon" href="favicon.ico">
    <link href="/res/news/css/bootstrap.min.css?v=3.3.5" rel="stylesheet">
    <link href="/res/news/css/font-awesome.min.css?v=4.4.0" rel="stylesheet">

    <!-- Morris -->
    <link href="/res/news/css/plugins/morris/morris-0.4.3.min.css" rel="stylesheet">

    <!-- Gritter -->
    <link href="/res/news/js/plugins/gritter/jquery.gritter.css" rel="stylesheet">

    <link href="/res/news/css/animate.min.css" rel="stylesheet">
    <link href="/res/news/css/style.min.css?v=4.0.0" rel="stylesheet">
    <base target="_blank">

    <script src="/res/news/js/jquery.min.js?v=2.1.4"></script>
    <script src="/res/news/js/bootstrap.min.js?v=3.3.5"></script>
    <script src="/res/news/js/plugins/flot/jquery.flot.js"></script>
    <script src="/res/news/js/plugins/flot/jquery.flot.tooltip.min.js"></script>
    <script src="/res/news/js/plugins/flot/jquery.flot.spline.js"></script>
    <script src="/res/news/js/plugins/flot/jquery.flot.resize.js"></script>
    <script src="/res/news/js/plugins/flot/jquery.flot.pie.js"></script>
    <script src="/res/news/js/plugins/peity/jquery.peity.min.js"></script>
    <script src="/res/news/js/demo/peity-demo.min.js"></script>
    <script src="/res/news/js/content.min.js?v=1.0.0"></script>
    <script src="/res/news/js/plugins/jquery-ui/jquery-ui.min.js"></script>
    <script src="/res/news/js/plugins/gritter/jquery.gritter.min.js"></script>
    <script src="/res/news/js/plugins/easypiechart/jquery.easypiechart.js"></script>
    <script src="/res/news/js/plugins/sparkline/jquery.sparkline.min.js"></script>
    <script src="/res/news/js/demo/sparkline-demo.min.js"></script>
    <script>
        $(document).ready(function () {
//            释放后用于添加个人信箱部分
//            WinMove();
//            setTimeout(function () {
//                $.gritter.add({
//                    title: "您有2条未读信息", text: '请前往<a href="mailbox.html" class="text-warning">收件箱</a>查看今日任务', time: 10000
//                })
//            }, 2000);
//            $(".chart").easyPieChart({barColor: "#f8ac59", scaleLength: 5, lineWidth: 4, size: 80});
//            $(".chart2").easyPieChart({barColor: "#1c84c6", scaleLength: 5, lineWidth: 4, size: 80});
//            var data1 = [[0, 4], [1, 8], [2, 5], [3, 10], [4, 4], [5, 16], [6, 5], [7, 11], [8, 6], [9, 11], [10, 30], [11, 10], [12, 13], [13, 4], [14, 3], [15, 3], [16, 6]];
//            var data2 = [[0, 1], [1, 0], [2, 2], [3, 0], [4, 1], [5, 3], [6, 1], [7, 5], [8, 2], [9, 3], [10, 2], [11, 1], [12, 0], [13, 2], [14, 8], [15, 0], [16, 0]];
//            $("#flot-dashboard-chart").length && $.plot($("#flot-dashboard-chart"), [data1, data2], {
//                series: {
//                    lines: {
//                        show: false,
//                        fill: true
//                    },
//                    splines: {show: true, tension: 0.4, lineWidth: 1, fill: 0.4},
//                    points: {radius: 0, show: true},
//                    shadowSize: 2
//                },
//                grid: {hoverable: true, clickable: true, tickColor: "#d5d5d5", borderWidth: 1, color: "#d5d5d5"},
//                colors: ["#1ab394", "#464f88"],
//                xaxis: {},
//                yaxis: {ticks: 4},
//                tooltip: false
//            })
        });
    </script>
    <!-- 注入腾讯分析服务 http://ta.qq.com/analysis/function -->
    <#--<script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>-->

</head>

<body class="gray-bg">
<div class="wrapper wrapper-content">
    <div class="row">
        <div class="col-sm-12">
            <div class="ibox float-e-margins">
                <div class="ibox-title">
                    <h5>所有表单元素
                        <small>填写 公众号ID，点击 保存 按钮， 系统将自动生成 URL 和 Token 。将它们填写到公众平台 开发者中心 中，公众账号即可升级成为开发者账号</small>
                    </h5>
                    <div class="ibox-tools">
                        <a class="collapse-link">
                            <i class="fa fa-chevron-up"></i>
                        </a>
                        <a class="dropdown-toggle" data-toggle="dropdown" href="form_basic.html#">
                            <i class="fa fa-wrench"></i>
                        </a>
                        <ul class="dropdown-menu dropdown-user">
                            <li><a href="form_basic.html#">选项1</a>
                            </li>
                            <li><a href="form_basic.html#">选项2</a>
                            </li>
                        </ul>
                        <a class="close-link">
                            <i class="fa fa-times"></i>
                        </a>
                    </div>
                </div>
                <div class="ibox-content">
                    <form method="get" class="form-horizontal">
                        <div class="form-group">
                            <label class="col-sm-2 control-label">公众号ID</label>
                            <div class="col-sm-6">
                                <input type="text" placeholder="公众号ID简介" class="form-control">
                            </div>
                            <span class="input-group-btn">
                                <button type="button" class="btn btn-primary">自动生成</button>
                            </span>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">URL</label>
                            <div class="col-sm-6">
                                <input type="text" placeholder="URL简介" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">TOKEN</label>
                            <div class="col-sm-6">
                                <input type="text" placeholder="TOKEN简介" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">APPID</label>
                            <div class="col-sm-6">
                                <input type="text" placeholder="APPID简介" class="form-control">
                            </div>
                        </div>
                        <div class="form-group">
                            <label class="col-sm-2 control-label">APPSecret</label>
                            <div class="col-sm-6">
                                <input type="text" placeholder="APPSecret简介" class="form-control">
                            </div>
                        </div>
                        <div class="hr-line-dashed"></div>

                        <div class="form-group">
                            <label class="col-sm-2 control-label">回复图文消息条数</label>
                            <div class="col-sm-6">
                                <select class="form-control m-b" name="account">
                                    <option>选项 1</option>
                                    <option>选项 2</option>
                                    <option>选项 3</option>
                                    <option>选项 4</option>
                                </select>
                            </div>
                        </div>
                        <div class="hr-line-dashed"></div>
                        <div class="form-group">
                            <div class="col-sm-4 col-sm-offset-2">
                                <button class="btn btn-primary" type="submit">保存内容</button>
                                <button class="btn btn-white" type="submit">取消</button>
                            </div>
                        </div>
                    </form>
                </div>
            </div>
        </div>

    </div>
</div>
</body>

</html>