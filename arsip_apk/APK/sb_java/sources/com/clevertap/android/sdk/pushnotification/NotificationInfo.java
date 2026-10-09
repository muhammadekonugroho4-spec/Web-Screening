package com.clevertap.android.sdk.pushnotification;

/* loaded from: classes4.dex */
public final class NotificationInfo {
    public final boolean fromCleverTap;
    public final boolean shouldRender;

    public NotificationInfo(boolean r1, boolean r2) {
        this.fromCleverTap = r1;
        this.shouldRender = r2;
    }

    public String toString() {
        return "NotificationInfo{fromCleverTap=" + this.fromCleverTap + ", shouldRender=" + this.shouldRender + '}';
    }
}
