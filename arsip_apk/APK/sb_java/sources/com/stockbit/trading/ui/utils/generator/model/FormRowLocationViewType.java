package com.stockbit.trading.ui.utils.generator.model;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/trading/ui/utils/generator/model/FormRowLocationViewType;", "", "<init>", "(Ljava/lang/String;I)V", "BEFORE", "AFTER", "trading_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public enum FormRowLocationViewType extends Enum<FormRowLocationViewType> {
    public static final FormRowLocationViewType AFTER = null;
    public static final FormRowLocationViewType BEFORE = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FormRowLocationViewType[] f148833a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f148834b = null;

    static {
        BEFORE = new FormRowLocationViewType("BEFORE", 0);
        AFTER = new FormRowLocationViewType("AFTER", 1);
        FormRowLocationViewType[] r02 = a();
        f148833a = r02;
        f148834b = b.a(r02);
    }

    FormRowLocationViewType(String r1, int r2) {
    }

    public static final /* synthetic */ FormRowLocationViewType[] a() {
        return new FormRowLocationViewType[]{BEFORE, AFTER};
    }

    public static a getEntries() {
        return f148834b;
    }

    public static FormRowLocationViewType valueOf(String r1) {
        return (FormRowLocationViewType) Enum.valueOf(FormRowLocationViewType.class, r1);
    }

    public static FormRowLocationViewType[] values() {
        return (FormRowLocationViewType[]) f148833a.clone();
    }
}
