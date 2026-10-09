package pub.devrel.easypermissions;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.appcompat.app.a;

/* loaded from: classes3.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public String f183343a;

    /* renamed from: b, reason: collision with root package name */
    public String f183344b;

    /* renamed from: c, reason: collision with root package name */
    public int f183345c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public String f183346e;

    /* renamed from: f, reason: collision with root package name */
    public String[] f183347f;

    public f(String r1, String r2, String r3, int r4, int r5, String[] r6) {
        this.f183343a = r1;
        this.f183344b = r2;
        this.f183346e = r3;
        this.f183345c = r4;
        this.d = r5;
        this.f183347f = r6;
    }

    public AlertDialog a(Context r3, DialogInterface.OnClickListener r4) {
        if (this.f183345c <= 0) goto L5;
        AlertDialog.Builder r02 = new AlertDialog.Builder(r3, this.f183345c);
    L7:
        return r02.setCancelable(false).setPositiveButton(this.f183343a, r4).setNegativeButton(this.f183344b, r4).setMessage(this.f183346e).create();
    L5:
        r02 = new AlertDialog.Builder(r3);
        goto L7
    }

    public androidx.appcompat.app.a b(Context r3, DialogInterface.OnClickListener r4) {
        int r02 = this.f183345c;
        if (r02 <= 0) goto L5;
        a.C0026a r1 = new a.C0026a(r3, r02);
    L7:
        return r1.setCancelable(false).setPositiveButton(this.f183343a, r4).setNegativeButton(this.f183344b, r4).setMessage(this.f183346e).create();
    L5:
        r1 = new a.C0026a(r3);
        goto L7
    }

    public Bundle c() {
        Bundle r02 = new Bundle();
        r02.putString("positiveButton", this.f183343a);
        r02.putString("negativeButton", this.f183344b);
        r02.putString("rationaleMsg", this.f183346e);
        r02.putInt("theme", this.f183345c);
        r02.putInt("requestCode", this.d);
        r02.putStringArray("permissions", this.f183347f);
        return r02;
    }

    public f(Bundle r2) {
        this.f183343a = r2.getString("positiveButton");
        this.f183344b = r2.getString("negativeButton");
        this.f183346e = r2.getString("rationaleMsg");
        this.f183345c = r2.getInt("theme");
        this.d = r2.getInt("requestCode");
        this.f183347f = r2.getStringArray("permissions");
    }
}
