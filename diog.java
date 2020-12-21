//
// Decompiled by Jadx - 1683ms
//
package mutil;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Process;
import android.preference.PreferenceManager;
import android.text.Html;
import android.util.Base64;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

public class OnlineDialog extends AsyncTask<String, Exception, ︁> implements DialogInterface.OnClickListener {
    private static OnlineDialog 　 = new OnlineDialog();
    private static SharedPreferences 　　;
    private static boolean 　︀ = false;
    private static Activity ︁;

    public OnlineDialog() {
    }

    static /* synthetic */ Activity 　() {
        return ︁;
    }

    protected /* synthetic */ Object doInBackground(Object[] objArr) {
        return 　((String[]) objArr);
    }

    protected /* synthetic */ void onPostExecute(Object obj) {
        AlertDialog.Builder builder;
        OnlineDialog onlineDialog;
        ︁ r7 = (︁) obj;
        super.onPostExecute(r7);
        if (r7 != null && !r7.︀　.equals("关")) {
            if (!r7.︀︁.startsWith("开") || !︁.　︁.equals(︁.︀︀)) {
                String str = r7.︁　;
                Activity activity = ︁;
                if (str.equals(　　("pXT6My4gTj82NxGYm3VW2w=="))) {
                    builder = new AlertDialog.Builder(activity, 5);
                } else if (str.equals(　　("qqYqjpPJDuzNkTREGtjyLw=="))) {
                    builder = new AlertDialog.Builder(activity, 4);
                } else if (str.equalsIgnoreCase(　　("uH67aS+UuGLYpIqLEsFD/g=="))) {
                    builder = new AlertDialog.Builder(activity, 3);
                } else if (str.equalsIgnoreCase(　　("ExuTjIN13KU3QHCSgVZ5Pw=="))) {
                    builder = new AlertDialog.Builder(activity, 2);
                } else if (str.equals(　　("cgNoU3WYHfLgHQk8tA2CzQ=="))) {
                    builder = new AlertDialog.Builder(activity, 1);
                } else {
                    builder = new AlertDialog.Builder(activity);
                }
                builder.setTitle(Html.fromHtml(r7.　︀︀)).setMessage(Html.fromHtml(r7.　︁　));
                if (r7.　　︀.equals("关")) {
                    onlineDialog = this;
                } else {
                    builder.setPositiveButton(r7.　︁︁, this);
                    onlineDialog = this;
                }
                if (!r7.　　︁.equals("关")) {
                    builder.setNegativeButton(r7.︀︁︀, onlineDialog);
                }
                if (!r7.︁︀︀.equals("关")) {
                    builder.setNeutralButton(r7.︀︀　, onlineDialog);
                }
                AlertDialog create = builder.create();
                if (r7.　︁︀.equals("关")) {
                    create.setCanceledOnTouchOutside(false);
                }
                if (r7.︁︁.equals("开")) {
                    create.getWindow().setDimAmount(0.0f);
                }
                create.show();
                if (r7.︁︀.equals("开")) {
                    try {
                        Field declaredField = create.getClass().getSuperclass().getDeclaredField("mShowing");
                        declaredField.setAccessible(true);
                        declaredField.set(create, Boolean.FALSE);
                    } catch (Exception e) {
                        publishProgress(new Exception[]{e});
                    }
                }
                try {
                    Field declaredField2 = AlertDialog.class.getDeclaredField("mAlert");
                    declaredField2.setAccessible(true);
                    Object obj2 = declaredField2.get(create);
                    Field declaredField3 = obj2.getClass().getDeclaredField("mTitleView");
                    declaredField3.setAccessible(true);
                    TextView textView = (TextView) declaredField3.get(obj2);
                    if (textView != null) {
                        textView.setTextColor(Color.parseColor(r7.　︀　));
                    }
                    Field declaredField4 = obj2.getClass().getDeclaredField("mMessageView");
                    declaredField4.setAccessible(true);
                    TextView textView2 = (TextView) declaredField4.get(obj2);
                    if (textView2 != null) {
                        textView2.setTextColor(Color.parseColor(r7.　︀︁));
                    }
                } catch (Exception e2) {
                    publishProgress(new Exception[]{e2});
                }
                try {
                    create.getButton(-1).setTextColor(Color.parseColor(r7.　　　));
                } catch (Exception e3) {
                    publishProgress(new Exception[]{e3});
                }
                try {
                    create.getButton(-2).setTextColor(Color.parseColor(r7.︀︀︀));
                } catch (Exception e4) {
                    publishProgress(new Exception[]{e4});
                }
                try {
                    create.getButton(-3).setTextColor(Color.parseColor(r7.︁︁︀));
                } catch (Exception e5) {
                    publishProgress(new Exception[]{e5});
                }
            }
        }
    }

