package com.stockbit.eipo.ui.compose.underwriter.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0014\u0010\u0013\u001a\u00020\u00062\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0012HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/stockbit/eipo/ui/compose/underwriter/model/UnderwriterChipItemUiState;", "Landroid/os/Parcelable;", "code", "", Constants.KEY_COLOR, "isSelected", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Z)V", "getCode", "()Ljava/lang/String;", "getColor", "()Z", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "eipo_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class UnderwriterChipItemUiState implements Parcelable {
    public static final Parcelable.Creator<UnderwriterChipItemUiState> CREATOR = null;
    public static final int d = 0;

    /* renamed from: a, reason: collision with root package name */
    public final String f90924a;

    /* renamed from: b, reason: collision with root package name */
    public final String f90925b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f90926c;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final UnderwriterChipItemUiState a(Parcel r4) {
            p.l(r4, "parcel");
            String r1 = r4.readString();
            String r2 = r4.readString();
            if (r4.readInt() == 0) goto L5;
            boolean r42 = true;
        L7:
            return new UnderwriterChipItemUiState(r1, r2, r42);
        L5:
            r42 = false;
            goto L7
        }

        public final UnderwriterChipItemUiState[] b(int r1) {
            return new UnderwriterChipItemUiState[r1];
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
        d = 8;
    }

    public UnderwriterChipItemUiState(String r2, String r3, boolean r4) {
        p.l(r2, "code");
        this.f90924a = r2;
        this.f90925b = r3;
        this.f90926c = r4;
    }

    public static /* synthetic */ UnderwriterChipItemUiState b(UnderwriterChipItemUiState r02, String r1, String r2, boolean r3, int r4, Object r5) {
        if ((r4 & 1) == 0) goto L6;
        r1 = r02.f90924a;
    L6:
        if ((r4 & 2) == 0) goto L9;
        r2 = r02.f90925b;
    L9:
        if ((r4 & 4) == 0) goto L12;
        r3 = r02.f90926c;
    L12:
        return r02.a(r1, r2, r3);
    }

    public final UnderwriterChipItemUiState a(String r2, String r3, boolean r4) {
        p.l(r2, "code");
        return new UnderwriterChipItemUiState(r2, r3, r4);
    }

    public final String c() {
        return this.f90924a;
    }

    public final String d() {
        return this.f90925b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        return this.f90926c;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UnderwriterChipItemUiState) == true) goto L8;
        return false;
    L8:
        UnderwriterChipItemUiState r52 = (UnderwriterChipItemUiState) r5;
        if (p.g(this.f90924a, r52.f90924a) == true) goto L12;
        return false;
    L12:
        if (p.g(this.f90925b, r52.f90925b) == true) goto L15;
        return false;
    L15:
        if (this.f90926c == r52.f90926c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = this.f90924a.hashCode() * 31;
        String r1 = this.f90925b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + Boolean.hashCode(this.f90926c);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "UnderwriterChipItemUiState(code=" + this.f90924a + ", color=" + this.f90925b + ", isSelected=" + this.f90926c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f90924a);
        r1.writeString(this.f90925b);
        r1.writeInt(this.f90926c ? 1 : 0);
    }
}
