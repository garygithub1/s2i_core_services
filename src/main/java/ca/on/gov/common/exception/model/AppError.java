package ca.on.gov.common.exception.model;

public class AppError {
    private String code;
    private String desc;
    
    public AppError(String code, String desc) {
        this.code = code;
        this.desc = desc;
    }
    
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public String toString() {
        return "AppError [code=" + code + ", desc=" + desc + "]";
    }
}
