package com.chuckerteam.chucker.api;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"com/chuckerteam/chucker/api/RetentionManager$Period", "", "Lcom/chuckerteam/chucker/api/RetentionManager$Period;", "<init>", "(Ljava/lang/String;I)V", "ONE_HOUR", "ONE_DAY", "ONE_WEEK", "FOREVER", "com.github.ChuckerTeam.Chucker.library"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public enum RetentionManager$Period extends Enum<RetentionManager$Period> {
    public static final RetentionManager$Period FOREVER = null;
    public static final RetentionManager$Period ONE_DAY = null;
    public static final RetentionManager$Period ONE_HOUR = null;
    public static final RetentionManager$Period ONE_WEEK = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ RetentionManager$Period[] f33409a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f33410b = null;

    static {
        ONE_HOUR = new RetentionManager$Period("ONE_HOUR", 0);
        ONE_DAY = new RetentionManager$Period("ONE_DAY", 1);
        ONE_WEEK = new RetentionManager$Period("ONE_WEEK", 2);
        FOREVER = new RetentionManager$Period("FOREVER", 3);
        RetentionManager$Period[] r02 = a();
        f33409a = r02;
        f33410b = kotlin.enums.b.a(r02);
    }

    RetentionManager$Period(String r1, int r2) {
    }

    public static final /* synthetic */ RetentionManager$Period[] a() {
        return new RetentionManager$Period[]{ONE_HOUR, ONE_DAY, ONE_WEEK, FOREVER};
    }

    public static kotlin.enums.a getEntries() {
        return f33410b;
    }

    public static RetentionManager$Period valueOf(String r1) {
        return (RetentionManager$Period) Enum.valueOf(RetentionManager$Period.class, r1);
    }

    public static RetentionManager$Period[] values() {
        return (RetentionManager$Period[]) f33409a.clone();
    }
}
