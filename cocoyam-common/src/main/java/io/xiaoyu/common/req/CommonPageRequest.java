/*
 * Copyright [2022] [https://www.xiaonuo.vip]
 *
 * Snowy采用APACHE LICENSE 2.0开源协议，您在使用过程中，需要注意以下几点：
 *
 * 1.请不要删除和修改根目录下的LICENSE文件。
 * 2.请不要删除和修改Snowy源码头部的版权声明。
 * 3.本项目代码可免费商业使用，商业使用请保留源码和相关描述文件的项目出处，作者声明等。
 * 4.分发源码时候，请注明软件出处 https://www.xiaonuo.vip
 * 5.不可二次分发开源参与同类竞品，如有想法可联系团队xiaonuobase@qq.com商议合作。
 * 6.若您的项目无法满足以上几点，需要更多功能代码，获取Snowy商业授权许可，请在官网购买授权，地址为 https://www.xiaonuo.vip
 */
package io.xiaoyu.common.req;

import cn.hutool.core.convert.Convert;
import cn.hutool.core.util.ObjectUtil;
import com.baomidou.mybatisplus.core.metadata.OrderItem;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import io.xiaoyu.common.resp.PageResp;
import io.xiaoyu.common.util.CommonServletUtil;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

/**
 * 通用分页请求
 *
 * @author xiaoyu
 * @date 2021/12/18 14:43
 */
@Slf4j
public class CommonPageRequest {

    private static final String PAGE_SIZE_PARAM_NAME = "perPage";

    private static final String PAGE_PARAM_NAME = "page";

    private static final Integer PAGE_SIZE_MAX_VALUE = 100;

    public static <T> PageResp<T> defaultPage() {
        return defaultPage(null);
    }

    public static <T> PageResp<T> defaultPage(List<OrderItem> orderItemList) {

        int perPage = 20;

        int page = 1;

        //每页条数
        String pageSizeString = CommonServletUtil.getParamFromRequest(PAGE_SIZE_PARAM_NAME);
        if (ObjectUtil.isNotEmpty(pageSizeString)) {
            try {
                perPage = Convert.toInt(pageSizeString);
                if(perPage > PAGE_SIZE_MAX_VALUE) {
                    perPage = PAGE_SIZE_MAX_VALUE;
                }
            } catch (Exception e) {
                log.error(">>> 分页条数转换异常：", e);
                perPage = 20;
            }
        }

        //第几页
        String pageString = CommonServletUtil.getParamFromRequest(PAGE_PARAM_NAME);
        if (ObjectUtil.isNotEmpty(pageString)) {
            try {
                page = Convert.toInt(pageString);
            } catch (Exception e) {
                log.error(">>> 分页页数转换异常：", e);
                page = 1;
            }
        }

        System.err.println("page = " + page);
        System.err.println("perPage = " + perPage);

        PageResp<T> objectPage = new PageResp<>(page, perPage);
        if (ObjectUtil.isNotEmpty(orderItemList)) {
            objectPage.setOrders(orderItemList);
        }
        return objectPage;
    }
}
