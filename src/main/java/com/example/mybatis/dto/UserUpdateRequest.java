package com.example.mybatis.dto;

import java.io.Serializable;
import lombok.Data;
import lombok.EqualsAndHashCode;
/**
 * ユーザー情報更新リクエストデータ
 *
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class UserUpdateRequest extends UserAddRequest implements Serializable {
    /**
     * ユーザーID
     */
    @jakarta.validation.constraints.NotNull
    private Long id;
}