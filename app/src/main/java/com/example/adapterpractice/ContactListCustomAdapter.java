package com.example.adapterpractice;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ContactListCustomAdapter extends ArrayAdapter<Contacts> {
    private final Activity context;
    private final List<Contacts> contacts;

    public ContactListCustomAdapter(Activity context, List<Contacts> contacts) {
        super(context, R.layout.contact_item, contacts);
        this.context = context;
        this.contacts = contacts;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the contact for the current position
        Contacts currentContact = contacts.get(position);

        // Inflate the view
        LayoutInflater inflater = context.getLayoutInflater();
        View contactView = inflater.inflate(R.layout.contact_item, parent, false);

        // Get the views
        ImageView contactImageView = contactView.findViewById(R.id.contact_image);
        TextView contactNameTextView = contactView.findViewById(R.id.contact_name);
        TextView contactPhoneTextView = contactView.findViewById(R.id.contact_phone);

        // Set the data
        contactImageView.setImageResource(currentContact.getImageResourceId());
        contactNameTextView.setText(currentContact.getName());
        contactPhoneTextView.setText(currentContact.getPhoneNumber());

        // Return the prepared view
        return contactView;
    }
}

