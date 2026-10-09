package com.huawei.secure.android.common.ssl.util;

import android.content.Context;
import android.os.AsyncTask;
import java.io.InputStream;

/* loaded from: classes6.dex */
public class d extends AsyncTask {

    /* renamed from: a, reason: collision with root package name */
    public static final String f39609a = "d";

    static {
    }

    public d() {
    }

    public Boolean a(Context... r7) {
        long r02 = System.currentTimeMillis();
        InputStream r72 = a.m(r7[0]);     // Catch: Exception -> L5
    L7:
        f.b(f39609a, "doInBackground: get bks from hms tss cost : " + (System.currentTimeMillis() - r02) + " ms");
        if (r72 == null) goto L12;
        e.b(r72);
        return Boolean.TRUE;
    L12:
        return Boolean.FALSE;
    L5:
        e = move-exception;
        f.d(f39609a, "doInBackground: exception : " + e.getMessage());
        r72 = null;
        goto L7
    }

    public void b(Boolean r2) {
        if (r2.booleanValue() == false) goto L6;
        f.e(f39609a, "onPostExecute: upate done");
        return;
    L6:
        f.d(f39609a, "onPostExecute: upate failed");
    }

    public void c(Integer... r2) {
        f.e(f39609a, "onProgressUpdate");
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ Object doInBackground(Object[] r1) {
        return a((Context[]) r1);
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onPostExecute(Object r1) {
        b((Boolean) r1);
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        f.b(f39609a, "onPreExecute");
    }

    @Override // android.os.AsyncTask
    public /* bridge */ /* synthetic */ void onProgressUpdate(Object[] r1) {
        c((Integer[]) r1);
    }
}
