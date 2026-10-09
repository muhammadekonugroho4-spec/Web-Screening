package com.stockbit.navigation.container;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.stockbit.navigation.NavigationAnimation;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0003J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u001eHÖ\u0081\u0004J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006$"}, d2 = {"Lcom/stockbit/navigation/container/ModularNavParam;", "Landroid/os/Parcelable;", "navGraphId", "", "destinationId", "startDestinationExtra", "Landroid/os/Bundle;", "defaultAnimation", "Lcom/stockbit/navigation/NavigationAnimation;", "<init>", "(IILandroid/os/Bundle;Lcom/stockbit/navigation/NavigationAnimation;)V", "getNavGraphId", "()I", "getDestinationId", "getStartDestinationExtra", "()Landroid/os/Bundle;", "getDefaultAnimation", "()Lcom/stockbit/navigation/NavigationAnimation;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "navigation_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class ModularNavParam implements Parcelable {
    public static final Parcelable.Creator<ModularNavParam> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f122424a;

    /* renamed from: b, reason: collision with root package name */
    public final int f122425b;

    /* renamed from: c, reason: collision with root package name */
    public final Bundle f122426c;
    public final NavigationAnimation d;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final ModularNavParam a(Parcel r6) {
            p.l(r6, "parcel");
            int r1 = r6.readInt();
            int r2 = r6.readInt();
            Bundle r3 = r6.readBundle(ModularNavParam.class.getClassLoader());
            if (r6.readInt() != 0) goto L5;
            NavigationAnimation r62 = null;
        L7:
            return new ModularNavParam(r1, r2, r3, r62);
        L5:
            r62 = NavigationAnimation.valueOf(r6.readString());
            goto L7
        }

        public final ModularNavParam[] b(int r1) {
            return new ModularNavParam[r1];
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

    public ModularNavParam(int r1, int r2, Bundle r3, NavigationAnimation r4) {
        this.f122424a = r1;
        this.f122425b = r2;
        this.f122426c = r3;
        this.d = r4;
    }

    public static /* synthetic */ ModularNavParam b(ModularNavParam r02, int r1, int r2, Bundle r3, NavigationAnimation r4, int r5, Object r6) {
        if ((r5 & 1) == 0) goto L6;
        r1 = r02.f122424a;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r2 = r02.f122425b;
    L9:
        if ((r5 & 4) == 0) goto L12;
        r3 = r02.f122426c;
    L12:
        if ((r5 & 8) == 0) goto L15;
        r4 = r02.d;
    L15:
        return r02.a(r1, r2, r3, r4);
    }

    public final ModularNavParam a(int r2, int r3, Bundle r4, NavigationAnimation r5) {
        return new ModularNavParam(r2, r3, r4, r5);
    }

    public final NavigationAnimation c() {
        return this.d;
    }

    public final int d() {
        return this.f122425b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int e() {
        return this.f122424a;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof ModularNavParam) == true) goto L8;
        return false;
    L8:
        ModularNavParam r52 = (ModularNavParam) r5;
        if (this.f122424a == r52.f122424a) goto L12;
        return false;
    L12:
        if (this.f122425b == r52.f122425b) goto L15;
        return false;
    L15:
        if (p.g(this.f122426c, r52.f122426c) == true) goto L18;
        return false;
    L18:
        if (this.d == r52.d) goto L20;
        return false;
    L20:
        return true;
    }

    public final Bundle f() {
        return this.f122426c;
    }

    public int hashCode() {
        int r02 = ((Integer.hashCode(this.f122424a) * 31) + Integer.hashCode(this.f122425b)) * 31;
        Bundle r1 = this.f122426c;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        NavigationAnimation r13 = this.d;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public String toString() {
        return "ModularNavParam(navGraphId=" + this.f122424a + ", destinationId=" + this.f122425b + ", startDestinationExtra=" + this.f122426c + ", defaultAnimation=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        p.l(r2, "dest");
        r2.writeInt(this.f122424a);
        r2.writeInt(this.f122425b);
        r2.writeBundle(this.f122426c);
        NavigationAnimation r32 = this.d;
        if (r32 != null) goto L6;
        r2.writeInt(0);
        return;
    L6:
        r2.writeInt(1);
        r2.writeString(r32.name());
    }

    public /* synthetic */ ModularNavParam(int r2, int r3, Bundle r4, NavigationAnimation r5, int r6, i r7) {
        if ((r6 & 2) == 0) goto L6;
        r3 = -1;
    L6:
        if ((r6 & 4) == 0) goto L9;
        r4 = null;
    L9:
        if ((r6 & 8) == 0) goto L11;
        r5 = null;
    L11:
        this(r2, r3, r4, r5);
    }
}
