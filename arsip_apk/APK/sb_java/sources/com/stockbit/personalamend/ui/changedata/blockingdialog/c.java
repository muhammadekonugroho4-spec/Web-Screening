package com.stockbit.personalamend.ui.changedata.blockingdialog;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.navigation.InterfaceC4094y;
import com.stockbit.personalamend.model.BlockingChangeDataMessageUIState;
import java.io.Serializable;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.p;

/* loaded from: classes10.dex */
public final class c implements InterfaceC4094y {

    /* renamed from: b, reason: collision with root package name */
    public static final a f125376b = null;

    /* renamed from: c, reason: collision with root package name */
    public static final int f125377c = 0;

    /* renamed from: a, reason: collision with root package name */
    public final BlockingChangeDataMessageUIState f125378a;

    public static final class a {
        public /* synthetic */ a(i r1) {
            this();
        }

        public final c a(Bundle r4) {
            p.l(r4, "bundle");
            r4.setClassLoader(c.class.getClassLoader());
            if (r4.containsKey("blockingChangeDataMessageUIState") == false) goto L18;
            if (Parcelable.class.isAssignableFrom(BlockingChangeDataMessageUIState.class) == false) goto L7;
        L11:
            BlockingChangeDataMessageUIState r42 = (BlockingChangeDataMessageUIState) r4.get("blockingChangeDataMessageUIState");
            if (r42 == null) goto L16;
            return new c(r42);
        L16:
            throw new IllegalArgumentException("Argument \"blockingChangeDataMessageUIState\" is marked as non-null but was passed a null value.");
        L7:
            if (Serializable.class.isAssignableFrom(BlockingChangeDataMessageUIState.class) == true) goto L11;
            throw new UnsupportedOperationException(BlockingChangeDataMessageUIState.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
        L18:
            throw new IllegalArgumentException("Required argument \"blockingChangeDataMessageUIState\" is missing and does not have an android:defaultValue");
        }

        public a() {
        }
    }

    static {
        f125376b = new a(null);
        f125377c = BlockingChangeDataMessageUIState.f125328c;
    }

    public c(BlockingChangeDataMessageUIState r2) {
        p.l(r2, "blockingChangeDataMessageUIState");
        this.f125378a = r2;
    }

    public static final c fromBundle(Bundle r1) {
        return f125376b.a(r1);
    }

    public final BlockingChangeDataMessageUIState a() {
        return this.f125378a;
    }

    public final Bundle b() {
        Bundle r02 = new Bundle();
        if (Parcelable.class.isAssignableFrom(BlockingChangeDataMessageUIState.class) == false) goto L7;
        BlockingChangeDataMessageUIState r1 = this.f125378a;
        p.j(r1, "null cannot be cast to non-null type android.os.Parcelable");
        r02.putParcelable("blockingChangeDataMessageUIState", r1);
        return r02;
    L7:
        if (Serializable.class.isAssignableFrom(BlockingChangeDataMessageUIState.class) == false) goto L11;
        Parcelable r12 = this.f125378a;
        p.j(r12, "null cannot be cast to non-null type java.io.Serializable");
        r02.putSerializable("blockingChangeDataMessageUIState", (Serializable) r12);
        return r02;
    L11:
        throw new UnsupportedOperationException(BlockingChangeDataMessageUIState.class.getName() + " must implement Parcelable or Serializable or must be an Enum.");
    }

    public boolean equals(Object r4) {
        if (this != r4) goto L6;
        return true;
    L6:
        if ((r4 instanceof c) == true) goto L9;
        return false;
    L9:
        if (p.g(this.f125378a, ((c) r4).f125378a) == true) goto L11;
        return false;
    L11:
        return true;
    }

    public int hashCode() {
        return this.f125378a.hashCode();
    }

    public String toString() {
        return "BlockingPersonalAmendDataChangeDialogArgs(blockingChangeDataMessageUIState=" + this.f125378a + ')';
    }
}
