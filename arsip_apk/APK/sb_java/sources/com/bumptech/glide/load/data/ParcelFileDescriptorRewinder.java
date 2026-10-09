package com.bumptech.glide.load.data;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import com.bumptech.glide.load.data.e;
import java.io.IOException;

/* loaded from: classes4.dex */
public final class ParcelFileDescriptorRewinder implements e {

    /* renamed from: a, reason: collision with root package name */
    public final InternalRewinder f32569a;

    public static final class InternalRewinder {

        /* renamed from: a, reason: collision with root package name */
        public final ParcelFileDescriptor f32570a;

        public InternalRewinder(ParcelFileDescriptor r1) {
            this.f32570a = r1;
        }

        public ParcelFileDescriptor rewind() throws IOException {
            Os.lseek(this.f32570a.getFileDescriptor(), 0, OsConstants.SEEK_SET);     // Catch: ErrnoException -> L5
            return this.f32570a;
        L5:
            e = move-exception;
            throw new IOException(e);
        }
    }

    public static final class a implements e.a {
        public a() {
        }

        @Override // com.bumptech.glide.load.data.e.a
        public Class a() {
            return ParcelFileDescriptor.class;
        }

        @Override // com.bumptech.glide.load.data.e.a
        public /* bridge */ /* synthetic */ e b(Object r1) {
            return c((ParcelFileDescriptor) r1);
        }

        public e c(ParcelFileDescriptor r2) {
            return new ParcelFileDescriptorRewinder(r2);
        }
    }

    public ParcelFileDescriptorRewinder(ParcelFileDescriptor r2) {
        this.f32569a = new InternalRewinder(r2);
    }

    public static boolean c() {
        if ("robolectric".equals(Build.FINGERPRINT) == true) goto L6;
        return true;
    L6:
        return false;
    }

    @Override // com.bumptech.glide.load.data.e
    public /* bridge */ /* synthetic */ Object a() {
        return d();
    }

    @Override // com.bumptech.glide.load.data.e
    public void b() {
    }

    public ParcelFileDescriptor d() {
        return this.f32569a.rewind();
    }
}
