package com.iab.digitalidentity.sdk.core.network.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.clevertap.android.sdk.Constants;
import com.google.gson.annotations.SerializedName;
import d0.g;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\r\u0010\fR.\u0010\u0007\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0002\u0018\u0001`\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"com/iab/digitalidentity/sdk/core/network/model/UnifiedKycResponse$Choice", "Landroid/os/Parcelable;", "", "value", Constants.KEY_TEXT, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "nextQuestions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/ArrayList;)V", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "a", "Ljava/util/ArrayList;", "getNextQuestions", "()Ljava/util/ArrayList;", "OneKycSdk_universalRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UnifiedKycResponse$Choice implements Parcelable {
    public static final Parcelable.Creator<UnifiedKycResponse$Choice> CREATOR = null;

    @SerializedName("nextQuestions")
    private final ArrayList<String> nextQuestions;

    @SerializedName(Constants.KEY_TEXT)
    private final String text;

    @SerializedName("value")
    private final String value;

    static {
        CREATOR = new g();
    }

    public UnifiedKycResponse$Choice(String r2, String r3, ArrayList<String> r4) {
        p.l(r2, "value");
        this.value = r2;
        this.text = r3;
        this.nextQuestions = r4;
    }

    public final String a() {
        return this.text;
    }

    public final String b() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object r5) {
        if (this != r5) goto L6;
        return true;
    L6:
        if ((r5 instanceof UnifiedKycResponse$Choice) == true) goto L8;
        return false;
    L8:
        UnifiedKycResponse$Choice r52 = (UnifiedKycResponse$Choice) r5;
        if (p.g(this.value, r52.value) == true) goto L12;
        return false;
    L12:
        if (p.g(this.text, r52.text) == true) goto L15;
        return false;
    L15:
        if (p.g(this.nextQuestions, r52.nextQuestions) == true) goto L17;
        return false;
    L17:
        return true;
    }

    public final int hashCode() {
        int r02 = this.value.hashCode() * 31;
        String r1 = this.text;
        int r2 = 0;
        if (r1 != null) goto L5;
        int r12 = 0;
    L6:
        int r03 = (r02 + r12) * 31;
        ArrayList<String> r13 = this.nextQuestions;
        if (r13 == null) goto L11;
        r2 = r13.hashCode();
    L11:
        return r03 + r2;
    L5:
        r12 = r1.hashCode();
        goto L6
    }

    public final String toString() {
        return "Choice(value=" + this.value + ", text=" + this.text + ", nextQuestions=" + this.nextQuestions + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel r1, int r2) {
        p.l(r1, "out");
        r1.writeString(this.value);
        r1.writeString(this.text);
        r1.writeStringList(this.nextQuestions);
    }

    public /* synthetic */ UnifiedKycResponse$Choice(String r1, String r2, ArrayList r3, int r4, i r5) {
        if ((r4 & 2) == 0) goto L6;
        r2 = "";
    L6:
        if ((r4 & 4) == 0) goto L8;
        r3 = null;
    L8:
        this(r1, r2, r3);
    }
}
