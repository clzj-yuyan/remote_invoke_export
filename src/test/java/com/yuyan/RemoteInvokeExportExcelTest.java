package com.yuyan;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.alibaba.fastjson.JSON;
import com.yuyan.pojo.FoodCountInfoDO;
import com.yuyan.pojo.ResultVO;
import org.junit.Test;
import org.springframework.http.*;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * 远程调用接口，导出接口获取的数据
 * @author yuyan
 */
public class RemoteInvokeExportExcelTest {


    @Test
    public void invokeExportExcel() {
        // 调用接口
        ResponseEntity<ResultVO> response = invokeUrl();
        // 接口返回参数重新组装
        List<FoodCountInfoDO> dataSource = assembleData(response);
        // 导出excel数据
        exportExcel(dataSource);
    }

    /**
     * 组装参数
     * 远程调用url
     * @return
     */
    private ResponseEntity<ResultVO> invokeUrl() {
        MultiValueMap<String, String> params = new LinkedMultiValueMap<>();
        // 请求入参
        params.add("saleRateType","0");
        RestTemplate client = new RestTemplate();
        HttpHeaders headers = new HttpHeaders();
        List<String> cookie = new ArrayList<>();
        cookie.add("language_type=zh-cn; qimo_xstKeywords_544ae310-b152-11ea-8c12-810e7227392c=; pageViewNum=5");
        //将cookie存入头部
        headers.put(HttpHeaders.COOKIE, cookie);
        // 请求方式
        HttpMethod method = HttpMethod.POST;
        // 以表单的方式提交
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);
        //将请求头部和参数合成一个请求
        HttpEntity<MultiValueMap<String, String>> requestEntity = new HttpEntity<>(params, headers);
        //执行HTTP请求，将返回的结构使用ResultVO类格式化
        ResponseEntity<ResultVO> response = client.exchange("https://www.baidu.com/get/test",
                method,
                requestEntity,
                ResultVO.class);
        return response;
    }

    /**
     * 组装导出数据
     * @param response
     * @return
     */
    private List<FoodCountInfoDO> assembleData(ResponseEntity<ResultVO> response) {
        ResultVO resultVo = response.getBody();
        LinkedHashMap infoMap = (LinkedHashMap) resultVo.getData();
        List<FoodCountInfoDO> dataSource = JSON.parseArray(JSON.toJSONString(infoMap.get("dataSource")), FoodCountInfoDO.class);
        FoodCountInfoDO sum = JSON.parseObject(JSON.toJSONString(infoMap.get("sum")), FoodCountInfoDO.class);
        dataSource.add(sum);
        return dataSource;
    }

    /**
     * 导出excel
     *
     * @param dataSource
     */
    private void exportExcel(List<FoodCountInfoDO> dataSource) {
        // 导出路径
        String fileName = RemoteInvokeExportExcelTest.class.getResource("/").getPath()
                + "店铺销售排行表 20200501--20201130" + System.currentTimeMillis() + ".xlsx";
        ExcelWriter excelWriter = null;
        try {
            excelWriter = EasyExcel.write(fileName, FoodCountInfoDO.class).build();
            WriteSheet writeSheet = EasyExcel.writerSheet("汇总").build();
            excelWriter.write(dataSource, writeSheet);
        } finally {
            if (excelWriter != null) {
                excelWriter.finish();
            }
        }
    }

}
