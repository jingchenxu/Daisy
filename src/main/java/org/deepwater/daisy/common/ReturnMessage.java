package org.deepwater.daisy.common;

public enum ReturnMessage {
    SUCCESS("请求成功"), FAIL("请求失败");

    private String message;

    ReturnMessage(String message) {
        this.message = message;
    }

    public static ReturnMessage fromMessage(String message) {
        for(ReturnMessage returnMessage: ReturnMessage.values()){
            if(returnMessage.getMessage().equals(message)){
                return returnMessage;
            }
        }
        return null;
    }

    public String getMessage() {
        return this.message;
    }
}
