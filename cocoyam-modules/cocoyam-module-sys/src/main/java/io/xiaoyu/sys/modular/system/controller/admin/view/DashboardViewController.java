package io.xiaoyu.sys.modular.system.controller.admin.view;

//视图层控制器

import io.xiaoyu.common.resp.CommonAdminResp;
import io.xiaoyu.common.yaims.AmisFactory;
import io.xiaoyu.common.yaims.Card;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

@RestController
public class DashboardViewController {

    @Value("${website.logo}")
    private String logo;

    @Value("${website.app_name}")
    private String app_name;

    @GetMapping("/admin-api/dashboard")
    public CommonAdminResp<Map<Object,Object>> getDashboard() {

        AmisFactory.Html().html("111").render();

        Map<Object,Object> page = AmisFactory.BasePage().css(this.css()).body(
            new Object[]{
                AmisFactory.Grid().columns(new Object[]{
                        this.frameworkInfo(),
                        AmisFactory.Flex().items(new Object[]{
                                this.pieChart(),
                                this.cube(),
                        }).render()
                }).render(),
            }
        ).render();

        return CommonAdminResp.ok("获取成功", page);

    }

    private  Map<String, Map<String, String>> css() {
        Map<String, Map<String, String>> cssMap = new HashMap<>();

        Map<String, String> clearCardMB = new HashMap<>();
        clearCardMB.put("margin-bottom", "0 !important");
        cssMap.put(".clear-card-mb", clearCardMB);

        Map<String, String> cxdImage = new HashMap<>();
        cxdImage.put("border", "0");
        cssMap.put(".cxd-Image", cxdImage);

        Map<String, String> bgBlingbling = new HashMap<>();
        bgBlingbling.put("color", "#fff");
        bgBlingbling.put("background", "linear-gradient(to bottom right, #2C3E50, #FD746C, #FF8235, #ffff1c, #92FE9D, #00C9FF, #a044ff, #e73827)");
        bgBlingbling.put("background-repeat", "no-repeat");
        bgBlingbling.put("background-size", "1000% 1000%");
        bgBlingbling.put("animation", "gradient 60s ease infinite");
        cssMap.put(".bg-blingbling", bgBlingbling);

        Map<String, String> keyframesGradient = new HashMap<>();
        keyframesGradient.put("0%", "background-position:0% 0%");
        keyframesGradient.put("50%", "background-position:100% 100%");
        keyframesGradient.put("100%", "background-position:0% 0%");
        cssMap.put("@keyframes gradient", keyframesGradient);

        Map<String, String> bgBlingblingCardTitle = new HashMap<>();
        bgBlingblingCardTitle.put("color", "#fff");
        cssMap.put(".bg-blingbling .cxd-Card-title", bgBlingblingCardTitle);

        return cssMap;
    }


    public Map<Object, Object> frameworkInfo() {
        return AmisFactory.Card().className("h-96").body(
                AmisFactory.Wrapper().className("h-full").body(
                  AmisFactory.Flex().className("h-full").direction("column").justify("center").alignItems("center").items(
                    Arrays.asList(
                      AmisFactory.Image().src(this.logo).render(),
                      AmisFactory.Wrapper().className("text-3xl mt-9").body(this.app_name).render(),
                      AmisFactory.Flex().className("w-64 mt-5").justify("space-around").items(
                         Arrays.asList(
                           AmisFactory.Action()
                            .level("link")
                            .label("GitHub")
                            .blank(true)
                            .actionType("url")
                            .blank(true)
                            .link("https://github.com/slowlyo/owl-admin").render(),
                           AmisFactory.Action()
                            .level("link")
                            .label("OwlAdmin 文档")
                            .blank(true)
                            .actionType("url")
                            .link("http://admin-demo.slowlyo.top/doc").render(),
                           AmisFactory.Action()
                            .level("link")
                            .label("Amis 文档")
                            .blank(true)
                            .actionType("url")
                            .link("https://aisuda.bce.baidu.com/amis/zh-CN/docs/index").render()
                           )
                        ).render()
                    )
                ).render()
            ).render()
        ).set("md",5).render();
    }

