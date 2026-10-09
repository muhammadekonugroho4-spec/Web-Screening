package com.stockbit.domain.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stockbit/domain/model/ErrorShowType;", "", "<init>", "(Ljava/lang/String;I)V", "SNACKBAR", "TOAST", "NONE", "TOAST_CUSTOM", "BOTTOM_SHEET", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum ErrorShowType extends Enum<ErrorShowType> {
    public static final ErrorShowType BOTTOM_SHEET = null;
    public static final ErrorShowType NONE = null;
    public static final ErrorShowType SNACKBAR = null;
    public static final ErrorShowType TOAST = null;
    public static final ErrorShowType TOAST_CUSTOM = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ErrorShowType[] f80492a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f80493b = null;

    static {
        SNACKBAR = new ErrorShowType("SNACKBAR", 0);
        TOAST = new ErrorShowType("TOAST", 1);
        NONE = new ErrorShowType("NONE", 2);
        TOAST_CUSTOM = new ErrorShowType("TOAST_CUSTOM", 3);
        BOTTOM_SHEET = new ErrorShowType("BOTTOM_SHEET", 4);
        ErrorShowType[] r02 = a();
        f80492a = r02;
        f80493b = kotlin.enums.b.a(r02);
    }

    ErrorShowType(String r1, int r2) {
    }

    public static final /* synthetic */ ErrorShowType[] a() {
        return new ErrorShowType[]{SNACKBAR, TOAST, NONE, TOAST_CUSTOM, BOTTOM_SHEET};
    }

    public static kotlin.enums.a getEntries() {
        return f80493b;
    }

    public static ErrorShowType valueOf(String r1) {
        return (ErrorShowType) Enum.valueOf(ErrorShowType.class, r1);
    }

    public static ErrorShowType[] values() {
        return (ErrorShowType[]) f80492a.clone();
    }
}
