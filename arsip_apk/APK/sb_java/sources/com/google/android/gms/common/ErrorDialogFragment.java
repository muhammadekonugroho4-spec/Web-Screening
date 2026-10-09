package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import com.google.android.gms.common.internal.Preconditions;

/* loaded from: classes5.dex */
public class ErrorDialogFragment extends DialogFragment {
    private Dialog zaa;
    private DialogInterface.OnCancelListener zab;
    private Dialog zac;

    public ErrorDialogFragment() {
    }

    public static ErrorDialogFragment newInstance(Dialog r1) {
        return newInstance(r1, null);
    }

    @Override // android.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface r2) {
        DialogInterface.OnCancelListener r02 = this.zab;
        if (r02 == null) goto L6;
        r02.onCancel(r2);
        return;
    }

    @Override // android.app.DialogFragment
    public Dialog onCreateDialog(Bundle r2) {
        Dialog r22 = this.zaa;
        if (r22 != null) goto L9;
        setShowsDialog(false);
        if (this.zac != null) goto L8;
        this.zac = new AlertDialog.Builder((Context) Preconditions.checkNotNull(getActivity())).create();
    L8:
        return this.zac;
    L9:
        return r22;
    }

    @Override // android.app.DialogFragment
    public void show(FragmentManager r1, String r2) {
        super.show(r1, r2);
    }

    public static ErrorDialogFragment newInstance(Dialog r2, DialogInterface.OnCancelListener r3) {
        ErrorDialogFragment r02 = new ErrorDialogFragment();
        Dialog r22 = (Dialog) Preconditions.checkNotNull(r2, "Cannot display null dialog");
        r22.setOnCancelListener(null);
        r22.setOnDismissListener(null);
        r02.zaa = r22;
        if (r3 == null) goto L5;
        r02.zab = r3;
    L5:
        return r02;
    }
}
