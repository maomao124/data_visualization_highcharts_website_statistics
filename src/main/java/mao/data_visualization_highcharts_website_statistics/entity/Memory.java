package mao.data_visualization_highcharts_website_statistics.entity;

import lombok.*;
import lombok.experimental.Accessors;

/**
 * Project name(项目名称)：data_visualization_highcharts_website_statistics
 * Package(包名): mao.data_visualization_highcharts_website_statistics.entity
 * Class(类名): Memory
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/6/11
 * Time(创建时间)： 23:04
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
public class Memory
{
    /**
     * 当前已使用的内存，单位为M
     */
    private Double use;

    /**
     * jvm分配到的内存，单位为M
     */
    private Double max;

    /**
     * 当前机器最大内存
     */
    private Double total;
}
