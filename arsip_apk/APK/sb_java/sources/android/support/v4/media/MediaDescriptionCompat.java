package android.support.v4.media;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.b;
import android.support.v4.media.c;
import android.support.v4.media.session.MediaSessionCompat;

/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final String f2019a;

    /* renamed from: b, reason: collision with root package name */
    public final CharSequence f2020b;

    /* renamed from: c, reason: collision with root package name */
    public final CharSequence f2021c;
    public final CharSequence d;

    /* renamed from: e, reason: collision with root package name */
    public final Bitmap f2022e;

    /* renamed from: f, reason: collision with root package name */
    public final Uri f2023f;

    /* renamed from: g, reason: collision with root package name */
    public final Bundle f2024g;

    /* renamed from: h, reason: collision with root package name */
    public final Uri f2025h;

    /* renamed from: i, reason: collision with root package name */
    public Object f2026i;

    public static class a implements Parcelable.Creator {
        public a() {
        }

        public MediaDescriptionCompat a(Parcel r1) {
            return MediaDescriptionCompat.a(android.support.v4.media.b.a(r1));
        }

        public MediaDescriptionCompat[] b(int r1) {
            return new MediaDescriptionCompat[r1];
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object createFromParcel(Parcel r1) {
            return a(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ Object[] newArray(int r1) {
            return b(r1);
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public String f2027a;

        /* renamed from: b, reason: collision with root package name */
        public CharSequence f2028b;

        /* renamed from: c, reason: collision with root package name */
        public CharSequence f2029c;
        public CharSequence d;

        /* renamed from: e, reason: collision with root package name */
        public Bitmap f2030e;

        /* renamed from: f, reason: collision with root package name */
        public Uri f2031f;

        /* renamed from: g, reason: collision with root package name */
        public Bundle f2032g;

        /* renamed from: h, reason: collision with root package name */
        public Uri f2033h;

        public b() {
        }

        public MediaDescriptionCompat a() {
            return new MediaDescriptionCompat(this.f2027a, this.f2028b, this.f2029c, this.d, this.f2030e, this.f2031f, this.f2032g, this.f2033h);
        }

        public b b(CharSequence r1) {
            this.d = r1;
            return this;
        }

        public b c(Bundle r1) {
            this.f2032g = r1;
            return this;
        }

        public b d(Bitmap r1) {
            this.f2030e = r1;
            return this;
        }

        public b e(Uri r1) {
            this.f2031f = r1;
            return this;
        }

        public b f(String r1) {
            this.f2027a = r1;
            return this;
        }

        public b g(Uri r1) {
            this.f2033h = r1;
            return this;
        }

        public b h(CharSequence r1) {
            this.f2029c = r1;
            return this;
        }

        public b i(CharSequence r1) {
            this.f2028b = r1;
            return this;
        }
    }

    static {
        CREATOR = new a();
    }

    public MediaDescriptionCompat(String r1, CharSequence r2, CharSequence r3, CharSequence r4, Bitmap r5, Uri r6, Bundle r7, Uri r8) {
        this.f2019a = r1;
        this.f2020b = r2;
        this.f2021c = r3;
        this.d = r4;
        this.f2022e = r5;
        this.f2023f = r6;
        this.f2024g = r7;
        this.f2025h = r8;
    }

    public static MediaDescriptionCompat a(Object r8) {
        Bundle r02 = null;
        if (r8 == null) goto L22;
        b r1 = new b();
        r1.f(android.support.v4.media.b.f(r8));
        r1.i(android.support.v4.media.b.h(r8));
        r1.h(android.support.v4.media.b.g(r8));
        r1.b(android.support.v4.media.b.b(r8));
        r1.d(android.support.v4.media.b.d(r8));
        r1.e(android.support.v4.media.b.e(r8));
        Bundle r2 = android.support.v4.media.b.c(r8);
        if (r2 == null) goto L7;
        MediaSessionCompat.a(r2);
        Uri r4 = (Uri) r2.getParcelable("android.support.v4.media.description.MEDIA_URI");
    L8:
        if (r4 != null) goto L10;
    L15:
        r02 = r2;
    L16:
        r1.c(r02);
        if (r4 == null) goto L19;
        r1.g(r4);
    L20:
        MediaDescriptionCompat r03 = r1.a();
        r03.f2026i = r8;
        return r03;
    L19:
        r1.g(c.a(r8));
        goto L20
    L10:
        if (r2.containsKey("android.support.v4.media.description.NULL_BUNDLE_FLAG") == true) goto L12;
    L14:
        r2.remove("android.support.v4.media.description.MEDIA_URI");
        r2.remove("android.support.v4.media.description.NULL_BUNDLE_FLAG");
        goto L15
    L12:
        if (r2.size() != 2) goto L14;
    L7:
        r4 = null;
        goto L8
    L22:
        return null;
    }

    public Object b() {
        Object r02 = this.f2026i;
        if (r02 != null) goto L6;
        Object r03 = b.a.b();
        b.a.g(r03, this.f2019a);
        b.a.i(r03, this.f2020b);
        b.a.h(r03, this.f2021c);
        b.a.c(r03, this.d);
        b.a.e(r03, this.f2022e);
        b.a.f(r03, this.f2023f);
        b.a.d(r03, this.f2024g);
        c.a.a(r03, this.f2025h);
        Object r04 = b.a.a(r03);
        this.f2026i = r04;
        return r04;
    L6:
        return r02;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return this.f2020b + ", " + this.f2021c + ", " + this.d;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r2, int r3) {
        android.support.v4.media.b.i(b(), r2, r3);
    }
}
