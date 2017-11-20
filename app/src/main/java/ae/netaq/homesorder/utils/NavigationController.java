package ae.netaq.homesorder.utils;


import android.content.Context;
import android.content.Intent;

import ae.netaq.homesorder.screens.main.MainActivity;

/**
 * Created by sabih on 19-Nov-17.
 */

public class NavigationController {


    public static void showMainScreen(Context context) {

        Intent intent = new Intent(context, MainActivity.class);
        context.startActivity(intent);
    }
}
