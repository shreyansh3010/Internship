package com.shreyanshvit.internship.Fragment.android_program;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.shreyanshvit.internship.R;


public class expand_android_program extends Fragment {


    View view;
    TextView textView, java, kotlin;

    public expand_android_program() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             final Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_expand_android_program, container, false);

        String strtext=getArguments().getString("name");
        textView = (TextView) view.findViewById(R.id.head_id_and);
        java = (TextView)  view.findViewById(R.id.java_code_and);

        Typeface tf=Typeface.createFromAsset(getContext().getAssets(), "fonts/DroidSansMono.ttf");
        java.setTypeface(tf);

        setcode(strtext);
        textView.setText(strtext);

        return view;
    }

    private void setcode(String strtext) {
        switch (strtext){

            case "Activity":
                java.setText("class MyActivity : Activity()\n{\n\noverride fun onCreate(saveInstanceState: Bundle?, persistentState: PersistableBundle?)\n{\nsuper.onCreate(savedInstanceState, persistentState)\nsetContentView(R.layout.activity_main)\n}\n\noverride fun onResume() {\nsuper.onResume()\n}\n\n}");
                break;

            case "Fragments" :
                java.setText("class MyFragement : Fragment()\n{\n\noverride fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstances: Bundle): View? {\nreturn inflater.inflate(R.layout.fragment_home, container, false)\n}");
                break;

            case "Service" :
                java.setText("@Override\n" +
                        "public int onStartCommand(Intent intent, int flags, int startId) {\n" +
                        "    Toast.makeText(this, \"service starting\", Toast.LENGTH_SHORT).show();\n" +
                        "    return super.onStartCommand(intent,flags,startId);\n" +
                        "}");
                break;

            case "TextView & EditText":
                java.setText("EditText simpleEditText = (EditText) findViewById(R.id.et_simple);\n" +
                        "String strValue = simpleEditText.getText().toString();\n\nfinal TextView helloTextView = (TextView) findViewById(R.id.text_view_id);\n" +
                        "         helloTextView.setText(R.string.user_greeting);");
                break;

            case "Spinner & ArrayAdapter":
                java.setText("Spinner spinner = new Spinner(this);\n" +
                        "    ArrayAdapter spinnerArrayAdapter = new ArrayAdapter(this,\n" +
                        "        android.R.layout.simple_spinner_dropdown_item,\n" +
                        "            spinnerArray);\n" +
                        "    spinner.setAdapter(spinnerArrayAdapter);");
                break;

            case "Alert Dialog":
                java.setText("// 1. Instantiate an AlertDialog.Builder with its constructor\n" +
                        "AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());\n" +
                        "\n" +
                        "// 2. Chain together various setter methods to set the dialog characteristics\n" +
                        "builder.setMessage(R.string.dialog_message)\n" +
                        "       .setTitle(R.string.dialog_title);\n" +
                        "\n" +
                        "// 3. Get the AlertDialog from create()\n" +
                        "AlertDialog dialog = builder.create();");
                break;

            case "Shared Preference":
                java.setText("SharedPreferences.Editor editor = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE).edit();\n" +
                        " editor.putString(\"name\", \"Elena\");\n" +
                        " editor.putInt(\"idName\", 12);\n" +
                        " editor.apply();\n\nSharedPreferences prefs = getSharedPreferences(MY_PREFS_NAME, MODE_PRIVATE); \n" +
                        "String restoredText = prefs.getString(\"text\", null);\n" +
                        "if (restoredText != null) {\n" +
                        "  String name = prefs.getString(\"name\", \"No name defined\");//\"No name defined\" is the default value.\n" +
                        "  int idName = prefs.getInt(\"idName\", 0); //0 is the default value.\n" +
                        "}");
                break;

            case "OnclickListener":
                java.setText("private OnClickListener mCorkyListener = new OnClickListener() {\n" +
                        "    public void onClick(View v) {\n" +
                        "      // do something when the button is clicked\n" +
                        "    }\n" +
                        "};");
                break;
            case "Switch Fragment":
                java.setText("Fragment fragment = new YourFragment();\n" +
                        "\n" +
                        "FragmentManager fm = getSupportFragmentManager();\n" +
                        "FragmentTransaction transaction = fm.beginTransaction();\n" +
                        "transaction.replace(R.id.contentFragment, fragment);\n" +
                        "transaction.commit();");
                break;

            case "Switch Activity":
                java.setText("public class MainActivity extends AppCompatActivity {\n" +
                        "    @Override\n" +
                        "    protected void onCreate(Bundle savedInstanceState) {\n" +
                        "        super.onCreate(savedInstanceState);\n" +
                        "        setContentView(R.layout.activity_main);\n" +
                        "    }\n" +
                        "\n" +
                        "    /** Called when the user taps the Send button */\n" +
                        "    public void sendMessage(View view) {\n" +
                        "        // Do something in response to button\n" +
                        "    }\n" +
                        "}");
                break;


        }
    }


}
