package com.stockbit.usecase.securities.model.type;

import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u0000 \u000e2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0019\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000f"}, d2 = {"Lcom/stockbit/usecase/securities/model/type/LITCompareConditionType;", "", "value", "", Constants.KEY_TEXT, "", "<init>", "(Ljava/lang/String;IILjava/lang/String;)V", "getValue", "()I", "getText", "()Ljava/lang/String;", "AUTOBUY_ABOVE_PRICE", "AUTOBUY_BELOW_PRICE", "Companion", "usecase-securities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public enum LITCompareConditionType extends Enum<LITCompareConditionType> {
    public static final LITCompareConditionType AUTOBUY_ABOVE_PRICE = null;
    public static final LITCompareConditionType AUTOBUY_BELOW_PRICE = null;
    public static final a Companion = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ LITCompareConditionType[] f161895a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f161896b = null;
    private final String text;
    private final int value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        AUTOBUY_ABOVE_PRICE = new LITCompareConditionType("AUTOBUY_ABOVE_PRICE", 0, 1, "≥");
        AUTOBUY_BELOW_PRICE = new LITCompareConditionType("AUTOBUY_BELOW_PRICE", 1, 2, "≤");
        LITCompareConditionType[] r02 = a();
        f161895a = r02;
        f161896b = b.a(r02);
        Companion = new a(null);
    }

    LITCompareConditionType(String r1, int r2, int r3, String r4) {
        this.value = r3;
        this.text = r4;
    }

    public static final /* synthetic */ LITCompareConditionType[] a() {
        return new LITCompareConditionType[]{AUTOBUY_ABOVE_PRICE, AUTOBUY_BELOW_PRICE};
    }

    public static kotlin.enums.a getEntries() {
        return f161896b;
    }

    public static LITCompareConditionType valueOf(String r1) {
        return (LITCompareConditionType) Enum.valueOf(LITCompareConditionType.class, r1);
    }

    public static LITCompareConditionType[] values() {
        return (LITCompareConditionType[]) f161895a.clone();
    }

    public final String getText() {
        return this.text;
    }

    public final int getValue() {
        return this.value;
    }
}