    protected /* synthetic */ void onProgressUpdate(Object[] objArr) {
        Exception[] excArr = (Exception[]) objArr;
        super.onProgressUpdate(excArr);
        Exception exc = excArr[0];
        String stackTraceString = Log.getStackTraceString(exc);
        if (　︀ && excArr != null && exc != null && !stackTraceString.isEmpty()) {
            new AlertDialog.Builder(︁).setTitle(　　("DMDohhFHQ94eW0MXxQBNmQ==")).setMessage(stackTraceString).setPositiveButton("复制", new 　(this, stackTraceString)).setNegativeButton("取消", (DialogInterface.OnClickListener) null).create().show();
        }
    }

    static {
        Log.d("OnlineDialog", "6.5");
    }

    public static final void show(Activity activity, String str) {
        ︁ = activity;
        　　 = PreferenceManager.getDefaultSharedPreferences(activity);
        try {
            String str2 = new String(Base64.decode(str.getBytes("UTF-8"), 0), "UTF-8");
            if (str2.contains("ttp")) {
                str = str2;
            }
        } catch (Exception e) {
        }
        try {
            if (str.startsWith("Eh")) {
                　︀ = true;
            } else {
                　︀ = false;
            }
            Class.forName("android.os.AsyncTask");
            　.execute(new String[]{str.replace("Ehttp", "http")});
        } catch (Exception e2) {
        }
    }

    public static final void showAlways(Activity activity, String str) {
        ︁ = activity;
        　　 = PreferenceManager.getDefaultSharedPreferences(activity);
        try {
            String str2 = new String(Base64.decode(str.getBytes("UTF-8"), 0), "UTF-8");
            if (str2.contains("ttp")) {
                str = str2;
            }
        } catch (Exception e) {
        }
        try {
            if (str.startsWith("Eh")) {
                　︀ = true;
            } else {
                　︀ = false;
            }
            Class.forName("android.os.AsyncTask");
            new OnlineDialog().execute(new String[]{str.replace("Ehttp", "http")});
        } catch (Exception e2) {
        }
    }

    protected void onPreExecute() {
        super.onPreExecute();
    }

