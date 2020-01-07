package com.jsu.vo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CubeResult {
    private Integer code;
    private Object data;

    public  static CubeResult  SUCCESS(Object ...param){
        return new CubeResult(200,param);
    }

}
