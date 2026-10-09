package com.clevertap.android.pushsdk;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.guardsquare.dexguard.height;

/* loaded from: classes4.dex */
public final class setContentView {
    private static char[] Movie = null;
    public static final String onContextItemSelected = null;
    public static final int onOptionsItemSelected = 10003;
    public static final String openContextMenu = null;
    public static final String registerForContextMenu = null;
    public static final boolean setContentView = false;
    public static final String unregisterForContextMenu = null;
    private static int valueOf = 0;
    private static char values = 0;
    private static int width = 1;

    static {
        unregisterForContextMenu();
        Object[] r6 = new Object[1];
        setContentView(5 - KeyEvent.getDeadChar(0, 0), (byte) (ExpandableListView.getPackedPositionType(0) + 123), "\u0018\u0005\u0018\u0004㘤", r6);
        onContextItemSelected = ((String) r6[0]).intern();
        Object[] r62 = new Object[1];
        setContentView((-16777142) - Color.rgb(0, 0, 0), (byte) (54 - TextUtils.getOffsetBefore("", 0)), "\u0001\u001c\b!\f\u001b\b\f\u001b\u0001\r\u0011\r\u001b\b\r\u0004\u000f\"\u0000\u0017\t\u0014\u001d\u0005\u0006\u0016\u0006\u001c\t\u0013\u0019\u0013\u0002\u0002\u0012\u000b\u0017\u0011\u0013#\u000f\u0017\t\u0016\u0006\u001c\t\u0013\u0019\u0013\u0002\u0010\u000e\u000b\u0004\u0010\u000b\u000e\u0019\u0017 \u0010\u0015\r#\u0017\u001b\u0004\u0018\u0001\u0003\u0004\u0018", r62);
        unregisterForContextMenu = ((String) r62[0]).intern();
        Object[] r63 = new Object[1];
        setContentView(Color.rgb(0, 0, 0) + 16777223, (byte) (11 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), "\u0010\u0007\u0016\u0006\u0015\u0017㘊", r63);
        registerForContextMenu = ((String) r63[0]).intern();
        Object[] r3 = new Object[1];
        setContentView(KeyEvent.getDeadChar(0, 0) + 29, (byte) ((SystemClock.elapsedRealtime() > 0 ? 1 : (SystemClock.elapsedRealtime() == 0 ? 0 : -1)) + 72), "\u0011\u001d\u0018\u0002\u0006\u0017\t\u001c\u0007\u0010\u0014\u0015\u0002\u0001\u0017\u0002\f\u000e\u0015#\f\u0005\u0004\u001f\u0014\n\u0017\u0010㘺", r3);
        openContextMenu = ((String) r3[0]).intern();
        int r02 = width + 113;
        valueOf = r02 % 128;
        if ((r02 % 2) != 0) goto L6;
        return;
    L6:
        throw null;
    }

    public setContentView() {
    }

