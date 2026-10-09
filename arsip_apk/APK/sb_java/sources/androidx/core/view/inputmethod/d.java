package androidx.core.view.inputmethod;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final b f23255a;

    public static final class a implements b {

        /* renamed from: a, reason: collision with root package name */
        public final InputContentInfo f23256a;

        public a(Object r1) {
            this.f23256a = (InputContentInfo) r1;
        }

        @Override // androidx.core.view.inputmethod.d.b
        public Object a() {
            return this.f23256a;
        }

        @Override // androidx.core.view.inputmethod.d.b
        public Uri b() {
            return this.f23256a.getContentUri();
        }

        @Override // androidx.core.view.inputmethod.d.b
        public void c() {
            this.f23256a.requestPermission();
        }

        @Override // androidx.core.view.inputmethod.d.b
        public Uri d() {
            return this.f23256a.getLinkUri();
        }

        @Override // androidx.core.view.inputmethod.d.b
        public ClipDescription getDescription() {
            return this.f23256a.getDescription();
        }
    }

    public interface b {
        Object a();

        Uri b();

        void c();

        Uri d();

        ClipDescription getDescription();
    }

    public d(b r1) {
        this.f23255a = r1;
    }

    public static d f(Object r2) {
        if (r2 != null) goto L6;
        return null;
    L6:
        return new d(new a(r2));
    }

    public Uri a() {
        return this.f23255a.b();
    }

    public ClipDescription b() {
        return this.f23255a.getDescription();
    }

    public Uri c() {
        return this.f23255a.d();
    }

    public void d() {
        this.f23255a.c();
    }

    public Object e() {
        return this.f23255a.a();
    }
}
