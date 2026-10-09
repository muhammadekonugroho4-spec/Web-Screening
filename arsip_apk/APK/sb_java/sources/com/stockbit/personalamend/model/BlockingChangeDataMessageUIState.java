package com.stockbit.personalamend.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0005J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0016HÖ\u0081\u0004J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/stockbit/personalamend/model/BlockingChangeDataMessageUIState;", "Landroid/os/Parcelable;", "cooldownTimeInMillis", "", "descriptionStringRes", "", "<init>", "(JI)V", "getCooldownTimeInMillis", "()J", "getDescriptionStringRes", "()I", "component1", "component2", Constants.COPY_TYPE, "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "personalamend-contract_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class BlockingChangeDataMessageUIState implements Parcelable {
    public static final Parcelable.Creator<BlockingChangeDataMessageUIState> CREATOR = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f125328c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final long f125329a;

    /* renamed from: b, reason: collision with root package name */
    public final int f125330b;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final BlockingChangeDataMessageUIState a(Parcel r4) {
            p.l(r4, "parcel");
            return new BlockingChangeDataMessageUIState(r4.readLong(), r4.readInt());
        }

        public final BlockingChangeDataMessageUIState[] b(int r1) {
            return new BlockingChangeDataMessageUIState[r1];
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
        f125328c = 8;
    }

    public BlockingChangeDataMessageUIState(long r1, int r3) {
        this.f125329a = r1;
        this.f125330b = r3;
    }

    public final long a() {
        return this.f125329a;
    }

    public final int b() {
        return this.f125330b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r8) {
        if (this != r8) goto L6;
        return true;
    L6:
        if ((r8 instanceof BlockingChangeDataMessageUIState) == true) goto L8;
        return false;
    L8:
        BlockingChangeDataMessageUIState r82 = (BlockingChangeDataMessageUIState) r8;
        if (this.f125329a == r82.f125329a) goto L12;
        return false;
    L12:
        if (this.f125330b == r82.f125330b) goto L14;
        return false;
    L14:
        return true;
    }

    public int hashCode() {
        return (Long.hashCode(this.f125329a) * 31) + Integer.hashCode(this.f125330b);
    }

    public String toString() {
        return "BlockingChangeDataMessageUIState(cooldownTimeInMillis=" + this.f125329a + ", descriptionStringRes=" + this.f125330b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeLong(this.f125329a);
        r3.writeInt(this.f125330b);
    }
}
