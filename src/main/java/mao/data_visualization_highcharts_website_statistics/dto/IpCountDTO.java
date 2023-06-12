package mao.data_visualization_highcharts_website_statistics.dto;

import lombok.*;
import lombok.experimental.Accessors;
import mao.data_visualization_highcharts_website_statistics.entity.IpCount;
import mao.data_visualization_highcharts_website_statistics.entity.R;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;

/**
 * Project name(项目名称)：data_visualization_highcharts_website_statistics
 * Package(包名): mao.data_visualization_highcharts_website_statistics.dto
 * Class(类名): IpCountDTO
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/6/12
 * Time(创建时间)： 19:44
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
public class IpCountDTO
{
    /**
     * 日期
     */
    private LocalDateTime date;

    /**
     * 数据
     */
    private List<IpCount> data;
}
