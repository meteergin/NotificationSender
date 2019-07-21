package com.meteloper.notificationsender.asyncs;

import android.os.AsyncTask;

import com.meteloper.notificationsender.MainActivity;
import com.meteloper.notificationsender.tools.GMailSender;

public class EmailSender extends AsyncTask<Void, Void, Void> {

    private String telephoneNumber;
    private String callType;

    public EmailSender(String callType, String telephoneNumber) {
        this.callType = callType;
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    protected Void doInBackground(Void... voids) {
        GMailSender sender = new GMailSender("e-mail address", "password");
        sender.sendMail(callType,
                telephoneNumber,
                "e-mail address",
                "e-mail address");

        return null;
    }
}
