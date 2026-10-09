package com.stockbit.stream.ui.attachmentedit;

import android.os.Bundle;
import androidx.navigation.InterfaceC4094y;
import java.util.Arrays;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes11.dex */
public final class b implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f141748b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f141749c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String[] f141750a;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final b a(Bundle r3) {
            p.l(r3, "bundle");
            r3.setClassLoader(b.class.getClassLoader());
            if (r3.containsKey("attachments") == false) goto L5;
            String[] r32 = r3.getStringArray("attachments");
        L7:
            return new b(r32);
        L5:
            r32 = null;
            goto L7
        }

        public a() {
        }
    }

    static {
        f141748b = new a(null);
        f141749c = 8;
    }

    public b(String[] r1) {
        this.f141750a = r1;
    }

    public static final b fromBundle(Bundle r1) {
        return f141748b.a(r1);
    }

    public final String[] a() {
        return this.f141750a;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof b) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f141750a, ((b) r4).f141750a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        String[] r02 = this.f141750a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return Arrays.hashCode(r02);
    }

    public String toString() {
        return "StreamAttachmentEditDialogArgs(attachments=" + Arrays.toString(this.f141750a) + ')';
    }
}
