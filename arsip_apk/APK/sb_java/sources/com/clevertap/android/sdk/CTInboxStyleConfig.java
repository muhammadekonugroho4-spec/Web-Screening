package com.clevertap.android.sdk;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes4.dex */
public class CTInboxStyleConfig implements Parcelable {
    public static final Parcelable.Creator<CTInboxStyleConfig> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public String f33462a;

    /* renamed from: b, reason: collision with root package name */
    public String f33463b;

    /* renamed from: c, reason: collision with root package name */
    public String f33464c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f33465e;

    /* renamed from: f, reason: collision with root package name */
    public String f33466f;

    /* renamed from: g, reason: collision with root package name */
    public String f33467g;

    /* renamed from: h, reason: collision with root package name */
    public String f33468h;

    /* renamed from: i, reason: collision with root package name */
    public String f33469i;

    /* renamed from: j, reason: collision with root package name */
    public String f33470j;

    /* renamed from: k, reason: collision with root package name */
    public String f33471k;

    /* renamed from: l, reason: collision with root package name */
    public String[] f33472l;

    /* renamed from: m, reason: collision with root package name */
    public String f33473m;

    public class a implements Parcelable.Creator {
        public a() {
        }

        public CTInboxStyleConfig a(Parcel r2) {
            return new CTInboxStyleConfig(r2);
        }

        public CTInboxStyleConfig[] b(int r1) {
            return new CTInboxStyleConfig[r1];
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

    static {
        CREATOR = new a();
    }

    public CTInboxStyleConfig(Parcel r2) {
        this.d = r2.readString();
        this.f33465e = r2.readString();
        this.f33466f = r2.readString();
        this.f33464c = r2.readString();
        this.f33472l = r2.createStringArray();
        this.f33462a = r2.readString();
        this.f33469i = r2.readString();
        this.f33473m = r2.readString();
        this.f33470j = r2.readString();
        this.f33471k = r2.readString();
        this.f33467g = r2.readString();
        this.f33468h = r2.readString();
        this.f33463b = r2.readString();
    }

    public String a() {
        return this.f33462a;
    }

    public String b() {
        return this.f33463b;
    }

    public String c() {
        return this.f33464c;
    }

    public String d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String e() {
        return this.f33465e;
    }

    public String f() {
        return this.f33466f;
    }

    public String g() {
        return this.f33467g;
    }

    public String h() {
        return this.f33468h;
    }

    public String i() {
        return this.f33469i;
    }

    public String j() {
        return this.f33470j;
    }

    public String k() {
        return this.f33471k;
    }

    public ArrayList l() {
        if (this.f33472l != null) goto L7;
        return new ArrayList();
    L7:
        return new ArrayList(Arrays.asList(this.f33472l));
    }

    public String m() {
        return this.f33473m;
    }

    public boolean n() {
        String[] r02 = this.f33472l;
        if (r02 != null) goto L5;
        return false;
    L5:
        if (r02.length <= 0) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeString(this.d);
        r1.writeString(this.f33465e);
        r1.writeString(this.f33466f);
        r1.writeString(this.f33464c);
        r1.writeStringArray(this.f33472l);
        r1.writeString(this.f33462a);
        r1.writeString(this.f33469i);
        r1.writeString(this.f33473m);
        r1.writeString(this.f33470j);
        r1.writeString(this.f33471k);
        r1.writeString(this.f33467g);
        r1.writeString(this.f33468h);
        r1.writeString(this.f33463b);
    }
}
