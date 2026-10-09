package com.google.android.recaptcha.internal;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.functions.p;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* loaded from: classes5.dex */
final /* synthetic */ class zzif extends FunctionReferenceImpl implements p {
    public static final zzif zza = null;

    static {
        zza = new zzif();
    }

    public zzif() {
        super(2, zzih.class, Constants.KEY_ENCRYPTION_INAPP_CS, "cs([Ljava/lang/Object;)Ljava/lang/Object;", 0);
    }

    @Override // kotlin.jvm.functions.p
    public final /* synthetic */ Object invoke(Object r1, Object r2) {
        return ((zzih) r1).cs((Object[]) r2);
    }
}
