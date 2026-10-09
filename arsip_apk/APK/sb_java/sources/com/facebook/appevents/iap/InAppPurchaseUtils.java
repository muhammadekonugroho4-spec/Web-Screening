package com.facebook.appevents.iap;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;
import java.lang.reflect.Method;
import java.util.Arrays;
import kotlin.Metadata;

/* loaded from: classes4.dex */
public final class InAppPurchaseUtils {

    /* renamed from: a, reason: collision with root package name */
    public static final InAppPurchaseUtils f35927a = null;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseUtils$BillingClientVersion;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "NONE", "V1", "V2_V4", "V5_V7", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum BillingClientVersion extends Enum<BillingClientVersion> {
        public static final BillingClientVersion NONE = null;
        public static final BillingClientVersion V1 = null;
        public static final BillingClientVersion V2_V4 = null;
        public static final BillingClientVersion V5_V7 = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ BillingClientVersion[] f35928a = null;
        private final String type;

        static {
            NONE = new BillingClientVersion("NONE", 0, "none");
            V1 = new BillingClientVersion("V1", 1, "Android-GPBL-V1");
            V2_V4 = new BillingClientVersion("V2_V4", 2, "Android-GPBL-V2-V4");
            V5_V7 = new BillingClientVersion("V5_V7", 3, "Android-GPBL-V5-V7");
            f35928a = a();
        }

        BillingClientVersion(String r1, int r2, String r3) {
            this.type = r3;
        }

        public static final /* synthetic */ BillingClientVersion[] a() {
            return new BillingClientVersion[]{NONE, V1, V2_V4, V5_V7};
        }

        public static BillingClientVersion valueOf(String r1) {
            return (BillingClientVersion) Enum.valueOf(BillingClientVersion.class, r1);
        }

        public static BillingClientVersion[] values() {
            return (BillingClientVersion[]) f35928a.clone();
        }

        public final String getType() {
            return this.type;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/facebook/appevents/iap/InAppPurchaseUtils$IAPProductType;", "", "type", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getType", "()Ljava/lang/String;", "INAPP", "SUBS", "facebook-core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public enum IAPProductType extends Enum<IAPProductType> {
        public static final IAPProductType INAPP = null;
        public static final IAPProductType SUBS = null;

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ IAPProductType[] f35929a = null;
        private final String type;

        static {
            INAPP = new IAPProductType("INAPP", 0, "inapp");
            SUBS = new IAPProductType("SUBS", 1, "subs");
            f35929a = a();
        }

        IAPProductType(String r1, int r2, String r3) {
            this.type = r3;
        }

        public static final /* synthetic */ IAPProductType[] a() {
            return new IAPProductType[]{INAPP, SUBS};
        }

        public static IAPProductType valueOf(String r1) {
            return (IAPProductType) Enum.valueOf(IAPProductType.class, r1);
        }

        public static IAPProductType[] values() {
            return (IAPProductType[]) f35929a.clone();
        }

        public final String getType() {
            return this.type;
        }
    }

    static {
        f35927a = new InAppPurchaseUtils();
    }

    public InAppPurchaseUtils() {
    }

    public static final Class a(String r3) {
        if (com.facebook.internal.instrument.crashshield.a.d(InAppPurchaseUtils.class) == false) goto L15;
        return null;
    L15:
        kotlin.jvm.internal.p.l(r3, "className");     // Catch: Throwable -> L8
        return Class.forName(r3);
    L10:
        return null;
    L8:
        th = move-exception;
        com.facebook.internal.instrument.crashshield.a.b(th, InAppPurchaseUtils.class);
        return null;
    }

    public static final Class b(Context r3, String r4) {
        if (com.facebook.internal.instrument.crashshield.a.d(InAppPurchaseUtils.class) == false) goto L15;
        return null;
    L15:
        kotlin.jvm.internal.p.l(r3, "context");     // Catch: Throwable -> L8
        kotlin.jvm.internal.p.l(r4, "className");     // Catch: Throwable -> L8
        return r3.getClassLoader().loadClass(r4);
    L10:
        return null;
    L8:
        th = move-exception;
        com.facebook.internal.instrument.crashshield.a.b(th, InAppPurchaseUtils.class);
        return null;
    }

    public static final Method c(Class r3, String r4, Class... r5) {
        if (com.facebook.internal.instrument.crashshield.a.d(InAppPurchaseUtils.class) == false) goto L13;
        return null;
    L13:
        kotlin.jvm.internal.p.l(r3, "clazz");     // Catch: Throwable -> L8
        kotlin.jvm.internal.p.l(r4, "methodName");     // Catch: Throwable -> L8
        kotlin.jvm.internal.p.l(r5, "args");     // Catch: Throwable -> L8
        return r3.getDeclaredMethod(r4, (Class[]) Arrays.copyOf(r5, r5.length));
    L10:
        return null;
    L8:
        th = move-exception;
        com.facebook.internal.instrument.crashshield.a.b(th, InAppPurchaseUtils.class);
        return null;
    }

    public static final Method d(Class r3, String r4, Class... r5) {
        if (com.facebook.internal.instrument.crashshield.a.d(InAppPurchaseUtils.class) == false) goto L13;
        return null;
    L13:
        kotlin.jvm.internal.p.l(r3, "clazz");     // Catch: Throwable -> L8
        kotlin.jvm.internal.p.l(r4, "methodName");     // Catch: Throwable -> L8
        kotlin.jvm.internal.p.l(r5, "args");     // Catch: Throwable -> L8
        return r3.getMethod(r4, (Class[]) Arrays.copyOf(r5, r5.length));
    L10:
        return null;
    L8:
        th = move-exception;
        com.facebook.internal.instrument.crashshield.a.b(th, InAppPurchaseUtils.class);
        return null;
    }

    public static final Object e(Class r3, Method r4, Object r5, Object... r6) {
        if (com.facebook.internal.instrument.crashshield.a.d(InAppPurchaseUtils.class) == false) goto L16;
        return null;
    L16:
        kotlin.jvm.internal.p.l(r3, "clazz");     // Catch: Throwable -> L9
        kotlin.jvm.internal.p.l(r4, FirebaseAnalytics.Param.METHOD);     // Catch: Throwable -> L9
        kotlin.jvm.internal.p.l(r6, "args");     // Catch: Throwable -> L9
        if (r5 == null) goto L18;
        r5 = r3.cast(r5);     // Catch: Throwable -> L9
    L18:
        return r4.invoke(r5, Arrays.copyOf(r6, r6.length));
    L13:
        return null;
    L9:
        th = move-exception;
        com.facebook.internal.instrument.crashshield.a.b(th, InAppPurchaseUtils.class);
        return null;
    }
}
