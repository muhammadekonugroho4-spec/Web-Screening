package com.stockbit.model.entity.stream;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\"\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0012J\u0010\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0019J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010'\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010(J\u0006\u0010)\u001a\u00020\u0005J\u0014\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0083\u0004J\n\u0010.\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010/\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u00100\u001a\u0002012\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u00020\u0005R \u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\"\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\"\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u0015\u001a\u0004\b\u0016\u0010\u0012\"\u0004\b\u0017\u0010\u0014R\"\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010\u001c\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR \u0010\t\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u000e\"\u0004\b\u001e\u0010\u0010R \u0010\n\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0087\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u000e\"\u0004\b \u0010\u0010¨\u00065"}, d2 = {"Lcom/stockbit/model/entity/stream/StreamImageResponseData;", "Landroid/os/Parcelable;", "imagePath", "", "height", "", "width", "ratio", "", "frame", "frameType", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)V", "getImagePath", "()Ljava/lang/String;", "setImagePath", "(Ljava/lang/String;)V", "getHeight", "()Ljava/lang/Integer;", "setHeight", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getWidth", "setWidth", "getRatio", "()Ljava/lang/Float;", "setRatio", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "getFrame", "setFrame", "getFrameType", "setFrameType", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/String;Ljava/lang/String;)Lcom/stockbit/model/entity/stream/StreamImageResponseData;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class StreamImageResponseData implements Parcelable {
    public static final Parcelable.Creator<StreamImageResponseData> CREATOR = null;

    @SerializedName("frame")
    private String frame;

    @SerializedName("frame_type")
    private String frameType;

    @SerializedName("height")
    private Integer height;

    @SerializedName("image")
    private String imagePath;

    @SerializedName("ratio")
    private Float ratio;

    @SerializedName("width")
    private Integer width;

    public static final class a implements Parcelable.Creator {
        public a() {
        }

        public final StreamImageResponseData a(Parcel r9) {
            p.l(r9, "parcel");
            String r2 = r9.readString();
            Float r3 = null;
            if (r9.readInt() != 0) goto L5;
            Integer r02 = null;
        L7:
            if (r9.readInt() != 0) goto L9;
            Integer r4 = null;
        L11:
            if (r9.readInt() != 0) goto L13;
        L12:
            Float r5 = r3;
            return new StreamImageResponseData(r2, r02, r4, r5, r9.readString(), r9.readString());
        L13:
            r3 = Float.valueOf(r9.readFloat());
            goto L12
        L9:
            r4 = Integer.valueOf(r9.readInt());
            goto L11
        L5:
            r02 = Integer.valueOf(r9.readInt());
            goto L7
        }

        public final StreamImageResponseData[] b(int r1) {
            return new StreamImageResponseData[r1];
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

    public StreamImageResponseData() {
        String r1 = null;
        Integer r2 = null;
        Integer r3 = null;
        Float r4 = null;
        String r5 = null;
        String r6 = null;
        this(r1, r2, r3, r4, r5, r6, 63, null);
    }

    public final String a() {
        return this.frame;
    }

    public final String b() {
        return this.frameType;
    }

    public final Integer c() {
        return this.height;
    }

    public final String d() {
        return this.imagePath;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final Float e() {
        return this.ratio;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof StreamImageResponseData) == true) goto L8;
        return false;
    L8:
        StreamImageResponseData r52 = (StreamImageResponseData) r5;
        if (p.g(this.imagePath, r52.imagePath) == true) goto L12;
        return false;
    L12:
        if (p.g(this.height, r52.height) == true) goto L15;
        return false;
    L15:
        if (p.g(this.width, r52.width) == true) goto L18;
        return false;
    L18:
        if (p.g(this.ratio, r52.ratio) == true) goto L21;
        return false;
    L21:
        if (p.g(this.frame, r52.frame) == true) goto L24;
        return false;
    L24:
        if (p.g(this.frameType, r52.frameType) == true) goto L26;
        return false;
    L26:
        return true;
    }

    public final Integer f() {
        return this.width;
    }

    public int hashCode() {
        String r02 = this.imagePath;
        int r1 = 0;
        if (r02 != null) goto L5;
        int r03 = 0;
    L6:
        int r04 = r03 * 31;
        Integer r2 = this.height;
        if (r2 != null) goto L9;
        int r22 = 0;
    L10:
        int r05 = (r04 + r22) * 31;
        Integer r23 = this.width;
        if (r23 != null) goto L13;
        int r24 = 0;
    L14:
        int r06 = (r05 + r24) * 31;
        Float r25 = this.ratio;
        if (r25 != null) goto L17;
        int r26 = 0;
    L18:
        int r07 = (r06 + r26) * 31;
        String r27 = this.frame;
        if (r27 != null) goto L21;
        int r28 = 0;
    L22:
        int r08 = (r07 + r28) * 31;
        String r29 = this.frameType;
        if (r29 == null) goto L27;
        r1 = r29.hashCode();
    L27:
        return r08 + r1;
    L21:
        r28 = r27.hashCode();
        goto L22
    L17:
        r26 = r25.hashCode();
        goto L18
    L13:
        r24 = r23.hashCode();
        goto L14
    L9:
        r22 = r2.hashCode();
        goto L10
    L5:
        r03 = r02.hashCode();
        goto L6
    }

    public String toString() {
        return "StreamImageResponseData(imagePath=" + this.imagePath + ", height=" + this.height + ", width=" + this.width + ", ratio=" + this.ratio + ", frame=" + this.frame + ", frameType=" + this.frameType + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r3, int r4) {
        p.l(r3, "dest");
        r3.writeString(this.imagePath);
        Integer r42 = this.height;
        if (r42 != null) goto L5;
        r3.writeInt(0);
    L6:
        Integer r43 = this.width;
        if (r43 != null) goto L9;
        r3.writeInt(0);
    L10:
        Float r44 = this.ratio;
        if (r44 != null) goto L13;
        r3.writeInt(0);
    L14:
        r3.writeString(this.frame);
        r3.writeString(this.frameType);
        return;
    L13:
        r3.writeInt(1);
        r3.writeFloat(r44.floatValue());
        goto L14
    L9:
        r3.writeInt(1);
        r3.writeInt(r43.intValue());
        goto L10
    L5:
        r3.writeInt(1);
        r3.writeInt(r42.intValue());
        goto L6
    }

    public StreamImageResponseData(String r1, Integer r2, Integer r3, Float r4, String r5, String r6) {
        this.imagePath = r1;
        this.height = r2;
        this.width = r3;
        this.ratio = r4;
        this.frame = r5;
        this.frameType = r6;
    }

    public /* synthetic */ StreamImageResponseData(String r2, Integer r3, Integer r4, Float r5, String r6, String r7, int r8, i r9) {
        if ((r8 & 1) == 0) goto L6;
        r2 = null;
    L6:
        if ((r8 & 2) == 0) goto L9;
        r3 = null;
    L9:
        if ((r8 & 4) == 0) goto L12;
        r4 = null;
    L12:
        if ((r8 & 8) == 0) goto L15;
        r5 = null;
    L15:
        if ((r8 & 16) == 0) goto L18;
        r6 = null;
    L18:
        if ((r8 & 32) == 0) goto L21;
        String r82 = null;
    L20:
        String r72 = r6;
        Float r62 = r5;
        Integer r52 = r4;
        this(r2, r3, r52, r62, r72, r82);
        return;
    L21:
        r82 = r7;
        goto L20
    }
}
