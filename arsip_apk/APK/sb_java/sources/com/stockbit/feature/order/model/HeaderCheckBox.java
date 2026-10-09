package com.stockbit.feature.order.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/stockbit/feature/order/model/HeaderCheckBox;", "", "<init>", "(Ljava/lang/String;I)V", "NONE", "HALF", "FULL", "EMPTY_LIST", "order_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes9.dex */
public enum HeaderCheckBox extends Enum<HeaderCheckBox> {
    public static final HeaderCheckBox EMPTY_LIST = null;
    public static final HeaderCheckBox FULL = null;
    public static final HeaderCheckBox HALF = null;
    public static final HeaderCheckBox NONE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ HeaderCheckBox[] f101355a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f101356b = null;

    static {
        NONE = new HeaderCheckBox("NONE", 0);
        HALF = new HeaderCheckBox("HALF", 1);
        FULL = new HeaderCheckBox("FULL", 2);
        EMPTY_LIST = new HeaderCheckBox("EMPTY_LIST", 3);
        HeaderCheckBox[] r02 = a();
        f101355a = r02;
        f101356b = b.a(r02);
    }

    HeaderCheckBox(String r1, int r2) {
    }

    public static final /* synthetic */ HeaderCheckBox[] a() {
        return new HeaderCheckBox[]{NONE, HALF, FULL, EMPTY_LIST};
    }

    public static a getEntries() {
        return f101356b;
    }

    public static HeaderCheckBox valueOf(String r1) {
        return (HeaderCheckBox) Enum.valueOf(HeaderCheckBox.class, r1);
    }

    public static HeaderCheckBox[] values() {
        return (HeaderCheckBox[]) f101355a.clone();
    }
}