    private ︁ 　(String[] strArr) {
        ︁ r0;
        String str = strArr[0];
        if (str == null || str.trim().isEmpty() || !str.contains("ttp")) {
            publishProgress(new Exception[]{new Exception(　　("QWJrEn1bge8ZMsWxf66kbs8LhqOASMd/reU+j+OFEKA=") + str)});
            return null;
        }
        try {
            String r2 = ︁(str);
            if (r2 == null || r2.trim().isEmpty()) {
                publishProgress(new Exception[]{new Exception(　　("yoV9BydWjHbXaVgn5XC9yNn20iDOtUExz7IiOH/nddytCanTZRKWLHsaELlaaC0X"))});
                return null;
            }
            try {
                if (!r2.contains(　　("fQjidHAOPJqFHfngYLI3v1wPHRz8NgNqEUnEVN1Tho0=")) || !r2.contains(　　("bAL5WjbI1JyMNkbXljC1ijfLK/FERzZ8zXkzDIwMdR4="))) {
                    throw new Exception(　　("WYOdLZ4Bd86/i8DZ3K9TW7zYIw3v2j+01nfCPWcPEmb/UazFNCTQqu3/v/emt38v"));
                }
                r0 = new ︁();
                int lastIndexOf = r2.lastIndexOf(　　("fQjidHAOPJqFHfngYLI3v1wPHRz8NgNqEUnEVN1Tho0="));
                int lastIndexOf2 = r2.lastIndexOf(　　("bAL5WjbI1JyMNkbXljC1ijfLK/FERzZ8zXkzDIwMdR4="), lastIndexOf);
                if (lastIndexOf2 == -1) {
                    throw new Exception("糟糕 配置不完整");
                }
                ︁.　 = r2.substring(lastIndexOf2, lastIndexOf).replace("\\\"", "\"").replace("&lt;", "<").replace("&gt;", ">").replace("<br  />", "<br>").replace("\\u003C", "<").replace("<p><br></p>", "<p></p>").replace("</div><div>", "<br>").replace("</p><p>", "<br>");
                r0.︀　 = 　︀(　　("VK2kF9OtXAgIb25z5BnYhQ=="));
                r0.︀︁ = 　︀(　　("ouxl+IhS4IE7mUArEpJRLg=="));
                ︁.　︁ = 　︀(　　("2BJqH++xYpnn4doM1V5mbQ=="));
                String str2 = ︁.getPackageManager().getPackageInfo(︁.getPackageName(), 0).versionName;
                SharedPreferences sharedPreferences = 　　;
                if (str2 == null || str2.isEmpty()) {
                    str2 = "";
                }
                ︁.︀︀ = sharedPreferences.getString("dialogVer", str2);
                r0.︁︀ = 　︀(　　("X/3ekiU6vxvA5Ru5yG4rhg=="));
                r0.　︁︀ = 　︀(　　("tkGM0jJ16AW5wwauWhI3S3wNjsy1OJLZGhmifJ/iGKM="));
                r0.︁　 = 　︀(　　("Dz++jdGW+FWlFi90eS4PfQ=="));
                r0.︁︁ = 　︀(　　("+W2iea6BxkygPR5IclJ+rPRTlk6Wzb9FTCo/PWd/mRY="));
                r0.　︀︀ = 　︀(　　("5h734NuUBysnQfajDejRaw=="));
                r0.　︀　 = 　︀(　　("Ap2kLC3wET/CUqmiRikA9g=="));
                r0.　︁　 = 　︀(　　("ECtq4EekCzco7k289USJ0A=="));
                r0.　︀︁ = 　︀(　　("VR/2eD5Z/QXNr9m80uZDzg=="));
                r0.　　︀ = 　︀(　　("UjcsfBHKo+Zt2EHb3APrbQ=="));
                r0.　︁︁ = 　︀(　　("0XHthsQb2Gz30O5jWu8xeDyMFvfdS2x2KS/mqA0K5Qg="));
                r0.　　　 = 　︀(　　("2x8oLGaQ9uzZyyed8ZBi2zJuXPHGmW6P0L5b/ooyjgk="));
                ︁.︁ = 　︀(　　("rOra5OKPNR7ihKz2CKhRx+CbQfT8AWTqD64HZfjthFc="));
                r0.　　︁ = 　︀(　　("f6RVqkzETVpW/7xv+inmNQ=="));
                r0.︀︁︀ = 　︀(　　("Ek3/t9Su7Si4y23W05kxgHqxutY1AH4qhkxzPOAiG3E="));
                r0.︀︀︀ = 　︀(　　("X0imWVJ1C6Cqr9BdkHmNXZaYCZnI49QlgX2s+pA013k="));
                ︁.　︀ = 　︀(　　("JGDp9BDOJj0zJe4h+lpf2J40qNt8CVGXPE+Kra0XX/M="));
                r0.︁︀︀ = 　︀(　　("xqinNCBsymrb4aZJPsx7pg=="));
                r0.︀︀　 = 　︀(　　("XSgmDH6Id9jzp4VhdWSTy0QNAkKYDBKff94bJncMJUI="));
                r0.︁︁︀ = 　︀(　　("TrQkJ+PxmCvCTo102I6A2l+8XZmcYEuZBBhZzvmLMR8="));
                ︁.　　 = 　︀(　　("Bjv5dW1Ry+/jW91jDuQjZNljCb/zuovZnah7M8P2/+U="));
                return r0;
            } catch (Exception e) {
                publishProgress(new Exception[]{e});
                r0 = null;
            }
        } catch (Exception e2) {
            publishProgress(new Exception[]{e2});
            return null;
        }
    }

