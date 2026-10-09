package com.midtrans.sdk.corekit.models;

import com.google.gson.annotations.SerializedName;

/* loaded from: classes6.dex */
public class ExpiryModel {
    public static final String UNIT_DAY = "days";
    public static final String UNIT_HOUR = "hours";
    public static final String UNIT_MINUTE = "minutes";

    @SerializedName("duration")
    private int duration;

    @SerializedName("start_time")
    private String startTime;

    @SerializedName("unit")
    private String unit;

    public ExpiryModel() {
    }

    public int getDuration() {
        return this.duration;
    }

    public String getStartTime() {
        return this.startTime;
    }

    public String getUnit() {
        return this.unit;
    }

    public void setDuration(int r1) {
        this.duration = r1;
    }

    public void setStartTime(String r1) {
        this.startTime = r1;
    }

    public void setUnit(String r1) {
        this.unit = r1;
    }
}
