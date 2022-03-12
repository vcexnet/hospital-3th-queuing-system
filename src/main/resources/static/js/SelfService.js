window.onload = $(function () {

    const windowNo = $(".windowNo").text();
    const clinicAreaNo = $(".clinicAreaNo").text();
    let windowNum = undefined;
    getTheClinicName();

    getPatientList();

    setInterval(function () {
        getPatientList();
    },3000);





    // 异步获取医院标题信息函数
    function getTheClinicName() {

        $.ajax({
            type:"get",
            url:"/getSelfServiceWindow",
            async:false,
            data: {
                "windowNo":windowNo,
            },
            success: function (data) {
                console.log(data);
                windowNum = data.windowNo;
                $("#windowNO").text(windowNum);
                $("#windowName").text(data.windowName);
            }
        });
    }

    //异步获取队列中不同状态德患者信息
    function getPatientList() {
        //候诊获取
        $.ajax({
            type: "get",
            url: "/getPatientList",
            async:false,
            data: {
                //clinicAreaNo 诊区号   windowNo  窗口号
                "windowNo": windowNo,
                "clinicAreaNo" : clinicAreaNo,
                // 0 是真正办理  = 2 等待
                'type': '0'
            },
            success: function (data) {
                console.log(data);
                if (data.length===0){
                    $("#NowTransact").html("");
                }else {
                    // $(".windowNO").text(windowNum);
                    // $("#NowTransact .patientNo").text(data[0].codeText+data[0].patientNo);
                    $("#NowTransact").html("请<span class=\"patientNo\"  style=\"color: #271376;\">"+data[0].codeText+data[0].patientNo+
                        "</span>到<span CLASS=\"windowNO\" >"+windowNum+"</span>窗口办理");
                }

            }
        });
        //待诊获取
        $.ajax({
            type: "get",
            url: "/getPatientList",
            async:false,
            data: {
                //clinicAreaNo 诊区号   windowNo  窗口号
                "clinicAreaNo" : clinicAreaNo,
                "windowNo": windowNo,
                'type': '2'
            },
            success: function (data) {
                if (data.length === 0) {
                    console.log("排队信息未找到");
                    $("#firstWaitTransact").html("");
                    $("#secondWaitTransact").html("");
                }else {
                    if (data.length ===1){
                        // $("#firstWaitTransact span").text(data[0].codeText+data[0].patientNo);
                        $("#firstWaitTransact").html("请<span  style=\"color: #271376;\">"+data[0].codeText+data[0].patientNo+"</span>等待");
                        $("#secondWaitTransact").html("");
                    }else {
                        $("#firstWaitTransact").html("请<span  style=\"color: #271376;\">"+data[0].codeText+data[0].patientNo+"</span>等待");
                        $("#secondWaitTransact").html("请<span  style=\"color: #271376;\">"+data[1].codeText+data[1].patientNo+"</span>等待");
                        // $("#secondWaitTransact span").text(data[1].codeText+data[1].patientNo);
                    }
                }
                console.log(data);
            }
        });
    }
})