    public void onClick(DialogInterface dialogInterface, int i) {
        String substring;
        String str;
        String substring2;
        String str2;
        String substring3;
        String trim = ︁.︁.trim();
        String trim2 = ︁.　︀.trim();
        String trim3 = ︁.　　.trim();
        switch (i) {
            case -3:
                if (trim3.startsWith(　　("ZGr1WYZWKxy1f/1Csjl30A=="))) {
                    try {
                        Field declaredField = dialogInterface.getClass().getSuperclass().getDeclaredField("mShowing");
                        declaredField.setAccessible(true);
                        declaredField.set(dialogInterface, Boolean.TRUE);
                        return;
                    } catch (Exception e) {
                        Toast.makeText(︁, e.toString(), 1).show();
                        return;
                    }
                } else if (trim3.startsWith(　　("IBxPZUTTYVDzaT/o7+RBgQ=="))) {
                    try {
                        ︁.finish();
                        Process.killProcess(Process.myPid());
                        System.exit(0);
                        return;
                    } catch (Exception e2) {
                        Toast.makeText(︁, e2.toString(), 1).show();
                        return;
                    }
                } else if (trim3.startsWith(　　("NgJerjRix2BLCFv3oVoFbg=="))) {
                    try {
                        if (trim3.contains(　　("aBK2OxI211VfDrrmSw3Pfg=="))) {
                            Toast.makeText(︁, trim3.substring(trim3.indexOf(　　("aBK2OxI211VfDrrmSw3Pfg==")) + 2), 1).show();
                        }
                        　　.edit().putString("dialogVer", ︁.　︁).apply();
                        Field declaredField2 = dialogInterface.getClass().getSuperclass().getDeclaredField("mShowing");
                        declaredField2.setAccessible(true);
                        declaredField2.set(dialogInterface, Boolean.TRUE);
                        return;
                    } catch (Exception e3) {
                        Toast.makeText(︁, e3.toString(), 1).show();
                        return;
                    }
                } else if (trim3.startsWith(　　("EYMk2mRaRH8BSPyJLiFK8A=="))) {
                    try {
                        if (trim3.contains(　　("aBK2OxI211VfDrrmSw3Pfg=="))) {
                            Toast.makeText(︁, trim3.substring(trim3.indexOf(　　("aBK2OxI211VfDrrmSw3Pfg==")) + 2), 1).show();
                            trim3 = trim3.substring(0, trim3.indexOf(　　("aBK2OxI211VfDrrmSw3Pfg==")));
                        }
                        if (!trim3.contains("href=")) {
                            substring = trim3.substring(2);
                        } else {
                            substring = trim3.substring(trim3.lastIndexOf("\">") + 2, trim3.lastIndexOf("</a>"));
                        }
                        ︁.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(substring)));
                        return;
                    } catch (Exception e4) {
                        Toast.makeText(︁, e4.toString(), 1).show();
                        return;
                    }
                } else if (trim3.startsWith(　　("aBK2OxI211VfDrrmSw3Pfg=="))) {
                    try {
                        Toast.makeText(︁, trim3.substring(2), 1).show();
                        return;
                    } catch (Exception e5) {
                        Toast.makeText(︁, e5.toString(), 1).show();
                        return;
                    }
                } else if (trim3.startsWith("QQ") || trim3.startsWith("qq")) {
                    　(trim3);
                    return;
                } else {
                    return;
                }
            case -2:
                if (trim2.startsWith(　　("ZGr1WYZWKxy1f/1Csjl30A=="))) {
                    try {
                        Field declaredField3 = dialogInterface.getClass().getSuperclass().getDeclaredField("mShowing");
                        declaredField3.setAccessible(true);
                        declaredField3.set(dialogInterface, Boolean.TRUE);
                        return;
                    } catch (Exception e6) {
                        Toast.makeText(︁, e6.toString(), 1).show();
                        return;
                    }
                } else if (trim2.startsWith(　　("IBxPZUTTYVDzaT/o7+RBgQ=="))) {
                    try {
                        ︁.finish();
                        Process.killProcess(Process.myPid());
                        System.exit(0);
                        return;
                    } catch (Exception e7) {
                        Toast.makeText(︁, e7.toString(), 1).show();
                        return;
                    }
                } else if (trim2.startsWith(　　("NgJerjRix2BLCFv3oVoFbg=="))) {
                    try {
                        if (trim2.contains(　　("aBK2OxI211VfDrrmSw3Pfg=="))) {
                            Toast.makeText(︁, trim2.substring(trim2.indexOf(　　("aBK2OxI211VfDrrmSw3Pfg==")) + 2), 1).show();
                        }
                        　　.edit().putString("dialogVer", ︁.　︁).apply();
                        Field declaredField4 = dialogInterface.getClass().getSuperclass().getDeclaredField("mShowing");
                        declaredField4.setAccessible(true);
                        declaredField4.set(dialogInterface, Boolean.TRUE);
                        return;
                    } catch (Exception e8) {
                        Toast.makeText(︁, e8.toString(), 1).show();
                        return;
                    }
                } else if (trim2.startsWith(　　("EYMk2mRaRH8BSPyJLiFK8A=="))) {
                    try {
                        if (trim2.contains(　　("aBK2OxI211VfDrrmSw3Pfg=="))) {
                            Toast.makeText(︁, trim2.substring(trim2.indexOf(　　("aBK2OxI211VfDrrmSw3Pfg==")) + 2), 1).show();
                            str = trim2.substring(0, trim2.indexOf(　　("aBK2OxI211VfDrrmSw3Pfg==")));
                        } else {
                            str = trim2;
                        }
                        if (!str.contains("href=")) {
                            substring2 = str.substring(2);
                        } else {
                            substring2 = str.substring(str.lastIndexOf("\">") + 2, str.lastIndexOf("</a>"));
                        }
                        ︁.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(substring2)));
                        return;
                    } catch (Exception e9) {
                        Toast.makeText(︁, e9.toString(), 1).show();
                        return;
                    }
                } else if (trim2.startsWith(　　("aBK2OxI211VfDrrmSw3Pfg=="))) {
                    try {
                        Toast.makeText(︁, trim2.substring(2), 1).show();
                        return;
                    } catch (Exception e10) {
                        Toast.makeText(︁, e10.toString(), 1).show();
                        return;
                    }
                } else if (trim2.startsWith("QQ") || trim2.startsWith("qq")) {
                    　(trim2);
                    return;
                } else {
                    return;
                }
            case -1:
                if (trim.startsWith(　　("ZGr1WYZWKxy1f/1Csjl30A=="))) {
                    try {
                        Field declaredField5 = dialogInterface.getClass().getSuperclass().getDeclaredField("mShowing");
                        declaredField5.setAccessible(true);
                        declaredField5.set(dialogInterface, Boolean.TRUE);
                        return;
                    } catch (Exception e11) {
                        Toast.makeText(︁, e11.toString(), 1).show();
                        return;
                    }
                } else if (trim.startsWith(　　("IBxPZUTTYVDzaT/o7+RBgQ=="))) {
                    try {
                        ︁.finish();
                        Process.killProcess(Process.myPid());
                        System.exit(0);
                        return;
                    } catch (Exception e12) {
                        Toast.makeText(︁, e12.toString(), 1).show();
                        return;
                    }
                } else if (trim.startsWith(　　("NgJerjRix2BLCFv3oVoFbg=="))) {
                    try {
                        if (trim.contains(　　("aBK2OxI211VfDrrmSw3Pfg=="))) {
                            Toast.makeText(︁, trim.substring(trim.indexOf(　　("aBK2OxI211VfDrrmSw3Pfg==")) + 2), 1).show();
                        }
                        　　.edit().putString("dialogVer", ︁.　︁).apply();
                        Field declaredField6 = dialogInterface.getClass().getSuperclass().getDeclaredField("mShowing");
                        declaredField6.setAccessible(true);
                        declaredField6.set(dialogInterface, Boolean.TRUE);
                        return;
                    } catch (Exception e13) {
                        Toast.makeText(︁, e13.toString(), 1).show();
                        return;
                    }
                } else if (trim.startsWith(　　("EYMk2mRaRH8BSPyJLiFK8A=="))) {
                    try {
                        if (trim.contains(　　("aBK2OxI211VfDrrmSw3Pfg=="))) {
                            Toast.makeText(︁, trim.substring(trim.indexOf(　　("aBK2OxI211VfDrrmSw3Pfg==")) + 2), 1).show();
                            str2 = trim.substring(0, trim.indexOf(　　("aBK2OxI211VfDrrmSw3Pfg==")));
                        } else {
                            str2 = trim;
                        }
                        if (!str2.contains("href=")) {
                            substring3 = str2.substring(2);
                        } else {
                            substring3 = str2.substring(str2.lastIndexOf("\">") + 2, str2.lastIndexOf("</a>"));
                        }
                        ︁.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(substring3)));
                        return;
                    } catch (Exception e14) {
                        Toast.makeText(︁, e14.toString(), 1).show();
                        return;
                    }
                } else if (trim.startsWith(　　("aBK2OxI211VfDrrmSw3Pfg=="))) {
                    try {
                        Toast.makeText(︁, trim.substring(2), 1).show();
                        return;
                    } catch (Exception e15) {
                        Toast.makeText(︁, e15.toString(), 1).show();
                        return;
                    }
                } else if (trim.startsWith("QQ") || trim.startsWith("qq")) {
                    　(trim);
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    private final void 　(String str) {
        if (str.contains(　　("rOHJyHciQlHptt+6NeNqoQ=="))) {
            try {
                if (str.contains(　　("aBK2OxI211VfDrrmSw3Pfg=="))) {
                    Toast.makeText(︁, str.substring(str.indexOf(　　("aBK2OxI211VfDrrmSw3Pfg==")) + 2), 1).show();
                    str = str.substring(0, str.indexOf(　　("aBK2OxI211VfDrrmSw3Pfg==")));
                }
                ︁.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqqapi://card/show_pslcard?src_type=internal&source=sharecard&version=1&uin=" + str.substring(4))));
            } catch (Exception e) {
                if (e instanceof ActivityNotFoundException) {
                    Toast.makeText(︁, 　　("oEJ+jLBJm923j7SrewvVASgQo64qdqnwXdW+1lH+mnI="), 0).show();
                } else {
                    Toast.makeText(︁, e.toString(), 1).show();
                }
            }
        } else if (str.contains(　　("QIbocZSbLUvlFWmWQ08Jmw=="))) {
            try {
                if (str.contains(　　("aBK2OxI211VfDrrmSw3Pfg=="))) {
                    Toast.makeText(︁, str.substring(str.indexOf(　　("aBK2OxI211VfDrrmSw3Pfg==")) + 2), 1).show();
                    str = str.substring(0, str.indexOf(　　("aBK2OxI211VfDrrmSw3Pfg==")));
                }
                ︁.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqqapi://card/show_pslcard?src_type=internal&version=1&uin=" + str.substring(3) + "&card_type=group&source=qrcode")));
            } catch (Exception e2) {
                if (e2 instanceof ActivityNotFoundException) {
                    Toast.makeText(︁, 　　("oEJ+jLBJm923j7SrewvVASgQo64qdqnwXdW+1lH+mnI="), 0).show();
                } else {
                    Toast.makeText(︁, e2.toString(), 1).show();
                }
            }
        } else if (str.contains(　　("99ei4uKKBoUJSsRHplIABg=="))) {
            try {
                if (str.contains(　　("aBK2OxI211VfDrrmSw3Pfg=="))) {
                    Toast.makeText(︁, str.substring(str.indexOf(　　("aBK2OxI211VfDrrmSw3Pfg==")) + 2), 1).show();
                    str = str.substring(0, str.indexOf(　　("aBK2OxI211VfDrrmSw3Pfg==")));
                }
                ︁.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("mqqwpa://im/chat?chat_type=wpa&uin=" + str.substring(4) + "&version=1&src_type=web")));
            } catch (Exception e3) {
                if (e3 instanceof ActivityNotFoundException) {
                    Toast.makeText(︁, 　　("oEJ+jLBJm923j7SrewvVASgQo64qdqnwXdW+1lH+mnI="), 0).show();
                } else {
                    Toast.makeText(︁, e3.toString(), 1).show();
                }
            }
        }
    }

    private static String ︁(String str) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setRequestMethod("GET");
        httpURLConnection.setUseCaches(false);
        httpURLConnection.setReadTimeout(20000);
        httpURLConnection.setConnectTimeout(20000);
        httpURLConnection.setInstanceFollowRedirects(false);
        httpURLConnection.setRequestProperty("User-Agent", "Mozilla/5.0 (iPhone; U; CPU iPhone OS 4_0 like Mac OS X; en-us) AppleWebKit/532.9 (KHTML, like Gecko) Version/4.0.5 Mobile/8A293 Safari/6531.22.7");
        if (httpURLConnection.getResponseCode() != 200) {
            return "";
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
        StringBuffer stringBuffer = new StringBuffer();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return stringBuffer.toString();
            }
            stringBuffer.append(readLine);
        }
    }

    private final String 　︀(String str) {
        if (str != null) {
            try {
                if (!str.trim().isEmpty()) {
                    String str2 = "〈" + str + "〉";
                    String str3 = "〈/" + str + "〉";
                    String str4 = ︁.　;
                    return str4.substring(str2.length() + str4.indexOf(str2), ︁.　.indexOf(str3));
                }
            } catch (Exception e) {
                publishProgress(new Exception[]{e});
                return "";
            }
        }
        return "";
    }

    private static String 　　(String str) {
        byte[] bArr = null;
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec("qyma".toCharArray(), "$9s1{;1H".getBytes("UTF-8"), 5, 256)).getEncoded(), "AES");
            Cipher instance = Cipher.getInstance("AES/CBC/PKCS5Padding");
            instance.init(2, secretKeySpec, new IvParameterSpec("F-=5!2]/9G(<(=uY".getBytes("UTF-8")));
            bArr = instance.doFinal(Base64.decode(str, 0));
        } catch (Exception e) {
        }
        if (bArr != null) {
            return new String(bArr);
        }
        return str;
    }
}
