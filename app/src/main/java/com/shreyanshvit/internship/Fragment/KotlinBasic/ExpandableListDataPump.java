package com.shreyanshvit.internship.Fragment.KotlinBasic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ExpandableListDataPump {
    public static HashMap<String, List<String>> getData() {
        HashMap<String, List<String>> expandableListDetail = new HashMap<String, List<String>>();

        List<String> introduction = new ArrayList<String>();
        introduction.add("WHAT IS KOTLIN?");
        introduction.add("KOTLIN FOR SERVER SIDE");
        introduction.add("KOTLIN FOR ANDROID");

        List<String> getting_stated = new ArrayList<String>();
        getting_stated.add("BASIC SYNTAX");
        getting_stated.add("IDIOMS");
        getting_stated.add("CODING CONVENTIONS");

        List<String> basics = new ArrayList<String>();
        basics.add("BASIC TYPES");
        basics.add("LOOPS & IF CONDITION");
        basics.add("RETURNS AND JUMPS");

        List<String> class_obj = new ArrayList<String>();
        class_obj.add("CLASSES");
        class_obj.add("PROPERTIES AND FIELDS");
        class_obj.add("INTERFACE");
        class_obj.add("DATA CLASSES");
        class_obj.add("SEALED CLASSES");
        class_obj.add("GENERICS");
        class_obj.add("NESTED CLASSES");
        class_obj.add("ENUM CLASSES");
        class_obj.add("DELEGATION");
        class_obj.add("DELEGATED PROPERTIES");

        List<String> function_lamdas = new ArrayList<String>();
        function_lamdas.add("FUNCTIONS");
        function_lamdas.add("LABBDAS");
        function_lamdas.add("INLINE FUNCTION");

        List<String> other = new ArrayList<String>();
        other.add("COLLECTIONS");
        other.add("RANGES");
        other.add("EQUALITY");
        other.add("OPERATOR OVERLOADING");
        other.add("NULL SAFETY");


        expandableListDetail.put("INTRODUCTION", introduction);
        expandableListDetail.put("GETTING STARTED", getting_stated);
        expandableListDetail.put("BASICS", basics);
        expandableListDetail.put("CLASSES AND OBJECTS", class_obj);
        expandableListDetail.put("FUNCTIONS AND LAMBDAS", function_lamdas);
        expandableListDetail.put("OTHER", other);
        return expandableListDetail;
    }
}
