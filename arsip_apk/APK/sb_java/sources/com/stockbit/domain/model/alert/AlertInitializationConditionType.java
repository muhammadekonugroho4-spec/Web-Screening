package com.stockbit.domain.model.alert;

import java.util.Iterator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\f"}, d2 = {"Lcom/stockbit/domain/model/alert/AlertInitializationConditionType;", "", "apiValue", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getApiValue", "()Ljava/lang/String;", "Unspecified", "Price", "Technical", "Companion", "domain-model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum AlertInitializationConditionType extends Enum<AlertInitializationConditionType> {
    public static final a Companion = null;
    public static final AlertInitializationConditionType Price = null;
    public static final AlertInitializationConditionType Technical = null;
    public static final AlertInitializationConditionType Unspecified = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AlertInitializationConditionType[] f80563a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f80564b = null;
    private final String apiValue;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final AlertInitializationConditionType a(String r4) {
            kotlin.jvm.internal.p.l(r4, "apiValue");
            Iterator<E> r02 = AlertInitializationConditionType.getEntries().iterator();
        L4:
            if (r02.hasNext() == false) goto L8;
            Object r1 = r02.next();
            if (kotlin.jvm.internal.p.g(((AlertInitializationConditionType) r1).getApiValue(), r4) == false) goto L4;
        L10:
            return (AlertInitializationConditionType) r1;
        L8:
            r1 = null;
            goto L10
        }

        public final AlertInitializationConditionType b(String r2) {
            kotlin.jvm.internal.p.l(r2, "apiValue");
            AlertInitializationConditionType r22 = a(r2);
            if (r22 == null) goto L5;
            return r22;
        L5:
            return AlertInitializationConditionType.Unspecified;
        }

        public a() {
        }
    }

    static {
        Unspecified = new AlertInitializationConditionType("Unspecified", 0, "CONDITION_TYPE_UNSPECIFIED");
        Price = new AlertInitializationConditionType("Price", 1, "CONDITION_TYPE_PRICE");
        Technical = new AlertInitializationConditionType("Technical", 2, "CONDITION_TYPE_TECHNICAL");
        AlertInitializationConditionType[] r02 = a();
        f80563a = r02;
        f80564b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    AlertInitializationConditionType(String r1, int r2, String r3) {
        this.apiValue = r3;
    }

    public static final /* synthetic */ AlertInitializationConditionType[] a() {
        return new AlertInitializationConditionType[]{Unspecified, Price, Technical};
    }

    public static kotlin.enums.a getEntries() {
        return f80564b;
    }

    public static AlertInitializationConditionType valueOf(String r1) {
        return (AlertInitializationConditionType) Enum.valueOf(AlertInitializationConditionType.class, r1);
    }

    public static AlertInitializationConditionType[] values() {
        return (AlertInitializationConditionType[]) f80563a.clone();
    }

    public final String getApiValue() {
        return this.apiValue;
    }
}
