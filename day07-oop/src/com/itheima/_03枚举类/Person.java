package com.itheima._03枚举类;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description Person
 * @Author jeanAulis
 * @Date 2025-07-11
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    private String name;

    private Gender gender;
}
