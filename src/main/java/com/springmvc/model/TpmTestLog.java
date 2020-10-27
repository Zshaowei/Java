package com.springmvc.model;


import java.io.Serializable;
import java.util.Objects;

public class TpmTestLog implements Serializable {

    private Long logUuid;   //主键
    private String testmainUuid;    //
    private String operation;
    private String syscreatedate;

    public Long getLogUuid() {
        return logUuid;
    }

    public void setLogUuid(Long logUuid) {
        this.logUuid = logUuid;
    }

    public String getTestmainUuid() {
        return testmainUuid;
    }

    public void setTestmainUuid(String testmainUuid) {
        this.testmainUuid = testmainUuid;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }


    public String getSyscreatedate() {
        return syscreatedate;
    }

    public void setSyscreatedate(String syscreatedate) {
        this.syscreatedate = syscreatedate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TpmTestLog that = (TpmTestLog) o;
        return Objects.equals(logUuid, that.logUuid) &&
                Objects.equals(testmainUuid, that.testmainUuid) &&
                Objects.equals(operation, that.operation) &&
                Objects.equals(syscreatedate, that.syscreatedate);
    }

    @Override
    public int hashCode() {

        return Objects.hash(logUuid, testmainUuid, operation, syscreatedate);
    }

    @Override
    public String toString() {
        return "TpmTestLog{" +
                "logUuid=" + logUuid +
                ", testmainUuid='" + testmainUuid + '\'' +
                ", operation='" + operation + '\'' +
                ", syscreatedate='" + syscreatedate + '\'' +
                '}';
    }
}
