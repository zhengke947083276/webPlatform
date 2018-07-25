package org.com.entity;

import java.util.Date;

public class TblCustomer {
    private Integer customerId;

    private String customerTelnum;

    private String customerPassword;

    private Boolean customerSex;

    private Date customerBirthday;

    private String customerJob;

    private String customerPicture;

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    public String getCustomerTelnum() {
        return customerTelnum;
    }

    public void setCustomerTelnum(String customerTelnum) {
        this.customerTelnum = customerTelnum == null ? null : customerTelnum.trim();
    }

    public String getCustomerPassword() {
        return customerPassword;
    }

    public void setCustomerPassword(String customerPassword) {
        this.customerPassword = customerPassword == null ? null : customerPassword.trim();
    }

    public Boolean getCustomerSex() {
        return customerSex;
    }

    public void setCustomerSex(Boolean customerSex) {
        this.customerSex = customerSex;
    }

    public Date getCustomerBirthday() {
        return customerBirthday;
    }

    public void setCustomerBirthday(Date customerBirthday) {
        this.customerBirthday = customerBirthday;
    }

    public String getCustomerJob() {
        return customerJob;
    }

    public void setCustomerJob(String customerJob) {
        this.customerJob = customerJob == null ? null : customerJob.trim();
    }

    public String getCustomerPicture() {
        return customerPicture;
    }

    public void setCustomerPicture(String customerPicture) {
        this.customerPicture = customerPicture == null ? null : customerPicture.trim();
    }

    @Override
    public String toString() {
        return "TblCustomer{" +
                "customerId=" + customerId +
                ", customerTelnum='" + customerTelnum + '\'' +
                ", customerPassword='" + customerPassword + '\'' +
                ", customerSex=" + customerSex +
                ", customerBirthday=" + customerBirthday +
                ", customerJob='" + customerJob + '\'' +
                ", customerPicture='" + customerPicture + '\'' +
                '}';
    }
}