    private static void setContentView(int r10, byte r11, String r12, Object[] r13) {
        if (r12 == null) goto L4;
        char[] r122 = r12.toCharArray();
    L4:
        char[] r123 = r122;
        Object r02 = height.Movie;
        monitor-enter(r02);
        char[] r1 = Movie;     // Catch: Throwable -> L9
        char r2 = values;     // Catch: Throwable -> L9
        char[] r3 = new char[r10];     // Catch: Throwable -> L9
        if ((r10 % 2) == 0) goto L11;
        int r4 = r10 - 1;
        r3[r4] = (char) (r123[r4] - r11);     // Catch: Throwable -> L9
    L13:
        if (r4 <= 1) goto L28;
        height.onOptionsItemSelected = 0;     // Catch: Throwable -> L9
    L15:
        int r7 = height.onOptionsItemSelected;     // Catch: Throwable -> L9
        if (r7 >= r4) goto L28;
        height.unregisterForContextMenu = r123[r7];     // Catch: Throwable -> L9
        height.registerForContextMenu = r123[height.onOptionsItemSelected + 1];     // Catch: Throwable -> L9
        if (height.unregisterForContextMenu != height.registerForContextMenu) goto L20;
        r3[height.onOptionsItemSelected] = (char) (height.unregisterForContextMenu - r11);     // Catch: Throwable -> L9
        r3[height.onOptionsItemSelected + 1] = (char) (height.registerForContextMenu - r11);     // Catch: Throwable -> L9
    L27:
        height.onOptionsItemSelected += 2;
        goto L15
    L20:
        height.setContentView = height.unregisterForContextMenu / r2;     // Catch: Throwable -> L9
        height.onContextItemSelected = height.unregisterForContextMenu % r2;     // Catch: Throwable -> L9
        height.openContextMenu = height.registerForContextMenu / r2;     // Catch: Throwable -> L9
        height.valueOf = height.registerForContextMenu % r2;     // Catch: Throwable -> L9
        if (height.onContextItemSelected != height.valueOf) goto L24;
        height.setContentView = ((height.setContentView + r2) - 1) % r2;     // Catch: Throwable -> L9
        height.openContextMenu = ((height.openContextMenu + r2) - 1) % r2;     // Catch: Throwable -> L9
        int r72 = (height.setContentView * r2) + height.onContextItemSelected;     // Catch: Throwable -> L9
        int r8 = (height.openContextMenu * r2) + height.valueOf;     // Catch: Throwable -> L9
        int r9 = height.onOptionsItemSelected;     // Catch: Throwable -> L9
        r3[r9] = r1[r72];     // Catch: Throwable -> L9
        r3[r9 + 1] = r1[r8];     // Catch: Throwable -> L9
        goto L27
    L24:
        if (height.setContentView != height.openContextMenu) goto L26;
        height.onContextItemSelected = ((height.onContextItemSelected + r2) - 1) % r2;     // Catch: Throwable -> L9
        height.valueOf = ((height.valueOf + r2) - 1) % r2;     // Catch: Throwable -> L9
        int r73 = (height.setContentView * r2) + height.onContextItemSelected;     // Catch: Throwable -> L9
        int r82 = (height.openContextMenu * r2) + height.valueOf;     // Catch: Throwable -> L9
        int r92 = height.onOptionsItemSelected;     // Catch: Throwable -> L9
        r3[r92] = r1[r73];     // Catch: Throwable -> L9
        r3[r92 + 1] = r1[r82];     // Catch: Throwable -> L9
        goto L27
    L26:
        int r74 = (height.setContentView * r2) + height.valueOf;     // Catch: Throwable -> L9
        int r83 = (height.openContextMenu * r2) + height.onContextItemSelected;     // Catch: Throwable -> L9
        int r93 = height.onOptionsItemSelected;     // Catch: Throwable -> L9
        r3[r93] = r1[r74];     // Catch: Throwable -> L9
        r3[r93 + 1] = r1[r83];     // Catch: Throwable -> L9
    L28:
        int r112 = 0;
    L29:
        if (r112 >= r10) goto L31;
        r3[r112] = (char) (r3[r112] ^ 13722);     // Catch: Throwable -> L9
        r112 = r112 + 1;     // Catch: Throwable -> L9
        goto L29
    L31:
        String r102 = new String(r3);     // Catch: Throwable -> L9
        monitor-exit(r02);     // Catch: Throwable -> L9
        r13[0] = r102;
        return;
    L11:
        r4 = r10;
    L9:
        th = move-exception;
        throw th;
    }

    public static void unregisterForContextMenu() {
        Movie = new char[]{13748, 13802, 13737, 13779, 13755, 13812, 13791, 13774, 13810, 13790, 13823, 13817, 13781, 13800, 13768, 13751, 13780, 13822, 13814, 13806, 13819, 13728, 13801, 13813, 13772, 13769, 13815, 13804, 13738, 13739, 13789, 13809, 13777, 13811, 13807, 13794};
        values = 6;
    }
}
