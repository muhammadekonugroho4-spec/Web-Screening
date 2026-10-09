package com.stockbit.features.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/stockbit/features/model/PayloadMaskTag;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "PAYLOAD_MASK_TAG_BOLD", "model"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum PayloadMaskTag extends Enum<PayloadMaskTag> {
    public static final PayloadMaskTag PAYLOAD_MASK_TAG_BOLD = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ PayloadMaskTag[] f119107a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f119108b = null;
    private final String value;

    static {
        PAYLOAD_MASK_TAG_BOLD = new PayloadMaskTag("PAYLOAD_MASK_TAG_BOLD", 0, "PAYLOAD_MASK_TAG_BOLD");
        PayloadMaskTag[] r02 = a();
        f119107a = r02;
        f119108b = kotlin.enums.b.a(r02);
    }

    PayloadMaskTag(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ PayloadMaskTag[] a() {
        return new PayloadMaskTag[]{PAYLOAD_MASK_TAG_BOLD};
    }

    public static kotlin.enums.a getEntries() {
        return f119108b;
    }

    public static PayloadMaskTag valueOf(String r1) {
        return (PayloadMaskTag) Enum.valueOf(PayloadMaskTag.class, r1);
    }

    public static PayloadMaskTag[] values() {
        return (PayloadMaskTag[]) f119107a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
