package com.google.android.material.stateful;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.g0;
import androidx.customview.view.AbsSavedState;

/* loaded from: classes5.dex */
public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator<ExtendableSavedState> CREATOR = null;
    public final g0 extendableStates;

    static {
        CREATOR = new AnonymousClass1();
    }

    public /* synthetic */ ExtendableSavedState(Parcel r1, ClassLoader r2, AnonymousClass1 r3) {
        this(r1, r2);
    }

    public String toString() {
        return "ExtendableSavedState{" + Integer.toHexString(System.identityHashCode(this)) + " states=" + this.extendableStates + "}";
    }

    @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
    public void writeToParcel(Parcel r6, int r7) {
        super.writeToParcel(r6, r7);
        int r72 = this.extendableStates.size();
        r6.writeInt(r72);
        String[] r02 = new String[r72];
        Bundle[] r1 = new Bundle[r72];
        int r3 = 0;
    L3:
        if (r3 >= r72) goto L5;
        r02[r3] = (String) this.extendableStates.g(r3);
        r1[r3] = (Bundle) this.extendableStates.l(r3);
        r3 = r3 + 1;
        goto L3
    L5:
        r6.writeStringArray(r02);
        r6.writeTypedArray(r1, 0);
    }

    public ExtendableSavedState(Parcelable r1) {
        super(r1);
        this.extendableStates = new g0();
    }

    private ExtendableSavedState(Parcel r6, ClassLoader r7) {
        super(r6, r7);
        int r72 = r6.readInt();
        String[] r02 = new String[r72];
        r6.readStringArray(r02);
        Bundle[] r1 = new Bundle[r72];
        r6.readTypedArray(r1, Bundle.CREATOR);
        this.extendableStates = new g0(r72);
        int r62 = 0;
    L3:
        if (r62 >= r72) goto L5;
        this.extendableStates.put(r02[r62], r1[r62]);
        r62 = r62 + 1;
        goto L3
    }
}
