package com.stockbit.usecase.profile.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J1\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0003J\u0014\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006 "}, d2 = {"Lcom/stockbit/usecase/profile/model/ProfileConnectUIState;", "Landroid/os/Parcelable;", "facebook", "", "google", "apple", "twitter", "<init>", "(IIII)V", "getFacebook", "()I", "getGoogle", "getApple", "getTwitter", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "usecase-profile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ProfileConnectUIState implements Parcelable {
    public static final Parcelable.Creator<ProfileConnectUIState> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f159407a;

    /* renamed from: b, reason: collision with root package name */
    public final int f159408b;

    /* renamed from: c, reason: collision with root package name */
    public final int f159409c;
    public final int d;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final ProfileConnectUIState a(Parcel r5) {
            p.l(r5, "parcel");
            return new ProfileConnectUIState(r5.readInt(), r5.readInt(), r5.readInt(), r5.readInt());
        }

        public final ProfileConnectUIState[] b(int r1) {
            return new ProfileConnectUIState[r1];
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

    public ProfileConnectUIState(int r1, int r2, int r3, int r4) {
        this.f159407a = r1;
        this.f159408b = r2;
        this.f159409c = r3;
        this.d = r4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ProfileConnectUIState) == true) goto L8;
        return false;
    L8:
        ProfileConnectUIState r52 = (ProfileConnectUIState) r5;
        if (this.f159407a == r52.f159407a) goto L12;
        return false;
    L12:
        if (this.f159408b == r52.f159408b) goto L15;
        return false;
    L15:
        if (this.f159409c == r52.f159409c) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.f159407a) * 31) + Integer.hashCode(this.f159408b)) * 31) + Integer.hashCode(this.f159409c)) * 31) + Integer.hashCode(this.d);
    }

    public String toString() {
        return "ProfileConnectUIState(facebook=" + this.f159407a + ", google=" + this.f159408b + ", apple=" + this.f159409c + ", twitter=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeInt(this.f159407a);
        r1.writeInt(this.f159408b);
        r1.writeInt(this.f159409c);
        r1.writeInt(this.d);
    }

    public /* synthetic */ ProfileConnectUIState(int r2, int r3, int r4, int r5, int r6, i r7) {
        if ((r6 & 1) == 0) goto L6;
        r2 = 0;
    L6:
        if ((r6 & 2) == 0) goto L9;
        r3 = 0;
    L9:
        if ((r6 & 4) == 0) goto L12;
        r4 = 0;
    L12:
        if ((r6 & 8) == 0) goto L14;
        r5 = 0;
    L14:
        this(r2, r3, r4, r5);
    }
}