    public Map<Object,Object> pieChart() {
        String config = "{\n" +
                "  tooltip: { trigger: 'item' },\n" +
                "  legend: { bottom: 0, left: 'center' },\n" +
                "  series: [\n" +
                "    {\n" +
                "      name: 'Access From',\n" +
                "      type: 'pie',\n" +
                "      radius: ['40%', '70%'],\n" +
                "      avoidLabelOverlap: false,\n" +
                "      itemStyle: { borderRadius: 10, borderColor: '#fff', borderWidth: 2 },\n" +
                "      label: { show: false, position: 'center' },\n" +
                "      emphasis: {\n" +
                "        label: { show: true, fontSize: '40', fontWeight: 'bold' }\n" +
                "      },\n" +
                "      labelLine: { show: false },\n" +
                "      data: [\n" +
                "        { value: 1048, name: 'Search Engine' },\n" +
                "        { value: 735, name: 'Direct' },\n" +
                "        { value: 580, name: 'Email' },\n" +
                "        { value: 484, name: 'Union Ads' },\n" +
                "        { value: 300, name: 'Video Ads' }\n" +
                "      ]\n" +
                "    }\n" +
                "  ]\n" +
                "}";

        return  AmisFactory.Card().className("h-96").body(
                AmisFactory.Chart().height(350).config(config).render()
        ).render();
    }


    public Card lineChart() {
        Random random = new Random();

        StringBuilder randomArr = new StringBuilder();
        for (int i = 0; i < 7; i++) {
            if (i > 0) {
                randomArr.append(",");
            }
            randomArr.append(random.nextInt(191) + 10);
        }

        String chartConfig = "{\n" +
                "  title:{ text: '会员增长情况' },\n" +
                "  tooltip: { trigger: 'axis' },\n" +
                "  xAxis: { type: 'category', boundaryGap: false, data: ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun'] },\n" +
                "  yAxis: { type: 'value' },\n" +
                "  grid: { left: '7%', right:'3%', top: 60, bottom: 30 },\n" +
                "  legend: { data: ['访问量','注册量'] },\n" +
                "  series: [\n" +
                "    { name: '访问量', data: [" + randomArr.toString() + "], type: 'line', areaStyle: {}, smooth: true, symbol: 'none' },\n" +
                "    { name:'注册量', data: [" + randomArr.toString() + "], type: 'line', areaStyle: {}, smooth: true, symbol: 'none' }\n" +
                "  ]\n" +
                "}";

        return  AmisFactory.Card().className("clear-card-mb").body(
                AmisFactory.Chart().height(380).className("h-96").config(chartConfig)
        );
    }

    public  Map<Object,Object> cube() {
        String html  = "<style>" +
                ".cube-box{ height: 300px; display: flex; align-items: center; justify-content: center; }" +
                ".cube { width: 100px; height: 100px; position: relative; transform-style: preserve-3d; animation: rotate 10s linear infinite; }" +
                ".cube:after {" +
                "content: '';" +
                "width: 100%;" +
                "height: 100%;" +
                "box-shadow: 0 0 50px rgba(0, 0, 0, 0.2);" +
                "position: absolute;" +
                "transform-origin: bottom;" +
                "transform-style: preserve-3d;" +
                "transform: rotateX(90deg) translateY(50px) translateZ(-50px);" +
                "background-color: rgba(0, 0, 0, 0.1);" +
                "}" +
                ".cube div {" +
                "background-color: rgba(64, 158, 255, 0.7);" +
                "position: absolute;" +
                "width: 100%;" +
                "height: 100%;" +
                "border: 1px solid rgb(27, 99, 170);" +
                "box-shadow: 0 0 60px rgba(64, 158, 255, 0.7);" +
                "}" +
                ".cube div:nth-child(1) { transform: translateZ(-50px); animation: shade 10s -5s linear infinite; }" +
                ".cube div:nth-child(2) { transform: translateZ(50px) rotateY(180deg); animation: shade 10s linear infinite; }" +
                ".cube div:nth-child(3) { transform-origin: right; transform: translateZ(50px) rotateY(270deg); animation: shade 10s -2.5s linear infinite; }" +
                ".cube div:nth-child(4) { transform-origin: left; transform: translateZ(50px) rotateY(90deg); animation: shade 10s -7.5s linear infinite; }" +
                ".cube div:nth-child(5) { transform-origin: bottom; transform: translateZ(50px) rotateX(90deg); background-color: rgba(0, 0, 0, 0.7); }" +
                ".cube div:nth-child(6) { transform-origin: top; transform: translateZ(50px) rotateX(270deg); }" +
                "@keyframes rotate {" +
                "0% { transform: rotateX(-15deg) rotateY(0deg); }" +
                "100% { transform: rotateX(-15deg) rotateY(360deg); }" +
                "}" +
                "@keyframes shade { 50% { background-color: rgba(0, 0, 0, 0.7); } }" +
                "</style><div class='cube-box'><div class='cube'>" +
                "<div></div><div></div><div></div><div></div><div></div><div></div>" +
                "</div></div>";
         AmisFactory.Card().className("h-96 ml-4 w-8/12").body(
            new Object[]{

            }
        ).render();

        return null;

    }


}

