package com.company;
import org.json.JSONObject;

import java.util.Arrays;

/**
 * Created by shinji on 2017/05/12.
 */
public class PlayLists {
    PlayLists(){

        JSONObject obj = new JSONObject();
        JSONObject obj2 = new JSONObject();
        obj2.put("text","kyakyta");
        obj.put("name",obj2);
        System.out.print(obj.toString());

    }

}
