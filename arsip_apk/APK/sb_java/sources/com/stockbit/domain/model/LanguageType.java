package com.stockbit.domain.model;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\u000b"}, d2 = {"Lcom/stockbit/domain/model/LanguageType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "INDONESIA", "ENGLISH", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum LanguageType extends Enum<LanguageType> {
    public static final a Companion = null;
    public static final LanguageType ENGLISH = null;
    public static final LanguageType INDONESIA = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LanguageType[] f80496a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f80497b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        INDONESIA = new LanguageType("INDONESIA", 0, "in");
        ENGLISH = new LanguageType("ENGLISH", 1, "en");
        LanguageType[] r02 = a();
        f80496a = r02;
        f80497b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    LanguageType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ LanguageType[] a() {
        return new LanguageType[]{INDONESIA, ENGLISH};
    }

    public static kotlin.enums.a getEntries() {
        return f80497b;
    }

    public static LanguageType valueOf(String r1) {
        return (LanguageType) Enum.valueOf(LanguageType.class, r1);
    }

    public static LanguageType[] values() {
        return (LanguageType[]) f80496a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
