package com.stockbit.domain.model.valueobject.openingaccount;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007HÆ\u0003J;\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u0012\b\u0002\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0003J\u0014\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u001dHÖ\u0081\u0004J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u001b\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006#"}, d2 = {"Lcom/stockbit/domain/model/valueobject/openingaccount/OAStatusProgress;", "Landroid/os/Parcelable;", Constants.KEY_ENCRYPTION_INAPP_CS, "", "ksei", "bank", "oaVerificationSteps", "", "Lcom/stockbit/domain/model/valueobject/openingaccount/OAVerificationStep;", "<init>", "(IIILjava/util/List;)V", "getCs", "()I", "getKsei", "getBank", "getOaVerificationSteps", "()Ljava/util/List;", "component1", "component2", "component3", "component4", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class OAStatusProgress implements Parcelable {
    public static final Parcelable.Creator<OAStatusProgress> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final int f86899a;

    /* renamed from: b, reason: collision with root package name */
    public final int f86900b;

    /* renamed from: c, reason: collision with root package name */
    public final int f86901c;
    public final List d;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final OAStatusProgress a(Parcel r9) {
            p.l(r9, "parcel");
            int r02 = r9.readInt();
            int r1 = r9.readInt();
            int r2 = r9.readInt();
            ArrayList r4 = null;
            if (r9.readInt() == 0) goto L14;
            int r3 = r9.readInt();
            ArrayList r5 = new ArrayList(r3);
            int r6 = 0;
        L6:
            if (r6 == r3) goto L12;
            if (r9.readInt() != 0) goto L10;
            OAVerificationStep r7 = null;
        L11:
            r5.add(r7);
            r6 = r6 + 1;
            goto L6
        L10:
            r7 = OAVerificationStep.CREATOR.createFromParcel(r9);
            goto L11
        L12:
            r4 = r5;
        L14:
            return new OAStatusProgress(r02, r1, r2, r4);
        }

        public final OAStatusProgress[] b(int r1) {
            return new OAStatusProgress[r1];
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

    public OAStatusProgress(int r1, int r2, int r3, List r4) {
        this.f86899a = r1;
        this.f86900b = r2;
        this.f86901c = r3;
        this.d = r4;
    }

    public final int a() {
        return this.f86901c;
    }

    public final int b() {
        return this.f86899a;
    }

    public final int c() {
        return this.f86900b;
    }

    public final List d() {
        return this.d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof OAStatusProgress) == true) goto L8;
        return false;
    L8:
        OAStatusProgress r52 = (OAStatusProgress) r5;
        if (this.f86899a == r52.f86899a) goto L12;
        return false;
    L12:
        if (this.f86900b == r52.f86900b) goto L15;
        return false;
    L15:
        if (this.f86901c == r52.f86901c) goto L18;
        return false;
    L18:
        if (p.g(this.d, r52.d) == true) goto L20;
        return false;
    L20:
        return true;
    }

    public int hashCode() {
        int r02 = ((((Integer.hashCode(this.f86899a) * 31) + Integer.hashCode(this.f86900b)) * 31) + Integer.hashCode(this.f86901c)) * 31;
        List r1 = this.d;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return r02 + r12;
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "OAStatusProgress(cs=" + this.f86899a + ", ksei=" + this.f86900b + ", bank=" + this.f86901c + ", oaVerificationSteps=" + this.d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r5, int r6) {
        p.l(r5, "dest");
        r5.writeInt(this.f86899a);
        r5.writeInt(this.f86900b);
        r5.writeInt(this.f86901c);
        List r02 = this.d;
        if (r02 != null) goto L6;
        r5.writeInt(0);
        return;
    L6:
        r5.writeInt(1);
        r5.writeInt(r02.size());
        Iterator r03 = r02.iterator();
    L8:
        if (r03.hasNext() == false) goto L13;
        OAVerificationStep r3 = (OAVerificationStep) r03.next();
        if (r3 == null) goto L11;
        r5.writeInt(1);
        r3.writeToParcel(r5, r6);
        goto L8
    L11:
        r5.writeInt(0);
        goto L8
    }
}
