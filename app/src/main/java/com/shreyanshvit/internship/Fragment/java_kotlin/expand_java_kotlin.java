package com.shreyanshvit.internship.Fragment.java_kotlin;

import android.content.Context;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.shreyanshvit.internship.R;

import org.w3c.dom.Text;

import static android.R.attr.fragment;


public class expand_java_kotlin extends Fragment {

    View view;
    TextView textView, java, kotlin;
    public expand_java_kotlin() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             final Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_expand_java_kotlin, container, false);
        String strtext=getArguments().getString("name");
        textView = (TextView) view.findViewById(R.id.head_id);
        java = (TextView)  view.findViewById(R.id.java_code);
        kotlin = (TextView) view.findViewById(R.id.kotlin_code);

        Typeface tf=Typeface.createFromAsset(getContext().getAssets(), "fonts/DroidSansMono.ttf");
        java.setTypeface(tf);
        kotlin.setTypeface(tf);

        setcode(strtext);
        textView.setText(strtext);



        return view;
    }

    private void setcode(String strtext) {
        switch (strtext){

            case "Data types":
                java.setText("public class Test {\nprivate int a = 10;\nprivate float b =5.5f;\nprivate String name = \"shreyansh\";\npublic String name2;\nprivate static long c = 4334343434L;\n private static final String Tag = \"Test\";\n}");
                kotlin.setText("class Test {\nprivate val a =10\nprivate val b =5.5f\nprivate val name = \"shreyansh\"\nvar name2: String? = null\ncompanion object {\nprivate val c = 433434334L\nprivate val Tag = \"Test\":\n}\n}");
                break;
            case "Enum" :
                java.setText("private enum Workday {\nMONDAY, TUSEDAY, WEDNESDAY, THURSDAY, FRIDAY\n}\nprivate boolean isTomorrowLeave(Workdaytoday) {\nif(today == Workday.FRIDAY)) {\nSystem.out.printLn(\"Hurray! Tomorrow is weekend!\");\nreturn true;\n}\nreturn false;\n}");
                kotlin.setText("private enum class Workday {\nMONDAY, TUSEDAY, WEDNESDAY, THURSDAY, FRIDAY\n}\nprivate fun isTomorrowLeave(today: Workday): Boolean {\nif (today == Workday.FRIDAY)) {\nprintln(\"Hurray! Tomorrow is weekend\")\nreturn true\n}\nreturn false\n}");
                break;
            case "For loop" :
                java.setText("public static int sumOfNumbers(int number) {\nint total = 0;\nfor (int i =0; i<number; i++){\ntotal +=i;\n}\nreturn total\n}");
                kotlin.setText("fun sumofNumbers(number: Int): Int {\nvar total = 0\nfor(i in 0..number -1){\ntotal+=i\n}\nreturn total\n}");
                break;
            case "Switch case" :
                java.setText("public staics void switchTesting(String employeeType){\nswitch(employee){\ncase \"Developer\"\nSystem.out.print(\"I am Tester\");\nbreak;\ndefault:\nSystem.out.println(\"I am Default\");\nbreak\n;\n}\n}");
                kotlin.setText("funn switchTesting(employeeType: String)\n{\nwhen (employeeType) {\n\"Developer\" -> println(\"I am Developer\")\n\"Tester\" -> println(\"I am Tester\")\nelse -> println(\"I am Default\")\n}\n}");
                break;
            case "Exception handling" :
                java.setText("private String exceptionHandling(String test) {\nString subString = null;\ntry{\nsubString = test.subString(0,5);\n}\ncatch (Exception e){\ne.printStackTrace();\n}\nfinally {\nif(subString == null)\nsubString=\"\";\n}\nreturn subString;\n}");
                kotlin.setText("private fun exceptionHandling(test: String): String {\nvar subString: String? = null\ntry {\nsubString = test.subString(0,5)\n} catch (e: Exception) {\ne.printStackTrace()\n} finally {\nif(subString == null)\nsubString = \"\"\n}\nreturn subString\n}");
                break;
            case "Constructor":
                java.setText("public class Testing\n{\npublic Testing()\n{\nSystem.out.println(\"This is default constructor\");\n}\n}");
                kotlin.setText("class Testing {\n //init is keyword to define constructor\n\ninit{\nprintln(\"This is a default consturtor\")\n}\n}");
                break;
            case "Inheritance":
                java.setText("public class Animal {\nvoid eat() {\nSystem.out.println(\"eating...\");\n}\n}\npunblic class Dog exdtend Animal{\nvoid bark() {\nsuper.eat();\nSystem.out.println(\"barking...\");\n}\n}");
                kotlin.setText("open class Animal {\ninternal fun eat() {\nprintln(\"eating..\")\n}\n}\nclass Dog : Animal() {\ninternal fun bark() {\nsuper.eat()\nprintln(\"barking\")\n}\n}");
                break;
            case "Interface":
                java.setText("public interface MyListene{\nvod myEvent(Strng result);\n}\npublic class Testing implements MyListener {\n@Override\npublic void myEvent(String result) {\nSystem.out.println(\"Result: \"+result);\n}\n}");
                kotlin.setText("interface MyListener {\nfun myEvent(result: String)\n}\nclass Testing : MyListener {\noverride fun myEvent(result: String) {\nprintln(\"Result\"+ result)\n}\n}");
                break;
            case "Ternary Operator":
                java.setText("private void ternaryOperator(int a,int b){\n//syntax ==> result = testCondition ? value : value2\n\nint minVal = (a < b) ? a:b;\n}");
                kotlin.setText("private fun ternaryOperator(a: Int, b: Int) {\n//Kotlin not have ternary opertor\n//following line equal to temnary\n\nval minVal = if(a < b) a else b\n}");
                break;
        }
    }


}
