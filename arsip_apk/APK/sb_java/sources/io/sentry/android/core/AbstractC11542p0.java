package io.sentry.android.core;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

/* renamed from: io.sentry.android.core.p0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11542p0 extends ContentProvider {

    /* renamed from: a, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.k f175567a;

    public AbstractC11542p0() {
        this.f175567a = new io.sentry.android.core.internal.util.k();
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri r1, String r2, String[] r3) {
        this.f175567a.a(this);
        return 0;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri r1, ContentValues r2) {
        this.f175567a.a(this);
        return null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri r1, String[] r2, String r3, String[] r4, String r5) {
        this.f175567a.a(this);
        return null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri r1, ContentValues r2, String r3, String[] r4) {
        this.f175567a.a(this);
        return 0;
    }
}
