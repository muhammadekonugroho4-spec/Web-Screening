package com.stockbit.model.type;

import kotlin.Metadata;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/stockbit/model/type/CompanyAnalysisPEType;", "", "position", "", "value", "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getPosition", "()I", "getValue", "()Ljava/lang/String;", "PE_STANDARD", "PE_FORWARD", "Companion", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public enum CompanyAnalysisPEType extends Enum<CompanyAnalysisPEType> {
    public static final a Companion = null;
    public static final CompanyAnalysisPEType PE_FORWARD = null;
    public static final CompanyAnalysisPEType PE_STANDARD = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CompanyAnalysisPEType[] f122167a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f122168b = null;
    private final int position;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        PE_STANDARD = new CompanyAnalysisPEType("PE_STANDARD", 0, 0, "PE Band (TTM)");
        PE_FORWARD = new CompanyAnalysisPEType("PE_FORWARD", 1, 1, "Forward PE Band");
        CompanyAnalysisPEType[] r02 = a();
        f122167a = r02;
        f122168b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    CompanyAnalysisPEType(String r1, int r2, int r3, String r4) {
        this.position = r3;
        this.value = r4;
    }

    public static final /* synthetic */ CompanyAnalysisPEType[] a() {
        return new CompanyAnalysisPEType[]{PE_STANDARD, PE_FORWARD};
    }

    public static kotlin.enums.a getEntries() {
        return f122168b;
    }

    public static CompanyAnalysisPEType valueOf(String r1) {
        return (CompanyAnalysisPEType) Enum.valueOf(CompanyAnalysisPEType.class, r1);
    }

    public static CompanyAnalysisPEType[] values() {
        return (CompanyAnalysisPEType[]) f122167a.clone();
    }

    public final int getPosition() {
        return this.position;
    }

    public final String getValue() {
        return this.value;
    }
}
