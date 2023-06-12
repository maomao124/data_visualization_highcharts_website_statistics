package mao.data_visualization_highcharts_website_statistics.config;

import lombok.extern.slf4j.Slf4j;
import mao.data_visualization_highcharts_website_statistics.entity.R;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * Project name(项目名称)：data_visualization_highcharts_website_statistics
 * Package(包名): mao.data_visualization_highcharts_website_statistics.config
 * Class(类名): ExceptionHandler
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/6/12
 * Time(创建时间)： 19:10
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Slf4j
@Configuration
@RestControllerAdvice
public class ExceptionHandler
{
    @org.springframework.web.bind.annotation.ExceptionHandler(Exception.class)
    public R<Object> exception(Exception e)
    {
        log.error("错误：", e);
        return R.fail("系统繁忙，请稍后再试");
    }
}
