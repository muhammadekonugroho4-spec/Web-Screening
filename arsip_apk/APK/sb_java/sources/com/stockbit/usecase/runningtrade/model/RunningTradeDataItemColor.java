package com.stockbit.usecase.runningtrade.model;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\n"}, d2 = {"Lcom/stockbit/usecase/runningtrade/model/RunningTradeDataItemColor;", "", "<init>", "(Ljava/lang/String;I)V", "GRAY", "RED", "GREEN", "PURPLE", "GRAY_SECONDARY", "Companion", "usecase-runningtrade"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum RunningTradeDataItemColor extends Enum<RunningTradeDataItemColor> {
    public static final a Companion = null;
    public static final RunningTradeDataItemColor GRAY = null;
    public static final RunningTradeDataItemColor GRAY_SECONDARY = null;
    public static final RunningTradeDataItemColor GREEN = null;
    public static final RunningTradeDataItemColor PURPLE = null;
    public static final RunningTradeDataItemColor RED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ RunningTradeDataItemColor[] f159572a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f159573b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        GRAY = new RunningTradeDataItemColor("GRAY", 0);
        RED = new RunningTradeDataItemColor("RED", 1);
        GREEN = new RunningTradeDataItemColor("GREEN", 2);
        PURPLE = new RunningTradeDataItemColor("PURPLE", 3);
        GRAY_SECONDARY = new RunningTradeDataItemColor("GRAY_SECONDARY", 4);
        RunningTradeDataItemColor[] r02 = a();
        f159572a = r02;
        f159573b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    RunningTradeDataItemColor(String r1, int r2) {
    }

    public static final /* synthetic */ RunningTradeDataItemColor[] a() {
        return new RunningTradeDataItemColor[]{GRAY, RED, GREEN, PURPLE, GRAY_SECONDARY};
    }

    public static kotlin.enums.a getEntries() {
        return f159573b;
    }

    public static RunningTradeDataItemColor valueOf(String r1) {
        return (RunningTradeDataItemColor) Enum.valueOf(RunningTradeDataItemColor.class, r1);
    }

    public static RunningTradeDataItemColor[] values() {
        return (RunningTradeDataItemColor[]) f159572a.clone();
    }
}
