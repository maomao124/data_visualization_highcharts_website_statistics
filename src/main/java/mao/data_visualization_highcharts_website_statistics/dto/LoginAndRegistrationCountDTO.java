package mao.data_visualization_highcharts_website_statistics.dto;

import lombok.*;
import lombok.experimental.Accessors;
import mao.data_visualization_highcharts_website_statistics.entity.LoginAndRegistrationCount;

import java.util.List;

/**
 * Project name(项目名称)：data_visualization_highcharts_website_statistics
 * Package(包名): mao.data_visualization_highcharts_website_statistics.dto
 * Class(类名): LoginAndRegistrationCountDTO
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/6/12
 * Time(创建时间)： 15:09
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
public class LoginAndRegistrationCountDTO
{
    /**
     * 登录相关的数据
     */
    private List<LoginAndRegistrationCount> login;

    /**
     * 注册相关的数据
     */
    private List<LoginAndRegistrationCount> registration;
}
