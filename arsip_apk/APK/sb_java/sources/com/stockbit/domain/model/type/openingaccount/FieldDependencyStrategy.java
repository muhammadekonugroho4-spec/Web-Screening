package com.stockbit.domain.model.type.openingaccount;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/stockbit/domain/model/type/openingaccount/FieldDependencyStrategy;", "", "<init>", "(Ljava/lang/String;I)V", "GET_VALUE_FOR_VALUE", "GET_VALUE_FOR_LABEL", "READ_VALUE_FOR_LABEL", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum FieldDependencyStrategy extends Enum<FieldDependencyStrategy> {
    public static final FieldDependencyStrategy GET_VALUE_FOR_LABEL = null;
    public static final FieldDependencyStrategy GET_VALUE_FOR_VALUE = null;
    public static final FieldDependencyStrategy READ_VALUE_FOR_LABEL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FieldDependencyStrategy[] f86339a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f86340b = null;

    static {
        GET_VALUE_FOR_VALUE = new FieldDependencyStrategy("GET_VALUE_FOR_VALUE", 0);
        GET_VALUE_FOR_LABEL = new FieldDependencyStrategy("GET_VALUE_FOR_LABEL", 1);
        READ_VALUE_FOR_LABEL = new FieldDependencyStrategy("READ_VALUE_FOR_LABEL", 2);
        FieldDependencyStrategy[] r02 = a();
        f86339a = r02;
        f86340b = b.a(r02);
    }

    FieldDependencyStrategy(String r1, int r2) {
    }

    public static final /* synthetic */ FieldDependencyStrategy[] a() {
        return new FieldDependencyStrategy[]{GET_VALUE_FOR_VALUE, GET_VALUE_FOR_LABEL, READ_VALUE_FOR_LABEL};
    }

    public static a getEntries() {
        return f86340b;
    }

    public static FieldDependencyStrategy valueOf(String r1) {
        return (FieldDependencyStrategy) Enum.valueOf(FieldDependencyStrategy.class, r1);
    }

    public static FieldDependencyStrategy[] values() {
        return (FieldDependencyStrategy[]) f86339a.clone();
    }
}
