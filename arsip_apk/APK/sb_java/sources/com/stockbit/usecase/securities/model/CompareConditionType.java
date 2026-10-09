package com.stockbit.usecase.securities.model;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B!\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0011"}, d2 = {"Lcom/stockbit/usecase/securities/model/CompareConditionType;", "", Constants.KEY_ID, "", "value", "valueInt", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "getValue", "getValueInt", "()I", "GREATER_EQUAL", "LESS_EQUAL", "Companion", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum CompareConditionType extends Enum<CompareConditionType> {
    public static final a Companion = null;
    public static final CompareConditionType GREATER_EQUAL = null;
    public static final CompareConditionType LESS_EQUAL = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ CompareConditionType[] f160319a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f160320b = null;

    /* renamed from: id, reason: collision with root package name */
    private final String f160321id;
    private final String value;
    private final int valueInt;

    public static final class a {
        public /* synthetic */ a(kotlin.jvm.internal.i r1) {
            this();
        }

        public final CompareConditionType a(Integer r7) {
            CompareConditionType[] r02 = CompareConditionType.values();
            int r1 = r02.length;
            int r2 = 0;
        L3:
            if (r2 >= r1) goto L11;
            CompareConditionType r3 = r02[r2];
            int r4 = r3.getValueInt();
            if (r7 == null) goto L10;
            if (r4 != r7.intValue()) goto L10;
        L12:
            if (r3 == null) goto L14;
            return r3;
        L14:
            return CompareConditionType.LESS_EQUAL;
        L10:
            r2 = r2 + 1;
            goto L3
        L11:
            r3 = null;
            goto L12
        }

        public a() {
        }
    }

    static {
        GREATER_EQUAL = new CompareConditionType("GREATER_EQUAL", 0, "GREATER_EQUAL", "≥", 1);
        LESS_EQUAL = new CompareConditionType("LESS_EQUAL", 1, "LESS_EQUAL", "≤", 2);
        CompareConditionType[] r02 = a();
        f160319a = r02;
        f160320b = kotlin.enums.b.a(r02);
        Companion = new a(null);
    }

    CompareConditionType(String r1, int r2, String r3, String r4, int r5) {
        this.f160321id = r3;
        this.value = r4;
        this.valueInt = r5;
    }

    public static final /* synthetic */ CompareConditionType[] a() {
        return new CompareConditionType[]{GREATER_EQUAL, LESS_EQUAL};
    }

    public static kotlin.enums.a getEntries() {
        return f160320b;
    }

    public static CompareConditionType valueOf(String r1) {
        return (CompareConditionType) Enum.valueOf(CompareConditionType.class, r1);
    }

    public static CompareConditionType[] values() {
        return (CompareConditionType[]) f160319a.clone();
    }

    public final String getId() {
        return this.f160321id;
    }

    public final String getValue() {
        return this.value;
    }

    public final int getValueInt() {
        return this.valueInt;
    }
}
