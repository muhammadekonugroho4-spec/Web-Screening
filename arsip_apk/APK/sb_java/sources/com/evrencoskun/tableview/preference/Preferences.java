package com.evrencoskun.tableview.preference;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes4.dex */
public class Preferences implements Parcelable {
    public static final Parcelable.Creator<Preferences> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public int f35462a;

    /* renamed from: b, reason: collision with root package name */
    public int f35463b;

    /* renamed from: c, reason: collision with root package name */
    public int f35464c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f35465e;

    /* renamed from: f, reason: collision with root package name */
    public int f35466f;

    public static class a implements Parcelable.Creator {
        public a() {
        }

        public Preferences a(Parcel r2) {
            return new Preferences(r2);
        }

        public Preferences[] b(int r1) {
            return new Preferences[r1];
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

    public Preferences() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.f35462a);
        r1.writeInt(this.f35463b);
        r1.writeInt(this.f35464c);
        r1.writeInt(this.d);
        r1.writeInt(this.f35465e);
        r1.writeInt(this.f35466f);
    }

    public Preferences(Parcel r2) {
        this.f35462a = r2.readInt();
        this.f35463b = r2.readInt();
        this.f35464c = r2.readInt();
        this.d = r2.readInt();
        this.f35465e = r2.readInt();
        this.f35466f = r2.readInt();
    }
}
