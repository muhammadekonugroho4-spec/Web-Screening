package com.huawei.hms.ui;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.KeyEvent;
import com.huawei.hms.support.log.HMSLog;
import com.huawei.hms.utils.UIUtil;

/* loaded from: classes6.dex */
public abstract class AbstractDialog {

    /* renamed from: a, reason: collision with root package name */
    private Activity f39486a;

    /* renamed from: b, reason: collision with root package name */
    private AlertDialog f39487b;

    /* renamed from: c, reason: collision with root package name */
    private Callback f39488c;

    public interface Callback {
        void onCancel(AbstractDialog r1);

        void onDoWork(AbstractDialog r1);
    }

    public class a implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractDialog f39489a;

        public a(AbstractDialog r1) {
            this.f39489a = r1;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface r1, int r2) {
            this.f39489a.fireDoWork();
        }
    }

    public class b implements DialogInterface.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractDialog f39490a;

        public b(AbstractDialog r1) {
            this.f39490a = r1;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public void onClick(DialogInterface r1, int r2) {
            this.f39490a.cancel();
        }
    }

    public class c implements DialogInterface.OnCancelListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractDialog f39491a;

        public c(AbstractDialog r1) {
            this.f39491a = r1;
        }

        @Override // android.content.DialogInterface.OnCancelListener
        public void onCancel(DialogInterface r1) {
            this.f39491a.fireCancel();
        }
    }

    public class d implements DialogInterface.OnKeyListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ AbstractDialog f39492a;

        public d(AbstractDialog r1) {
            this.f39492a = r1;
        }

        @Override // android.content.DialogInterface.OnKeyListener
        public boolean onKey(DialogInterface r1, int r2, KeyEvent r3) {
            if (4 == r2) goto L5;
            return false;
        L5:
            if (r3.getAction() != 1) goto L10;
            this.f39492a.cancel();
            return true;
        L10:
            return false;
        }
    }

    public AbstractDialog() {
    }

    public void cancel() {
        AlertDialog r02 = this.f39487b;
        if (r02 == null) goto L6;
        r02.cancel();
        return;
    }

    public void dismiss() {
        AlertDialog r02 = this.f39487b;
        if (r02 == null) goto L6;
        r02.dismiss();
        return;
    }

    public void fireCancel() {
        Callback r02 = this.f39488c;
        if (r02 == null) goto L6;
        r02.onCancel(this);
        return;
    }

    public void fireDoWork() {
        Callback r02 = this.f39488c;
        if (r02 == null) goto L6;
        r02.onDoWork(this);
        return;
    }

    public Activity getActivity() {
        return this.f39486a;
    }

    public int getDialogThemeId() {
        return UIUtil.getDialogThemeId(getActivity());
    }

    public AlertDialog onCreateDialog(Activity r4) {
        AlertDialog.Builder r02 = new AlertDialog.Builder(getActivity(), getDialogThemeId());
        String r1 = onGetTitleString(r4);
        if (r1 == null) goto L5;
        r02.setTitle(r1);
    L5:
        String r12 = onGetMessageString(r4);
        if (r12 == null) goto L8;
        r02.setMessage(r12);
    L8:
        String r13 = onGetPositiveButtonString(r4);
        if (r13 == null) goto L11;
        r02.setPositiveButton(r13, new a(this));
    L11:
        String r42 = onGetNegativeButtonString(r4);
        if (r42 == null) goto L15;
        r02.setNegativeButton(r42, new b(this));
    L15:
        return r02.create();
    }

    public abstract String onGetMessageString(Context r1);

    public abstract String onGetNegativeButtonString(Context r1);

    public abstract String onGetPositiveButtonString(Context r1);

    public abstract String onGetTitleString(Context r1);

    public void setMessage(CharSequence r2) {
        AlertDialog r02 = this.f39487b;
        if (r02 == null) goto L6;
        r02.setMessage(r2);
        return;
    }

    public void setTitle(CharSequence r2) {
        AlertDialog r02 = this.f39487b;
        if (r02 == null) goto L6;
        r02.setTitle(r2);
        return;
    }

    public void show(Activity r1, Callback r2) {
        this.f39486a = r1;
        this.f39488c = r2;
        if (r1 != null) goto L5;
    L9:
        HMSLog.e("AbstractDialog", "In show, The activity is null or finishing.");
        return;
    L5:
        if (r1.isFinishing() == true) goto L9;
        AlertDialog r12 = onCreateDialog(this.f39486a);
        this.f39487b = r12;
        r12.setCanceledOnTouchOutside(false);
        this.f39487b.setOnCancelListener(new c(this));
        this.f39487b.setOnKeyListener(new d(this));
        this.f39487b.show();
    }
}
