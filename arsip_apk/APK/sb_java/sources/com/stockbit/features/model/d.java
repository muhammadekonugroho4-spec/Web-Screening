package com.stockbit.features.model;

import com.clevertap.android.sdk.Constants;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f119117a;

    /* renamed from: b, reason: collision with root package name */
    public final String f119118b;

    public d(String r2, String r3) {
        p.l(r2, Constants.KEY_KEY);
        p.l(r3, com.google.firebase.messaging.Constants.IPC_BUNDLE_KEY_SEND_ERROR);
        this.f119117a = r2;
        this.f119118b = r3;
    }

    public final String a() {
        return this.f119118b;
    }

    public final String b() {
        return this.f119117a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof d) == true) goto L8;
        return false;
    L8:
        d r52 = (d) r5;
        if (p.g(this.f119117a, r52.f119117a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f119118b, r52.f119118b) == true) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (this.f119117a.hashCode() * 31) + this.f119118b.hashCode();
    }

    public String toString() {
        return "RawErrorListItem(key=" + this.f119117a + ", error=" + this.f119118b + ")";
    }
}
