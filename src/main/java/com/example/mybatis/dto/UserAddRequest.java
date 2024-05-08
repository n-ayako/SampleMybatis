package com.example.mybatis.dto;

import java.io.Serializable;
import lombok.Data;
/**
 * ユーザー情報登録 リクエストデータ
 */
@Data
public class UserAddRequest implements Serializable {
    /**
     * 名前
     */
    @jakarta.validation.constraints.NotEmpty(message = "名前を入力してください")
    @jakarta.validation.constraints.Size(max = 100, message = "名前は100桁以内で入力してください")
    private String name;
    /**
     * 住所
     */
    @jakarta.validation.constraints.Size(max = 255, message = "住所は255桁以内で入力してください")
    private String address;
    /**
     * 電話番号
     */
    @jakarta.validation.constraints.Pattern(regexp = "0\\d{1,4}-\\d{1,4}-\\d{4}", message = "電話番号の形式で入力してください")
    private String phone;
}