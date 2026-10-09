package com.huawei.hms.common;

import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.DialogInterface;
import android.os.Bundle;
import com.huawei.hms.common.internal.Preconditions;

/* loaded from: classes6.dex */
public class ErrorDialogFragment extends DialogFragment {

    /* renamed from: a, reason: collision with root package name */
    private Dialog f39032a;

    /* renamed from: b, reason: collision with root package name */
    private DialogInterface.OnCancelListener f39033b;

    public ErrorDialogFragment() {
        this.f39032a = null;
        this.f39033b = null;
    }

    public static ErrorDialogFragment newInstance(Dialog r1) {
        return newInstance(r1, null);
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface r2) {
        DialogInterface.OnCancelListener r02 = this.f39033b;
        if (r02 == null) goto L6;
        r02.onCancel(r2);
        return;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle r1) {
        if (this.f39032a != null) goto L6;
        setShowsDialog(false);
    L6:
        return this.f39032a;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager r2, String r3) {
        Preconditions.checkNotNull(r2, "FragmentManager cannot be null!");
        super.show(r2, r3);
    }

    public static ErrorDialogFragment newInstance(Dialog r2, DialogInterface.OnCancelListener r3) {
        Preconditions.checkNotNull(r2, "Dialog cannot be null!");
        ErrorDialogFragment r02 = new ErrorDialogFragment();
        r02.f39032a = r2;
        r2.setOnCancelListener(null);
        r02.f39032a.setOnDismissListener(null);
        if (r3 == null) goto L5;
        r02.f39033b = r3;
    L5:
        return r02;
    }
}
