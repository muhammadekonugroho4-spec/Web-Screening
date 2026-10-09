package com.stockbit.alert.ui.mainlist.active;

import androidx.compose.material3.InterfaceC3264o3;
import androidx.compose.material3.SnackbarDuration;

/* loaded from: classes6.dex */
public final class Z implements InterfaceC3264o3 {

    /* renamed from: a, reason: collision with root package name */
    public final String f45514a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f45515b;

    /* renamed from: c, reason: collision with root package name */
    public final String f45516c;
    public final boolean d;

    /* renamed from: e, reason: collision with root package name */
    public final SnackbarDuration f45517e;

    static {
    }

    public Z(String r2, boolean r3) {
        kotlin.jvm.internal.p.l(r2, "message");
        this.f45514a = r2;
        this.f45515b = r3;
        this.d = true;
        this.f45517e = SnackbarDuration.Short;
    }

    @Override // androidx.compose.material3.InterfaceC3264o3
    public boolean a() {
        return this.d;
    }

    @Override // androidx.compose.material3.InterfaceC3264o3
    public String b() {
        return this.f45516c;
    }

    @Override // androidx.compose.material3.InterfaceC3264o3
    public SnackbarDuration c() {
        return this.f45517e;
    }

    public final boolean d() {
        return this.f45515b;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof Z) == true) goto L8;
        return false;
    L8:
        Z r52 = (Z) r5;
        if (kotlin.jvm.internal.p.g(this.f45514a, r52.f45514a) == true) goto L12;
        return false;
    L12:
        if (this.f45515b == r52.f45515b) goto L14;
        return false;
    L14:
        return true;
    }

    @Override // androidx.compose.material3.InterfaceC3264o3
    public String getMessage() {
        return this.f45514a;
    }

    public int hashCode() {
        return (this.f45514a.hashCode() * 31) + Boolean.hashCode(this.f45515b);
    }

    public String toString() {
        return "ActiveAlertSnackbarVisuals(message=" + this.f45514a + ", isError=" + this.f45515b + ')';
    }
}
