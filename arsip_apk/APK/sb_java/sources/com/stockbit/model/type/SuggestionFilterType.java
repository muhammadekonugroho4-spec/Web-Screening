package com.stockbit.model.type;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stockbit/model/type/SuggestionFilterType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ALL", "STREAM", "ONBOARDING", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum SuggestionFilterType extends Enum<SuggestionFilterType> {
    public static final SuggestionFilterType ALL = null;
    public static final SuggestionFilterType ONBOARDING = null;
    public static final SuggestionFilterType STREAM = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ SuggestionFilterType[] f122218a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122219b = null;
    private final String value;

    static {
        ALL = new SuggestionFilterType("ALL", 0, "FILTER_ALL");
        STREAM = new SuggestionFilterType("STREAM", 1, "FILTER_STREAM");
        ONBOARDING = new SuggestionFilterType("ONBOARDING", 2, "FILTER_ONBOARDING");
        SuggestionFilterType[] r02 = a();
        f122218a = r02;
        f122219b = kotlin.enums.b.a(r02);
    }

    SuggestionFilterType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ SuggestionFilterType[] a() {
        return new SuggestionFilterType[]{ALL, STREAM, ONBOARDING};
    }

    public static kotlin.enums.a getEntries() {
        return f122219b;
    }

    public static SuggestionFilterType valueOf(String r1) {
        return (SuggestionFilterType) Enum.valueOf(SuggestionFilterType.class, r1);
    }

    public static SuggestionFilterType[] values() {
        return (SuggestionFilterType[]) f122218a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
