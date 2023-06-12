package mao.data_visualization_highcharts_website_statistics.controller;

import lombok.extern.slf4j.Slf4j;
import mao.data_visualization_highcharts_website_statistics.dto.IpCountDTO;
import mao.data_visualization_highcharts_website_statistics.dto.LoginAndRegistrationCountDTO;
import mao.data_visualization_highcharts_website_statistics.entity.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

    /**
     * CPU使用率统计
     *
     * @return {@link R}<{@link Double}>
     */
    @GetMapping("/cpu")
    public R<Double> cpu()
    {
        Double format = Double.parseDouble(String.format("%.2f", getDoubleRandom(0, 100)));
        log.info("cou使用率：" + format);
        return R.success(format);
    }

    /**
     * 内存统计
     *
     * @return {@link R}<{@link Memory}>
     */
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

    /**
     * pv统计
     *
     * @return {@link R}<{@link List}<{@link PVCount}>>
     */
    @GetMapping("/pv")
    public R<List<PVCount>> pv()
    {
        List<PVCount> list = new ArrayList<>(30);
        LocalDate now = LocalDate.now();
        for (int i = 29; i > 0; i--)
        {
            LocalDate localDate = now.minusDays(i);
            String date = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            PVCount pvCount = new PVCount()
                    .setDate(date)
                    .setCount(getIntRandom(300000, 1500000));
            list.add(pvCount);
        }
        String date = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        PVCount pvCount = new PVCount()
                .setDate(date)
                .setCount(getIntRandom(300000, 1500000));
        list.add(pvCount);

        log.info("pv统计：" + list);
        return R.success(list);
    }

    /**
     * uv统计
     *
     * @return {@link R}<{@link List}<{@link UVCount}>>
     */
    @GetMapping("/uv")
    public R<List<UVCount>> uv()
    {
        List<UVCount> list = new ArrayList<>(30);
        LocalDate now = LocalDate.now();
        for (int i = 29; i > 0; i--)
        {
            LocalDate localDate = now.minusDays(i);
            String date = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            UVCount uvCount = new UVCount()
                    .setDate(date)
                    .setCount(getIntRandom(80000, 500000));
            list.add(uvCount);
        }
        String date = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        UVCount uvCount = new UVCount()
                .setDate(date)
                .setCount(getIntRandom(80000, 500000));
        list.add(uvCount);

        log.info("uv统计：" + list);
        return R.success(list);
    }


    /**
     * 登录和注册统计
     *
     * @return {@link R}<{@link LoginAndRegistrationCountDTO}>
     */
    @GetMapping("/loginAndRegistration")
    public R<LoginAndRegistrationCountDTO> loginAndRegistration()
    {
        LoginAndRegistrationCountDTO loginAndRegistrationCountDTO = new LoginAndRegistrationCountDTO();
        {
            List<LoginAndRegistrationCount> list = new ArrayList<>(7);
            LocalDate now = LocalDate.now();
            for (int i = 6; i > 0; i--)
            {
                LocalDate localDate = now.minusDays(i);
                String date = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                LoginAndRegistrationCount loginAndRegistrationCount = new LoginAndRegistrationCount()
                        .setDate(date)
                        .setCount(getIntRandom(80000, 400000));
                list.add(loginAndRegistrationCount);
            }
            String date = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            LoginAndRegistrationCount loginAndRegistrationCount = new LoginAndRegistrationCount()
                    .setDate(date)
                    .setCount(getIntRandom(80000, 400000));
            list.add(loginAndRegistrationCount);

            log.info("登录统计：" + list);
            loginAndRegistrationCountDTO.setLogin(list);
        }
        {
            List<LoginAndRegistrationCount> list = new ArrayList<>(7);
            LocalDate now = LocalDate.now();
            for (int i = 6; i > 0; i--)
            {
                LocalDate localDate = now.minusDays(i);
                String date = localDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
                LoginAndRegistrationCount loginAndRegistrationCount = new LoginAndRegistrationCount()
                        .setDate(date)
                        .setCount(getIntRandom(10000, 70000));
                list.add(loginAndRegistrationCount);
            }
            String date = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            LoginAndRegistrationCount loginAndRegistrationCount = new LoginAndRegistrationCount()
                    .setDate(date)
                    .setCount(getIntRandom(10000, 70000));
            list.add(loginAndRegistrationCount);

            log.info("登录统计：" + list);
            loginAndRegistrationCountDTO.setRegistration(list);
        }

        return R.success(loginAndRegistrationCountDTO);
    }

    /**
     * ip访问统计
     *
     * @return {@link R}<{@link Map}<{@link String}, {@link Integer}>>
     */
    @GetMapping("/ipCount")
    public R<IpCountDTO> ipCount()
    {
        List<IpCount> list = new ArrayList<>();
        list.add(new IpCount("北京", getIntRandom(1000, 100000)));
        list.add(new IpCount("浙江", getIntRandom(1000, 100000)));
        list.add(new IpCount("广东", getIntRandom(1000, 100000)));
        list.add(new IpCount("湖南", getIntRandom(1000, 100000)));
        list.add(new IpCount("广西", getIntRandom(1000, 100000)));
        list.add(new IpCount("海南", getIntRandom(1000, 100000)));
        list.add(new IpCount("福建", getIntRandom(1000, 100000)));
        list.add(new IpCount("山东", getIntRandom(1000, 100000)));
        list.add(new IpCount("山西", getIntRandom(1000, 100000)));
        list.add(new IpCount("四川", getIntRandom(1000, 100000)));
        list.add(new IpCount("内蒙古", getIntRandom(1000, 100000)));
        list.add(new IpCount("新疆", getIntRandom(1000, 100000)));
        list.add(new IpCount("西藏", getIntRandom(1000, 100000)));
        list.add(new IpCount("湖北", getIntRandom(1000, 100000)));
        list.add(new IpCount("河南", getIntRandom(1000, 100000)));
        list.add(new IpCount("河北", getIntRandom(1000, 100000)));
        list.add(new IpCount("未知地区", getIntRandom(1000, 100000)));
        log.info("地区统计：" + list);
        return R.success(new IpCountDTO().setDate(LocalDateTime.now()).setData(list));
    }
}
