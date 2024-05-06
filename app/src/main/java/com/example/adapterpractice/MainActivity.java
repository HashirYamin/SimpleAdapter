package com.example.adapterpractice;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
public class MainActivity extends AppCompatActivity {
        private List<Contacts> contacts;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Initialize the list of contacts
        contacts = new ArrayList<>();
        contacts.add(new Contacts("Mummi", "031725034324", R.drawable.baseline_person_24));
        contacts.add(new Contacts("Baba", "031725034324", R.drawable.baseline_person_24));


        // Add more contacts as needed

        // Initialize the ContactListAdapter with the list of contacts
        ContactListCustomAdapter contactAdapter = new ContactListCustomAdapter(this, contacts);

        // Get the ListView from the layout
        ListView contactsListView = findViewById(R.id.contacts_list_view);
        contactsListView.setAdapter(contactAdapter);

        // Set an item click listener to handle contact list item clicks
        contactsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Contacts clickedContact = contacts.get(position);
                Intent it = new Intent(MainActivity.this,DisplayContacts.class);
                it.putExtra("text1",clickedContact.getName());
                // Handle the contact item click event
                Toast.makeText(getApplicationContext(),
                        "Clicked contact: " + clickedContact.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}
