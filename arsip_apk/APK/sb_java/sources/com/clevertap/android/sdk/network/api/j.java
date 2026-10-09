package com.clevertap.android.sdk.network.api;

import com.google.firebase.messaging.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes4.dex */
public final class j extends i {

    /* renamed from: a, reason: collision with root package name */
    public final String f34672a;

    /* renamed from: b, reason: collision with root package name */
    public final String f34673b;

    public j(String r2, String r3) {
        p.l(r2, Constants.ScionAnalytics.MessageType.DATA_MESSAGE);
        p.l(r3, "iv");
        super(null);
        this.f34672a = r2;
        this.f34673b = r3;
    }

    public final String a() {
        return this.f34672a;
    }

    public final String b() {
        return this.f34673b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof j) == true) goto L8;
        return false;
    L8:
        j r52 = (j) r5;
        if (p.g(this.f34672a, r52.f34672a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f34673b, r52.f34673b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f34672a.hashCode() * 31) + this.f34673b.hashCode();
    }

    public String toString() {
        return "EncryptionSuccess(data=" + this.f34672a + ", iv=" + this.f34673b + ')';
    }
}
