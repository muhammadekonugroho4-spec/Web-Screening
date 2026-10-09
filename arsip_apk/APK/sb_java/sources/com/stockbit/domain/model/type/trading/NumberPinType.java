package com.stockbit.domain.model.type.trading;

import com.gojek.ojosdk.exif.ExifInterface;
import com.google.firebase.perf.FirebasePerformance;
import com.iab.digitalidentity.sdk.core.model.GoPayPlusCameraConfigKt;
import kotlin.Metadata;
import kotlin.enums.b;
import kotlin.jvm.internal.i;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0086\u0081\u0002\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0014B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013¨\u0006\u0015"}, d2 = {"Lcom/stockbit/domain/model/type/trading/NumberPinType;", "", "value", "", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "ZERO", "ONE", "TWO", "THREE", "FOUR", "FIVE", "SIX", "SEVEN", "EIGHT", "NINE", FirebasePerformance.HttpMethod.DELETE, "BIOMETRIC", "Companion", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public enum NumberPinType extends Enum<NumberPinType> {
    public static final NumberPinType BIOMETRIC = null;
    public static final a Companion = null;
    public static final NumberPinType DELETE = null;
    public static final NumberPinType EIGHT = null;
    public static final NumberPinType FIVE = null;
    public static final NumberPinType FOUR = null;
    public static final NumberPinType NINE = null;
    public static final NumberPinType ONE = null;
    public static final NumberPinType SEVEN = null;
    public static final NumberPinType SIX = null;
    public static final NumberPinType THREE = null;
    public static final NumberPinType TWO = null;
    public static final NumberPinType ZERO = null;

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ NumberPinType[] f86500a = null;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ kotlin.enums.a f86501b = null;
    private final String value;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public a() {
        }
    }

    static {
        ZERO = new NumberPinType("ZERO", 0, "0");
        ONE = new NumberPinType("ONE", 1, GoPayPlusCameraConfigKt.SELFIE_EXPERIMENT_OPT_A);
        TWO = new NumberPinType("TWO", 2, "2");
        THREE = new NumberPinType("THREE", 3, ExifInterface.GpsMeasureMode.MODE_3_DIMENSIONAL);
        FOUR = new NumberPinType("FOUR", 4, "4");
        FIVE = new NumberPinType("FIVE", 5, "5");
        SIX = new NumberPinType("SIX", 6, "6");
        SEVEN = new NumberPinType("SEVEN", 7, "7");
        EIGHT = new NumberPinType("EIGHT", 8, "8");
        NINE = new NumberPinType("NINE", 9, "9");
        DELETE = new NumberPinType(FirebasePerformance.HttpMethod.DELETE, 10, "DEL");
        BIOMETRIC = new NumberPinType("BIOMETRIC", 11, "BIO");
        NumberPinType[] r02 = a();
        f86500a = r02;
        f86501b = b.a(r02);
        Companion = new a(null);
    }

    NumberPinType(String r1, int r2, String r3) {
        this.value = r3;
    }

    public static final /* synthetic */ NumberPinType[] a() {
        return new NumberPinType[]{ZERO, ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, DELETE, BIOMETRIC};
    }

    public static kotlin.enums.a getEntries() {
        return f86501b;
    }

    public static NumberPinType valueOf(String r1) {
        return (NumberPinType) Enum.valueOf(NumberPinType.class, r1);
    }

    public static NumberPinType[] values() {
        return (NumberPinType[]) f86500a.clone();
    }

    public final String getValue() {
        return this.value;
    }
}
