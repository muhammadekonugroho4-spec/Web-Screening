package com.stockbit.domain.model.alert;

import com.google.firebase.messaging.Constants;
import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0086\u0081\u0002\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0012B\u001d\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0013"}, d2 = {"Lcom/stockbit/domain/model/alert/AlertConditionOperatorType;", "", "apiValue", "", Constants.ScionAnalytics.PARAM_LABEL, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "getApiValue", "()Ljava/lang/String;", "getLabel", "Unspecified", "LesserThanEqual", "GreaterThanEqual", "LesserThan", "GreaterThan", "Equal", "CrossingUp", "CrossingDown", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum AlertConditionOperatorType extends Enum<AlertConditionOperatorType> {
    public static final a Companion = null;
    public static final AlertConditionOperatorType CrossingDown = null;
    public static final AlertConditionOperatorType CrossingUp = null;
    public static final AlertConditionOperatorType Equal = null;
    public static final AlertConditionOperatorType GreaterThan = null;
    public static final AlertConditionOperatorType GreaterThanEqual = null;
    public static final AlertConditionOperatorType LesserThan = null;
    public static final AlertConditionOperatorType LesserThanEqual = null;
    public static final AlertConditionOperatorType Unspecified = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AlertConditionOperatorType[] f80559a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f80560b = null;
    private final String apiValue;
    private final String label;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final AlertConditionOperatorType a(String r4) {
            kotlin.jvm.internal.p.l(r4, "raw");
            Iterator<E> r02 = AlertConditionOperatorType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (kotlin.jvm.internal.p.g(((AlertConditionOperatorType) r1).getApiValue(), r4) == false) goto L4;
        L9:
            AlertConditionOperatorType r12 = (AlertConditionOperatorType) r1;
            if (r12 == null) goto L12;
            return r12;
        L12:
            return AlertConditionOperatorType.Unspecified;
        L8:
            r1 = null;
            goto L9
        }

        public a() {
        }
    }

    static {
        String r1 = "Unspecified";
        int r2 = 0;
        String r3 = "OPERATOR_UNSPECIFIED";
        String r4 = null;
        Unspecified = new AlertConditionOperatorType(r1, r2, r3, r4, 2, null);
        LesserThanEqual = new AlertConditionOperatorType("LesserThanEqual", 1, "OPERATOR_LESSER_THAN_EQUAL", "Less Than / Equal To");
        GreaterThanEqual = new AlertConditionOperatorType("GreaterThanEqual", 2, "OPERATOR_GREATER_THAN_EQUAL", "Greater Than / Equal To");
        LesserThan = new AlertConditionOperatorType("LesserThan", 3, "OPERATOR_LESSER_THAN", "Less Than");
        GreaterThan = new AlertConditionOperatorType("GreaterThan", 4, "OPERATOR_GREATER_THAN", "Greater Than");
        Equal = new AlertConditionOperatorType("Equal", 5, "OPERATOR_EQUAL", "Equal To");
        CrossingUp = new AlertConditionOperatorType("CrossingUp", 6, "OPERATOR_CROSSING_UP", "Price Crossing Up");
        CrossingDown = new AlertConditionOperatorType("CrossingDown", 7, "OPERATOR_CROSSING_DOWN", "Price Crossing Down");
        AlertConditionOperatorType[] r02 = a();
        f80559a = r02;
        f80560b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    AlertConditionOperatorType(String r1, int r2, String r3, String r4) {
        this.apiValue = r3;
        this.label = r4;
    }

    public static final /* synthetic */ AlertConditionOperatorType[] a() {
        return new AlertConditionOperatorType[]{Unspecified, LesserThanEqual, GreaterThanEqual, LesserThan, GreaterThan, Equal, CrossingUp, CrossingDown};
    }

    public static kotlin.enums.a getEntries() {
        return f80560b;
    }

    public static AlertConditionOperatorType valueOf(String r1) {
        return (AlertConditionOperatorType) Enum.valueOf(AlertConditionOperatorType.class, r1);
    }

    public static AlertConditionOperatorType[] values() {
        return (AlertConditionOperatorType[]) f80559a.clone();
    }

    public final String getApiValue() {
        return this.apiValue;
    }

    public final String getLabel() {
        return this.label;
    }

    /* synthetic */ AlertConditionOperatorType(String r1, int r2, String r3, String r4, int r5, kotlin.jvm.internal.i r6) {
        if ((r5 & 2) == 0) goto L5;
        r4 = null;
    L5:
        this(r1, r2, r3, r4);
    }
}
