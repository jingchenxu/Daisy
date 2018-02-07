package org.deepwater.daisy.entity.flag;

public class Flag {
    private Integer flagId;

    private String flagNumber;

    private String flagName;

    private String flagIcon;

    public Integer getFlagId() {
        return flagId;
    }

    public void setFlagId(Integer flagId) {
        this.flagId = flagId;
    }

    public String getFlagNumber() {
        return flagNumber;
    }

    public void setFlagNumber(String flagNumber) {
        this.flagNumber = flagNumber == null ? null : flagNumber.trim();
    }

    public String getFlagName() {
        return flagName;
    }

    public void setFlagName(String flagName) {
        this.flagName = flagName == null ? null : flagName.trim();
    }

    public String getFlagIcon() {
        return flagIcon;
    }

    public void setFlagIcon(String flagIcon) {
        this.flagIcon = flagIcon == null ? null : flagIcon.trim();
    }

    @Override
    public String toString() {
        return "Flag{" +
                "flagId=" + flagId +
                ", flagNumber='" + flagNumber + '\'' +
                ", flagName='" + flagName + '\'' +
                ", flagIcon='" + flagIcon + '\'' +
                '}';
    }
}