package io.geekidea.boot.system.vo;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统日志详情VO
 *
 * @author geekidea
 * @since 2023-02-16
 */
@Data
@Schema(description = "系统日志详情VO")
public class SysLogInfoVo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(description = "主键")
    private Long id;

    @Schema(description = "请求ID")
    private String requestId;

    @Schema(description = "请求时间")
    private String requestTime;

    @Schema(description = "全路径")
    private String requestUrl;

    @Schema(description = "日志名称")
    private String logName;

    @Schema(description = "请求方式，GET/POST")
    private String requestMethod;

    @Schema(description = "内容类型")
    private String contentType;

    @Schema(description = "是否是JSON请求映射参数")
    private Boolean isRequestBody;

    @Schema(description = "请求参数")
    private String requestParam;

    @Schema(description = "用户ID")
    private Long userId;

    @Schema(description = "用户名")
    private String username;

    @Schema(description = "请求ip")
    private String requestIp;

    @Schema(description = "0:其它,1:新增,2:修改,3:删除,4:详情查询,5:所有列表,6:分页列表,7:其它查询,8:上传文件")
    private Integer logType;

    @Schema(description = "0:失败,1:成功")
    private Boolean responseSuccess;

    @Schema(description = "响应结果状态码")
    private Integer responseCode;

    @Schema(description = "响应结果消息")
    private String responseMessage;

    @Schema(description = "响应数据")
    private String responseData;

    @Schema(description = "异常类名称")
    private String exceptionName;

    @Schema(description = "异常信息")
    private String exceptionMessage;

    @Schema(description = "响应时间")
    private String responseTime;

    @Schema(description = "耗时，单位：毫秒")
    private Long diffTime;

    @Schema(description = "来源地址")
    private String referer;

    @Schema(description = "请求来源")
    private String requestSource;

    @Schema(description = "用户环境")
    private String userAgent;

    @Schema(description = "备注")
    private String remark;

    @Schema(description = "创建时间")
    private Date createTime;

    @Schema(description = "修改时间")
    private Date updateTime;

}

