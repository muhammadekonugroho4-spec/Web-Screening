package com.stockbit.domain.model.entity.roomchat;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.e;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0015\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u000b\u001a\u00020\fJ\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010HÖ\u0083\u0004J\n\u0010\u0011\u001a\u00020\fHÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\u0016\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\fR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\u0005¨\u0006\u0019"}, d2 = {"Lcom/stockbit/domain/model/entity/roomchat/AttributesChatRoom;", "Landroid/os/Parcelable;", "personal", "Lcom/stockbit/domain/model/entity/roomchat/Personal;", "<init>", "(Lcom/stockbit/domain/model/entity/roomchat/Personal;)V", "getPersonal", "()Lcom/stockbit/domain/model/entity/roomchat/Personal;", "setPersonal", "component1", Constants.COPY_TYPE, "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
@e
/* loaded from: classes8.dex */
public final class AttributesChatRoom implements Parcelable {
    public static final Parcelable.Creator<AttributesChatRoom> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public Personal f82803a;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final AttributesChatRoom a(Parcel r3) {
            p.l(r3, "parcel");
            if (r3.readInt() != 0) goto L5;
            Personal r32 = null;
        L7:
            return new AttributesChatRoom(r32);
        L5:
            r32 = Personal.CREATOR.createFromParcel(r3);
            goto L7
        }

        public final AttributesChatRoom[] b(int r1) {
            return new AttributesChatRoom[r1];
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

    public AttributesChatRoom(Personal r1) {
        this.f82803a = r1;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof AttributesChatRoom) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f82803a, ((AttributesChatRoom) r4).f82803a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        Personal r02 = this.f82803a;
        if (r02 != null) goto L7;
        return 0;
    L7:
        return r02.hashCode();
    }

    public String toString() {
        return "AttributesChatRoom(personal=" + this.f82803a + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        Personal r02 = this.f82803a;
        if (r02 != null) goto L6;
        r3.writeInt(0);
        return;
    L6:
        r3.writeInt(1);
        r02.writeToParcel(r3, r4);
    }
}
