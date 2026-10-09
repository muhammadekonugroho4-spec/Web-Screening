package com.fingerprintjs.android.fingerprint.device_id_providers;

import android.content.ContentResolver;
import com.fingerprintjs.android.fingerprint.tools.a;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class AndroidIdProvider {

    /* renamed from: a, reason: collision with root package name */
    public final ContentResolver f37057a;

    public AndroidIdProvider(ContentResolver r2) {
        p.l(r2, "contentResolver");
        this.f37057a = r2;
    }

    public static final /* synthetic */ ContentResolver a(AndroidIdProvider r02) {
        return r02.f37057a;
    }

    public final String b() {
        return (String) a.a(new AndroidIdProvider$getAndroidId$1(this), "");
    }
}
