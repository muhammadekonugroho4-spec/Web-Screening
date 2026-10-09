package com.stockbit.component.dialog.ordertype;

import com.clevertap.android.sdk.Constants;
import com.stockbit.common.o;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B9\b\u0002\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017¨\u0006\u0018"}, d2 = {"Lcom/stockbit/component/dialog/ordertype/OrderType;", "", Constants.KEY_TITLE, "", "subtitle", "radioTagId", "image", "withSymbolParam", "", "<init>", "(Ljava/lang/String;IIIIIZ)V", "getTitle", "()I", "getSubtitle", "getRadioTagId", "getImage", "getWithSymbolParam", "()Z", "FAST_ORDER", "MARKET_ORDER", "TRAILING_STOP", "STOP_LOSS", "TAKE_PROFIT", "LIMIT_IF_TOUCHED", "dialog_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public enum OrderType extends Enum<OrderType> {
    public static final OrderType FAST_ORDER = null;
    public static final OrderType LIMIT_IF_TOUCHED = null;
    public static final OrderType MARKET_ORDER = null;
    public static final OrderType STOP_LOSS = null;
    public static final OrderType TAKE_PROFIT = null;
    public static final OrderType TRAILING_STOP = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ OrderType[] f70321a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f70322b = null;
    private final int image;
    private final int radioTagId;
    private final int subtitle;
    private final int title;
    private final boolean withSymbolParam;

    static {
        int r3 = com.stockbit.component.dialog.e.f70235S;
        int r4 = com.stockbit.component.dialog.e.f70236T;
        int r6 = com.stockbit.component.dialog.b.f70127e;
        FAST_ORDER = new OrderType("FAST_ORDER", 0, r3, r4, o.s4, r6, false);
        int r42 = com.stockbit.component.dialog.e.f70237U;
        int r5 = com.stockbit.component.dialog.e.f70238V;
        int r7 = com.stockbit.component.dialog.b.f70130h;
        MARKET_ORDER = new OrderType("MARKET_ORDER", 1, r42, r5, o.t4, r7, false);
        int r52 = com.stockbit.component.dialog.e.f70239W;
        int r62 = com.stockbit.component.dialog.e.f70240X;
        int r8 = com.stockbit.component.dialog.b.f70136n;
        TRAILING_STOP = new OrderType("TRAILING_STOP", 2, r52, r62, o.y4, r8, true);
        int r63 = com.stockbit.component.dialog.e.f70275q0;
        int r72 = com.stockbit.component.dialog.e.f70273p0;
        int r9 = com.stockbit.component.dialog.b.f70133k;
        STOP_LOSS = new OrderType("STOP_LOSS", 3, r63, r72, o.v4, r9, true);
        int r73 = com.stockbit.component.dialog.e.f70279s0;
        int r82 = com.stockbit.component.dialog.e.f70277r0;
        int r10 = com.stockbit.component.dialog.b.f70134l;
        TAKE_PROFIT = new OrderType("TAKE_PROFIT", 4, r73, r82, o.x4, r10, true);
        int r83 = com.stockbit.component.dialog.e.f70267m0;
        int r92 = com.stockbit.component.dialog.e.f70269n0;
        int r11 = com.stockbit.component.dialog.b.f70129g;
        LIMIT_IF_TOUCHED = new OrderType("LIMIT_IF_TOUCHED", 5, r83, r92, o.u4, r11, true);
        OrderType[] r02 = a();
        f70321a = r02;
        f70322b = kotlin.enums.b.a(r02);
    }

    OrderType(String r1, int r2, int r3, int r4, int r5, int r6, boolean r7) {
        this.title = r3;
        this.subtitle = r4;
        this.radioTagId = r5;
        this.image = r6;
        this.withSymbolParam = r7;
    }

    public static final /* synthetic */ OrderType[] a() {
        return new OrderType[]{FAST_ORDER, MARKET_ORDER, TRAILING_STOP, STOP_LOSS, TAKE_PROFIT, LIMIT_IF_TOUCHED};
    }

    public static kotlin.enums.a getEntries() {
        return f70322b;
    }

    public static OrderType valueOf(String r1) {
        return (OrderType) Enum.valueOf(OrderType.class, r1);
    }

    public static OrderType[] values() {
        return (OrderType[]) f70321a.clone();
    }

    public final int getImage() {
        return this.image;
    }

    public final int getRadioTagId() {
        return this.radioTagId;
    }

    public final int getSubtitle() {
        return this.subtitle;
    }

    public final int getTitle() {
        return this.title;
    }

    public final boolean getWithSymbolParam() {
        return this.withSymbolParam;
    }
}
