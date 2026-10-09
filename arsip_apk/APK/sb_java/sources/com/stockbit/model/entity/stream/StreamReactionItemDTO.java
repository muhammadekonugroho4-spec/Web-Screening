package com.stockbit.model.entity.stream;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0006\u0010\u0014\u001a\u00020\u0005J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0005R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006 "}, d2 = {"Lcom/stockbit/model/entity/stream/StreamReactionItemDTO;", "Landroid/os/Parcelable;", "reaction", "", "total", "", "backgroundColor", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V", "getReaction", "()Ljava/lang/String;", "getTotal", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getBackgroundColor", "component1", "component2", "component3", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Lcom/stockbit/model/entity/stream/StreamReactionItemDTO;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StreamReactionItemDTO implements Parcelable {
    public static final Parcelable.Creator<StreamReactionItemDTO> CREATOR = null;

    @SerializedName("background_color")
    private final String backgroundColor;

    @SerializedName("reaction")
    private final String reaction;

    @SerializedName("total")
    private final Integer total;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final StreamReactionItemDTO a(Parcel r4) {
            p.l(r4, "parcel");
            String r1 = r4.readString();
            if (r4.readInt() != 0) goto L5;
            Integer r2 = null;
        L7:
            return new StreamReactionItemDTO(r1, r2, r4.readString());
        L5:
            r2 = Integer.valueOf(r4.readInt());
            goto L7
        }

        public final StreamReactionItemDTO[] b(int r1) {
            return new StreamReactionItemDTO[r1];
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

    public StreamReactionItemDTO() {
        String r1 = null;
        Integer r2 = null;
        String r3 = null;
        this(r1, r2, r3, 7, null);
    }

    public final String a() {
        return this.backgroundColor;
    }

    public final String b() {
        return this.reaction;
    }

    public final Integer c() {
        return this.total;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof StreamReactionItemDTO) == true) goto L8;
        return false;
    L8:
        StreamReactionItemDTO r52 = (StreamReactionItemDTO) r5;
        if (p.g(this.reaction, r52.reaction) == true) goto L12;
        return false;
    L12:
        if (p.g(this.total, r52.total) == true) goto L15;
        return false;
    L15:
        if (p.g(this.backgroundColor, r52.backgroundColor) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public int hashCode() {
        String r02 = this.reaction;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.total;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        String r23 = this.backgroundColor;
        if (r23 == null) goto L15;
        r1 = r23.hashCode();
    L15:
        return r05 + r1;
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "StreamReactionItemDTO(reaction=" + this.reaction + ", total=" + this.total + ", backgroundColor=" + this.backgroundColor + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r2, int r3) {
        p.l(r2, "dest");
        r2.writeString(this.reaction);
        Integer r32 = this.total;
        if (r32 != null) goto L6;
        int r33 = 0;
    L5:
        r2.writeInt(r33);
        r2.writeString(this.backgroundColor);
        return;
    L6:
        r2.writeInt(1);
        r33 = r32.intValue();
        goto L5
    }

    public StreamReactionItemDTO(String r1, Integer r2, String r3) {
        this.reaction = r1;
        this.total = r2;
        this.backgroundColor = r3;
    }

    public /* synthetic */ StreamReactionItemDTO(String r2, Integer r3, String r4, int r5, i r6) {
        if ((r5 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r5 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r5 & 4) == 0) goto L11;
        r4 = null;
    L11:
        this(r2, r3, r4);
    }
}
