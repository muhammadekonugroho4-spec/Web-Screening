package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

@SafeParcelable.Class(creator = "WebImageCreator")
/* loaded from: classes5.dex */
public final class WebImage extends AbstractSafeParcelable {
    public static final Parcelable.Creator<WebImage> CREATOR = null;

    @SafeParcelable.VersionField(id = 1)
    final int zaa;

    @SafeParcelable.Field(getter = "getUrl", id = 2)
    private final Uri zab;

    @SafeParcelable.Field(getter = "getWidth", id = 3)
    private final int zac;

    @SafeParcelable.Field(getter = "getHeight", id = 4)
    private final int zad;

    static {
        CREATOR = new zah();
    }

    @SafeParcelable.Constructor
    public WebImage(@SafeParcelable.Param(id = 1) int r1, @SafeParcelable.Param(id = 2) Uri r2, @SafeParcelable.Param(id = 3) int r3, @SafeParcelable.Param(id = 4) int r4) {
        this.zaa = r1;
        this.zab = r2;
        this.zac = r3;
        this.zad = r4;
    }

    public boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if (r5 != null) goto L8;
    L17:
        return false;
    L8:
        if ((r5 instanceof WebImage) == false) goto L17;
        WebImage r52 = (WebImage) r5;
        if (Objects.equal(this.zab, r52.zab) == false) goto L17;
        if (this.zac != r52.zac) goto L17;
        if (this.zad != r52.zad) goto L17;
        return true;
    }

    public int getHeight() {
        return this.zad;
    }

    public Uri getUrl() {
        return this.zab;
    }

    public int getWidth() {
        return this.zac;
    }

    public int hashCode() {
        return Objects.hashCode(new Object[]{this.zab, Integer.valueOf(this.zac), Integer.valueOf(this.zad)});
    }

    @KeepForSdk
    public JSONObject toJson() {
        JSONObject r02 = new JSONObject();
        r02.put("url", this.zab.toString());     // Catch: JSONException -> L5
        r02.put("width", this.zac);     // Catch: JSONException -> L5
        r02.put("height", this.zad);     // Catch: JSONException -> L5
    L4:
        return r02;
    }

    public String toString() {
        return String.format(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.zac), Integer.valueOf(this.zad), this.zab.toString()});
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel r5, int r6) {
        int r02 = this.zaa;
        int r1 = SafeParcelWriter.beginObjectHeader(r5);
        SafeParcelWriter.writeInt(r5, 1, r02);
        SafeParcelWriter.writeParcelable(r5, 2, getUrl(), r6, false);
        SafeParcelWriter.writeInt(r5, 3, getWidth());
        SafeParcelWriter.writeInt(r5, 4, getHeight());
        SafeParcelWriter.finishObjectHeader(r5, r1);
    }

    public WebImage(Uri r2) throws IllegalArgumentException {
        this(r2, 0, 0);
    }

    public WebImage(Uri r2, int r3, int r4) throws IllegalArgumentException {
        this(1, r2, r3, r4);
        if (r2 == null) goto L10;
        if (r3 < 0) goto L8;
        if (r4 < 0) goto L8;
        return;
    L8:
        throw new IllegalArgumentException("width and height must not be negative");
    L10:
        throw new IllegalArgumentException("url cannot be null");
    }

    @KeepForSdk
    public WebImage(JSONObject r5) throws IllegalArgumentException {
        Uri r02 = Uri.EMPTY;
        if (r5.has("url") == true) goto L8;
    L5:
        this(r02, r5.optInt("width", 0), r5.optInt("height", 0));
        return;
    L8:
        r02 = Uri.parse(r5.getString("url"));     // Catch: JSONException -> L7
        goto L5
    }
}
