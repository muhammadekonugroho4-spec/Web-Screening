package com.huawei.hms.core.aidl;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes6.dex */
public class DataBuffer implements Parcelable {
    public static final Parcelable.Creator<DataBuffer> CREATOR = null;
    public String URI;

    /* renamed from: a, reason: collision with root package name */
    private int f39140a;

    /* renamed from: b, reason: collision with root package name */
    private Bundle f39141b;
    public Bundle header;

    public static class a implements Parcelable.Creator<DataBuffer> {
        public a() {
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DataBuffer createFromParcel(Parcel r1) {
            return createFromParcel(r1);
        }

        @Override // android.os.Parcelable.Creator
        public /* bridge */ /* synthetic */ DataBuffer[] newArray(int r1) {
            return newArray(r1);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DataBuffer createFromParcel(Parcel r3) {
            return new DataBuffer(r3, null);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DataBuffer[] newArray(int r1) {
            return new DataBuffer[r1];
        }
    }

    static {
        CREATOR = new a();
    }

    public /* synthetic */ DataBuffer(Parcel r1, a r2) {
        this(r1);
    }

    private static ClassLoader a(Class r02) {
        return r02.getClassLoader();
    }

    public DataBuffer addBody(Bundle r1) {
        this.f39141b = r1;
        return this;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Bundle getBody() {
        return this.f39141b;
    }

    public int getBodySize() {
        if (this.f39141b != null) goto L6;
        return 0;
    L6:
        return 1;
    }

    public int getProtocol() {
        return this.f39140a;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r1, int r2) {
        r1.writeInt(this.f39140a);
        r1.writeString(this.URI);
        r1.writeBundle(this.header);
        r1.writeBundle(this.f39141b);
    }

    private DataBuffer(Parcel r3) {
        this.header = null;
        this.f39140a = 1;
        this.f39141b = null;
        a(r3);
    }

    private void a(Parcel r3) {
        this.f39140a = r3.readInt();
        this.URI = r3.readString();
        this.header = r3.readBundle(a(Bundle.class));
        this.f39141b = r3.readBundle(a(Bundle.class));
    }

    public DataBuffer() {
        this.header = null;
        this.f39140a = 1;
        this.f39141b = null;
    }

    public DataBuffer(String r3) {
        this.header = null;
        this.f39140a = 1;
        this.f39141b = null;
        this.URI = r3;
    }

    public DataBuffer(String r2, int r3) {
        this.header = null;
        this.f39141b = null;
        this.URI = r2;
        this.f39140a = r3;
    }
}
