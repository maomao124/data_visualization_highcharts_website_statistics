package mao.data_visualization_highcharts_website_statistics.controller;

import lombok.extern.slf4j.Slf4j;
import mao.data_visualization_highcharts_website_statistics.entity.Memory;
import mao.data_visualization_highcharts_website_statistics.entity.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project name(项目名称)：data_visualization_highcharts_website_statistics
 * Package(包名): mao.data_visualization_highcharts_website_statistics.controller
 * Class(类名): StatisticsController
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/6/11
 * Time(创建时间)： 21:45
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Slf4j
@RestController
@RequestMapping("/statistics")
public class StatisticsController
{
    public static int getIntRandom(int min, int max)
    {
        if (min > max)
        {
            min = max;
        }
        return min + (int) (Math.random() * (max - min + 1));
    }

    /**
     * 得到Double随机数
     *
     * @param min 最小值
     * @param max 最大值
     * @return double
     */
    public static double getDoubleRandom(double min, double max)
    {
        if (min > max)
        {
            min = max;
        }
        return min + (Math.random() * (max - min));
    }

    /**
     * 得到当前QPS
     *
     * @return {@link R}<{@link Integer}>
     */
    @GetMapping("/qps")
    public R<Integer> qps()
    {
        int intRandom = getIntRandom(5000, 20000);
        log.info("qps:" + intRandom);
        return R.success(intRandom);
    }

    @GetMapping("/cpu")
    public R<Double> cpu()
    {
        Double format = Double.parseDouble(String.format("%.2f", getDoubleRandom(0, 100)));
        log.info("cou使用率：" + format);
        return R.success(format);
    }

    @GetMapping("/memory")
    public R<Memory> memory()
    {
        Memory memory = new Memory()
                .setUse(Double.parseDouble(String.format("%.2f", getDoubleRandom(300, 1300))))
                .setMax(Double.parseDouble(String.format("%.2f", getDoubleRandom(1800, 2500))))
                .setTotal(16000.0);
        log.info("内存使用：" + memory);
        return R.success(memory);
    }


}
