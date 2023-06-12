package mao.data_visualization_highcharts_website_statistics.entity;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * Project name(项目名称)：data_visualization_highcharts_website_statistics
 * Package(包名): mao.data_visualization_highcharts_website_statistics.entity
 * Class(类名): IpCount
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/6/12
 * Time(创建时间)： 19:51
 * Version(版本): 1.0
 * Description(描述)： 无
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
@EqualsAndHashCode
@Accessors(chain = true)
public class IpCount
{
    /**
     * 区域
     */
    private String area;

    /**
     * 统计
     */
    private int count;
}
