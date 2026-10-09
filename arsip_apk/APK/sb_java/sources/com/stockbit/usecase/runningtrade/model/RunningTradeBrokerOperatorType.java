package com.stockbit.usecase.runningtrade.model;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/stockbit/usecase/runningtrade/model/RunningTradeBrokerOperatorType;", "", "<init>", "(Ljava/lang/String;I)V", "FILTER_BROKER_OPERATOR_UNSPECIFIED", "FILTER_BROKER_OPERATOR_AND", "FILTER_BROKER_OPERATOR_OR", "Companion", "usecase-runningtrade"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum RunningTradeBrokerOperatorType extends Enum<RunningTradeBrokerOperatorType> {
    public static final a Companion = null;
    public static final RunningTradeBrokerOperatorType FILTER_BROKER_OPERATOR_AND = null;
    public static final RunningTradeBrokerOperatorType FILTER_BROKER_OPERATOR_OR = null;
    public static final RunningTradeBrokerOperatorType FILTER_BROKER_OPERATOR_UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ RunningTradeBrokerOperatorType[] f159568a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f159569b = null;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        FILTER_BROKER_OPERATOR_UNSPECIFIED = new RunningTradeBrokerOperatorType("FILTER_BROKER_OPERATOR_UNSPECIFIED", 0);
        FILTER_BROKER_OPERATOR_AND = new RunningTradeBrokerOperatorType("FILTER_BROKER_OPERATOR_AND", 1);
        FILTER_BROKER_OPERATOR_OR = new RunningTradeBrokerOperatorType("FILTER_BROKER_OPERATOR_OR", 2);
        RunningTradeBrokerOperatorType[] r02 = a();
        f159568a = r02;
        f159569b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    RunningTradeBrokerOperatorType(String r1, int r2) {
    }

    public static final /* synthetic */ RunningTradeBrokerOperatorType[] a() {
        return new RunningTradeBrokerOperatorType[]{FILTER_BROKER_OPERATOR_UNSPECIFIED, FILTER_BROKER_OPERATOR_AND, FILTER_BROKER_OPERATOR_OR};
    }

    public static kotlin.enums.a getEntries() {
        return f159569b;
    }

    public static RunningTradeBrokerOperatorType valueOf(String r1) {
        return (RunningTradeBrokerOperatorType) Enum.valueOf(RunningTradeBrokerOperatorType.class, r1);
    }

    public static RunningTradeBrokerOperatorType[] values() {
        return (RunningTradeBrokerOperatorType[]) f159568a.clone();
    }
}
