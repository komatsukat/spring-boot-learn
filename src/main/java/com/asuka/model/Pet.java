package com.asuka.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 描述：宠物
 *
 * @author chenpeng
 * @date 2021-05-01 2:10 PM
 */

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Pet {

    private String name;

    private Double weight;
}
