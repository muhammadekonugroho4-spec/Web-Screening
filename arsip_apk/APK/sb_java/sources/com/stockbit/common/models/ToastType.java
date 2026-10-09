package com.stockbit.common.models;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/common/models/ToastType;", "", "<init>", "(Ljava/lang/String;I)V", "SUCCESS", "ERROR", "WARNING", "INFO", "ALERT", "NORMAL", "common_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum ToastType extends Enum<ToastType> {
    public static final ToastType ALERT = null;
    public static final ToastType ERROR = null;
    public static final ToastType INFO = null;
    public static final ToastType NORMAL = null;
    public static final ToastType SUCCESS = null;
    public static final ToastType WARNING = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ToastType[] f60891a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f60892b = null;

    static {
        SUCCESS = new ToastType("SUCCESS", 0);
        ERROR = new ToastType("ERROR", 1);
        WARNING = new ToastType("WARNING", 2);
        INFO = new ToastType("INFO", 3);
        ALERT = new ToastType("ALERT", 4);
        NORMAL = new ToastType("NORMAL", 5);
        ToastType[] r02 = a();
        f60891a = r02;
        f60892b = kotlin.enums.b.a(r02);
    }

    ToastType(String r1, int r2) {
    }

    public static final /* synthetic */ ToastType[] a() {
        return new ToastType[]{SUCCESS, ERROR, WARNING, INFO, ALERT, NORMAL};
    }

    public static kotlin.enums.a getEntries() {
        return f60892b;
    }

    public static ToastType valueOf(String r1) {
        return (ToastType) Enum.valueOf(ToastType.class, r1);
    }

    public static ToastType[] values() {
        return (ToastType[]) f60891a.clone();
    }
}
