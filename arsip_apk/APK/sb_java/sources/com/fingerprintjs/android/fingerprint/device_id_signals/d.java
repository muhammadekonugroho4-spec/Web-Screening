package com.fingerprintjs.android.fingerprint.device_id_signals;

import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class d extends b {

    /* renamed from: a, reason: collision with root package name */
    public final String f37067a;

    public d(String r2) {
        p.l(r2, "value");
        super(null);
        this.f37067a = r2;
    }

    @Override // com.fingerprintjs.android.fingerprint.device_id_signals.b
    public String a() {
        return b();
    }

    public String b() {
        return this.f37067a;
    }
}
