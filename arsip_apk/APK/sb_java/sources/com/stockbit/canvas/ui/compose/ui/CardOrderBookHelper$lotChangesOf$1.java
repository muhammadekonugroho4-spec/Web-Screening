package com.stockbit.canvas.ui.compose.ui;

import android.os.SystemClock;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* synthetic */ class CardOrderBookHelper$lotChangesOf$1 extends FunctionReferenceImpl implements kotlin.jvm.functions.a {

    /* renamed from: a, reason: collision with root package name */
    public static final CardOrderBookHelper$lotChangesOf$1 f51762a = null;

    static {
        f51762a = new CardOrderBookHelper$lotChangesOf$1();
    }

    public CardOrderBookHelper$lotChangesOf$1() {
        super(0, SystemClock.class, "elapsedRealtime", "elapsedRealtime()J", 0);
    }

    @Override // kotlin.jvm.functions.a
    public /* bridge */ /* synthetic */ Object invoke() {
        return s();
    }

    public final Long s() {
        return Long.valueOf(SystemClock.elapsedRealtime());
    }
}
