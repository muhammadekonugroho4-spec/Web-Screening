package com.stockbit.usecase.screener.model.type;

import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/stockbit/usecase/screener/model/type/TemplateType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "TEMPLATE_TYPE_GURU", "TEMPLATE_TYPE_CUSTOM", "Companion", "usecase-screener"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum TemplateType extends Enum<TemplateType> {
    public static final a Companion = null;
    public static final TemplateType TEMPLATE_TYPE_CUSTOM = null;
    public static final TemplateType TEMPLATE_TYPE_GURU = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ TemplateType[] f159771a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f159772b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        TEMPLATE_TYPE_GURU = new TemplateType("TEMPLATE_TYPE_GURU", 0, "TEMPLATE_TYPE_GURU");
        TEMPLATE_TYPE_CUSTOM = new TemplateType("TEMPLATE_TYPE_CUSTOM", 1, "TEMPLATE_TYPE_CUSTOM");
        TemplateType[] r02 = a();
        f159771a = r02;
        f159772b = b.a(r02);
        Companion = new a(null);
    }

    TemplateType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ TemplateType[] a() {
        return new TemplateType[]{TEMPLATE_TYPE_GURU, TEMPLATE_TYPE_CUSTOM};
    }

    public static kotlin.enums.a getEntries() {
        return f159772b;
    }

    public static TemplateType valueOf(String r1) {
        return (TemplateType) Enum.valueOf(TemplateType.class, r1);
    }

    public static TemplateType[] values() {
        return (TemplateType[]) f159771a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
