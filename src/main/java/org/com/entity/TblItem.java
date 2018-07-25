package org.com.entity;

import java.util.Date;

public class TblItem {
    private Integer itemId;

    private String itemName;

    private String itemUrl;

    private String itemGitUrl;

    private Integer itemState;

    private Date itemTime;

    private String itemDescribe;

    private Integer customerId;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public String getItemUrl() {
        return itemUrl;
    }

    public void setItemUrl(String itemUrl) {
        this.itemUrl = itemUrl == null ? null : itemUrl.trim();
    }

    public String getItemGitUrl() {
        return itemGitUrl;
    }

    public void setItemGitUrl(String itemGitUrl) {
        this.itemGitUrl = itemGitUrl == null ? null : itemGitUrl.trim();
    }

    public Integer getItemState() {
        return itemState;
    }

    public void setItemState(Integer itemState) {
        this.itemState = itemState;
    }

    public Date getItemTime() {
        return itemTime;
    }

    public void setItemTime(Date itemTime) {
        this.itemTime = itemTime;
    }

    public String getItemDescribe() {
        return itemDescribe;
    }

    public void setItemDescribe(String itemDescribe) {
        this.itemDescribe = itemDescribe == null ? null : itemDescribe.trim();
    }

    public Integer getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Integer customerId) {
        this.customerId = customerId;
    }

    @Override
    public String toString() {
        return "TblItem{" +
                "itemId=" + itemId +
                ", itemName='" + itemName + '\'' +
                ", itemUrl='" + itemUrl + '\'' +
                ", itemGitUrl='" + itemGitUrl + '\'' +
                ", itemState=" + itemState +
                ", itemTime=" + itemTime +
                ", itemDescribe='" + itemDescribe + '\'' +
                ", customerId=" + customerId +
                '}';
    }
}