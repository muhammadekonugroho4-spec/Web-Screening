package com.stockbit.model.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stockbit/model/type/ScreenerTemplateType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "TEMPLATE_TYPE_GURU", "TEMPLATE_TYPE_CUSTOM", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum ScreenerTemplateType extends Enum<ScreenerTemplateType> {
    public static final ScreenerTemplateType TEMPLATE_TYPE_CUSTOM = null;
    public static final ScreenerTemplateType TEMPLATE_TYPE_GURU = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ ScreenerTemplateType[] f122208a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122209b = null;
    private final String value;

    static {
        TEMPLATE_TYPE_GURU = new ScreenerTemplateType("TEMPLATE_TYPE_GURU", 0, "TEMPLATE_TYPE_GURU");
        TEMPLATE_TYPE_CUSTOM = new ScreenerTemplateType("TEMPLATE_TYPE_CUSTOM", 1, "TEMPLATE_TYPE_CUSTOM");
        ScreenerTemplateType[] r02 = a();
        f122208a = r02;
        f122209b = kotlin.enums.b.a(r02);
    }

    ScreenerTemplateType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ ScreenerTemplateType[] a() {
        return new ScreenerTemplateType[]{TEMPLATE_TYPE_GURU, TEMPLATE_TYPE_CUSTOM};
    }

    public static kotlin.enums.a getEntries() {
        return f122209b;
    }

    public static ScreenerTemplateType valueOf(String r1) {
        return (ScreenerTemplateType) Enum.valueOf(ScreenerTemplateType.class, r1);
    }

    public static ScreenerTemplateType[] values() {
        return (ScreenerTemplateType[]) f122208a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
