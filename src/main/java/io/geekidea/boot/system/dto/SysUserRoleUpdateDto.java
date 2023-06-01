package io.geekidea.boot.system.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import javax.validation.constraints.NotNull;
import java.io.Serializable;

/**
 * 修改用户角色关系表参数
 *
 * @author geekidea
 * @since 2022-12-26
 */
@Data
@Schema(description = "修改用户角色关系表参数")
public class SysUserRoleUpdateDto implements Serializable {
    private static final long serialVersionUID = 1L;

    @Schema(description = "主键")
    @NotNull(message = "主键不能为空")
    private Long id;

    @Schema(description = "用户id")
    private Long userId;

    @Schema(description = "角色id")
    private Long roleId;

}


