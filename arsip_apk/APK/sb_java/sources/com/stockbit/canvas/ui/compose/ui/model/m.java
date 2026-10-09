package com.stockbit.canvas.ui.compose.ui.model;

import com.clevertap.android.sdk.Constants;
import com.stockbit.component.orderbook.model.OrderBookColor;
import kotlin.jvm.internal.p;

/* loaded from: classes7.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public static final a f51821c = null;
    public static final m d = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f51822a;

    /* renamed from: b, reason: collision with root package name */
    public final OrderBookColor f51823b;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final m a() {
            return m.a();
        }

        public a() {
        }
    }

    static {
        f51821c = new a(null);
        d = new m("", OrderBookColor.PRIMARY);
    }

    public m(String r2, OrderBookColor r3) {
        p.l(r2, Constants.KEY_TEXT);
        p.l(r3, Constants.KEY_COLOR);
        this.f51822a = r2;
        this.f51823b = r3;
    }

    public static final /* synthetic */ m a() {
        return d;
    }

    public final OrderBookColor b() {
        return this.f51823b;
    }

    public final String c() {
        return this.f51822a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof m) == true) goto L8;
        return false;
    L8:
        m r52 = (m) r5;
        if (p.g(this.f51822a, r52.f51822a) == true) goto L12;
        return false;
    L12:
        if (this.f51823b == r52.f51823b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f51822a.hashCode() * 31) + this.f51823b.hashCode();
    }

    public String toString() {
        return "LotChangeCellUiState(text=" + this.f51822a + ", color=" + this.f51823b + ')';
    }
}
