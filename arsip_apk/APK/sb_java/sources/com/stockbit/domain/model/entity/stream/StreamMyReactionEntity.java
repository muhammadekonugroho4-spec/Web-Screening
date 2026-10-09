package com.stockbit.domain.model.entity.stream;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.stockbit.domain.model.stream.emojireaction.StreamReactionSide;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J)\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0015J\u0014\u0010\u0016\u001a\u00020\u00072\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006 "}, d2 = {"Lcom/stockbit/domain/model/entity/stream/StreamMyReactionEntity;", "Landroid/os/Parcelable;", "side", "Lcom/stockbit/domain/model/stream/emojireaction/StreamReactionSide;", "reaction", "", "oneTap", "", "<init>", "(Lcom/stockbit/domain/model/stream/emojireaction/StreamReactionSide;Ljava/lang/String;Z)V", "getSide", "()Lcom/stockbit/domain/model/stream/emojireaction/StreamReactionSide;", "getReaction", "()Ljava/lang/String;", "getOneTap", "()Z", "component1", "component2", "component3", Constants.COPY_TYPE, "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "domain_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StreamMyReactionEntity implements Parcelable {
    public static final Parcelable.Creator<StreamMyReactionEntity> CREATOR = null;

    /* renamed from: a, reason: collision with root package name */
    public final StreamReactionSide f83676a;

    /* renamed from: b, reason: collision with root package name */
    public final String f83677b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f83678c;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final StreamMyReactionEntity a(Parcel r4) {
            p.l(r4, "parcel");
            StreamReactionSide r1 = StreamReactionSide.valueOf(r4.readString());
            String r2 = r4.readString();
            if (r4.readInt() == 0) goto L5;
            boolean r42 = true;
        L7:
            return new StreamMyReactionEntity(r1, r2, r42);
        L5:
            r42 = false;
            goto L7
        }

        public final StreamMyReactionEntity[] b(int r1) {
            return new StreamMyReactionEntity[r1];
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

    public StreamMyReactionEntity(StreamReactionSide r2, String r3, boolean r4) {
        p.l(r2, "side");
        this.f83676a = r2;
        this.f83677b = r3;
        this.f83678c = r4;
    }

    public final boolean a() {
        return this.f83678c;
    }

    public final String b() {
        return this.f83677b;
    }

    public final StreamReactionSide c() {
        return this.f83676a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof StreamMyReactionEntity) == true) goto L8;
        return false;
    L8:
        StreamMyReactionEntity r52 = (StreamMyReactionEntity) r5;
        if (this.f83676a == r52.f83676a) goto L12;
        return false;
    L12:
        if (p.g(this.f83677b, r52.f83677b) == true) goto L15;
        return false;
    L15:
        if (this.f83678c == r52.f83678c) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        int r02 = this.f83676a.hashCode() * 31;
        String r1 = this.f83677b;
        if (r1 != null) goto L5;
        int r12 = 0;
    L7:
        return ((r02 + r12) * 31) + Boolean.hashCode(this.f83678c);
    L5:
        r12 = r1.hashCode();
        goto L7
    }

    public String toString() {
        return "StreamMyReactionEntity(side=" + this.f83676a + ", reaction=" + this.f83677b + ", oneTap=" + this.f83678c + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "dest");
        r1.writeString(this.f83676a.name());
        r1.writeString(this.f83677b);
        r1.writeInt(this.f83678c ? 1 : 0);
    }

    public /* synthetic */ StreamMyReactionEntity(StreamReactionSide r1, String r2, boolean r3, int r4, i r5) {
        if ((r4 & 4) == 0) goto L5;
        r3 = false;
    L5:
        this(r1, r2, r3);
    }
}
