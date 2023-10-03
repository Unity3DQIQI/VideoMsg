package com.pojo;

import java.util.ArrayList;
import java.util.List;

/**
 * 响应给前端的状态码枚举类
 */
public enum CodeEnum {

    // ================== 通用模块
    PARAMS_ERROR(101, "参数异常"),
    JAVA_ERROR(102, "程序异常"),
    ROOM_NOT_EXIST(103, "房间号不存在或已结束"),
    SUCCESS(200, "请求成功"),


    // ================== 游戏
    BAD_STATUS(1001, "状态错误"),
    NOT_ROOM_STREAMER(1002, "不是该房间的主播"),
    ACCOUNT_NOT_RIGHT(1003, "用户名或密码错误"),
    ;


    private final int code;
    private final String msg;

    CodeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }

//    public static List<CodeEnumVO> createVos(){
//        List<CodeEnumVO> vos = new ArrayList<>();
//        for(CodeEnum ce : CodeEnum.values()){
//            CodeEnumVO vo = new CodeEnumVO();
//            vo.setCode(ce.getCode());
//            vo.setMsg(ce.getMsg());
//            vos.add(vo);
//        }
//        return vos;
//    }
}
