package com.huawei.hms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.huawei.hms.common.internal.Preconditions;

/* loaded from: classes6.dex */
public class ErrDlgFragmentForSupport extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    private Dialog f39030a;

    /* renamed from: b, reason: collision with root package name */
    private DialogInterface.OnCancelListener f39031b;

    public ErrDlgFragmentForSupport() {
        this.f39030a = null;
        this.f39031b = null;
    }

    public static ErrDlgFragmentForSupport newInstance(Dialog r1) {
        return newInstance(r1, null);
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface r2) {
        DialogInterface.OnCancelListener r02 = this.f39031b;
        if (r02 == null) goto L6;
        r02.onCancel(r2);
        return;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle r1) {
        if (this.f39030a != null) goto L6;
        setShowsDialog(false);
    L6:
        return this.f39030a;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager r2, String r3) {
        Preconditions.checkNotNull(r2, "FragmentManager cannot be null!");
        super.show(r2, r3);
    }

    public static ErrDlgFragmentForSupport newInstance(Dialog r2, DialogInterface.OnCancelListener r3) {
        Preconditions.checkNotNull(r2, "Dialog cannot be null!");
        ErrDlgFragmentForSupport r02 = new ErrDlgFragmentForSupport();
        r02.f39030a = r2;
        r2.setOnCancelListener(null);
        r02.f39030a.setOnDismissListener(null);
        r02.f39031b = r3;
        return r02;
    }
}
