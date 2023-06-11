package mao.data_visualization_highcharts_website_statistics.entity;

import lombok.*;
import lombok.experimental.Accessors;

import java.util.Date;
import java.util.Map;

/**
 * Project name(项目名称)：data_visualization_highcharts_website_statistics
 * Package(包名): mao.data_visualization_highcharts_website_statistics.entity
 * Class(类名): R
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2023/6/11
 * Time(创建时间)： 21:35
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
public class R<T>
{
    /**
     * 状态
     */
    private boolean status;

    /**
     * 时间戳
     */
    private long time;

    /**
     * 错误消息
     */
    private String msg;

    /**
     * 数据
     */
    private T data;

    /**
     * 额外数据
     */
    private Map<String, Object> extraData;


    /**
     * 成功
     *
     * @return {@link R}<{@link Object}>
     */
    public static R<Object> success()
    {
        return new R<>().setStatus(true).setTime(new Date().getTime());
    }

    /**
     * 成功
     *
     * @param data 数据
     * @return {@link R}<{@link D}>
     */
    public static <D> R<D> success(D data)
    {
        return new R<D>().setStatus(true).setTime(new Date().getTime()).setData(data);
    }

    /**
     * 成功
     *
     * @param data      数据
     * @param extraData 额外数据
     * @return {@link R}<{@link D}>
     */
    public static <D> R<D> success(D data, Map<String, Object> extraData)
    {
        return new R<D>().setStatus(true).setTime(new Date().getTime()).setData(data).setExtraData(extraData);
    }

    /**
     * 失败
     *
     * @return {@link R}<{@link Object}>
     */
    public static R<Object> fail()
    {
        return new R<>().setStatus(false).setTime(new Date().getTime());
    }

    /**
     * 失败
     *
     * @param msg 消息
     * @return {@link R}<{@link Object}>
     */
    public static R<Object> fail(String msg)
    {
        return new R<>().setStatus(false).setTime(new Date().getTime()).setMsg(msg);
    }
}
