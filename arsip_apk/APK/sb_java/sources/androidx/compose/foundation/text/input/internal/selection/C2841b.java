package androidx.compose.foundation.text.input.internal.selection;

import android.content.ClipDescription;
import androidx.compose.ui.platform.Z;

/* renamed from: androidx.compose.foundation.text.input.internal.selection.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2841b {

    /* renamed from: a, reason: collision with root package name */
    public final Z f10443a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f10444b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f10445c;

    static {
    }

    public C2841b(Z r1) {
        this.f10443a = r1;
    }

    public final boolean a() {
        return this.f10445c;
    }

    public final Object b(kotlin.coroutines.e r2) {
        boolean r22 = this.f10443a.b().hasPrimaryClip();
        this.f10444b = r22;
        if (r22 == false) goto L9;
        ClipDescription r23 = this.f10443a.b().getPrimaryClipDescription();
        if (r23 == null) goto L9;
        boolean r02 = true;
        if (r23.hasMimeType("text/*") != true) goto L9;
    L10:
        this.f10445c = r02;
        return kotlin.w.f180450a;
    L9:
        r02 = false;
        goto L10
    }
}
