package com.stockbit.domain.model.type.openingaccount;

import kotlin.Metadata;
import kotlin.enums.a;
import kotlin.enums.b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/stockbit/domain/model/type/openingaccount/FormTooltipMessageType;", "", "<init>", "(Ljava/lang/String;I)V", "KTP_ADDRESS", "UNSPECIFIED", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum FormTooltipMessageType extends Enum<FormTooltipMessageType> {
    public static final FormTooltipMessageType KTP_ADDRESS = null;
    public static final FormTooltipMessageType UNSPECIFIED = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ FormTooltipMessageType[] f86362a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ a f86363b = null;

    static {
        KTP_ADDRESS = new FormTooltipMessageType("KTP_ADDRESS", 0);
        UNSPECIFIED = new FormTooltipMessageType("UNSPECIFIED", 1);
        FormTooltipMessageType[] r02 = a();
        f86362a = r02;
        f86363b = b.a(r02);
    }

    FormTooltipMessageType(String r1, int r2) {
    }

    public static final /* synthetic */ FormTooltipMessageType[] a() {
        return new FormTooltipMessageType[]{KTP_ADDRESS, UNSPECIFIED};
    }

    public static a getEntries() {
        return f86363b;
    }

    public static FormTooltipMessageType valueOf(String r1) {
        return (FormTooltipMessageType) Enum.valueOf(FormTooltipMessageType.class, r1);
    }

    public static FormTooltipMessageType[] values() {
        return (FormTooltipMessageType[]) f86362a.clone();
    }
}
