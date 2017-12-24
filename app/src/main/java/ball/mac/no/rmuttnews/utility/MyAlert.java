package ball.mac.no.rmuttnews.utility;

import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;

import ball.mac.no.rmuttnews.R;

/**
 * Created by masterung on 23/12/2017 AD.
 */

public class MyAlert {

    private Context context;

    public MyAlert(Context context) {
        this.context = context;
    }

    public void normalDialog(String titleString, String messageString) {

        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setCancelable(false);
        builder.setIcon(R.drawable.ic_action_alert);
        builder.setTitle(titleString);
        builder.setMessage(messageString);
        builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        builder.show();


    }



}
