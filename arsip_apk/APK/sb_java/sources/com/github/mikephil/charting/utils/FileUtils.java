package com.github.mikephil.charting.utils;

import android.content.res.AssetManager;
import android.os.Environment;
import android.util.Log;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes4.dex */
public class FileUtils {
    private static final String LOG = "MPChart-FileUtils";

    public FileUtils() {
    }

    public static List<BarEntry> loadBarEntriesFromAssets(AssetManager r5, String r6) {
        ArrayList r1 = new ArrayList();
        BufferedReader r2 = null;
        BufferedReader r3 = new BufferedReader(new InputStreamReader(r5.open(r6), "UTF-8"));     // Catch: Throwable -> L16 IOException -> L18
        String r52 = r3.readLine();     // Catch: Throwable -> L8 IOException -> L10
    L5:
        if (r52 == null) goto L12;
        String[] r53 = r52.split("#");     // Catch: Throwable -> L8 IOException -> L10
        r1.add(new BarEntry(Float.parseFloat(r53[1]), Float.parseFloat(r53[0])));     // Catch: Throwable -> L8 IOException -> L10
        r52 = r3.readLine();     // Catch: Throwable -> L8 IOException -> L10
    L12:
        r3.close();     // Catch: IOException -> L14
        return r1;
    L10:
        e = e;
        r2 = r3;
    L19:
        Log.e(LOG, e.toString());     // Catch: Throwable -> L16
        if (r2 == null) goto L30;
        r2.close();     // Catch: IOException -> L14
    L30:
        return r1;
    L8:
        th = th;
        r2 = r3;
    L23:
        if (r2 != null) goto L33;
    L28:
        throw th;
    L33:
        r2.close();     // Catch: IOException -> L26
    L26:
        e = move-exception;
        Log.e(LOG, e.toString());
    L14:
        e = move-exception;
        Log.e(LOG, e.toString());
    L18:
        e = e;
    L16:
        th = th;
        goto L23
    }

    public static List<Entry> loadEntriesFromAssets(AssetManager r7, String r8) {
        ArrayList r1 = new ArrayList();
        BufferedReader r2 = null;
        BufferedReader r3 = new BufferedReader(new InputStreamReader(r7.open(r8), "UTF-8"));     // Catch: Throwable -> L23 IOException -> L25
        String r72 = r3.readLine();     // Catch: Throwable -> L9 IOException -> L11
    L5:
        if (r72 == null) goto L19;
        String[] r73 = r72.split("#");     // Catch: Throwable -> L9 IOException -> L11
        int r4 = 0;
        if (r73.length > 2) goto L13;
        r1.add(new Entry(Float.parseFloat(r73[1]), Float.parseFloat(r73[0])));     // Catch: Throwable -> L9 IOException -> L11
    L17:
        r72 = r3.readLine();     // Catch: Throwable -> L9 IOException -> L11
        goto L5
    L13:
        int r82 = r73.length - 1;     // Catch: Throwable -> L9 IOException -> L11
        float[] r22 = new float[r82];     // Catch: Throwable -> L9 IOException -> L11
    L14:
        if (r4 >= r82) goto L16;
        r22[r4] = Float.parseFloat(r73[r4]);     // Catch: Throwable -> L9 IOException -> L11
        r4 = r4 + 1;     // Catch: Throwable -> L9 IOException -> L11
        goto L14
    L16:
        r1.add(new BarEntry(Integer.parseInt(r73[r73.length - 1]), r22));     // Catch: Throwable -> L9 IOException -> L11
        goto L17
    L19:
        r3.close();     // Catch: IOException -> L21
        return r1;
    L11:
        e = e;
        r2 = r3;
    L26:
        Log.e(LOG, e.toString());     // Catch: Throwable -> L23
        if (r2 == null) goto L36;
        r2.close();     // Catch: IOException -> L21
    L36:
        return r1;
    L9:
        th = th;
        r2 = r3;
    L30:
        if (r2 != null) goto L39;
    L35:
        throw th;
    L39:
        r2.close();     // Catch: IOException -> L33
    L33:
        e = move-exception;
        Log.e(LOG, e.toString());
    L23:
        th = th;
    L25:
        e = e;
    L21:
        e = move-exception;
        Log.e(LOG, e.toString());
        goto L36
    }

    public static List<Entry> loadEntriesFromFile(String r7) {
        File r1 = new File(Environment.getExternalStorageDirectory(), r7);
        ArrayList r72 = new ArrayList();
        BufferedReader r02 = new BufferedReader(new FileReader(r1));     // Catch: IOException -> L9
    L4:
        String r12 = r02.readLine();     // Catch: IOException -> L9
        if (r12 == null) goto L17;
        String[] r13 = r12.split("#");     // Catch: IOException -> L9
        int r4 = 0;
        if (r13.length <= 2) goto L8;
        int r2 = r13.length - 1;     // Catch: IOException -> L9
        float[] r3 = new float[r2];     // Catch: IOException -> L9
    L12:
        if (r4 >= r2) goto L14;
        r3[r4] = Float.parseFloat(r13[r4]);     // Catch: IOException -> L9
        r4 = r4 + 1;     // Catch: IOException -> L9
        goto L12
    L14:
        r72.add(new BarEntry(Integer.parseInt(r13[r13.length - 1]), r3));     // Catch: IOException -> L9
        goto L4
    L8:
        r72.add(new Entry(Float.parseFloat(r13[0]), Integer.parseInt(r13[1])));     // Catch: IOException -> L9
    L17:
        return r72;
    L9:
        e = move-exception;
        Log.e(LOG, e.toString());
        goto L17
    }

    public static void saveToSdCard(List<Entry> r4, String r5) {
        File r1 = new File(Environment.getExternalStorageDirectory(), r5);
        if (r1.exists() == true) goto L20;
        r1.createNewFile();     // Catch: IOException -> L6
    L6:
        e = move-exception;
        Log.e(LOG, e.toString());
    L20:
        BufferedWriter r52 = new BufferedWriter(new FileWriter(r1, true));     // Catch: IOException -> L12
        Iterator<Entry> r42 = r4.iterator();     // Catch: IOException -> L12
    L10:
        if (r42.hasNext() == false) goto L14;
        Entry r12 = r42.next();     // Catch: IOException -> L12
        r52.append(r12.getY() + "#" + r12.getX());     // Catch: IOException -> L12
        r52.newLine();     // Catch: IOException -> L12
        goto L10
    L14:
        r52.close();     // Catch: IOException -> L12
        return;
    L12:
        e = move-exception;
        Log.e(LOG, e.toString());
    }
}
